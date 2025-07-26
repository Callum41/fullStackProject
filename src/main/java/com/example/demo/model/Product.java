package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data // Genera los setters, getters, toString, equals y hashCode
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;
    private String description;
}