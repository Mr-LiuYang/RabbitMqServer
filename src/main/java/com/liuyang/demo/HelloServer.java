package com.liuyang.demo;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by N144859 on 2018/11/16
 */
@Component
public class HelloServer {
    @RabbitListener(queues="hello-queue")
    public void receive(String message){
        System.out.println(message);
    }
}
