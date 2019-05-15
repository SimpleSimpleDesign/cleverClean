package com.store.cleverclean.service;

import com.store.cleverclean.entity.User;

public interface UserService {
     User getUserById(int userId);

    boolean addUser(User record);
}