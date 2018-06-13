package com.emperorbrains.neo4j;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NodeEntity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	@Id private Integer id;
	private String nameBook;
	private String author;
	
	public Book() {
	}

	
	public Book(int id, String nameBook, String author) {
		super();
		this.id = id;
		this.nameBook = nameBook;
		this.author = author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}
	public String getAuthor() {
		return author;
	}
	public int getId() {
		return id;
	}
	public String getNameBook() {
		return nameBook;
	}
}
