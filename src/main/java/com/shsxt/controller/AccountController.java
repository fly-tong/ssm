package com.shsxt.controller;

import com.shsxt.po.Account;
import com.shsxt.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xlf on 2018/10/11.
 */
@Controller
@RequestMapping("account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("queryAccount")
    @ResponseBody
    public Account queryAccount(Integer id) throws Exception {
        return accountService.queryById(id);
    }

    @RequestMapping("hello01")
    public String hello01(){

        return "hello";
    }


}
