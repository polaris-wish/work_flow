package com.chen.work.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName WorkFlowController
 * @Description TODO
 * @Author anthony
 * @Date 2021/5/16 11:40
 **/
@RestController
@RequestMapping("work/flow")
public class WorkFlowController {

    @RequestMapping(value = "hello")
    public String hello(){
        return "hello world!";
    }

}
