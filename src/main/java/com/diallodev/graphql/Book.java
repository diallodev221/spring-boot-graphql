package com.diallodev.graphql;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Book(Integer id, String name, Integer pageCount, Integer authorId ) {
    public static List<Book> books = Arrays.asList(
            new Book(1, "Harry Potter", 200, 1),
            new Book(2, "Software design", 300, 1),
            new Book(3, "Quran", 100, 2),
            new Book(4, "Java", 500, 2),
            new Book(5, "NextJs", 800, 1),
            new Book(6, "Spring Boot", 200, 1)
    );

    public static Optional<Book> getBookById(Integer bookId) {
        return books.stream()
                .filter(b -> b.id().equals(bookId))
                .findFirst();
    }
}
