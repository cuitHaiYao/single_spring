package xyz.haiyao.service.impl;

import xyz.haiyao.BeanFactory;
import xyz.haiyao.dao.UserDao;
import xyz.haiyao.dao.impl.UserDaoImpl;

public class UserServiceImpl implements xyz.haiyao.service.UserService{
    private UserDao userDao = (UserDao) BeanFactory.getBean("userDao");

    public void saveUser() {
        userDao.saveUser();
    }
}
