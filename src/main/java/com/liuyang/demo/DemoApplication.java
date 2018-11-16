package com.liuyang.demo;

import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class DemoApplication {

	@Bean
	public Queue helloQueue(){
		return new Queue("hello-queue");
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
