package com.example.estudianteguia.controller;

import com.example.estudianteguia.entity.Estudiante;
import com.example.estudianteguia.service.EstudianteServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiante")

public class EstudianteController {
    @Autowired
    EstudianteServiceImp estudianteS;

    @GetMapping("/listar")
    public ResponseEntity<List<Estudiante>> listar() {
        return new ResponseEntity<>(estudianteS.findByAll(), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Estudiante> crear(@RequestBody Estudiante m) {
        return new ResponseEntity<>(estudianteS.save(m), HttpStatus.CREATED);
    }

    @DeleteMapping("/elimar/{id}")
    public ResponseEntity<Estudiante> eliminar(@PathVariable Long id) {
        estudianteS.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Estudiante> actualizarMedicamento(@PathVariable Integer id, @RequestBody Estudiante m) {
        Estudiante estudiante = estudianteS.findById(Long.valueOf(id));
        if (estudiante == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                estudiante.setNombre(m.getNombre());
                estudiante.setNumero_estudiante(m.getNumero_estudiante());
                estudiante.setCorreo(m.getCorreo());
                estudiante.setLista_curso(m.getLista_curso());
                estudiante.setGpa(m.getGpa());
                return new ResponseEntity<>(estudianteS.save(m), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
}
