package com.example.helloservice.conrtoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping
    public String home(){
        return "hello,world!";
    }
}
