import java.io.*;
import java.util.Random;

public class FileTemperatureProvider implements TemperatureProvider {

    public int getTemperature() {
        try {
            File tempFile = new File("temp.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(tempFile));
            return Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();

            return -255;
        }
    }


}
