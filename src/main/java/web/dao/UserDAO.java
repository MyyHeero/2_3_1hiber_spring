package web.dao;

import web.models.User;

import java.util.List;

public interface UserDAO {
    void addUser(User user);

    void updateUser(int id, User user);

    void deleteUser(int id);

    public User getUserByID(int id);

    public List<User> getAllUsers();
}
