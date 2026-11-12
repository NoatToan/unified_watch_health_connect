package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes15.dex */
public class pzb {
    public static boolean a(Context context, String str, String str2, String str3) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
        editorEdit.putString(str2, str3);
        return editorEdit.commit();
    }

    public static String c(Context context, String str, String str2, String str3) {
        return context.getSharedPreferences(str, 0).getString(str2, str3);
    }

    public static boolean d(Context context, String str, String str2, int i) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
        editorEdit.putInt(str2, i);
        return editorEdit.commit();
    }

    public static int c(Context context, String str, String str2, int i) {
        return context.getSharedPreferences(str, 0).getInt(str2, i);
    }
}
