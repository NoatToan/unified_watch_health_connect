package com.huami.mifit.sportlib.common;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes11.dex */
public class Keeper {
    public static final int DEFAULT_MIN_NOTICE_RUNNING_DISTANCE = 50;
    public static final int DEFAULT_MIN_NOTICE_RUNNING_INDOOR_DISTANCE = 100;
    private static final String a = "running_hr";
    private static final String b = "sport_bulk_pause";
    private static final String c = "debug_sport";
    private static final boolean d = false;
    private static final String e = "DisMinNoticeThreshold";
    private static final String f = "IndoorDisMinNoticeThreshold";
    private static SharedPreferences g;

    public static void clear(Context context) {
        setSportBulkPause("");
    }

    public static int getMinNoticeDisThreshold(Context context) {
        if (g == null) {
            g = context.getSharedPreferences(a, 0);
        }
        return g.getInt(e, 50);
    }

    public static int getMinNoticeIndoorDisThreshold(Context context) {
        if (g == null) {
            g = context.getSharedPreferences(a, 0);
        }
        return g.getInt(f, 100);
    }

    public static String getSportBulkPause() {
        SharedPreferences sharedPreferences = g;
        return sharedPreferences != null ? sharedPreferences.getString(b, "") : "";
    }

    public static void init(Context context) {
        if (g == null) {
            g = context.getSharedPreferences(a, 0);
        }
    }

    public static boolean isGPSDebug(Context context) {
        if (g == null) {
            g = context.getSharedPreferences(a, 0);
        }
        return g.getBoolean(c, false);
    }

    public static void setSportBulkPause(String str) {
        SharedPreferences sharedPreferences = g;
        if (sharedPreferences != null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString(b, str);
            editorEdit.apply();
        }
    }
}
