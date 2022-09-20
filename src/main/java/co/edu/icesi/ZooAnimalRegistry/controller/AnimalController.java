package co.edu.icesi.ZooAnimalRegistry.controller;


import co.edu.icesi.ZooAnimalRegistry.api.AnimalAPI;
import co.edu.icesi.ZooAnimalRegistry.dto.AnimalDTO;
import co.edu.icesi.ZooAnimalRegistry.mapper.AnimalMapper;
import co.edu.icesi.ZooAnimalRegistry.service.AnimalService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
public class AnimalController implements AnimalAPI {

    public final AnimalService animalService;
    public final AnimalMapper animalMapper;

    @Override
    public AnimalDTO getAnimal(UUID animalId) {
        return animalMapper.fromAnimal(animalService.getAnimal(animalId));
    }

    @Override
    public AnimalDTO createAnimal(AnimalDTO animalDTO) {
        return animalMapper.fromAnimal(animalService.createAnimal(animalMapper.fromDTO(animalDTO)));
    }

    @Override
    public List<AnimalDTO> getAnimals() {
        return animalService.getAnimal().stream().map(animalMapper::fromAnimal).collect(Collectors.toList());
    }
}
