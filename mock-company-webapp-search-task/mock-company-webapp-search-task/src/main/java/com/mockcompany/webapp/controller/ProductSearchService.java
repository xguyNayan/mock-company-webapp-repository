import java.util.Collection

public class ProductSearchService{
    private final (Collection<productltems> products){
        this.products = products;
    }
    public Collection<ProductItem> searchProducts(String query) {
        return products.stream()
                .filter(product -> product.getName().toLowerCase().contains(query.toLowerCase()) ||
                                   product.getDescription().toLowerCase().contains(query.toLowerCase()))
                .collect(Collectors.toList());
    }

}
