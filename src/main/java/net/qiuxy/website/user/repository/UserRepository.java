package net.qiuxy.website.user.repository;

import net.qiuxy.website.user.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author qiuxy on 2017/11/16
 */
public interface UserRepository extends JpaRepository<User, String> {
}
