package uaslp.enginering.exam.model;

public class Room {
    private int number;
    private String type;
    private RoomStatus roomStatus;
    Reservation reservation=new Reservation();

    public Room(Reservation reservation) {
        this.reservation = reservation;
    }

    public Room(int number, String type, RoomStatus roomStatus) {
        this.number=number;
        this.type=type;
        this.roomStatus=roomStatus;
    }

    public RoomStatus getStatus() {
        return roomStatus;
    }

    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }
}
