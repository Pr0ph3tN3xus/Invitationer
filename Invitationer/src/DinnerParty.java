public class DinnerParty extends Party{
    private int dinnerChoice = 0;
    String[] choices = {"Meat", "Veggie", "Pescatarian", "Boring"};

    public int getDinnerChoice() {
        return dinnerChoice;
    }

    public void setDinnerChoice(int dinnerChoice) {
        this.dinnerChoice = dinnerChoice;
    }
    @Override
    public void displayInvitation() {
        System.out.println("For dinner, we have " + getGuests() + " People, who are eating a " + choices[getDinnerChoice() - 1] + " meal.");
    }
}
