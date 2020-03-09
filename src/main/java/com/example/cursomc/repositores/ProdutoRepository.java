package com.example.cursomc.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cursomc.domain.Produto;;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
