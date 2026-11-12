package com.huawei.watchface;

import android.content.SharedPreferences;
import com.huawei.watchface.environment.Environment;

/* JADX INFO: loaded from: classes20.dex */
public abstract class f5 {
    public static void a(String str, String str2) {
        SharedPreferences sharedPreferencesB = e4.b(Environment.getApplicationContext(), "watch_face_shared_preference");
        if (sharedPreferencesB == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public static void b(String str, int i) {
        SharedPreferences sharedPreferencesB = e4.b(Environment.getApplicationContext(), "watch_face_shared_preference");
        if (sharedPreferencesB == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
        editorEdit.putInt(str, i);
        editorEdit.apply();
    }

    public static void c(String str) {
        SharedPreferences sharedPreferencesA = e4.a(Environment.getApplicationContext(), "my_watch_face");
        if (sharedPreferencesA == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
        editorEdit.putString("my_watchface_apply_time", str);
        editorEdit.apply();
    }

    public static String a(String str) {
        SharedPreferences sharedPreferencesB = e4.b(Environment.getApplicationContext(), "watch_face_shared_preference");
        if (sharedPreferencesB == null) {
            return null;
        }
        return sharedPreferencesB.getString(str, null);
    }

    public static void b(String str, String str2) {
        a(str, k5.c(str2, "storagePw"));
    }

    public static String b(String str) {
        return k5.b(a(str), "storagePw");
    }

    public static String a() {
        SharedPreferences sharedPreferencesA = e4.a(Environment.getApplicationContext(), "my_watch_face");
        if (sharedPreferencesA == null) {
            return null;
        }
        return sharedPreferencesA.getString("my_watchface_apply_time", null);
    }

    public static int a(String str, int i) {
        SharedPreferences sharedPreferencesB = e4.b(Environment.getApplicationContext(), "watch_face_shared_preference");
        if (sharedPreferencesB == null) {
            return 0;
        }
        return sharedPreferencesB.getInt(str, i);
    }
}
