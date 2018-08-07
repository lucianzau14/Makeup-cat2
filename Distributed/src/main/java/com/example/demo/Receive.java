package com.example.demo;

import com.rabbitmq.client.*;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import java.io.IOException;


    @RabbitListener(queues = "hello")
    public class Receive{

        @RabbitHandler
        public void receive(String in) {
            System.out.println(" [x] Received '" + in + "'");
        }
    }
