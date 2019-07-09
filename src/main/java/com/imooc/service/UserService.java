package com.imooc.service;


import com.imooc.service.model.UserModel;

public interface UserService {
    //通过用户id获取用户对象的信息
    UserModel getUserById(Integer id);
}
