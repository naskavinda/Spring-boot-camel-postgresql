package com.springboot.camel.postgresql.service;

import com.springboot.camel.postgresql.entity.Book;
import com.springboot.camel.postgresql.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Book findBookByName(String name) {
        return bookRepository.findBookByName(name);
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public void removeBook(int bookId) {
        bookRepository.deleteById(bookId);
    }
}
