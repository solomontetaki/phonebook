package javaschool.app;

import asg.cliche.Command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by JavaCourses on 29.03.2017..
 */
public class Person extends Record {
    private String email;
    private final List<String> phones = new ArrayList<>();


    @Command
    public String getEmail() {
        return email;
    }

    public List<String> getPhones() {
        return phones;
    }

    @Command
    public void setEmail(String email) {
        this.email = email;
    }

    @Command
    public void addPhones(String... phones) {
        this.phones.addAll(Arrays.asList(phones));
    }

    @Override
    public String toString() {
        return getId() + " " + getName() + " " + email + " " + phones;
    }
}
