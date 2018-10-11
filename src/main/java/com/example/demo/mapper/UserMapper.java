package com.example.demo.mapper;

import com.example.demo.entity.User;

import java.util.List;

/**
 * create by 1311230692@qq.com on 2018/10/11 14:00
 * 用户操作接口
 **/
public interface UserMapper {
    /**
     * 查询所有用户信息
     * */
    List<User> getAllUserInfo();
}
