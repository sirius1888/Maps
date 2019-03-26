package com.example.angelina.mapsinobi.utils;

import android.content.Context;
import android.content.SharedPreferences;

import java.sql.Time;
import java.util.Date;

public class PrefUtil {

    private static SharedPreferences sPref;


    private static final String      LAT = "lat";
    private static final String      LON = "lon";
    private static final String      TIME = "time";
    private static final String      TRACKING = "track";

    static void init(Context context) {
        sPref = context.getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
    }

    public static String getLat() {
        return sPref.getString(LAT, "0.0");
    }

    public static void setLat(String latitude) {
        sPref.edit().putString(LAT, latitude).apply();
    }

    public static String getLon() {
        return sPref.getString(LON, "0.0");
    }

    public static void setLon(String longitude) {
        sPref.edit().putString(LON, longitude).apply();
    }

    public static String  getTime() {
        return sPref.getString(TIME, "");
    }

    public static void setTime(Date longitude) {
        sPref.edit().putString(TIME, String.valueOf(longitude)).apply();
    }

    public static boolean getTracking() {
        return sPref.getBoolean(TRACKING, false);
    }

    public static void setTracking(boolean tracking) {
        sPref.edit().putBoolean(TRACKING, tracking).apply();
    }


}
