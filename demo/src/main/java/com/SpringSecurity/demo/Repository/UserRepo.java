package com.SpringSecurity.demo.Repository;

import com.SpringSecurity.demo.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users,Integer> {
    Users findByUsername(String username);

}
