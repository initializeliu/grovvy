package com.initialize.dao.impl;

import com.initialize.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public String selectName() {
        return "zhangsan";
    }
}
