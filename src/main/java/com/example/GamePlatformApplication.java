package com.example;

import com.example.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class GamePlatformApplication {
    public static void main(String[] args) {
        // Get the Hibernate SessionFactory
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        // Open a session
        Session session = sessionFactory.openSession();

        // Begin a transaction
        Transaction transaction = session.beginTransaction();

        try {
            // Create an entity object
            YourEntity entity = new YourEntity();
            // Set the entity properties

            // Save the entity
            session.save(entity);

            // Commit the transaction
            transaction.commit();
            System.out.println("Entity saved successfully!");
        } catch (Exception e) {
            // Rollback the transaction in case of an error
            transaction.rollback();
            System.err.println("Failed to save entity: " + e.getMessage());
        } finally {
            // Close the session
            session.close();
            // Close the SessionFactory (if necessary) when the application exits
            sessionFactory.close();
        }
    }
}
