package com.tomgropy.languageapp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Hello{
    public static void main(String[] args) throws IOException {
        String language=args[0];
        InputStream resourseStream =Hello.class.getResourceAsStream("/"+language+".txt");
        assert resourseStream != null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(resourseStream, StandardCharsets.UTF_8));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
    
}