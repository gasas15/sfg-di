package com.saimirgasa.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import com.saimirgasa.sfgdi.services.GreetingService;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {

        return greetingService.setGreeting();
    }
}
