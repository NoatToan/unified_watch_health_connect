package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.e.h;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public static synchronized Map<String, String> a(Context context, Map<String, String> map) {
        HashMap map2;
        map2 = new HashMap();
        String strF = oi0.c.f("tid", map);
        String strF2 = oi0.c.f("utdid", map);
        String strF3 = oi0.c.f("userId", map);
        String strF4 = oi0.c.f("appName", map);
        String strF5 = oi0.c.f("appKeyClient", map);
        String strF6 = oi0.c.f("tmxSessionId", map);
        String strF7 = h.f(context);
        String strF8 = oi0.c.f("sessionId", map);
        map2.put("AC1", strF);
        map2.put("AC2", strF2);
        map2.put("AC3", "");
        map2.put("AC4", strF7);
        map2.put("AC5", strF3);
        map2.put("AC6", strF6);
        map2.put("AC7", "");
        map2.put("AC8", strF4);
        map2.put("AC9", strF5);
        if (oi0.c.k(strF8)) {
            map2.put("AC10", strF8);
        }
        return map2;
    }
}
