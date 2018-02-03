package Time_Counter;

import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Timer extends JPanel {

	private static final long serialVersionUID = 1L;
	int hours, days, years, leap_year;

    Timer() {

		Date date1 = new Date(95, 01, 19);
        Date date2 = new Date();
        long milliseconds = date2.getTime() - date1.getTime();
        hours = 0;
        days = 0;
        leap_year=3;
        
        while (milliseconds > 3600000) {
            milliseconds -= 3600000;
            hours++;
        }
        
        while (hours > 24) {
            hours -= 24;
            days++;
        }
        
        while (days > 365) {
        	
        	if(leap_year==4) {
        		days -= 366;
            	years++;
            	leap_year=0;
        	}
        	
        	else {
	        	days -= 365;
	        	years++;
	        	leap_year++;
        	}
        }
       
        JLabel Texto = new JLabel("It has been " + years + " years " + days + " days and " + hours + " hours of life");
        this.add(Texto);
    }
}
