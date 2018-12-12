package com.cg.sortingproducts.controller;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.sortingproducts.bean.Product;

public class CapStoreController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Query query = em.createQuery("SELECT p FROM Product p BETWEEN :minRange AND :maxRange ORDER BY p.productCost DESC");
		query.setParameter("minRange", 200.00);
		query.setParameter("maxRange", 2500.00);
		List<Product> products = query.getResultList();
		for (Product pro : products) {
			System.out.println(pro);
			
		}
		
		Query query2 = em.createQuery("SELECT p FROM Product p WHERE p.rating:=?");
		if(product.getRating() >= 4) {
			query2.setParameter("rating", )
			
		}

	}

}
