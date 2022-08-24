package model;

import javax.persistence.*;

@Entity
@Table(name="phones")
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String brand;
    private String model;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")//foreign key from table phones
    private User user;


    public Phone() {
    }

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return brand+" "+model;
    }
}

