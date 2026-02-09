package com.impact.lessons.controllers;

import com.impact.lessons.models.User;
import com.impact.lessons.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService = new UserService();

    @PostMapping("/users/create")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/users/get_all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
