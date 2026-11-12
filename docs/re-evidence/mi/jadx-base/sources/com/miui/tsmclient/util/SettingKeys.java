package com.miui.tsmclient.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;

/* JADX INFO: loaded from: classes6.dex */
public class SettingKeys {
    private static final String PREF_NAME = "pref_com_miui_tsmclient_secure";

    public static int getSecureInt(Context context, String str) throws Settings.SettingNotFoundException {
        return context.getSharedPreferences(PREF_NAME, 0).getInt(str, -1);
    }

    public static String getSecureString(Context context, String str) {
        return context.getSharedPreferences(PREF_NAME, 0).getString(str, "");
    }

    public static boolean putSecureInt(Context context, String str, int i) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREF_NAME, 0).edit();
        editorEdit.putInt(str, i);
        editorEdit.apply();
        return true;
    }

    public static boolean putSecureString(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREF_NAME, 0).edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
        return true;
    }
}
