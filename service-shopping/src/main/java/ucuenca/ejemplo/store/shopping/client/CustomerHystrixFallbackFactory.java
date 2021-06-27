package ucuenca.ejemplo.store.shopping.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import ucuenca.ejemplo.store.shopping.model.Customer;

@Component
public class CustomerHystrixFallbackFactory implements CustomerClient{

    @Override
    public ResponseEntity<Customer> getCustomer(long id) {
        //En caso de que el servicio caiga, se envia un Customer vacio (none).
        Customer customer = Customer.builder()
                .firstName("none")
                .lastName("none")
                .email("none")
                .photoUrl("none").build();
        return ResponseEntity.ok(customer);
    }
}
