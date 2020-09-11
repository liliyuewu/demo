package com.example.demo;

import Uitls.CombineUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class DemoApplicationTests {

    /**
     * 测试
     */
    @Test
    public void test() {
        Integer[] arrs = {2, 3, 5};
        //将数字和字符组合转换
        List<String[]> resultList = CombineUtils.digitsConvertLetters(arrs);
        //打印输出组合结果
        CombineUtils.printResult(resultList);
    }
}
