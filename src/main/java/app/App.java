package app;


import app.dto.User;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.IOException;


public class App {

    public static void main(String[] args) throws IOException, IllegalAccessException {
        //reader
        User user = new User();
        FileInputStream fileInputStream = new FileInputStream(User.class.getClassLoader().getResource("user.json").getFile());
        ObjectMapper mapper = new ObjectMapper();
        user = mapper.readValue(fileInputStream, User.class);
        System.out.println(user);
    }
}