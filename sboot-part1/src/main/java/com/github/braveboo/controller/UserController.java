package com.github.braveboo.controller;

import com.github.braveboo.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserController {

    @RequestMapping("/getUser")
    User home() {
        return new User();
    }
}