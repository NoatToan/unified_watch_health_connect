package defpackage;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes21.dex */
public class lg {
    public static void c(Context context, String str, String str2, String str3) {
        synchronized (lg.class) {
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
}
