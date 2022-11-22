package com.meuprojeto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuprojeto.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
