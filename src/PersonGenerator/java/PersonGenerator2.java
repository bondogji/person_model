package PersonGenerator.java;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonGenerator2 {


        public static void PersonGen() throws IOException {
            Scanner input = new Scanner(System.in);
            ArrayList<person> person00Data= new ArrayList<>();
            ArrayList<String> personCSVData = new ArrayList<>();
            Scanner in = new Scanner(System.in);
            String ID = "";
            String firstname = "";
            String Lastname = "";
            String title = "";
            String CSVPersonRecord = "";
            int YOB = 0;


            boolean done = false;
            boolean enteringDone = false;


            do {
                ID = SafeInput.getNonZeroLenString(in, "Enter the ID as 6 digits)");
                firstname = SafeInput.getNonZeroLenString (in, "Enter the First Name");
                Lastname = SafeInput.getNonZeroLenString(in, "Enter the Last Name");
                title = SafeInput.getNonZeroLenString(in, "Enter the Title");
                YOB = SafeInput.getRangedInt(in, "Enter the year of birth as 4 digits",  1000,  9999);

                CSVPersonRecord = ID + ", " + firstname + " , " + Lastname + " ," + title + " ," + YOB;

                personCSVData.add(CSVPersonRecord);

                person00Data.add(new person(ID, firstname, Lastname, title, YOB));

                done = SafeInput.getYNConfirm(input, "Are you done Entering persons? ");
            }while (!done);
            for ( String P : personCSVData)
                System.out.println(P);
            String fullString = "";
            for (int i = 0; i < personCSVData.size(); i++) {
                fullString = fullString + personCSVData.get(i) + "\n";
            }

            File workingDirectory = new File(System.getProperty("user.dir"));
            Path file = Paths.get(workingDirectory.getPath() + "\\src\\PersonData.txt");
            byte[] byteArray = fullString.getBytes();
            Files.write(file, byteArray);
            System.out.println("Data file written!");




        }

    }





