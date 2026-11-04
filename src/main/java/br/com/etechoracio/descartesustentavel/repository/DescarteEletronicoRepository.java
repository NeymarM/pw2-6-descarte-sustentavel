package br.com.etechoracio.descartesustentavel.repository;

import br.com.etechoracio.descartesustentavel.entity.DescarteEletronico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DescarteEletronicoRepository extends JpaRepository<DescarteEletronico, Long> {
}