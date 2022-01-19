package com.apptech.springdemo.reprsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apptech.springdemo.model.User;

public interface userRepository extends JpaRepository<User, Integer> {
	
	User findByUsernameAndPassword(String un, String psw);

}
