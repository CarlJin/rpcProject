package com.wss.consumer;

import com.wss.api.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName:
 * @desc:
 * @author: jintao
 * @date: 2018-01-04 下午5:54
 **/
@Controller
public class DemoController {
    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/test.do",produces = "application/json; charset=utf-8")
    //加该注解放回json到客户端，不加则找到对应的jsp展示给页面
    @ResponseBody
    public String getTest() {
        String str = demoService.sayHello("jin");
        System.out.print(str);
        return str;
    }
}
