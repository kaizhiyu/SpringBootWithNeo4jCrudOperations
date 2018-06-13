package com.emperorbrains.neo4j;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
	@Autowired
	private BookRepository br;
	
	@GetMapping("/")
	public String inx(){
		br.save(new Book(1,"Spring With Neo4j","Crawn Rk Sir"));
		return "Welcome to Emperor Brains";
	}
	@PostMapping("/addBook")
	public String index(@RequestBody Book book) {
		br.save(book);
		return "Book Added Sucessfully";
	}
	
	@GetMapping("/getBook")
	public Iterable<Book> get() {
		return br.findAll();
	}
	
	@GetMapping("/getBook/{id}")
	public Optional<Book> getid(@PathVariable Integer id) {
		return br.findById(id);
	}
	
	@PutMapping("/updateBook/{id}")
	public Book updateBook(@RequestBody Book book) {
		return br.save(book);
	}
	
	@DeleteMapping("/delBook/{id}")
	public void delBook(@PathVariable Integer id) {
		br.deleteById(id);
	}
}
