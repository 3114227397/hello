package com.iteheima;//package com.itheima.web;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class demo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner sc=new Scanner(System.in);
        System.out.println("please input your old score:");
        double old_score=sc.nextDouble();
        System.out.println("please input your new score:");
        double new_score=sc.nextDouble();
        double ans=new_score/old_score;
        DecimalFormat df=new DecimalFormat("0.00%");//格式化对象
        System.out.println(df.format(ans));//format格式化方法

    }




}

