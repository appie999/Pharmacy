package com.pharmacy.pharmacy.repositories;

import com.pharmacy.pharmacy.entities.produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<produit,Long> {

}
