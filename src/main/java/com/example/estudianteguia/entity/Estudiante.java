package com.example.estudianteguia.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "estudiante")
public class Estudiante {
    @Id
    private Long id;
    private String nombre;
    private String numero_estudiante;
    private String correo;
    private String lista_curso;
    private Double gpa;

    public Estudiante(Long id, String nombre, String numero_estudiante, String correo, String lista_curso, Double gpa) {
        this.id = id;
        this.nombre = nombre;
        this.numero_estudiante = numero_estudiante;
        this.correo = correo;
        this.lista_curso = lista_curso;
        this.gpa = gpa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero_estudiante() {
        return numero_estudiante;
    }

    public void setNumero_estudiante(String numero_estudiante) {
        this.numero_estudiante = numero_estudiante;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getLista_curso() {
        return lista_curso;
    }

    public void setLista_curso(String lista_curso) {
        this.lista_curso = lista_curso;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }
}
