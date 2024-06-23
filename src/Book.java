import java.util.Objects;

public class Book {

    private final String book;
    private final Author author;
    private int yearPublished;

    public Book(String book, Author author, int yearPublished) {
        this.book = book;
        this.author = author;
        this.yearPublished = yearPublished;
    }
    public Book(String book,Author author) {
        this(book, author,0);
    }

    public int getYearPublished() {
        return this.yearPublished;
    }

    public Author getAuthor() {
        return this.author;
    }

    public String getBook() {
        return this.book;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    @Override
    public String toString() {
        return  "Книга: " + book + ", " + author +
                ", год издания: " +  yearPublished;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;
        Book otherBook = (Book) otherObject;
        return yearPublished == otherBook.yearPublished && book.equals(otherBook.book) && author.equals(otherBook.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book, author, yearPublished);
    }
}
