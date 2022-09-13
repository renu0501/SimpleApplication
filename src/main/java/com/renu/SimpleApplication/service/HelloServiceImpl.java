package com.renu.SimpleApplication.service;

import com.renu.SimpleApplication.controller.HelloController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService{

    Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);
    @Override
    public String simpleMessage() {
        logger.info("logs from Service");
        return "This is just an hello message to test Jaeger";
    }
}
