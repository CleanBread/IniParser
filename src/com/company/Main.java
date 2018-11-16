package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	    IniFile f = new IniFile("src/file.ini");

	    System.out.println(f.getInt("DEBUG", "PlentySockMaxQSize", 1));
    }
}
