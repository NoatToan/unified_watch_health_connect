package jg;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class c {
    public static void a(Context context, String str, HashMap map) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
        if (editorEdit != null) {
            for (String str2 : map.keySet()) {
                editorEdit.putString(str2, (String) map.get(str2));
            }
            editorEdit.commit();
        }
    }
}
