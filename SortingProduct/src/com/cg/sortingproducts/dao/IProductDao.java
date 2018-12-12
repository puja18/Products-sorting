package com.cg.sortingproducts.dao;

import java.util.Set;

import com.cg.sortingproducts.bean.Product;

public interface IProductDao {
	public Set<Product> sortingProducts(int maxRange,int minRange);
	public Set<Product> sortByAscending();
	public Set<Product> sortByDecending();
	public Set<Product> mostViewed(int views);
	public Set<Product> bestSellers(int rating);

}
