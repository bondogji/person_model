package PersonGenerator.java;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        person Tom = new person( "Tom", "Wolf","00001","prof",1960);
                System.out.println(Tom);
                System.out.println(Tom.getFullName());
        System.out.println(Tom.getFormallName());
        PersonGenerator2.PersonGen();

    }

}
