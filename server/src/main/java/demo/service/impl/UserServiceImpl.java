package demo.service.impl;

import demo.model.User;
import demo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author:bulingfeng
 * @Date: 2020-12-01
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getOneUser() {
        User user=new User();
        user.setAge(18);
        user.setName("bulingfeng");
        user.setGender("man");
        return user;
    }
}
