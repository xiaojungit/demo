package com.test.dubbo.registry.serviceImpl;

import com.test.dubbo.registry.service.TestRegistryService;

/**
 * Created by Admin on 2015/12/22.
 */
public class TestRegistryServiceImpl implements TestRegistryService {
    //one
    public String hello(String name) {
        return "hello" + name;
    }
}


