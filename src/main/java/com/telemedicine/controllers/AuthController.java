package com.telemedicine.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class AuthController {
  @GetMapping("/")
  public String index() {
    return "index";
  }
  @GetMapping("/register")
  public String get() {
    return "register";
  }
}
