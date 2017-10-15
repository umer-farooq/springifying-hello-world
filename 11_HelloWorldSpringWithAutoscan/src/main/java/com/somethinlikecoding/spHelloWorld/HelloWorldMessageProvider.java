package com.somethinlikecoding.spHelloWorld;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldMessageProvider implements MessageProvider {

    public String getMessage() {

        return "Hello World!";
    }

}