package com.springboot.telusko.jwt_security.repository;

import com.springboot.telusko.jwt_security.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepo extends JpaRepository<Users,Integer>{

    Users findByUsername(String username);

}

