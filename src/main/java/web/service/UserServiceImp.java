package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private UserDao userDao;

    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User getUser(long id) {
        return userDao.getUser(id);
    }

    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }

    @Transactional
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }
    @Transactional
    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
    @Transactional
    @Override
    public void deleteUser(long id) {
        userDao.deleteUser(id);
    }
}
