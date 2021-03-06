package Transport2;

class PassengerTrain implements Train {

    private String nameOfTrain;

    PassengerTrain() {
        this.nameOfTrain = "Пассажирский поезд";
    }

    String getNameOfTrain() {
        return nameOfTrain;
    }

    RollingStock[] passengerTrain = {
            new SedentaryCar(),
            new SedentaryCar(),
            new CouchetteCar(),
            new CouchetteCar(),
            new CouchetteCar(),
            new SedentaryCar(),
            new SedentaryCar(),
            new Coupe(),
            new Coupe(),
            new SleepingCar(),
            new SedentaryCar(),
            new SedentaryCar(),
            new Coupe()
    };

    void sorting() {
        sortingByComfortClass(passengerTrain);
        System.out.println("Сортировка " + getNameOfTrain() + " на основе уровня комфортности:");

        for (int i = 0; i < passengerTrain.length; i++) {
            System.out.println("Вагон №" + (i + 1) + ", класс комфорта: " + passengerTrain[i].getComfortClassCar() +
                    ", наименование: " + passengerTrain[i].getNameCar());
        }

    }

    @Override
    public int countOfPassengersTrain(RollingStock[] passengerTrain) {
        int countOfPassengers = 0;
        for (RollingStock aPassengerTrain : passengerTrain)
            countOfPassengers += aPassengerTrain.getAmountOfPassengersCar();
        return countOfPassengers;

    }

    @Override
    public double countOfBaggageTrain(RollingStock[] passengerTrain) {
        int countOfBaggage = 0;
        for (RollingStock aPassengerTrain : passengerTrain) countOfBaggage += aPassengerTrain.getBaggageWeight();
        return countOfBaggage;
    }
}
