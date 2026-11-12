package defpackage;

import android.content.Context;
import android.preference.PreferenceManager;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a3t {
    public static void a(Context context) {
    }

    public static void b(Context context, String str, boolean z) {
        a(context);
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(str, z).commit();
    }

    public static void c(Map<String, String> map, String str, String str2) {
        if (map == null || str == null || str2 == null) {
            return;
        }
        map.put(str, str2);
    }

    public static boolean d(Context context, String str, boolean z) {
        a(context);
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(str, z);
    }
}
