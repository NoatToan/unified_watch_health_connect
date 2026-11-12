package com.xiaomi.hm.health.baseutil;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;

/* JADX INFO: loaded from: classes19.dex */
public class GlobalKeeper {
    private static final String a = "global_sp_keep";
    private static final String b = "has_show_running_tips";
    private static final String c = "has_show_running_tips_blue_monkey";
    private static final String d = "exer_stat_total_count";
    private static final String e = "global_uuid";
    private static SharedPreferences f;

    private static void a(String str) {
        SharedPreferences.Editor editorEdit = f.edit();
        editorEdit.putString(e, str);
        editorEdit.apply();
    }

    private static String b() {
        return f.getString(e, null);
    }

    private static void c(String str, boolean z) {
        SharedPreferences.Editor editorEdit = f.edit();
        editorEdit.putBoolean(str, z);
        editorEdit.apply();
    }

    public static void clear(Context context) {
    }

    private static void d(String str, int i) {
        SharedPreferences.Editor editorEdit = f.edit();
        editorEdit.putInt(str, i);
        editorEdit.apply();
    }

    public static boolean getBlueMonkeyNeedTip() {
        return f.getBoolean(c, true);
    }

    public static int getExerStatTotalCount() {
        return f.getInt(d, 0);
    }

    public static boolean getHrNeedTip() {
        return f.getBoolean(b, true);
    }

    public static String getUuid() {
        String strB = b();
        if (strB != null && !strB.isEmpty()) {
            return strB;
        }
        String string = UUID.randomUUID().toString();
        a(string);
        return string;
    }

    public static void init(Context context) {
        f = context.getSharedPreferences(a, 0);
    }

    public static void setBlueMonkeyNeedTip(boolean z) {
        c(c, z);
    }

    public static void setExerStatTotalCount(int i) {
        d(d, i);
    }

    public static void setHrNeedTip(boolean z) {
        c(b, z);
    }
}
