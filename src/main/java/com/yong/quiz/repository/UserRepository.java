package com.yong.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yong.quiz.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
