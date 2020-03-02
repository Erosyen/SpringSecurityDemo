package com.springsecurity.demo.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/3/2 17:55
 */
@RestController
@RequestMapping("/product")
public class ProductTestController {

    @RequestMapping("/product")
    @ResponseBody
    public String productInfo(){
        return " some product info ";
    }

    @RequestMapping("/info1")
    @ResponseBody
    public String productInfo1(){
        String currentUser = "";
        Object principl = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if(principl instanceof UserDetails) {
            currentUser = ((UserDetails)principl).getUsername();
        }else {
            currentUser = principl.toString();
        }
        return " some product info,currentUser is: "+currentUser;
    }
}
