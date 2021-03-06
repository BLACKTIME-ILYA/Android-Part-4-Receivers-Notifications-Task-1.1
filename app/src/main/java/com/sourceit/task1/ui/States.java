package com.sourceit.task1.ui;

/**
 * Created by User on 13.02.2016.
 */
public class States {

    public static final String WIFI_STRING = "WI-FI";
    public static final String GPS_STRING = "GPS";
    public static final String AIR_STRING = "AIR";
    public static final String BLUETOOTH_STRING = "BLUETOOTH";

    public static final int WI_FI = 0;
    public static final int BLUETOOTH = 1;
    public static final int GPS = 2;
    public static final int AIR_MODE = 3;

    public static final boolean ON = true;
    public static final boolean OFF = false;

    public static boolean[] states = new boolean[]{false, false, false, false};

}
