package ucuenca.ejemplo.store.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ucuenca.ejemplo.store.customer.entity.Customer;
import ucuenca.ejemplo.store.customer.entity.Region;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    public Customer findByNumberID(String numberID);
    public List<Customer> findByLastName(String lastname);
    public List<Customer> findByRegion(Region region);
}
