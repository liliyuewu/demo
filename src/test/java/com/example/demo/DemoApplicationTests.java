package com.example.demo;

import Uitls.CombineUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.*;

@SpringBootTest
class DemoApplicationTests {

    /**
     * 测试1
     */
    @Test
    public void testOne() {
        try{
            Integer[] arrs = {2, 3, 5};
            //将数字和字符组合转换
            List<String[]> resultList = CombineUtils.digitsConvertLetters(arrs);
            //打印输出组合结果
            CombineUtils.printResult(resultList);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     *测试2
     */
    @Test
    public void testTwo() {
        try{
            Integer[] arrs = {0, 9};
            //将数字和字符组合转换
            List<String[]> resultList = CombineUtils.digitsConvertLetters(arrs);
            //打印输出组合结果
            CombineUtils.printResult(resultList);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     *测试3用例
     */
    @Test
    public void testThree() {
        try{
            //定义一个输入值
            Integer[] arrs = {0, 9, 2, 4};
            //将数字和字符组合转换
            List<String[]> resultList = CombineUtils.digitsConvertLetters(arrs);
            //打印输出组合结果
            CombineUtils.printResult(resultList);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
