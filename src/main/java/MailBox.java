import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<Mail> mails = new ArrayList<>();

    public void addMail(Mail mail1) {
        mails.add(mail1);
    }

    public List<Mail> getMails() {
        return mails;
    }

    public List<Mail> findByCriteria(String s) {
        if (s.startsWith("from:")) {
            return searchFrom(s.replace("from:", ""));
        }
        if (s.startsWith("to:")) {
            return searchTo(s.replace("to:", ""));
        }
        return search(s);
    }

    private List<Mail> searchFrom(String s) {
        List<Mail> result = new ArrayList<>();
        for (Mail item : mails) {
            if (item.getFrom().getEmail().equals(s) || item.getFrom().getName().equals(s)) {
                result.add(item);
            }
        }
        return result;
    }

    private List<Mail> searchTo(String s) {
        List<Mail> result = new ArrayList<>();
        for (Mail item : mails) {
            for (Contact cont : item.getTo()) {
                if (cont.getEmail().equals(s) || cont.getName().equals(s)) {
                    result.add(item);
                }
            }
        }
        return result;
    }

    private List<Mail> search(String s) {
        List<Mail> result = new ArrayList<>();
        for (Mail item : mails) {
            if (item.getSubject().contains(s)) {
                result.add(item);
            }
            if (item.getMessage().contains(s)) {
                result.add(item);
            }
        }
        return result;
    }

}
