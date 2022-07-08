package com.iteheima;//package com.itheima.web;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class demo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String name="张三";
        String encode = URLEncoder.encode(name, "UTF-8");
        System.out.println(encode);
        String decode = URLDecoder.decode(name, "utf-8");
        System.out.println(decode);
        byte[] bytes=decode.getBytes("ISO_8859_1");
        String s=new String(bytes,"utf-8");
        System.out.println(s);
    }
}
