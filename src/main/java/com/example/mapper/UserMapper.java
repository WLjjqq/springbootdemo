package com.example.mapper;

import com.example.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface UserMapper {
    User Sel(int id);

    //测试调用存储过程
    //增加用户
    void addUser(User user);
    //删除用户
    void deleteUser(Integer id);
    //根据id查询用户
    User getUserById(Integer id);
    //更新用户
    void updateUser(User user);

}
