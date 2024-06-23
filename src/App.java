public class App {
    public static void main(String[] args) {
        Author AlexPushkin;
        Author LevTolstoy;
        AlexPushkin = new Author("Александр", "Пушкин");
        LevTolstoy = new Author("Лев", "Толстой");
        Book book = new Book("Сказка о рыбаке и рыбке",AlexPushkin, 1835);
        Book book2 = new Book("Война и мир", LevTolstoy, 1868);
        Book [] books = {book, book2};
        for (Book element : books) {
            System.out.println(element);
        }
    }
}


