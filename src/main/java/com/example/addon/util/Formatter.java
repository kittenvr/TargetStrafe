package com.example.addon.util;

import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import net.minecraft.SharedConstants;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Formatter {

    public static String getFormattedPath(File f) {
        return "\"" + f.getPath() + "\"";
    }

    public static String stripName(String playerName, String msg) {
        return msg.replace(playerName, "");
    }
    public static int randInt(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    public static Color sToMC(SettingColor sc) { // SettingColor -> MeteorColor
        if (sc == null) return null;
        return new Color(sc.r, sc.g, sc.b, sc.a);
    }

    public static Color cToMC(java.awt.Color c) { // java.awt.Color -> MeteorColor
        if (c == null) return null;
        return new Color(c.getRed(), c.getGreen(), c.getBlue(), c.getAlpha());
    }

    public static java.awt.Color mcToC(Color c) { // MeteorColor -> java.awt.color
        if (c == null) return null;
        return new java.awt.Color(c.r, c.g, c.b, c.a);
    }

    public static java.awt.Color sToC(SettingColor sc) { // SettingColor -> java.awt.color
        if (sc == null) return null;
        return new java.awt.Color(sc.r, sc.g, sc.b, sc.a);
    }



    /*public static final List<String> spotTitle = List.of("{song}", "{songtitle}");
    public static final List<String> spotTrack = List.of("{songname}", "{currentsong}");
    public static final List<String> disc = List.of("{discord}", "{invite}");*/


    public static String applyEmotes(String msg) {
        if (msg.contains(":smile:")) msg = msg.replace(":smile:", "☺");
        if (msg.contains(":sad:")) msg = msg.replace(":sad:", "☹");
        if (msg.contains(":heart:")) msg = msg.replace(":heart:", "❤");
        if (msg.contains(":skull:")) msg = msg.replace(":skull:", "☠");
        if (msg.contains(":star:")) msg = msg.replace(":star:", "★");
        if (msg.contains(":flower:")) msg = msg.replace(":flower:", "❀");
        if (msg.contains(":pick:")) msg = msg.replace(":pick:", "⛏");
        if (msg.contains(":wheelchair:")) msg = msg.replace(":wheelchair:", "♿");
        if (msg.contains(":lightning:")) msg = msg.replace(":lightning:", "⚡");
        if (msg.contains(":rod:")) msg = msg.replace(":rod:", "🎣");
        if (msg.contains(":potion:")) msg = msg.replace(":potion:", "🧪");
        if (msg.contains(":fire:")) msg = msg.replace(":fire:", "🔥");
        if (msg.contains(":shears:")) msg = msg.replace(":shears:", "✂");
        if (msg.contains(":bell:")) msg = msg.replace(":bell:", "🔔");
        if (msg.contains(":bow:")) msg = msg.replace(":bow:", "🏹");
        if (msg.contains(":trident:")) msg = msg.replace(":trident:", "🔱");
        if (msg.contains(":cloud:")) msg = msg.replace(":cloud:", "☁");
        if (msg.contains(":meteor:")) msg = msg.replace(":meteor:", "☄");
        if (msg.contains(":nuke:")) msg = msg.replace(":nuke:", "☢");
        return msg;
    }



    public static String getGreeting() {
        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);

        if(timeOfDay < 12){
            return "Good morning, ";
        } else if(timeOfDay < 16){
            return "Good afternoon, ";
        } else if(timeOfDay < 21){
            return "Good evening, ";
        } else {
            return "Good night, ";
        }
    }






    public static String getSuffix() {
        return " | Ｒｅａｐｅｒ | ＢｅｄＧｏｄ";
    }
    public static String getReaperSuffix() {return " | Ｒｅａｐｅｒ | ";}
    public static String getBedGodSuffix() {return " | ＢｅｄＧｏｄ |";}



    //public static Random random = new Random();
    public static int random(int min, int max) { return min + (int) (Math.random() * ((max - min) + 1)); }
    public static double random(double min, double max) {
        return Math.random() * (max - min) + min;
    }
}
