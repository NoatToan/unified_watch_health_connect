package com.huawei.maps.offlinedata.utils;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes12.dex */
public abstract class j {
    public static String a(String str, String str2, Context context) {
        try {
            return context.getSharedPreferences("offlineMapPrefer", 0).getString(str, str2);
        } catch (Exception unused) {
            g.b("SharedPreUtil", "getString fail, wrong  with key: " + str);
            return str2;
        }
    }

    public static void b(String str, String str2, Context context) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("offlineMapPrefer", 0).edit();
            editorEdit.putString(str, str2);
            editorEdit.apply();
        } catch (Exception unused) {
            g.b("SharedPreUtil", "putString, wrong  with key: " + str);
        }
    }

    public static boolean a(String str, boolean z, Context context) {
        try {
            return context.getSharedPreferences("offlineMapPrefer", 0).getBoolean(str, z);
        } catch (Exception unused) {
            g.b("SharedPreUtil", "getBoolean fail, wrong  with key: " + str);
            return z;
        }
    }

    public static void b(String str, boolean z, Context context) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("offlineMapPrefer", 0).edit();
            editorEdit.putBoolean(str, z);
            editorEdit.apply();
        } catch (Exception unused) {
            g.b("SharedPreUtil", "putBoolean, wrong  with key: " + str);
        }
    }

    public static long a(String str, long j, Context context) {
        try {
            return context.getSharedPreferences("offlineMapPrefer", 0).getLong(str, j);
        } catch (Exception unused) {
            g.b("SharedPreUtil", "getLong fail, wrong with key: " + str);
            return j;
        }
    }

    public static int a(String str, int i, Context context) {
        try {
            return context.getSharedPreferences("offlineMapPrefer", 0).getInt(str, i);
        } catch (Exception unused) {
            g.b("SharedPreUtil", "getInt fail, wrong with key: " + str);
            return i;
        }
    }

    public static void b(String str, long j, Context context) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("offlineMapPrefer", 0).edit();
            editorEdit.putLong(str, j);
            editorEdit.apply();
        } catch (Exception unused) {
            g.b("SharedPreUtil", "putLong, wrong with key: " + str);
        }
    }

    public static void b(String str, int i, Context context) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("offlineMapPrefer", 0).edit();
            editorEdit.putInt(str, i);
            editorEdit.apply();
        } catch (Exception unused) {
            g.b("SharedPreUtil", "putInt, wrong with key: " + str);
        }
    }
}
