package kata4.view;

import kata4.model.Histograma;
import kata4.model.Mail;

public class MailHistogramBuilder {

    public Histograma<String> build(Iterable<Mail> list){
        Histograma histogram = new Histograma();
        for (Mail mail : list) {
            histogram.increment(mail.getDomain());
        }
        return histogram;
    }
}
