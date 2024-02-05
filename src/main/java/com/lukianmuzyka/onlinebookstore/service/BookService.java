package com.lukianmuzyka.onlinebookstore.service;

import com.lukianmuzyka.onlinebookstore.model.Book;
import java.util.List;

public interface BookService {
    Book save(Book book);

    List<Book> findAll();
}
