package com.roach.autocompletionexample.service;

import com.roach.autocompletionexample.domain.User;
import com.roach.autocompletionexample.repository.UserRepository;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> searchUser(String searchText) {
        return userRepository.searchByFullText(searchText);
    }

}
