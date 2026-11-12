package com.mi.health.qrcode.camera;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* JADX INFO: loaded from: classes5.dex */
public enum FrontLightMode {
    ON,
    AUTO,
    OFF;

    private static FrontLightMode parse(String str) {
        return str == null ? AUTO : valueOf(str);
    }

    public static void put(Context context, FrontLightMode frontLightMode) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString("preferences_front_light_mode", frontLightMode.toString()).commit();
    }

    public static FrontLightMode readPref(SharedPreferences sharedPreferences) {
        return parse(sharedPreferences.getString("preferences_front_light_mode", AUTO.toString()));
    }
}
