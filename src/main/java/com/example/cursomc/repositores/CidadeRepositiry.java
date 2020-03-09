package com.example.cursomc.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cursomc.domain.Cidade;
@Repository
public interface CidadeRepositiry extends JpaRepository<Cidade, Integer>{

}
