package test;

import model.Phone;
import model.User;
import service.UserService;

public class Test {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User user1 = new User("Bob", "Bobson", 21);
        userService.create(user1);
        Phone phone1 = new Phone("Samsung", "s6");
        phone1.setUser(user1);
        user1.addPhone(phone1);

        System.out.println(userService.findAllUsers());

        Phone phone2 = new Phone("Samsung", "s7");
        phone2.setUser(user1);
        user1.addPhone(phone2);

        userService.update(user1);

        User user2 = new User("John", "Johnson", 28);
        userService.create(user2);

        Phone phone3 = new Phone("Apple", "iphone 13 pro");
        phone3.setUser(user2);
        user2.addPhone(phone3);

        userService.update(user2);

        userService.delete(user2);

    }
}
