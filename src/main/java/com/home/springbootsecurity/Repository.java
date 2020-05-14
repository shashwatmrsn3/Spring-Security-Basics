package com.home.springbootsecurity;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.validation.ReportAsSingleViolation;

@org.springframework.stereotype.Repository
public interface Repository  extends JpaRepository<User,Integer>{

    User findByUsername(String username);
}
