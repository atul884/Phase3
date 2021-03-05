package com.simplilearnphase3.Sportyshoes.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearnphase3.Sportyshoes.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findByUserName(String userName);
}
