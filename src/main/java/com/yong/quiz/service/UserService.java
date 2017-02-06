package com.yong.quiz.service;

import com.yong.quiz.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
