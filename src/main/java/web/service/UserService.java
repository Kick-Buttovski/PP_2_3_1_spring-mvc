package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    User getUser(long id);
    List<User> listUsers();
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(long id);
}
