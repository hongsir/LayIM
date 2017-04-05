package com.silence.repository

import com.silence.enties.User
import org.apache.ibatis.annotations.Select
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Results

/**
 * @description User Dao
 * @date 2017年1月11日
 * @author wang
 *
 */
trait UserMapper {
  
    @Select(value = Array("select * from t_user where username = #{username}"))
    def findUser(username: String): User
    
    @Insert(value = Array("insert into t_user(username,password,sign,email,avatar,sex,create_date,status) values(#{username},#{password},#{sign},#{email},#{avatar},#{sex},#{createDate},#{status})"))
    def saveUser(user: User): Int
    
    @Select(value = Array("select * from t_user"))
    def findAll(): java.util.List[User]
    
}