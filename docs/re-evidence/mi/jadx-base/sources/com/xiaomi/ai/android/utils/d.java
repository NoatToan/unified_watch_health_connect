package com.xiaomi.ai.android.utils;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class d {
    public static String a(Context context, String str, String str2) {
        return context.getSharedPreferences(str, 0).getString(str2, null);
    }

    public static Map<String, ?> b(Context context, String str) {
        return context.getSharedPreferences(str, 0).getAll();
    }

    public static void a(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
        editorEdit.clear();
        editorEdit.apply();
    }

    public static void b(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
        editorEdit.remove(str2);
        editorEdit.apply();
    }

    public static void a(Context context, String str, String str2, String str3) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
        editorEdit.putString(str2, str3);
        editorEdit.apply();
    }
}
