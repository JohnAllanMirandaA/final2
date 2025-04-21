package com.maven.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maven.demo.domain.Login;
import com.maven.demo.repository.LoginRepo;

@Service
public class LoginService {
    @Autowired
    private LoginRepo rep;

    public Login log(String username,String password){
        Login user = rep.findByUsernameAndPassword(username,password);
        return user;
    }
}
