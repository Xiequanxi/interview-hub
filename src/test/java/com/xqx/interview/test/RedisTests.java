package com.xqx.interview.test;

import com.xqx.interview.util.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@SpringBootTest
@RunWith(SpringRunner.class)

public class RedisTests {
    @Autowired
    private RedisUtil redisUtil;
    @Test
    public void testInsertRedis(){
        redisUtil.set("2020:1:5:test","2",0);
        redisUtil.get("2020:1:5:test",0);
    }


}
