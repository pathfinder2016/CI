package com.oocl.CI.auth.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Controller {

    @RequestMapping("/login")
    String login(){
        return "Hello world";
    }
}
