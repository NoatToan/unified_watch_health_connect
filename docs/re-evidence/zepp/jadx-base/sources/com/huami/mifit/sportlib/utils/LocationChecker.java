package com.huami.mifit.sportlib.utils;

import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;

/* JADX INFO: loaded from: classes11.dex */
public class LocationChecker {
    private LocationChecker() {
    }

    private static boolean a(Context context) {
        try {
            return ((LocationManager) context.getSystemService("location")).isProviderEnabled("network");
        } catch (SecurityException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Intent getGPSIntent() {
        return new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
    }

    public static boolean isGPSLocationSupported(Context context) {
        try {
            return ((LocationManager) context.getSystemService("location")).isProviderEnabled("gps");
        } catch (SecurityException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isLocationSupported(Context context) {
        return isGPSLocationSupported(context) || a(context);
    }
}
