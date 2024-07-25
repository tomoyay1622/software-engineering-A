package app.cancel;

import java.util.Date;

import app.AppException;
import app.ManagerFactory;
import domain.reservation.ReservationException;
import domain.reservation.ReservationManager;

public class CancelReservationControl {

    @SuppressWarnings("unchecked")
    public void cancel(String reservationNumber) throws AppException {
        try {
            //Consume reservation
            ReservationManager reservationManager = getReservationManager();
			reservationManager.consumeReservation(reservationNumber);

        } catch (ReservationException e) {
            AppException exception = new AppException("Failed to cancel", e);
            exception.getDetailMessages().add(e.getMessage());
            exception.getDetailMessages().addAll(e.getDetailMessages());
            throw exception;
        }
    }

    private ReservationManager getReservationManager() {
        return ManagerFactory.getInstance().getReservationManager();
    }
    
}
