package com.example.patientapp.Repositery;

import com.example.patientapp.Entity.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RendezVousRepositery extends JpaRepository<RendezVous,Long> {
}
