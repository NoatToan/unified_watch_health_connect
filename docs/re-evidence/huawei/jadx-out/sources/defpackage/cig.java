package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes4.dex */
public class cig {
    public static void e(String str, long j) {
        SharedPreferences.Editor editorEdit = chm.c().getSharedPreferences("code_rule_sp", 0).edit();
        editorEdit.putLong(str, j);
        editorEdit.apply();
    }

    public static long a(String str, long j) {
        return chm.c().getSharedPreferences("code_rule_sp", 0).getLong(str, j);
    }

    public static void e(String str, String str2) {
        SharedPreferences.Editor editorEdit = chm.c().getSharedPreferences("code_rule_sp", 0).edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public static String b(String str, String str2) {
        return chm.c().getSharedPreferences("code_rule_sp", 0).getString(str, str2);
    }
}
