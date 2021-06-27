package ucuenca.ejemplo.store.product.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="tbl_categories")
@Data
@AllArgsConstructor @NoArgsConstructor @Builder // Para el Testing

public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

}
