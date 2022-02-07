import java.util.ArrayList;

/**
 * This class represents an UsedCarLot object
 *
 * @author David Yu
 */
public class UsedCarLot {
    /** An ArrayList of cars */
    private ArrayList<Car> inventory;

    /**
     * Instantiates an UsedCarLot object.
     *
     */
    public UsedCarLot() {
        inventory = new ArrayList<Car>();
    }

    /**
     * Returns the inventory, which is an ArrayList of cars
     *
     * @return The inventory of car objects
     */
    public ArrayList<Car> getInventory() {
        return inventory;
    }

    /**
     * Adds a car object to the inventory ArrayList
     *
     * @param car A new car object
     */
    public void addCar(Car car) {
        inventory.add(car);
    }

    /**
     * Swaps the car objects at 2 different indexes. Returns whether the swap was successful or not
     *
     * @param index1 The index of the car you want to swap
     * @param index2 The second index of the car you want to swap
     * @return Whether the swap was successful or not
     */
    public boolean swap(int index1, int index2) {
        if (index1 < 0 || index1 >= inventory.size() || index2 < 0 || index2 >= inventory.size()) {
            return false;
        } else {
            Car temp = inventory.get(index1);
            inventory.set(index1, inventory.get(index2));
            inventory.set(index2, temp);
            return true;
        }
    }

    /**
     * Adds a car to the inventory list at the index specified
     * <p>
     * PRECONDITION: 0 &lt;= indexToAdd &lt; inventory.size()
     *
     * @param indexToAdd The index where you want to add the car object
     * @param carToAdd The car object that you want to add to the inventory list
     */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        inventory.add(indexToAdd, carToAdd);
    }

    /**
     * Sells the car object located at a specified index
     * <p>
     * PRECONDITION: indexOfCarToSell &lt; inventory.size()
     *
     * @param indexOfCarToSell The index of the Car object you want to sell
     * @return The car that was sold
     */
    public Car sellCarShift(int indexOfCarToSell)
    {
        Car soldCar = inventory.remove(indexOfCarToSell);
        return soldCar;
    }

    /**
     * Sells the car object located at a specified index.
     * <p>
     * Replaces the sold car with NULL at the specified index
     * <p>
     * PRECONDITION: indexOfCarToSell &lt; inventory.size()
     *
     * @param indexOfCarToSell The index of the Car object you want to sell
     * @return The car that was sold
     */
    public Car sellCarNoShift(int indexOfCarToSell) {
        inventory.add(indexOfCarToSell, null);
        Car soldCar = inventory.remove(indexOfCarToSell + 1);
        return soldCar;
    }

    /**
     * Moves the car located at the specified index to another specified index
     * <p>
     * PRECONDITIONS: indexOfCarToMove &lt; inventory.size()
     *                destinationIndex &lt; inventory.size()
     *
     * @param indexOfCarToMove The index of the Car object you want to move
     * @param destinationIndex The index you want to move the car object to
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        Car movedCar = inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, movedCar);
    }



}
