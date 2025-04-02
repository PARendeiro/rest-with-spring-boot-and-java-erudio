package pt.com.erudio.model;

public class Greeting {

    private final long id;
    private final String name;

    public Greeting(final long id, final String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
