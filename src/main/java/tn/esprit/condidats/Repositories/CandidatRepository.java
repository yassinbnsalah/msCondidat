package tn.esprit.condidats.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.condidats.entites.Condidat;

public interface CandidatRepository extends JpaRepository<Condidat,Integer> {
}
