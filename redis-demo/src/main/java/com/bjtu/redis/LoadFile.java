package com.bjtu.redis;

import java.io.*;

public class LoadFile {
    public String ReadFile() throws IOException {
        InputStream input = null;
        input = this.getClass().getClassLoader().getResourceAsStream("counter.json");
        byte[] bytes = new byte[0];
        if(input == null) {
            return "";
        }
        bytes = new byte[input.available()];
        input.read(bytes);
        return new String(bytes);
    }
}
