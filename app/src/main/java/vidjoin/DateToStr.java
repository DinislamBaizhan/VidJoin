package vidjoin;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class DateToStr {
    static String toYYyMMmDD(GregorianCalendar date) {
       SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy'y'MM'm'dd");
       return simpleDateFormat.format(date.getTime());
   }
}
