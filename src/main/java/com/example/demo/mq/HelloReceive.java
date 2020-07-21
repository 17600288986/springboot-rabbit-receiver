package com.example.demo.mq;


import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "queue")
public class HelloReceive {
    @RabbitHandler
    public void processC(String str) {
        System.out.println("接收消息》》》》"+str);
    }

}
