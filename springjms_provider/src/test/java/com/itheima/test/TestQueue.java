package com.itheima.test;

import com.itheima.demo.QueueProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-jms.xml")
public class TestQueue {

    @Autowired
    private QueueProvider queueProvider;

    @Test
    public void testSend() {

        queueProvider.sendTextMessage("欢迎来到神奇的springjms世界");
    }
}
