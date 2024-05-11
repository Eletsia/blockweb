package com.example.demo.controller_test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("data","hello world");
        return "sin4";
    }

    @GetMapping("/template")
    public String template(Model model){
        model.addAttribute("data","hello world");
        return "working_page";
    }
}
