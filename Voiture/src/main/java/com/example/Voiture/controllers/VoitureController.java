package com.example.Voiture.controllers;

import com.example.Voiture.entities.Voiture;
import com.example.Voiture.service.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/voitures")
public class VoitureController {


    @Autowired
    private VoitureService voitureService;

    @GetMapping
    public List<Voiture> findAll() {
        return voitureService.findAll();
    }

    @PostMapping
    public Voiture save(@RequestBody Voiture entity) {
        return voitureService.save(entity);
    }

    @GetMapping("/{aLong}")
    public Optional<Voiture> findById(@PathVariable Long aLong) {
        return voitureService.findById(aLong);
    }

    public void deleteById(Long aLong) {
        voitureService.deleteById(aLong);
    }


}