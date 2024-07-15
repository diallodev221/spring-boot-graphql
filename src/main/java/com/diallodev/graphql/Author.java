package com.diallodev.graphql;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Author(Integer id, String name) {
    public  static List<Author> authors =  Arrays.asList(
            new Author(1, "Diallodev"),
            new Author(2, "Saifou"),
            new Author(2, "Allah")
    );

    public static Optional<Author> getAuthorById(Integer authorId) {
        return authors.stream()
                .filter(a -> a.id().equals(authorId))
                .findFirst();
    }

}
