package com.xiao.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("aaa}")
    private String name;

    @RequestMapping("/hello")
    public String hello() {
        return name;
    }
}
