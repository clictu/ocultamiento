import java.util.Calendar;
import java.util.GregorianCalendar;

public class TodaysDate {

    // Member variables
    private String time;
    public int day;
    private int month;
    protected int year;

    // Método para imprimir la fecha y la hora
    public void printDateAndTime() {
        // Obtener la fecha y la hora actual
        GregorianCalendar calendar = new GregorianCalendar();
        time = calendar.get(Calendar.HOUR_OF_DAY) + ":" +
                calendar.get(Calendar.MINUTE) + ":" +
                calendar.get(Calendar.SECOND);
        day = calendar.get(Calendar.DATE);
        month = calendar.get(Calendar.MONTH) + 1; // Se suma 1 porque en Calendar.MONTH enero es 0
        year = calendar.get(Calendar.YEAR);
        System.out.println("Time: " + time);
        System.out.println("Date: " + month + " " + day + " " + year);
    }
}

