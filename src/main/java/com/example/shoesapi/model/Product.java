package com.example.shoesapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;
    private String brand;
    private String description;
    private String imageUrl;

    public Product() {}

    public Product(String name, double price, String brand, String description, String imageUrl) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    // Getters and setters (có thể dùng Lombok nếu muốn gọn hơn)
}
