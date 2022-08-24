package dao;

import model.Phone;
import model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtils;

import java.util.List;

public class UserDAO {
    public User findUserById(int id){
        return HibernateUtils.getSessionFactory().openSession().get(User.class, id);
    }

    public Phone findPhoneById(int id){
        return HibernateUtils.getSessionFactory().openSession().get(Phone.class, id);
    }

    public List<User> findAllUsers(){
        List<User> users = HibernateUtils.getSessionFactory().openSession().createQuery("From User").list();
        return users;
    }

    public void create(User user){
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
    }

    public void update(User user){
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(user);
        transaction.commit();
        session.close();
    }

    public void delete(User user){
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(user);
        transaction.commit();
        session.close();
    }
}
