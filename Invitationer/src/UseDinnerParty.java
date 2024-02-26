import java.util.Scanner;

public class UseDinnerParty {
    public static void main(String[] args) {
        int guests = 0;
        Party aParty = new Party();
        Scanner scanner = new Scanner(System.in);
        DinnerParty aDinnerParty = new DinnerParty();
        ;

        System.out.println("Enter the amount of attendees, please!");

        aParty.setGuests(Integer.parseInt(scanner.nextLine()));

        System.out.println("And how many are coming to dinner?");

        aDinnerParty.setGuests(Integer.parseInt(scanner.nextLine()));

        System.out.println("What'll they eat? (1) Meat, (2) Veggie, (3) Pescatarian, or (4) Vegan?");

        aDinnerParty.setDinnerChoice(Integer.parseInt(scanner.nextLine()));

        aParty.setGuests(aParty.getGuests() + aDinnerParty.getGuests());

        aDinnerParty.displayInvitation();

        aParty.displayInvitation();












    }
}