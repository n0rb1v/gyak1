import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

public class OwlCounter {
    private Map<String, Integer> data = new HashMap<>();

    public void readFromFile(BufferedReader reader) throws IOException {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] temp = line.split("=");
            data.put(temp[0], Integer.parseInt(temp[1]));
        }
    }

    public int getNumberOfOwls(String s) {
        return data.get(s);
    }
}
