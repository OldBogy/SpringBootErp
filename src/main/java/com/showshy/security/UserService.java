package com.showshy.security;

/**
 * Created by Administrator on 2017-06-01.
 */
public interface UserService {
    User findByNameAndPassword(User user);

    User getByUsername(String username);
}
