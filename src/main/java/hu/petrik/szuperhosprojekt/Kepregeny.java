package hu.petrik.szuperhosprojekt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Kepregeny {
    public static ArrayList<Szuperhos> szuperhosLista = new ArrayList<>();

    public static void szereplok(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] split = line.split(" ");
                String type = split[0];
                int value = Integer.parseInt(split[1]);

                if (type.equals("Vasember")) {
                    Vasember vasember = new Vasember();
                    for (int i = 0; i < value; i++) {
                        vasember.kutyutKeszit();
                    }
                    szuperhosLista.add(vasember);
                } else if (type.equals("Batman")) {
                    Batman batman = new Batman();
                    for (int i = 0; i < value; i++) {
                        batman.kutyutKeszit();
                    }
                    szuperhosLista.add(batman);
                }
            }
        }
    }
    public static void szuperhosok() {
        szuperhosLista.forEach(szuperhos -> System.out.println(szuperhos.toString()));
    }

}
