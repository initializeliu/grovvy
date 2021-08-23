package com.initialize.service.impl;

import com.initialize.dao.UserDao;
import com.initialize.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public String getName() {

        return userDao.selectName();
    }
}
