
public class Party {
    protected int guests = 0;
    public void displayInvitation() {
        System.out.println("We have " + getGuests() + " People total so far, Show up or Throw up!");


    }

    public int getGuests() {
        return guests;
    }

    public void setGuests(int guests) {
        this.guests = guests;
    }
}
