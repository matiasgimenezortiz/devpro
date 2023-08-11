import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class InventoryManager {
    public static List<Product> sortProducts(List<Product> products, String sortKey, boolean ascending) {
        Comparator<Product> comparator = null;

        if ("name".equals(sortKey)) {
            comparator = Comparator.comparing(Product::getName);
        } else if ("price".equals(sortKey)) {
            comparator = Comparator.comparing(Product::getPrice);
        } else if ("stock".equals(sortKey)) {
            comparator = Comparator.comparing(Product::getStock);
        }

        if (comparator != null) {
            if (!ascending) {
                comparator = comparator.reversed();
            }
            products.sort(comparator);
        }

        return products;
    }
}
