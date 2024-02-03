package BuilderPattern;
import java.util.ArrayList;
import java.util.List;
public class User {
    protected final String firstName;
    protected final String lastName;
    protected final int age;
    protected final long phone;
    protected final String address;
    protected final String email;

    private User(UserBuilder userbuilder) {
        this.firstName = userbuilder.firstName;
        this.lastName = userbuilder.lastName;
        this.age = userbuilder.age;
        this.phone = userbuilder.phone;
        this.address = userbuilder.address;
        this.email = userbuilder.email;
    }

    protected static class UserBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private long phone;
        private String address;
        private String email;

        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(long phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}