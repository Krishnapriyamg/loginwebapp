package com.loginapplication.loginapplication;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class HomeController {

    // @GetMapping("/")
    @RequestMapping("/")  
    public String homePage() {
        return "hellooo";
    }


}