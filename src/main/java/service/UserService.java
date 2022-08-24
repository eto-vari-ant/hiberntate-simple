package service;

import dao.UserDAO;
import model.Phone;
import model.User;

import java.util.List;

public class UserService {
    UserDAO userDAO = new UserDAO();

    public User findUserById(int id){
        return userDAO.findUserById(id);
    }

    public Phone findPhoneById(int id){
        return userDAO.findPhoneById(id);
    }

    public List<User> findAllUsers(){
        return userDAO.findAllUsers();
    }

    public void create(User user){
        userDAO.create(user);
    }

    public void update(User user){
        userDAO.update(user);
    }

    public void delete(User user){
        userDAO.delete(user);
    }
}
