package jeps;

import java.nio.charset.Charset;

public class Demo {

    public static void main(String[] args) {

        //jeps 400 - UTF-8 by Default

        System.out.println(Charset.defaultCharset()); //UTF-8

        String encoding = System.getProperty("native.encoding"); //Cp1252
        Charset cs = (encoding!=null) ? Charset.forName(encoding) : Charset.defaultCharset();
        System.out.println(cs); //windows-1252

    }
}
