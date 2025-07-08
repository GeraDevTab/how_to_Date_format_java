import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample2 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Date format");
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = formatter.format(date);
        System.out.println("Date Format with MM/dd/yyyy : " + strDate);

        formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        strDate = formatter.format(date);
        System.out.println("Date Format with dd-M-yyyy hh:mm:ss : " + strDate);

    }
}
