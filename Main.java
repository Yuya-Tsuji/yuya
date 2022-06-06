import java.util.*;
import java.time.*;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws Exception {
        
    //現在日のみ取得(LocalDate)
    final LocalDate currentdate = LocalDate.now();
    System.out.println(currentdate.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));
    }
}
