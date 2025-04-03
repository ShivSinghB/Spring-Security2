package com.exa.security2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exa.security2.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
