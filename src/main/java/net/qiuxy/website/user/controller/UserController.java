package net.qiuxy.website.user.controller;

import net.qiuxy.website.user.bean.User;
import net.qiuxy.website.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.UsesSunHttpServer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author qiuxy on 2017/11/16
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(value = "register")
    public User register(User user) {
        return userRepository.save(user);
    }

}
