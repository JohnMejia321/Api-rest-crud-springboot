package com.example.demo.model;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
@Table(name="persona")
public class Person {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
}
