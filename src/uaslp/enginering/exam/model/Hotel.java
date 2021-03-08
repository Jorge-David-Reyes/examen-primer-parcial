package uaslp.enginering.exam.model;
import java.util.ArrayList;

public class Hotel {
    private ArrayList<Reservation> reservations;
    private ArrayList<Room> rooms;
    private String name;
    private int pools;
    private int gyms;
    public Hotel(String name, int pools, int gyms) {
        reservations = new ArrayList<Reservation>();
        rooms=new ArrayList<Room>();
        this.name=name;
        this.pools=pools;
        this.gyms=gyms;
    }

    public void reserveRoom(int roomNumber, Guest guest, String arrivalDate, int nights) {
        Reservation reservation = new Reservation();

        reservation.setRoomNumber(roomNumber);
        reservation.setArrivalDate(arrivalDate);
        reservation.setGuest(guest);
        reservation.setNights(nights);

        reservations.add(reservation);
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public void addRoom(Room room){
        rooms.add(room);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }
    public int getPools() {
        return pools;
    }
    public int getGyms() {
        return gyms;
    }
}
