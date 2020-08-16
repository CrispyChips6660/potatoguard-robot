package potatocult.potatogaurd;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import java.util.Scanner;

public class PotatoGaurd {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception{
        JDA jda = JDABuilder.createDefault(sc.next()).build();
    }
}
