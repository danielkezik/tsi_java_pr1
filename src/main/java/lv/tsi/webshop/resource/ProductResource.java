package lv.tsi.webshop.resource;

import lv.tsi.webshop.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/product")
public class ProductResource {

    @Autowired
    ProductRepository productRepository;

    @RequestMapping("/all")
    public @ResponseBody
    List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    @RequestMapping("/{id}")
    public @ResponseBody
    Optional<Product> getProductById(@PathVariable Long id) {
        return productRepository.findById(id);
    }
}
