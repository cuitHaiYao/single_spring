package xyz.haiyao;

import xyz.haiyao.service.UserService;
import xyz.haiyao.service.impl.UserServiceImpl;

public class Spring_jdbc {
    public static void main(String[] args) {
        UserService service = (UserService) BeanFactory.getBean("userService");
        service.saveUser();
    }
}
