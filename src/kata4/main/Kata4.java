package kata4.main;

import java.io.File;
import kata4.view.*;
import kata4.model.*;

public class Kata4 {

    public static void main(String[] args) {
        // Version 1
        
        Iterable<Mail> mailList = new MailListReader().read("emails.txt");
        
        Histograma<String> histogram = new MailHistogramBuilder().build(mailList);
        
        
        
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram, "HISTOGRAMA");
        histogramDisplay.execute();
        
    }
    
}
