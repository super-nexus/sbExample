package com.tpo.teamseven.tpo.controller;

import com.tpo.teamseven.tpo.dao.UserRepository;
import com.tpo.teamseven.tpo.model.User;
import com.tpo.teamseven.tpo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("/user")
    List<User> all(){
        return userRepository.findAll();
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name, Model model){
        model.addAttribute("name", name);
        return "hello";
    }

}
