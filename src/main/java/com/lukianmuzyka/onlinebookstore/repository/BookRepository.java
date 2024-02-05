package com.lukianmuzyka.onlinebookstore.repository;

import com.lukianmuzyka.onlinebookstore.model.Book;
import java.util.List;

public interface BookRepository {
    Book save(Book book);

    List<Book> findAll();
}
