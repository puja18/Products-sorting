package com.cg.sortingproducts.service;

import java.util.Set;

import javax.transaction.Transactional;
import javax.xml.ws.ServiceMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.sortingproducts.bean.Product;
import com.cg.sortingproducts.dao.IProductDao;


@Service("customerservice")
@Transactional
public class ProductServiceImpl implements IProductService {

	@Autowired
    IProductDao dao;
    
	@Override
	public Set<Product> sortingProducts(int maxRange, int minRange) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Product> sortByAscending() {
		// TODO Auto-generated method stub
		return dao.sortByAscending();
	}

	@Override
	public Set<Product> sortByDecending() {
		// TODO Auto-generated method stub
		return dao.sortByDecending();
	}

	@Override
	public Set<Product> mostViewed(int views) {
		// TODO Auto-generated method stub
		return dao.mostViewed(views);
	}

	@Override
	public Set<Product> bestSellers(int rating) {
		// TODO Auto-generated method stub
		return dao.bestSellers(rating);
	}

	
}
