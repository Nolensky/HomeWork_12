public class Book {

    private final String book;
    private final Author author;
    private int yearPublished;

    public Book(String book, Author author, int yearPublished) {
        this.book = book;
        this.author = author;
        this.yearPublished = yearPublished;
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
}
