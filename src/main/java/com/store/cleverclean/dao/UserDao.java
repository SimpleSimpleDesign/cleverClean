package com.store.cleverclean.dao;

import com.store.cleverclean.entity.User;

public interface UserDao {
    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);
}
