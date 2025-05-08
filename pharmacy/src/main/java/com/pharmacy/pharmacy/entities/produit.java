package com.pharmacy.pharmacy.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "produit")
public class produit {

    @Id
    private Long id;
    private String nom;
    private int quantite;
    private int prix;
    private String description;

}
