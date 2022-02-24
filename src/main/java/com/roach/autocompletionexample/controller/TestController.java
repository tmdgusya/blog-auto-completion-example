package com.roach.autocompletionexample.controller;

import com.roach.autocompletionexample.domain.User;
import com.roach.autocompletionexample.service.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    private final UserService userService;

    public TestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> searchUser(@RequestParam("searchText") String searchText) {
        return userService.searchUser(searchText);
    }
}
