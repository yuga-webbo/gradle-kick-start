package com.tomgropy.languageapp;
import org.junit.jupiter.api.Test;
import java.io.IOException;
public class HelloTest{
    @Test
    public void testSayHello() throws IOException {
        Hello.main(new String[]{"en"});
    }
}