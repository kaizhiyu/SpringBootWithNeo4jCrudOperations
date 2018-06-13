package com.emperorbrains.neo4j;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface BookRepository extends Neo4jRepository<Book,Integer>{
}
