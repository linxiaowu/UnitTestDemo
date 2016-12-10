package cn.xiaowu.unittestdemo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by linxiaowu on 2016/12/10.
 * 计算器的单元测试
 */
public class CalculatorTest {

    private Calculator mCalculator;

    @Before
    public void setUp() throws Exception {
        //初始化
        mCalculator = new Calculator();
    }

    @Test
    public void sum() throws Exception {
        //断言是否相等
        assertEquals(6d, mCalculator.sum(1d, 5d), 0);
    }

    @Test
    public void subtraction() throws Exception {
        assertEquals(4d, mCalculator.subtraction(5d, 1d), 0);
    }

    @Test
    public void divide() throws Exception {
        assertEquals(2d, mCalculator.divide(6d, 3d), 0);
    }

    @Test
    public void multiply() throws Exception {
        assertEquals(17, mCalculator.multiply(6d, 3d), 0);
    }

}