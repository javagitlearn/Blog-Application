package com.blogapp.durgesh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogapp.durgesh.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

	
	
}
