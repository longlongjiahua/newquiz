package com.yong.quiz.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
