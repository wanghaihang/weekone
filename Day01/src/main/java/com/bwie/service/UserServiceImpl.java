package com.bwie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bwie.bean.User;
import com.bwie.mapper.UserMapper;

@Service
@Transactional
public class UserServiceImpl implements UserService{
  @Autowired
  public UserMapper um;

  @Override
  public List<User> select() {
    // TODO Auto-generated method stub
    return um.select();
  }
  

}
