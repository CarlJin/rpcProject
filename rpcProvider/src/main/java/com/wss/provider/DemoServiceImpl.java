package com.wss.provider;

import com.wss.api.DemoService;

/**
 * @ClassName:
 * @desc:
 * @author: jintao
 * @date: 2018-01-04 下午5:40
 **/
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "提供服务service" + name;
    }
}
