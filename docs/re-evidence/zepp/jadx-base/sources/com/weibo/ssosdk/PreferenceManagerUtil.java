package com.weibo.ssosdk;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes18.dex */
public class PreferenceManagerUtil {
    public static final String PREFERENCE_NAME = "sso_oaid_save.txt";
    private static SharedPreferences a;
    private static PreferenceManagerUtil b;
    private static SharedPreferences.Editor c;

    private PreferenceManagerUtil(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCE_NAME, 0);
        a = sharedPreferences;
        c = sharedPreferences.edit();
    }

    public static synchronized PreferenceManagerUtil getInstance() {
        PreferenceManagerUtil preferenceManagerUtil;
        preferenceManagerUtil = b;
        if (preferenceManagerUtil == null) {
            throw new RuntimeException("please init first!");
        }
        return preferenceManagerUtil;
    }

    public static synchronized void init(Context context) {
        if (b == null) {
            b = new PreferenceManagerUtil(context);
        }
    }

    public final synchronized void cleatData() {
        c.clear().commit();
    }

    public final synchronized boolean getSaveBooleanData(String str, boolean z) {
        return a.getBoolean(str, z);
    }

    public final synchronized float getSaveFloatData(String str, float f) {
        return a.getFloat(str, f);
    }

    public final synchronized int getSaveIntData(String str, int i) {
        return a.getInt(str, i);
    }

    public final synchronized long getSaveLongData(String str, long j) {
        return a.getLong(str, j);
    }

    public final synchronized String getSaveStringData(String str, String str2) {
        return a.getString(str, str2);
    }

    public final synchronized void saveData(String str, String str2) {
        c.putString(str, str2).commit();
    }

    public final synchronized void saveData(String str, int i) {
        c.putInt(str, i).commit();
    }

    public final synchronized void saveData(String str, boolean z) {
        c.putBoolean(str, z).commit();
    }

    public final synchronized void saveData(String str, float f) {
        c.putFloat(str, f).commit();
    }

    public final synchronized void saveData(String str, long j) {
        c.putLong(str, j).commit();
    }
}
