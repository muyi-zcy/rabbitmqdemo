package com.example.rabbitmqdemo.controller;

import com.example.rabbitmqdemo.service.MessageServiceImpl;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nemo
 * @version 1.0.0
 * @ClassName OrderController.java
 * @Description TODO
 * @createTime 2019年12月11日 22:59:00
 */
@RestController
public class OrderController {
    @Autowired
    private MessageServiceImpl messageService;

    @GetMapping("hello")
    public String createOrderTest() {
        messageService.sendMsg("test_queue_1","hello i am delay msg");
        return "创建订单成功";
    }
}
