package com.boot.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootApplicationTests {

    @Test
    void contextLoads() {
        String haha = "haha";
        System.out.println(haha);
        te();
    }

    private void te(){
        String x = "中文";
        System.out.println(x);
    }

}
