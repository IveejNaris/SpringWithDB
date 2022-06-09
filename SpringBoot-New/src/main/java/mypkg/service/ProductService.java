package mypkg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import mypkg.entity.Product;
import mypkg.repository.ProductRepository;

@Service
@Profile(value = {"demo","testdemo"})
public class ProductService {
	@Autowired
	private ProductRepository productRepository;

	public Product getProductById(int id) {
		return productRepository.findById(id).orElse(null);
	}

	public Product saveProduct(Product p) {
		return productRepository.save(p);
	}

	public List<Product> getProducts() {
		return productRepository.findAll();
	}

	public List<Product> saveProducts(List<Product> p) {
		return productRepository.saveAll(p);
	}
	
	public String deleteProduct(int id) {
		productRepository.deleteById(id);
		return "Product Removed " + id;
	}

	public Product updateProduct(Product p) {
		Product prodInDB = productRepository.findById(p.getId()).orElse(null);
		prodInDB.setQuantity(12);
		return productRepository.save(p);
	}
}
