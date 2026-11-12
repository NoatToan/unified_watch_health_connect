package com.xiaomi.hm.health.lab.utils;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes21.dex */
public class LabKeeper {
    private static SharedPreferences a = null;
    private static final String b = "tag_time_offset";
    private static final String c = "tag_guid_roll_out";
    private static final String d = "temperature.device.option";
    private static final String e = "temperature.part.option";
    private static final String f = "temperature.option";

    public static boolean getGuideRollOut() {
        return a.getBoolean(c, false);
    }

    public static int getTemperatureDeviceOption() {
        return a.getInt(d, 0);
    }

    public static float getTemperatureOption() {
        return a.getFloat(f, 35.6f);
    }

    public static int getTemperaturePartOption() {
        return a.getInt(e, 0);
    }

    public static int getTimeOffset() {
        return a.getInt(b, 0);
    }

    public static void init(SharedPreferences sharedPreferences) {
        a = sharedPreferences;
    }

    public static void saveBodyTemperature(float f2) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putFloat(f, f2);
        editorEdit.apply();
    }

    public static void saveGuideRollOut(boolean z) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putBoolean(c, z);
        editorEdit.apply();
    }

    public static void saveTemperatureOptions(int i, int i2) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putInt(d, i);
        editorEdit.putInt(e, i2);
        editorEdit.apply();
    }

    public static void saveTimeOffset(int i) {
        SharedPreferences.Editor editorEdit = a.edit();
        editorEdit.putInt(b, i);
        editorEdit.apply();
    }
}
