package javaschool.app;

import asg.cliche.Command;

/**
 * Created by JavaCourses on 29.03.2017..
 */
public class Note extends Record {
    private String note;

    public String getNote() {
        return note;
    }

    @Command
    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return getId() + " " + getName() + " " + note;
    }
}