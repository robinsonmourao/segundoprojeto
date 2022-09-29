package com.a4s.segundoprojeto.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.a4s.segundoprojeto.entities.Product;
import com.a4s.segundoprojeto.repositories.ProductRepository;

@RestController //define que essa classe será reconhecida como um recurso Rest
@RequestMapping(value = "/products") //http responde a esse caminho
public class ProductResource {

	@Autowired //Sempre que instanciar o Category Resource ele puxa automaticamente outra instancia do CategoryRepository
	private ProductRepository productRepository;

	@GetMapping //Quando abrir o "/categories" vai abrir esse método
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = productRepository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product cat = productRepository.findById(id).get();
		return ResponseEntity.ok().body(cat);
	}
	
}
