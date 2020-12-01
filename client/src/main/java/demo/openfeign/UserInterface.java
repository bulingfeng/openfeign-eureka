package demo.openfeign;

import demo.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author:bulingfeng
 * @Date: 2020-12-01
 */
@FeignClient("HelloServer")
public interface UserInterface {

    @GetMapping("/getUser")
    User getOneUser();
}
