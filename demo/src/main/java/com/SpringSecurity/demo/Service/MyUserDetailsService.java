package com.SpringSecurity.demo.Service;

import com.SpringSecurity.demo.Model.UserPrincipal;
import com.SpringSecurity.demo.Model.Users;
import com.SpringSecurity.demo.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Users user=userRepo.findByUsername(username);
    if (user==null){
        System.out.println("User not found");
        throw new UsernameNotFoundException("User not found");
    }
        return new UserPrincipal(user);
    }
}
