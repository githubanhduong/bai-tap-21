package com.example.buoi21.JpaUser.controller;

import com.example.buoi21.JpaUser.dto.UserDTO;
import com.example.buoi21.JpaUser.service.imp.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/add")
    public ResponseEntity<?> saveUser(@RequestBody List<UserDTO> listUserDTO) {

        return new ResponseEntity<>(userService.saveUser(listUserDTO), HttpStatus.OK);
    }

    @GetMapping("/getByFullname")
    public ResponseEntity<?> getUserByFullname(@RequestParam String fullname) {

        return new ResponseEntity<>(userService.getUserByFullname(fullname), HttpStatus.OK);
    }
}
