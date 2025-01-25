package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getUsers();

    User getUser(int id);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(User user);
}
