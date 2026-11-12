package com.huami.watch.companion.weather.util;

import com.huami.watch.util.UnitUtil;

/* JADX INFO: loaded from: classes16.dex */
public class Unit {
    public static int convertTemperature(boolean z, int i) {
        if (!z) {
            return i;
        }
        try {
            return UnitUtil.centigradeToFahrenheit(i);
        } catch (Exception e) {
            e.printStackTrace();
            return i;
        }
    }

    public static String formatTemperature(boolean z, int i) {
        String strValueOf = String.valueOf(i);
        if (z) {
            return strValueOf + "ºF";
        }
        return strValueOf + "ºC";
    }

    public static String getTemperatureUnit(boolean z) {
        return !z ? "C" : "F";
    }
}
