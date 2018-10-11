package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

/**
 * create by 1311230692@qq.com on 2018/10/11 14:01
 * 用户操作业务逻辑层接口
 **/
public interface UserService {
    /**
     * 查询所有用户信息
     * */
    List<User> getAllUserInfo();
}
