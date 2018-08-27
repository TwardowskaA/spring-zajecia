public class Main {
    public static void main(String[] args) {

        TemperatureProvider temperatureProvider = new RandomTemperatureProvider();
        TemperatureFormatter formatter = new NoOpTemperatureFormatter();
        TemperatureFormatter formatter2 = temperature -> temperature + "*C";

        TemperaturePrinter printer = new TemperaturePrinter(temperatureProvider, formatter2);
        printer.printTemperature();


    }
}
