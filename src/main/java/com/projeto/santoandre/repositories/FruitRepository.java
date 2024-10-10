package com.projeto.santoandre.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.santoandre.models.FruitModel;

public interface FruitRepository extends JpaRepository<FruitModel, Long> {

}
