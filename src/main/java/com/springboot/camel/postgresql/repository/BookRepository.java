package com.springboot.camel.postgresql.repository;

import com.springboot.camel.postgresql.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    Book findBookByName(String name);
}
