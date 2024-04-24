import java.util.Observable;
import java.util.Observer;

public class Cart extends Observable {
    private Book book;
    private int quantity;

    public Cart(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
        setChanged();
        notifyObservers();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        setChanged();
        notifyObservers();
    }
}
