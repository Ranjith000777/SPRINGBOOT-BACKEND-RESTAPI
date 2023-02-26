package com.ranjith.repository;

import org.springframework.data.repository.CrudRepository;

import com.ranjith.model.User;

public interface UserRepository extends CrudRepository<User, String>{
	User findByusername(String username);
}
