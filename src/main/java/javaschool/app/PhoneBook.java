package javaschool.app;

import asg.cliche.Command;
import asg.cliche.Shell;
import asg.cliche.ShellDependent;
import asg.cliche.ShellFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PhoneBook implements ShellDependent {
    private List<Record> recordList = new ArrayList<>();

    @Command
    public void create(String name, String email, String... phones) {
        Record r = new Record();
        r.setName(name);
        r.setEmail(email);
        r.addPhones(phones);

        recordList.add(r);
    }

    @Command
    public List<Record> list() {
        return recordList;
    }

    @Command
    public void addPhone(int id, String phone) {
        for (Record r : recordList) {
            if (r.getId() == id) {
                r.addPhones(phone);
                break;
            }
        }
    }

    @Command
    public void edit(int id) throws IOException {
        for (Record r : recordList) {
            if (r.getId() == id) {
                ShellFactory.createSubshell("#" + id, theShell, "Edit record", r)
                        .commandLoop();
                break;
            }
        }
    }

    private Shell theShell;

    public void cliSetShell(Shell theShell) {
        this.theShell = theShell;
    }
}
