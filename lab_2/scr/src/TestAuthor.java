public class TestAuthor {
    public TestAuthor() {
    }

    public static void main(String[] args) {
        Author a1 = new Author("Evgeniya", "evgeniyamosunova@yandex.ru", 'F');
        System.out.println(a1);
        a1.setEmail("evgeniyamosunova@yandex.ru");
        System.out.println(a1);
    }
}

