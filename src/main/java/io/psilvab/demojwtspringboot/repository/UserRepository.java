package io.psilvab.demojwtspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.psilvab.demojwtspringboot.entity.User;

public interface UserRepository  extends JpaRepository<User, Integer>{

	User findByUsername(String username);
	
	
}
