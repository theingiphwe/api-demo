package org.ace.apidemo.controller;

import org.ace.apidemo.entity.User;
import org.ace.apidemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller // model view Controller
public class UserController {
    //JDK proxy
    //CGLIB proxy
    @Autowired
    private UserService userService;// jdk proxy

    @PostMapping("/save")
    public ResponseEntity<User> save(@RequestBody User user){
        userService.save(user);
        return new ResponseEntity<>(user,HttpStatus.CREATED);
    }

    @GetMapping("/findAll")
    public  ResponseEntity<List<User>> findAll(){
        List<User> userList = userService.findAll();
        return new ResponseEntity<>(userList,HttpStatus.OK);
    }

}
