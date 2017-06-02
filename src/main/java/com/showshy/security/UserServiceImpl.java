package com.showshy.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017-06-01.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User findByNameAndPassword(User user) {
        return userRepository.findByNameAndPassword(user.getName(), user.getPassword());
    }

    @Override
    public User getByUsername(String username) {
        return userRepository.getByUsername(username);
    }
}
