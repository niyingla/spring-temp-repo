package com.pikaqiu.springboottx.dao;

import com.pikaqiu.springboottx.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: springboot-tx
 * @description: dao
 * @author: xiaoye
 * @create: 2018-11-03 10:02
 **/
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
