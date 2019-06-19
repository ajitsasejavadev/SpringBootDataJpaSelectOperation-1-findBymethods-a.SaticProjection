package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {


	interface viewA {
		String getProdCode();
		String getProdModel(); 
	}

	interface viewB {
		String getProdVenodr();
		Double getProdCost();
	}


	List<viewA> findByProdCost(Double prodCost);
	List<viewB> findByProdCode(String PordCode);


}
