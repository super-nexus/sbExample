package com.tpo.teamseven.tpo.service;

import com.tpo.teamseven.tpo.dao.UserDao;
import com.tpo.teamseven.tpo.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userDao){
        this.userRepository = userDao;
    }



}
