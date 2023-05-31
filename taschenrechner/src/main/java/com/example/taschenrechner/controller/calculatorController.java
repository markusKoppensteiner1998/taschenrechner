package com.example.taschenrechner.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculatorController {

    //http://localhost:8080/calc/add?a=10&b=11
    @RequestMapping("/calc/add")
    public int add(@RequestParam int a, @RequestParam int b){
        return a+b;
    }
  //http://localhost:8080/calc/message
    @RequestMapping("/calc/message")
    public String add(){
        return "HHHHHHHHHHHHHHHHHHHHHHHHHHHHH";
    }


}
