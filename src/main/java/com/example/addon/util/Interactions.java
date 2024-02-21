package com.example.addon.util;


import static meteordevelopment.meteorclient.MeteorClient.mc;

public class Interactions {
    public static void setHVelocity(double x, double z) {
        mc.player.setVelocity(x, mc.player.getVelocity().getY(), z);
    }
}
