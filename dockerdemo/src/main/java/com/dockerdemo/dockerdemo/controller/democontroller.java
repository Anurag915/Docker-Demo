package com.dockerdemo.dockerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class democontroller
{
        @GetMapping("get")
        public String getObj(){
            return "Hello Docker";
        }
}
