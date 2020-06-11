package com.infosys.project1.DTO;

import java.util.Optional;

import com.infosys.project1.Entity.ProductEntity;

public class ProductDTO {
	int prodid;
	String brand;
	String category;
	String description;
	String image;
	float price;
	String productName;
	int rating;
	int sellerId;
	int stock;
	String subcategory;
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}
	public static ProductDTO valueof(ProductEntity p1) {
		ProductDTO product= new ProductDTO();
		product.setProdid(p1.getProdid());
		product.setBrand(p1.getBrand());
		product.setCategory(p1.getCategory());
		product.setDescription(p1.getDescription());
		product.setImage(p1.getImage());
		product.setPrice(p1.getPrice());
		product.setProductName(p1.getProductName());
		product.setRating(p1.getRating());
		product.setSellerId(p1.getSellerId());
		product.setStock(p1.getStock());
		product.setSubcategory(p1.getSubCategory());
		
		return product;
	
	}
	public static ProductDTO valueon(Optional<ProductEntity> product2) {
		ProductDTO product= new ProductDTO();
		product.setProdid(product2.get().getProdid());
		product.setBrand(product2.get().getBrand());
		product.setCategory(product2.get().getCategory());
		product.setDescription(product2.get().getDescription());
		product.setImage(product2.get().getImage());
		product.setPrice(product2.get().getPrice());
		product.setProductName(product2.get().getProductName());
		product.setRating(product2.get().getRating());
		product.setSellerId(product2.get().getSellerId());
		product.setStock(product2.get().getStock());
		product.setSubcategory(product2.get().getSubCategory());
		
		return product;
	}
	public ProductEntity createEntity() {
		ProductEntity pdt=new ProductEntity();
		pdt.setBrand(this.getBrand());
		pdt.setCategory(this.getCategory());
		pdt.setDescription(this.getDescription());
		pdt.setImage(this.getImage());
		pdt.setPrice(this.getPrice());
		pdt.setProdid(9);
		pdt.setSubCategory(this.getSubcategory());
		pdt.setProductName(this.getProductName());
		pdt.setRating(this.getRating());
		pdt.setSellerId(this.getSellerId());
		pdt.setStock(this.getStock());
		return pdt;
		
	}}
	






	
