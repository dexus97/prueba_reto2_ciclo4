/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ciclocuatro.retos.reto.model;

import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 *
 * @author Jonathan Romero
 */
@Document(collection="productos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Productos {
    @Id
    private String reference;
    private String brand;
    private String category;
    private String material;
    private String description;
    private double price;
    private boolean availability = true;
    private int quantity;
    private String photography;
}