package com.renu.SimpleApplication.controller;

import com.renu.SimpleApplication.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private HelloService helloService;

    @GetMapping("/message")
    public String hello(){
        logger.info("logs from controller");
        return helloService.simpleMessage();
    }


}
