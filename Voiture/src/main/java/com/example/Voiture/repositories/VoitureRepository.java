package com.example.Voiture.repositories;

import com.example.Voiture.entities.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoitureRepository extends JpaRepository<Voiture,Long> {

}
