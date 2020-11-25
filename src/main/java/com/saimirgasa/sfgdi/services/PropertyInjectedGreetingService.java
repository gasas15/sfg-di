package com.saimirgasa.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService {

    @Override
    public String setGreeting() {
        return "Hello World - Property";
    }
}
