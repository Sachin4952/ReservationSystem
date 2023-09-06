import java.util.Scanner;

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean authenticate(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}

public class ReservationSystem {
    private static User authorizedUser;

    public static void main(String[] args) {
        User user = new User("yourUsername", "yourPassword");
        authorizedUser = user;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Online Reservation System");
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (authorizedUser.authenticate(username, password)) {
            System.out.println("Login successful!");
            showReservationForm();
        } else {
            System.out.println("Invalid username or password. Exiting...");
        }
    }

    private static void showReservationForm() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Reservation System");
        System.out.print("Enter train number: ");
        String trainNumber = scanner.nextLine();
        // Add code to retrieve train name based on train number
        String trainName = "Sample Train Name"; // Replace with actual logic
        System.out.println("Train Name: " + trainName);
        System.out.print("Enter class type: ");
        String classType = scanner.nextLine();
        System.out.print("Enter date of journey: ");
        String dateOfJourney = scanner.nextLine();
        System.out.print("Enter departure place: ");
        String departurePlace = scanner.nextLine();
        System.out.print("Enter destination: ");
        String destination = scanner.nextLine();

        // Add code to insert reservation into the database or perform desired action
        System.out.println("Reservation successful!");
    }
}

