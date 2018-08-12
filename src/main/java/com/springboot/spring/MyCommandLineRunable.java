package com.springboot.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(9)
public class MyCommandLineRunable implements CommandLineRunner{
    @Override
    public void run(String... args) throws Exception {
        System.out.println("==========CommandLineRunner============");
    }
}
