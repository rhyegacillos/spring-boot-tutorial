package com.springboot.rest.controller;

import com.springboot.rest.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    private WelcomeService welcomeService;

    @Autowired
    public WelcomeController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }

    public WelcomeController() {
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Spring Boot Rest..., " + welcomeService.retrieveWelcomeMessage();
    }
}



