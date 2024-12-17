package employees;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EmployeeApp {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("employee");
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            Employee employee = new Employee("John Doe");
            em.persist(employee);
            em.getTransaction().commit();
        }
    }
}
