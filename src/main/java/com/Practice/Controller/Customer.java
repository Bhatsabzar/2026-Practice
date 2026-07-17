package com.Practice.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cust")
public class Customer {


    @GetMapping("/get")
    public String fun() {
        return "Welcome to Docker K8 World";
    }

    @GetMapping("/gettt")
    public String sun() {
        return "Welcome to GitHub Actions";
    }
}