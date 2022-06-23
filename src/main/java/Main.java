import domain.Product;
import repository.ProductRepository;

public class Main {
    public static void  main (String[] arg) {
        ProductRepository repo = new ProductRepository();
        repo.save(new Product(11, "Азбука", 235));
        repo.save(new Product(222, "Краш", 499));
        repo.save(new Product(3000, "Клетка", 259));
//        Удали элемент с айди 222
        repo.removeById(-90);

    }
}
