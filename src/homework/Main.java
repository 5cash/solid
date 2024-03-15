package homework;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService(new User("Bob"));
        userService.report();
        userService.save();
    }
}