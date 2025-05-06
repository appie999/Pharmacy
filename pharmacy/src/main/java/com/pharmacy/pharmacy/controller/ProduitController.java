package com.pharmacy.pharmacy.controller;

import com.pharmacy.pharmacy.entities.produit;
import com.pharmacy.pharmacy.repositories.ProduitRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProduitController {
    private final ProduitRepository produitRepository;

    public ProduitController(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    @PostMapping("/addproduit")
    public produit saveProduit(@RequestBody produit p){
        return produitRepository.save(p);
    }
    @GetMapping("/returnAllProduct")
    public List<produit> getProduits(){
        return produitRepository.findAll();
    }

    @DeleteMapping("/produit/{id}")
    public void delete(@PathVariable Long id){
        produitRepository.deleteById(id);
    }

    @PutMapping("/updateproduit")
    public produit updateProduct(@RequestBody produit p){
       return produitRepository.save(p);
    }
}
