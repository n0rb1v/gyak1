import java.util.ArrayList;
import java.util.List;

public class Mail {
    private Contact from;
    private List<Contact> to = new ArrayList<>();
    private String subject;
    private String message;

    public Mail(Contact from, List<Contact> to, String subject, String message) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.message = message;
    }

    public void addTo(Contact c){
        to.add(c);
    }

    public Contact getFrom() {
        return from;
    }

    public List<Contact> getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }
}
