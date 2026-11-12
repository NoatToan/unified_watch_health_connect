package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class lm {
    public static String e(Context context, String str, String str2, String str3) {
        return context.getSharedPreferences(str, 0).getString(str2, str3);
    }

    public static void b(Context context, String str, Map<String, String> map) {
        SharedPreferences.Editor editorEdit;
        if (map == null || (editorEdit = context.getSharedPreferences(str, 0).edit()) == null) {
            return;
        }
        for (String str2 : map.keySet()) {
            editorEdit.putString(str2, map.get(str2));
        }
        editorEdit.commit();
    }

    public static void a(Context context, String str, String str2, String str3) {
        SharedPreferences.Editor editorEdit;
        if (str3 == null || (editorEdit = context.getSharedPreferences(str, 0).edit()) == null) {
            return;
        }
        editorEdit.putString(str2, str3);
        editorEdit.commit();
    }
}
