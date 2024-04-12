package ua.com.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int prodYear;
    private String brand;

    public Car() {
    }

    public Car(int prodYear, String brand) {
        this.prodYear = prodYear;
        this.brand = brand;
    }
}
