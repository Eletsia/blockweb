package com.example.demo.controller_test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/sin3")
    public String hello(Model model){
        return "sin3";
    }
}
