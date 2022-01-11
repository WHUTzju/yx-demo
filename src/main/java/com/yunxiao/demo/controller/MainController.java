package com.yunxiao.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo
 * @description:
 * @author: inkChain
 * @create: 2022-01-11 16:17
 **/
@RestController
public class MainController {

    @GetMapping("/")
    public String index() {
        return "\n\n\n\n <p1>hello world!</p1>";
    }
}
