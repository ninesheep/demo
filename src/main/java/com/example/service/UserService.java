package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.UserMapper;
import com.example.pojo.User;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	public List<User> likeName(String name){
		return userMapper.likeName(name);
	}
	
	
}
