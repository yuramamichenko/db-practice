package ua.com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ua.com.entity.Car;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        try (SessionFactory sessionFactory = new Configuration().configure()
                .buildSessionFactory()) {
            Session session = sessionFactory.openSession();
//            session.beginTransaction();
//            session.persist(new Car(2022, "Audi"));
//            session.getTransaction().commit();
            List<Car> result = session.createQuery("from Car", Car.class).list();
            for (Car event : result) {
                System.out.println(event);
            }
        }
    }
}