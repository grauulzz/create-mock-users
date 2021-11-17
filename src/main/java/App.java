
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

public class App {

    static Locale getLocale(final String l) {
        if (l == null) { return Locale.getDefault(); }
        final String locale = l.toLowerCase();
        return switch (locale) {
            case "us" -> Locale.US;
            case "fr" -> Locale.FRANCE;
            case "en" -> Locale.ENGLISH;
            case "de" -> Locale.GERMAN;
            case "it" -> Locale.ITALIAN;
            case "jp" -> Locale.JAPANESE;
            case "uk" -> Locale.UK;
            default -> new Locale(locale);
        };
    }


     static Date convertToDateViaInstant(LocalDate dateToConvert) {
        return java.util.Date.from(dateToConvert.atStartOfDay()
                .atZone(ZoneId.systemDefault())
                .toInstant());
    }

    public static void main(String[] args) {

        PopulateData p = new PopulateData(60);

        System.out.println(p.getUserlist());


    }

}
