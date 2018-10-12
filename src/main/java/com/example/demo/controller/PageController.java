package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * create by 1311230692@qq.com on 2018/10/11 17:25
 * 页面跳转控制层实现
 **/
@Controller
@RequestMapping("/page")
public class PageController {

    /**
     * 跳转 admin 管理员界面
     * */
    @RequestMapping(value = "/toAdmin")
    public ModelAndView toAdminPage() {
        ModelAndView mv = new ModelAndView("html/admin");
        return mv;
    }

    /**
     * 跳转 index 默认页面
     * */
    @RequestMapping(value = "/toIndex")
    public String toIndexPage() {
        return "page/index";
    }

}
