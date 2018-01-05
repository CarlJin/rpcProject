package com.wss.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @ClassName:
 * @desc:
 * @author: jintao
 * @date: 2018-01-04 下午5:44
 **/
public class ProviderApplicationContext {
    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext" +
                ".xml"});
        context.start();
        System.out.println("服务方开始提供服务");
        System.in.read();

    }
}
