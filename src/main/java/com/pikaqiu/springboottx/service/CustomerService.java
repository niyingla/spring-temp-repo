package com.pikaqiu.springboottx.service;

import com.pikaqiu.springboottx.dao.CustomerRepository;
import com.pikaqiu.springboottx.domain.Customer;
import com.pikaqiu.springboottx.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @program: springboot-tx
 * @description: 22
 * @author: xiaoye
 * @create: 2018-11-01 23:18
 **/
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    @Qualifier("orderJdbcTemplate")
    private JdbcTemplate orderJdbcTemplate;

    //private static final String SQL_UPDATE_DEPPSIT = "update t_customer set amount = amount - ?  where id = ?";

    private static final String SQL_INSERT_ORDER = "INSERT INTO t_order(customerId,amount,title) values(?,?,?)";

    @Transactional
    public void createOrder(Order order) {
//        userJdbcTemplate.update(SQL_UPDATE_DEPPSIT, order.getAmount(), order.getCustomerId());
        Customer customer = customerRepository.findById(order.getCustomerId()).get();

        customer.setAmount((Integer.valueOf(customer.getAmount()) - order.getAmount()) + "");

        customerRepository.save(customer);

        if (order.getTitle().contains("error1")) {
            throw new RuntimeException();
        }
        orderJdbcTemplate.update(SQL_INSERT_ORDER, order.getCustomerId(), order.getAmount(), order.getTitle());
        if (order.getTitle().contains("error2")) {
            throw new RuntimeException();
        }

    }


}
