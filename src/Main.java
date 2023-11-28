public class Main {
    public static void main(String[] args) {
        SharedObject shared = new SharedObject();
        Thread user1Thread = new User(shared, "user1", 50);
        user1Thread.start();

        Thread user2Thread = new User(shared, "user2", 100);
        user2Thread.start();
    }
}

