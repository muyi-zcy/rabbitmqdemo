package com.example.rabbitmqdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nemo
 * @version 1.0.0
 * @ClassName HelloController.java
 * @Description TODO
 * @createTime 2019年12月11日 11:14:00
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello world！";
    }

}
