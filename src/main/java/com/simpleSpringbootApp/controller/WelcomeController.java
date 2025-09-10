package com.simpleSpringbootApp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public  String getWelcomeMessage(){
        return "Hello chandan,how are you";
    }
}
