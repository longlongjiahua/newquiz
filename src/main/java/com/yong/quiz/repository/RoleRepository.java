package com.yong.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yong.quiz.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
