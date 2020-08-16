package potatocult.potatogaurd;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class PotatoGaurd {
    public static final String BOT_TOKEN = "NzQ0MzcxMzU0MDY5MTA2ODA5.XziP2A.ekYyTLhZUba1Nrjvq9Xh6ATkYJI";
    public static void main(String[] args) throws Exception{
        JDA jda = JDABuilder.createDefault(BOT_TOKEN).build();
    }
}
