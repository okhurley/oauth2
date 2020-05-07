package com.okhurley.uaa.dao;

import com.okhurley.uaa.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<User> {

    @Select("select * from tb_user where username=#{username}")
    User selectByUsername(@Param("username") String username);

}
