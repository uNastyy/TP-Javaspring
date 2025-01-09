package org.example.repository;

import org.springframework.data.repository.CrudRepository;

import org.example.model.Reaction;

import java.util.List;
import java.util.Optional;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ReactionRepository extends CrudRepository<Reaction, Integer> {
    List<Reaction> findByArticleId(Integer articleId);
    List<Reaction> findByUserId(Integer userId);

    Optional<Object> findByArticleIdAndUserId(Integer articleId, Integer userId);
}