package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    User getUser(int id);

    void deleteUser(User user);

    void updateUser(User user);

    void saveUser(User user);
}
