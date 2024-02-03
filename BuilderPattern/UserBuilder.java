package BuilderPattern;
import java.util.*;;

public class UserBuilder {
    public static void main(String[] args) {

        User.UserBuilder builder = new User.UserBuilder();
        builder.firstName("Erikka Marielle");
        builder.lastName("Enaje");
        builder.age(21);
        builder.phone(1432416712);
        builder.address("11 Carpa St Homeowners Drive Ext. Marikina City!");
        builder.email("erikka.enaje@neu.edu.ph");
        User myUser = builder.build();


        System.out.println("\nApplication Information\n");
        System.out.println("Firstname: " + myUser.firstName);
        System.out.println("Lastname: " + myUser.lastName);
        System.out.println("Age: " + myUser.age);
        System.out.println("Phone Number: " + myUser.phone);
        System.out.println("Email: " + myUser.email);
        System.out.println("\n Here your Application Information:\n Your name is Erikka Marielle Enaje.\n 21 years old.\n Your Phone Number is 1432416712." +
                "\n Your Address is 11 Carpa St., Homeowners Drive, Ext. Marikina City.\n Your email is erikka.enaje@neu.edu.ph" );
        System.out.println("\n\t\t\t\tThankyou! Have a great day!!");
    }
}