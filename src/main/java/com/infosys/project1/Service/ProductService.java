package com.infosys.project1.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.project1.DTO.ProductDTO;
import com.infosys.project1.Entity.ProductEntity;
import com.infosys.project1.Repository.ProductRepository;
import com.infosys.project1.validator.ProductValidator;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;
	
	

	public List<ProductDTO> getproducts(){
		List<ProductEntity> product= productRepository.findAll();
		List<ProductDTO> productDTO= new ArrayList<ProductDTO>();
		for(ProductEntity p1: product) {
			ProductDTO product2= ProductDTO.valueof(p1);
			productDTO.add(product2);
		}
		return productDTO;
		
		
	}
	public List<ProductDTO> getproductsonCategory(String category){
		List<ProductEntity> product= productRepository.findAll();
		List<ProductDTO> productDTO= new ArrayList<ProductDTO>();
		for(ProductEntity P1: product) {
			if(P1.getCategory().equals(category)) {
			ProductDTO product1= ProductDTO.valueof(P1);
			productDTO.add(product1);}
			
		}
		return productDTO;	
	}
		
	
	
	public List<ProductDTO> getproductsonName(String productName){
		List<ProductEntity> product= productRepository.findAll();
		List<ProductDTO> productDTO= new ArrayList<ProductDTO>();
		for(ProductEntity p1: product) {
			if(p1.getProductName().equals(productName)) {
			ProductDTO product1= ProductDTO.valueof(p1);
			productDTO.add(product1);}
			
		}
		return productDTO;
		
	}
	public ProductDTO getProductsOnId(Integer prodid) {
		ProductDTO product1 = null;
		Optional<ProductEntity> product= productRepository.findById(prodid);
		if(product.isPresent()) {
//		ProductDTO productDTO= new ProductDTO();
		if(prodid.equals(product.get().getProdid())) {
			product1= ProductDTO.valueon(product);
			
	}}return product1;}

	public void addproducts(ProductDTO productdto) throws Exception{
		ProductValidator.ProdValidate(productdto);
		ProductEntity p2=productdto.createEntity();
		productRepository.save(p2);
		
	}
	
	public void deleteproducts(Integer prodid) {
		
			productRepository.deleteById(prodid);
		
		
	}}




