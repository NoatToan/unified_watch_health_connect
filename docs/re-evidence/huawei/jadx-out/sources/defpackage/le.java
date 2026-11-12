package defpackage;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class le {
    public static void d(Context context, String str, String str2, String str3) {
        synchronized (le.class) {
            if (kj.c(str) || kj.c(str2) || context == null) {
                return;
            }
            try {
                String strC = ks.c(ks.e(), str3);
                HashMap map = new HashMap();
                map.put(str2, strC);
                lm.b(context, str, map);
            } catch (Throwable unused) {
            }
        }
    }

    public static String d(Context context, String str, String str2) {
        synchronized (le.class) {
            String strE = null;
            if (context != null) {
                if (!kj.c(str) && !kj.c(str2)) {
                    try {
                        String strE2 = lm.e(context, str, str2, "");
                        if (!kj.c(strE2)) {
                            strE = ks.e(ks.e(), strE2);
                        }
                    } catch (Throwable unused) {
                    }
                    return strE;
                }
            }
            return null;
        }
    }
}
