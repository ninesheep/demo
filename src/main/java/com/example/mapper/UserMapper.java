package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.pojo.User;

@Mapper
public interface UserMapper {

	//#{name}:参数占位符
	@Select("select * from User where name=#{name}")
	public List<User> likeName(@Param("name")String name);
	
	@Select("select * from User where id = #{id}")
	public User getById(@Param("id")long id);
	
	@Select("select name from User where id = #{id}")
	public String getNameById(@Param("id")long id);
	
}
