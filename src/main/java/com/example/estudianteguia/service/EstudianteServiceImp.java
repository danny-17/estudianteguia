package com.example.estudianteguia.service;

import com.example.estudianteguia.entity.Estudiante;
import com.example.estudianteguia.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class EstudianteServiceImp extends GenericServiceImp<Estudiante, Long> implements EstudianteService{

    @Autowired
    EstudianteRepository estudianteR;

    @Override
    public CrudRepository<Estudiante, Long> getDao(){
        return estudianteR;
    }

}
