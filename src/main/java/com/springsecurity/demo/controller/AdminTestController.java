package com.springsecurity.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/3/2 17:56
 */
@RestController
@RequestMapping(value = "/admin")
public class AdminTestController {

    @RequestMapping("/home")
    @ResponseBody
    public String productInfo(){
        return " admin home page ";
    }
}
