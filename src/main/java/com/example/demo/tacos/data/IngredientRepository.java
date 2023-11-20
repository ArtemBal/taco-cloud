package com.example.demo.tacos.data;

import java.util.Optional;

import com.example.demo.tacos.Ingredient;

public interface IngredientRepository {
	Iterable<Ingredient> findAll();
    Optional<Ingredient> findById(String id);
    Ingredient save(Ingredient ingredient);
}
