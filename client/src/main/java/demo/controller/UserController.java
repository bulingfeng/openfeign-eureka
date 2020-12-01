package demo.controller;

import demo.model.User;
import demo.openfeign.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:bulingfeng
 * @Date: 2020-12-01
 */
@RestController
@RequestMapping("/server")
public class UserController {

    @Autowired
    private UserInterface userInterface;

    @GetMapping("/user")
    public User getOneUser(){
        return userInterface.getOneUser();
    }
}
