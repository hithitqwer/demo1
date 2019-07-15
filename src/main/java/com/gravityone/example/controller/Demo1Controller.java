package com.gravityone.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/demo1")
@RestController
public class Demo1Controller {

    private static Logger logger = LoggerFactory.getLogger(Demo1Controller.class);

    @RequestMapping(value = "/returnMsg", method = RequestMethod.GET)
    public String returnMsg(){
        String msg = "Msg!!!";
        logger.info("/demo1/returnMsg" + msg);
        return msg;
    }

}
