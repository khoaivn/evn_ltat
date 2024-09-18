package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listUsers", userService.getAllUsers());
        return "index";
    }

    @GetMapping("/login")
    public String showLogin(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "login";
    }
    

    @GetMapping("/user/form")
    public String showForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "user_form";
    }
    
    @PostMapping("/user/save")
    public String saveUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/user/form?success";
    }
}

