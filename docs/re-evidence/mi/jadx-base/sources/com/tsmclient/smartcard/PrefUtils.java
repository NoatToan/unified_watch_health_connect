package com.tsmclient.smartcard;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes6.dex */
public class PrefUtils {
    public static final String PREF_KEY_CIN = "key_cin";
    public static final String PREF_KEY_CPLC = "key_cplc";
    public static final String PREF_KEY_SEID = "key_seid";
    private static final String PREF_NAME = "pref_com_tsmclient_smartcard";

    private PrefUtils() {
    }

    public static void clear(Context context) {
        context.getSharedPreferences(PREF_NAME, 0).edit().clear().apply();
    }

    public static boolean contains(Context context, String str) {
        return context.getSharedPreferences(PREF_NAME, 0).contains(str);
    }

    public static boolean getBoolean(Context context, String str, boolean z) {
        return context.getSharedPreferences(PREF_NAME, 0).getBoolean(str, z);
    }

    public static int getInt(Context context, String str, int i) {
        return context.getSharedPreferences(PREF_NAME, 0).getInt(str, i);
    }

    public static long getLong(Context context, String str, long j) {
        return context.getSharedPreferences(PREF_NAME, 0).getLong(str, j);
    }

    public static String getString(Context context, String str, String str2) {
        return context.getSharedPreferences(PREF_NAME, 0).getString(str, str2);
    }

    public static void putBoolean(Context context, String str, boolean z) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREF_NAME, 0).edit();
        editorEdit.putBoolean(str, z);
        editorEdit.apply();
    }

    public static void putInt(Context context, String str, int i) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREF_NAME, 0).edit();
        editorEdit.putInt(str, i);
        editorEdit.apply();
    }

    public static void putLong(Context context, String str, long j) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREF_NAME, 0).edit();
        editorEdit.putLong(str, j);
        editorEdit.apply();
    }

    public static void putString(Context context, String str, String str2) {
        putString(context, PREF_NAME, str, str2);
    }

    public static boolean remove(Context context, String str) {
        return context.getSharedPreferences(PREF_NAME, 0).edit().remove(str).commit();
    }

    public static void putString(Context context, String str, String str2, String str3) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
        editorEdit.putString(str2, str3);
        editorEdit.apply();
    }
}
