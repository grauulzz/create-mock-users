import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.util.*;

public class PopulateData {

    private final List<User> userlist;


    Faker faker = new Faker();
    LocalDate somePastDate = LocalDate.of(1993, 1, 1);
    LocalDate now = LocalDate.now();
    Date randomDate = faker.date().between(App.convertToDateViaInstant(somePastDate), App.convertToDateViaInstant(now));
    Date currentDate = App.convertToDateViaInstant(now);

    User fakeUser = new User.UserBuilder(randomDate, faker.name().firstName(), faker.name().lastName())
            .age(faker.number().numberBetween(20, 80))
            .phone(faker.phoneNumber().phoneNumber())
            .address(faker.address().fullAddress())
            .build();

    User realUser = new User.UserBuilder(currentDate, "", "")
            .age(0)
            .phone("")
            .address("")
            .build();


    public PopulateData(int numberOfEntries) {

        this.userlist = new ArrayList<>(numberOfEntries);

        for (int i=0; i < numberOfEntries; i++ ) {
            userlist.add(new User.UserBuilder(randomDate, faker.name().firstName(), faker.name().lastName())
                    .age(faker.number().numberBetween(20, 80))
                    .phone(faker.phoneNumber().phoneNumber())
                    .address(faker.address().fullAddress())
                    .build());
        }
    }

    public List<User> getUserlist() {
        return this.userlist;
    }

    static <T> void fillWithNull(List<T> l) {
        Collections.fill(l, null);
    }

}
