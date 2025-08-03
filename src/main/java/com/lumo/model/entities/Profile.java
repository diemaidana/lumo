package com.lumo.model.entities;

import com.lumo.model.enums.Gender;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.JOINED) // Use JOINED strategy for inheritance ya que permite que Profile sea una clase base para otras entidades

@Data
@ToString
public abstract class Profile {
    @Id
    private Long id;

    @Column(unique = true, nullable = false)
    private String email;
    @Column(unique = true, nullable = false)
    private String DNI;

    private String name;
    private String apellido;

    private String password;
    private String phoneNumber;
    private String streetAddress;
    private String city;
    private String state;
    private String country;
    private String codigoPostal;
    @Column(name = "born_date")
    private LocalDate bornDate;

    private Gender gender;

    @Column(name = "created")
    private LocalDate created;

}
