import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    FakeValuesService fvs = new FakeValuesService(App.getLocale("uk"), new RandomService());
    String email = fvs.bothify("????##@gmail.com");
    Matcher emailMatcher = Pattern.compile("\\w{4}\\d{2}@gmail.com").matcher(email);

}
