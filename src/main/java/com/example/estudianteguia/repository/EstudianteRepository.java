package com.example.estudianteguia.repository;

import com.example.estudianteguia.entity.Estudiante;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends MongoRepository<Estudiante, Long> {
}
