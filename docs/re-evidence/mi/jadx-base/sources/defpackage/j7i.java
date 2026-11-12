package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes6.dex */
public final class j7i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f22497a = "sp_pref";

    public static String a(Context context, String str) {
        return b(context, str, null);
    }

    public static String b(Context context, String str, String str2) {
        return context.getSharedPreferences(f22497a, 0).getString(str, str2);
    }

    public static boolean c(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(f22497a, 0).edit();
        editorEdit.putString(str, str2);
        return editorEdit.commit();
    }

    public static boolean d(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(f22497a, 0).edit();
        editorEdit.remove(str);
        return editorEdit.commit();
    }
}
