package com.a4s.segundoprojeto.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.a4s.segundoprojeto.entities.Category;
import com.a4s.segundoprojeto.repositories.CategoryRepository;

@RestController //define que essa classe será reconhecida como um recurso Rest
@RequestMapping(value = "/categories") //http responde a esse caminho
public class CategoryResource {

	@Autowired //Sempre que instanciar o Category Resource ele puxa automaticamente outra instancia do CategoryRepository
	private CategoryRepository categoryRepository;

	@GetMapping //Quando abrir o "/categories" vai abrir esse método
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = categoryRepository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category cat = categoryRepository.findById(id).get();
		return ResponseEntity.ok().body(cat);
	}
	
}
