package com.example.springweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test")
    public  String getTest(){
        return "zxx";
    }

    @RequestMapping("/test2")
    public  String getTest2(){
        return "zxx";
    }
}
