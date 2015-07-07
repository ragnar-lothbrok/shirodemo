package com.cxf.spring.services.impl;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;

import com.cxf.spring.services.CustomerService;

public class CustomerServiceImpl implements CustomerService {
    
    static Logger log = Logger.getLogger(
            CustomerServiceImpl.class.getName());

    @Override
    public String getCustomer1() {
       org.apache.shiro.subject.Subject subject= SecurityUtils.getSubject();
        return "{ \"title\": \"customer1\" }";
    }

    @Override
    public String getCustomer2() {
        return "{ \"title\": \"customer2\" }";
    }

}
