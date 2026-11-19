package com.example.users.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/test")
    public String getUser() {
        return "User on port :8081";
    }
    @PostMapping("/adduser")
    public String addUser(@RequestBody  String name){
        return name;
    }

}
