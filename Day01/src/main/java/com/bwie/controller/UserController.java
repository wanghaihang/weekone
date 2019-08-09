package com.bwie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bwie.bean.User;
import com.bwie.service.UserService;

@Controller
public class UserController {

  @Autowired
  private UserService us;
  
  @RequestMapping("list.do")
  public String select(Model model){
    List<User> list = us.select();
    model.addAttribute("list", list);
    return "list";
  }
}
