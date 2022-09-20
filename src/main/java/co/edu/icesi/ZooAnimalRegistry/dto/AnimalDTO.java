package co.edu.icesi.ZooAnimalRegistry.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnimalDTO {
    private UUID id;
    private String name;
    private String sex;
    private double weight;
    private int age;
    private double height;
    private String date;
    private String motherId;
    private String fatherId;
}