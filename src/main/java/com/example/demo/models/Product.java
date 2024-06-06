package com.example.demo.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Setter
@Getter
@Entity
@Table(name= "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String brand;
    private String category;
    private double price;
    @Column(columnDefinition = "TEXT")
    private String description;
    private Date createdAt;
    private String imageFileName;



    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", imageFileName='" + imageFileName + '\'' +
                '}';
    }
}
