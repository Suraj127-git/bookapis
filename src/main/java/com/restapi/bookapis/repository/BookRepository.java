package com.restapi.bookapis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.bookapis.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
