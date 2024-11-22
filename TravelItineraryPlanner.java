import java.util.ArrayList;
import java.util.Scanner;

class Destination {
    String name;
    String date;
    String preferences;
    double budget;

    public Destination(String name, String date, String preferences, double budget) {
        this.name = name;
        this.date = date;
        this.preferences = preferences;
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Destination: " + name + ", Date: " + date + ", Preferences: " + preferences + ", Budget: $" + budget;
    }
}

public class TravelItineraryPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Destination> itinerary = new ArrayList<>();
        String input;

        System.out.println("Welcome to the Travel Itinerary Planner!");

        while (true) {
            System.out.print("Enter the destination (or type 'done' to finish): ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }

            String destinationName = input;

            System.out.print("Enter the date for the destination (e.g., YYYY-MM-DD): ");
            String date = scanner.nextLine();

            System.out.print("Enter your preferences (e.g., activities, food): ");
            String preferences = scanner.nextLine();

            System.out.print("Enter your budget for this destination: ");
            double budget = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline

            Destination destination = new Destination(destinationName, date, preferences, budget);
            itinerary.add(destination);
        }

        // Display the itinerary
        System.out.println("\nYour Travel Itinerary:");
        double totalBudget = 0;
        for (Destination dest : itinerary) {
            System.out.println(dest);
            totalBudget += dest.budget;
        }

        System.out.printf("Total Budget for the trip: $%.2f%n", totalBudget);

        // Close the scanner
        scanner.close();
    }
}
