public class NoOpTemperatureFormatter implements TemperatureFormatter{
    @Override
    public String format(int temperature) {
        return String.valueOf(temperature);
    }
}
