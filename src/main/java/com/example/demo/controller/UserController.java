package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * create by 1311230692@qq.com on 2018/10/11 14:02
 * 用户操作控制层实现
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource(name="UserService")
    private UserService userService;

    @RequestMapping(value = "/getAllUserInfo")
    @ResponseBody
    public String getAllUserInfo() throws Exception{
        HashMap<String, Object> map = new HashMap<>();
        ObjectMapper objectMapper = new ObjectMapper();

        List<User> userList = userService.getAllUserInfo();
        map.put("total", userList.size());
        map.put("rows", userList);

        return objectMapper.writeValueAsString(map);
    }
}
