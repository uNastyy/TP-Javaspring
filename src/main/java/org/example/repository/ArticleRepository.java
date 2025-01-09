package org.example.repository;

import org.springframework.data.repository.CrudRepository;

import org.example.model.Article;

import java.util.Optional;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ArticleRepository extends CrudRepository<Article, Integer> {
    Optional<Article> findById(Integer id);
}