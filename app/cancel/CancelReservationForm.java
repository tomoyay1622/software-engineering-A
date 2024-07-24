package app.cancel;

import app.AppException;

public class CancelReservationForm {

    private String reservationNumber;

    private CancelReservationControl cancelReservationControl = new CancelReservationControl();

    private CancelReservationControl getCancelReservationControl() {
        return cancelReservationControl;
    }

    public void setReservationNumber(String reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public String getReservationNumber(String reservationNumber) {
        return reservationNumber;
    }

    public void Cancel() throws AppException {
        CancelReservationControl cancelReservationControl = getCancelReservationControl();
        cancelReservationControl.cancel(reservationNumber);
    }
    
}
