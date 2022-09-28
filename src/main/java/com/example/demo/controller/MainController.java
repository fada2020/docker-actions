package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
@RequestMapping("")
public class MainController {

    @GetMapping("/")
    public String index(){

        return "index";
    }
    @GetMapping("/greetings")
    public String greetings(@RequestParam(name="lang",defaultValue = "ko") String lang){

        return "greetings";
    }
}
