package com.shsxt;

import com.shsxt.po.Account;
import com.shsxt.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created on 2018/10/11 20:12
 * Author: Mr Tong
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"} )
public class TestAccount {

    @Autowired
    private AccountService accountService;

    @Test
    public void test01() throws Exception {

        Account account = accountService.queryById(9);

        System.out.println("====" +account+ "====");
    }


}
