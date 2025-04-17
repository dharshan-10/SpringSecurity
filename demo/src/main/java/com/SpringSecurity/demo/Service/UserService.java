package com.SpringSecurity.demo.Service;

import com.SpringSecurity.demo.Model.Users;
import com.SpringSecurity.demo.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    private BCryptPasswordEncoder encoder= new BCryptPasswordEncoder(10);
    public Users register(Users user) {
        user.setPassword(encoder.encode(user.getPassword()));
        userRepo.save(user);
        return user;
    }
}
