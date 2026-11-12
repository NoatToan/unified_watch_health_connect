package jg;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class a {
    public static String a(Context context, String str) {
        synchronized (a.class) {
            String strR = null;
            if (context != null) {
                if (!oi0.c.g("vkeyid_settings") && !oi0.c.g(str)) {
                    try {
                        String string = context.getSharedPreferences("vkeyid_settings", 0).getString(str, "");
                        if (!oi0.c.g(string)) {
                            strR = og.a.r(og.a.m(), string);
                            return strR;
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
            return null;
        }
    }

    public static void b(Context context, String str, String str2) {
        synchronized (a.class) {
            try {
                if (oi0.c.g("vkeyid_settings") || oi0.c.g(str) || context == null) {
                    return;
                }
                try {
                    String strN = og.a.n(og.a.m(), str2);
                    HashMap map = new HashMap();
                    map.put(str, strN);
                    c.a(context, "vkeyid_settings", map);
                } catch (Throwable unused) {
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
