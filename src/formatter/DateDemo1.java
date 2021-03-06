package formatter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        DateFormat format1 = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        DateFormat format2 = new SimpleDateFormat("День dd Месяц MM Год yyyy Время hh:mm");
        System.out.println(format1.format(d)); //25.02.2013 09:03
        System.out.println(format2.format(d)); //День 25 Месяц 02 Год 2013 Время 09:03
    }
}
