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

import com.a4s.segundoprojeto.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{

}
/*
@Component
public class ProductRepository {

    private Map<Long, Product> map = new HashMap<>();

	public void save(Product obj) {
		map.put(obj.getId(),obj);
	}

	public Product findById(Long id) {
		return map.get(id);
	}
	
	public List<Product> findAll() {
		return new ArrayList<Product>(map.values());
	}
}
*/