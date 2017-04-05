package javaschool.app;

import asg.cliche.Command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Record {
    private static int count = 0;
    private int id;
    private String name;

    public Record() {
        count++;
        id = count;
    }

    public String getName() {
        return name;
    }

    @Command
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public boolean contains (String str) {
        str = str.toLowerCase();
        name = name.toLowerCase();
        return name.contains(str);

    }
}
