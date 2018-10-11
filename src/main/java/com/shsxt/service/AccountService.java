package com.shsxt.service;

import com.shsxt.base.BaseService;
import com.shsxt.dao.AccountMapper;
import com.shsxt.po.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created on 2018/10/10 19:52
 * Author: Mr Tong
 */
@Service
public class AccountService extends BaseService<Account> {

    @Autowired
    private AccountMapper accountMapper;
}
