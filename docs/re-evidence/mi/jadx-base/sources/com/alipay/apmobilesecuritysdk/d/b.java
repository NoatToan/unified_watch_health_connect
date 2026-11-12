package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.e.h;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static synchronized Map<String, String> a(Context context, Map<String, String> map) {
        HashMap map2;
        map2 = new HashMap();
        String strC = com.alipay.security.mobile.module.a.a.c(map, "tid", "");
        String strC2 = com.alipay.security.mobile.module.a.a.c(map, "utdid", "");
        String strC3 = com.alipay.security.mobile.module.a.a.c(map, "userId", "");
        String strC4 = com.alipay.security.mobile.module.a.a.c(map, "appName", "");
        String strC5 = com.alipay.security.mobile.module.a.a.c(map, "appKeyClient", "");
        String strC6 = com.alipay.security.mobile.module.a.a.c(map, "tmxSessionId", "");
        String strF = h.f(context);
        String strC7 = com.alipay.security.mobile.module.a.a.c(map, "sessionId", "");
        map2.put("AC1", strC);
        map2.put("AC2", strC2);
        map2.put("AC3", "");
        map2.put("AC4", strF);
        map2.put("AC5", strC3);
        map2.put("AC6", strC6);
        map2.put("AC7", "");
        map2.put("AC8", strC4);
        map2.put("AC9", strC5);
        if (com.alipay.security.mobile.module.a.a.g(strC7)) {
            map2.put("AC10", strC7);
        }
        return map2;
    }
}
