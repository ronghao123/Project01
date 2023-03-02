package com.ronghao.bean;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

//单行注释
public class Customer extends Person {

    private static int num;

    public Customer() {

    }

    private static final int INITIAL_SIZE = 10;

    public static void main(String[] args) {
        //region Description
        ArrayList list = getList();

        /*  ArrayList list1 = null;
        synchronized ();*/
        Date date = new Date();

//        method();
        System.out.println(list);

    }

    public static ArrayList getList() {
        System.out.println("helloworld！！！");
        System.out.println("helloworld！！！");
        //endregion

        ArrayList list = new ArrayList();
        list.add(0, 123);
        return list;
    }

    public static void method() {

        num = 10;


        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    public void eat() {
        System.out.println("客户吃饭");
    }
}
