package com.itheima.test;

import com.itheima.demo.QueueProvider;
import com.itheima.demo.TopicProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-jms.xml")
public class TestTopic {

    @Autowired
    private TopicProvider topicProvider;

    @Test
    public void testSend() {

        topicProvider.sendTextMessage("欢迎来到神奇的springjms-topic世界");
    }
}
