package homework;

public class UserService {
    private final User user;
    private final Persister persister;

    public UserService(User user) {
        this.user = user;
        this.persister = new DatabasePersister();
    }

    public void save() {
        persister.save(user);
    }

    public void report() {
        System.out.println("Report for user: " + user.getName());
    }
}