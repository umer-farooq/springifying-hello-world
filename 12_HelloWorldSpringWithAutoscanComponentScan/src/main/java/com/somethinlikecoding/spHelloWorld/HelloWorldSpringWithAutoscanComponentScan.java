package com.somethinlikecoding.spHelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class HelloWorldSpringWithAutoscanComponentScan {
	
	public static void main(String[] args) throws Exception {

		ApplicationContext context = SpringApplication.run(HelloWorldSpringWithAutoscanComponentScan.class,
				args);
		MessageRenderer mr = context.getBean(MessageRenderer.class);
		mr.render();
	}

}
