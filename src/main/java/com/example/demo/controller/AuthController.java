//package com.example.demo.controller;
//
//import com.example.demo.dto.LoginRequest;
//import com.example.demo.entity.User;
//import com.example.demo.repository.UserRepository;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/auth")
//public class AuthController {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @PostMapping("/login")
//    public String login(
//            @RequestBody LoginRequest request) {
//
//        User user = userRepository
//                .findByUsername(request.getUsername())
//                .orElse(null);
//
//        if(user == null) {
//            return "User not found";
//        }
//
//        if(user.getPassword()
//                .equals(request.getPassword())) {
//
//            return "Login success. Role: "
//                    + user.getRole();
//        }
//
//        return "Wrong password";
//    }
//}