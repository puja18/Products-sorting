package com.cg.sortingproducts.dao;

import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.sortingproducts.bean.Product;

@Repository("productservice")
public class ProductDaoImpl implements IProductDao{
	@PersistenceContext
	EntityManager em;
	
	
	@Override
	public Set<Product> sortingProducts(int maxRange, int minRange) {
		// TODO Auto-generated method stub
		Query query = em.createQuery("SELECT p FROM Product p WHERE p.price between :=maxRange and :=minRange");
		query.setParameter("price", maxRange);
		query.setParameter("price", minRange);
		return null;
	}
	
	@Override
	public Set<Product> sortByAscending() {
		// TODO Auto-generated method stub
		//SELECT c.name FROM Country c ORDER BY c.name ASC
		Query query = em.createQuery("SELECT p FROM Product p WHERE p.price between :maxRange and :minRange");
		query.setParameter("maxRange", 200.00);
		query.setParameter("minRange", 25000.00);
		Set<Product> products = (Set<Product>) query.getResultList();
		return products;
	}

	@Override
	public Set<Product> sortByDecending() {
		// TODO Auto-generated method stub
		//SELECT c.name FROM Country c ORDER BY c.name DESC
		return null;
	}

	@Override
	public Set<Product> mostViewed(int views) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Product> bestSellers(int rating) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
