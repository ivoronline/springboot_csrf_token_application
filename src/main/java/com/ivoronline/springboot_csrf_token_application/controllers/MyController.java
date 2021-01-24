package com.ivoronline.springboot_csrf_token_application.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @RequestMapping("/HelloForm")
  public String helloForm() {
    return "HelloForm";
  }

  @ResponseBody
  @RequestMapping("/SayHello")
  public String sayHello(@RequestParam String name) {
    return "Hello " + name;
  }
}


