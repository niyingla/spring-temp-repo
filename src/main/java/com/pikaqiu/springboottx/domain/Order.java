package com.pikaqiu.springboottx.domain;

/**
 * @program: springboot-tx
 * @description: 订单
 * @author: xiaoye
 * @create: 2018-11-01 23:04
 **/
public class Order {
    private Long id;
    private Long customerId;
    private String title;
    private Integer amount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
