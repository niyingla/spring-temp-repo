package com.pikaqiu.springboottx.web;

import com.pikaqiu.springboottx.domain.Order;
import com.pikaqiu.springboottx.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-tx
 * @description: 11
 * @author: xiaoye
 * @create: 2018-11-01 23:17
 **/
@RestController
public class CustomerController {


    @Autowired
    private CustomerService customerService;


    @PostMapping("create")
    public void createOrder(Order order){
        customerService.createOrder(order);

    }
}
