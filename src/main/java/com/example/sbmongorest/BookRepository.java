package com.example.sbmongorest;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "book", path="book")
public interface BookRepository extends MongoRepository<Book,String> {
    public Book findBookByName(String name);
}
