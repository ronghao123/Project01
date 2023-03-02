package com.ronghao.java;

import com.ronghao.bean.Customer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author ronghao
 * @date 2023/3/1  -  10:31
 * 常用模板
 */
public class TemplatesTest {

    //prsf
    private static final Customer CUST = new Customer();
    //psf
    public static final int NUM = 1;
    //psfi
    public static final int NUM2 = 2;
    //psfs
    public static final String NATION = "china";

    //psv
    public static void main(String[] args) {

        //sout
        System.out.println("hello!");
        //soutp
        System.out.println("args = " + Arrays.deepToString(args));
        //soutm
        System.out.println("TemplatesTest.main");
        //soutv
        int num =10;
        System.out.println("num = " + num);
        //xxx.sout
        System.out.println(num);

        //fori
        String[] arr = new String[]{"Tom","Jerry","HanMeiMei","Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        System.out.println("---------------");
        //iter
        for (String s : arr) {
            System.out.println(s);  
        }
        System.out.println("---------------");
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }


        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        //list.for
        for (Object o : list) {
            
        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
    }

    //soutm
    public void method(){
        System.out.println("TemplatesTest.method");
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        //ifn
        if (list == null) {

        }
        //inn
        if (list != null) {
            
        }
        //xxx.null
        if (list == null) {

        }
        //xxx.nn
        if (list != null) {

        }
    }
}
