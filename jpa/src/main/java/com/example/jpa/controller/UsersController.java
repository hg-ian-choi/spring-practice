package com.example.jpa.controller;

import com.example.jpa.entity.Users;
import com.example.jpa.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {
    @Autowired
    UsersService usersService;

    @GetMapping("/users")
    public List<Users> getUsers() {
        return usersService.getUsers();
    }

    @GetMapping("/users/{id}")
    public Users getUserById(@PathVariable Long id) {
        return usersService.getUserById(id);
    }
}
