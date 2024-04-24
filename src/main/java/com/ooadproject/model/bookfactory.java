public interface BookFactory {
    Book createBook(String barcode, String name, String author, double price, int quantity);
}

public class DefaultBookFactory implements BookFactory {
    @Override
    public Book createBook(String barcode, String name, String author, double price, int quantity) {
        return new Book(barcode, name, author, price, quantity);
    }
}

//using the DefaultBookFactory to create instances of Book objects
BookFactory factory = new DefaultBookFactory();
Book book = factory.createBook("123456", "The Great Gatsby", "F. Scott Fitzgerald", 12.99, 50);
