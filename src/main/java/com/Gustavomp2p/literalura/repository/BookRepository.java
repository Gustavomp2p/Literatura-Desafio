package com.Gustavomp2p.literalura.repository;

import com.Gustavomp2p.literalura.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    long countByLanguage(String language);
}
