package com.saimirgasa.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String setGreeting() {
        return "Hello World - From the Primary Bean";
    }
}
