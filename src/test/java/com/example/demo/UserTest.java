package com.example.demo;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void insert(){
        User user = new User();
        user.setUserName("李白");
        user.setPassWord("123456");
        user.setRealName("管理员");
        userMapper.addUser(user);
        System.out.println("添加成功："+user.getId());
    }
    @Test
    public void del(){
        userMapper.deleteUser(5);
    }

    @Test
    public void update(){
        User user = userMapper.getUserById(3);
        user.setUserName("杜甫");
        userMapper.updateUser(user);
    }

    @Test
    public void sel(){
        User user = userMapper.getUserById(1);
        System.out.println(user);
    }
}
