package com.xqx.interview.testMain;

/**
 * create by xqx on 2020-01-04
 */
public class StaticTest {

    /**
     * 静态代码块只会在加载类时执行
     * 代码块每次新建对象都会执行
     */

    public StaticTest() {
        System.out.print("默认构造方法！--");
    }

    {
        System.out.print("非静态代码块！--");
    }

    static {
        System.out.print("静态代码块！--");
    }

    public static void test() {
        System.out.print("静态方法中的内容! --");
        {
            System.out.print("静态方法中的代码块！--");
        }

    }

    public static void main(String[] args) {

        //StaticTest test = new StaticTest();
        StaticTest.test();
        StaticTest.test();
    }
}