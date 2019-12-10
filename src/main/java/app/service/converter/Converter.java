package app.service.converter;

import app.dto.User;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Converter {
    private final static String baseFile="user.json";

    public static void convertToJson(User user) throws IOException {
        ObjectMapper mapper=new ObjectMapper();
        mapper.writeValue(new File(baseFile),user);
        System.out.println("Json Created");
    }
}
