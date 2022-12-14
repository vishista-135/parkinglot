package bike.rapido.parkingLot;

public class Owner implements ParkingLotObserver {
    private boolean isLotEmptyAgain = false;
    private boolean isParkingLotFull = false;

    public boolean isLotFull() {
        return isParkingLotFull;
    }

    public void notifyParkingLotIsFull() {
        isParkingLotFull = true;
    }

    public boolean isParkingLotEmptyAgain() {
        return isLotEmptyAgain;
    }

    public void notifyParkingLotIsEmptyAgain(){
        isLotEmptyAgain = true;
    }
}
