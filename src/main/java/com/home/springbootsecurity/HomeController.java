package com.home.springbootsecurity;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Welcome to home";
    }

    @GetMapping("/user")
    public String user(){
        return "Welcome to user portal";
    }

    @GetMapping("/admin")
    public String admin(){
        return "Welcome to admin portal";
    }
}
