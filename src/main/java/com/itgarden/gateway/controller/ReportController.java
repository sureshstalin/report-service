package com.itgarden.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController {


    @GetMapping
    public String ping() {
        return "Report Service is up and running";
    }
}
