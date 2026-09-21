package pt.upt.quality.campusride;

public class RentalService {
    private final Fleet fleet;

    public RentalService(Fleet fleet) {
        this.fleet = fleet;
    }

    public void rentVehicle(String id) {
        Vehicle v = fleet.findById(id);
        if (v == null) {
            throw new IllegalArgumentException("Vehicle not found: " + id);
        }
        v.rent();
    }

    public void returnVehicle(String id) {
        Vehicle v = fleet.findById(id);
        if (v == null) {
            throw new IllegalArgumentException("Vehicle not found: " + id);
        }
        v.returnVehicle();
    }

    public double estimatePrice(String id, int minutes) {
        Vehicle v = fleet.findById(id);
        if (v == null) {
            throw new IllegalArgumentException("Vehicle not found: " + id);
        }
        return v.calculatePrice(minutes);
    }
}