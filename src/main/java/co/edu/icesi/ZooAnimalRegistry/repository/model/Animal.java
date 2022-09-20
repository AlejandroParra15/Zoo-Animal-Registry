package co.edu.icesi.ZooAnimalRegistry.repository.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import java.util.UUID;

@Data
@Table
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Animal {
    @Id
    @Type(type="org.hibernate.type.UUIDCharType")
    private UUID id;
    private String name;
    private String sex;
    private double weight;
    private int age;
    private double height;
    private String date;
    private String motherId;
    private String fatherId;

    @PrePersist
    public void generateId(){
        this.id = UUID.randomUUID();
    }
}
