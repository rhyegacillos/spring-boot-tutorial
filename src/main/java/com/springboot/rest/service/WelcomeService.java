package com.springboot.rest.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {
    public String retrieveWelcomeMessage() {
        //complex
        return "Good Morning!";
    }
}
