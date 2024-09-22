package comparatorsnc_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class book {
    String title;
    String author;
    double price;

    public static void main (String[]args){

        List<book> books = new ArrayList<>();

        book a = new book();
        a.setAuthor("J.K Rowling");
        a.setTitle("Harry Potter and the Goblet of fire");
        a.setPrice(80.40);
        books.add(a);


        book b = new book();
        b.setAuthor("J.R.R. Tolkien");
        b.setTitle("The Lord of the Rings");
        b.setPrice(120.50);
        books.add(b);
        
        book c = new book();
        c.setAuthor("George Orwell");
        c.setTitle("1984");
        c.setPrice(60.00);
        books.add(c);
    

        Collections.sort(books, new bookcomparator());

        for (book bk : books) {
            System.out.println(bk);
        }

    }

public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

@Override
public String toString() {
       return title+ ", " +author+ ", " +price;
    }


}
