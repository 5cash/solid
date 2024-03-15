package homework;

public class DatabasePersister implements Persister {
    @Override
    public void save(User user) {
        System.out.println("Saved user " + user.getName() + " to database");
    }
}