package com.alipay.security.mobile.module.c;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static String a(Context context, String str, String str2) {
        synchronized (a.class) {
            String strE = null;
            if (context != null) {
                if (!com.alipay.security.mobile.module.a.a.d(str) && !com.alipay.security.mobile.module.a.a.d(str2)) {
                    try {
                        String strA = e.a(context, str, str2, "");
                        if (com.alipay.security.mobile.module.a.a.d(strA)) {
                            return null;
                        }
                        strE = com.alipay.security.mobile.module.a.a.c.e(com.alipay.security.mobile.module.a.a.c.a(), strA);
                    } catch (Throwable unused) {
                    }
                    return strE;
                }
            }
            return null;
        }
    }

    public static void b(Context context, String str, String str2, String str3) {
        synchronized (a.class) {
            try {
                if (com.alipay.security.mobile.module.a.a.d(str) || com.alipay.security.mobile.module.a.a.d(str2) || context == null) {
                    return;
                }
                try {
                    String strB = com.alipay.security.mobile.module.a.a.c.b(com.alipay.security.mobile.module.a.a.c.a(), str3);
                    HashMap map = new HashMap();
                    map.put(str2, strB);
                    e.b(context, str, map);
                } catch (Throwable unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
