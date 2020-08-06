package pl.backlog.green;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class DeserializeExample {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        p.load(new FileReader("src/main/resources/flag.properties"));
        boolean flag = Boolean.getBoolean(p.getProperty("flag"));
        if (flag) {
            System.out.println("Flag is set to true");
        } else {
            System.out.println("Flag is set to false");
        }
    }
}
