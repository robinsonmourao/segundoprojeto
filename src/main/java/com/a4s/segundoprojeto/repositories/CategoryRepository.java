package com.a4s.segundoprojeto.repositories;
/* 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
*/

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.a4s.segundoprojeto.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long>{

}
/*
@Component
public class CategoryRepository {


    private Map<Long, Category> map = new HashMap<>();

	public void save(Category obj) {
		map.put(obj.getId(),obj);
	}

	public Category findById(Long id) {
		return map.get(id);
	}
	
	public List<Category> findAll() {
		return new ArrayList<Category>(map.values());
	}
    
}
*/