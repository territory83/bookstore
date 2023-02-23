package com.Baicai.baicai.controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    /**
     * GET,POST,PUT,DELETE
     *
     * /USER?ID = 1
     * /USER/1
     * @return
     */

    @RequestMapping("/hello")
    public String hello(){
        return "Hello Baicai";
    }
}
