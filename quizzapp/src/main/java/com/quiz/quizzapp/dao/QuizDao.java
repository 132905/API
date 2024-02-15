package com.quiz.quizzapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.quizzapp.model.Quiz;

@Repository
public interface QuizDao extends JpaRepository<Quiz, Integer> {
}
