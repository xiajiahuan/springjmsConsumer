package com.itheima.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-jms-queue.xml")
public class TestQueue {

    @Test
    public void testQueue() {

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
