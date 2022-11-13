package kata4.view;

import kata4.model.Mail;

public interface Loader {
    
    public Iterable<Mail> read(String fileName);
    
}
