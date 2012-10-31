package com.thoughtworks;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static org.junit.Assert.assertEquals;

public class JsonExampleTest {
    @Test
    public void shouldReadJson() throws IOException {
        Gson gson = new Gson();
        SamplePojo sample = gson.fromJson(new JsonReader(new InputStreamReader(JsonExampleTest.class.getResourceAsStream("/sample.json"))), SamplePojo.class);
        assertEquals("makes clutter", sample.getStuff());
        assertEquals("foovalue1", sample.getThings().get(0).getFoo());
        assertEquals("barvalue1", sample.getThings().get(0).getBar());
        assertEquals("foovalue2", sample.getThings().get(1).getFoo());
        assertEquals("barvalue2", sample.getThings().get(1).getBar());
    }
}
