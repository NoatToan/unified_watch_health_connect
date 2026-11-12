package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.e.h;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import defpackage.kj;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class b {
    public static Map<String, String> a(Context context, Map<String, String> map) {
        HashMap map2;
        synchronized (b.class) {
            map2 = new HashMap();
            String strE = kj.e(map, "tid", "");
            String strE2 = kj.e(map, "utdid", "");
            String strE3 = kj.e(map, JsbMapKeyNames.H5_USER_ID, "");
            String strE4 = kj.e(map, "appName", "");
            String strE5 = kj.e(map, "appKeyClient", "");
            String strE6 = kj.e(map, "tmxSessionId", "");
            String strF = h.f(context);
            String strE7 = kj.e(map, "sessionId", "");
            map2.put("AC1", strE);
            map2.put("AC2", strE2);
            map2.put("AC3", "");
            map2.put("AC4", strF);
            map2.put("AC5", strE3);
            map2.put("AC6", strE6);
            map2.put("AC7", com.alipay.apmobilesecuritysdk.c.b.a(context));
            map2.put("AC8", strE4);
            map2.put("AC9", strE5);
            if (kj.e(strE7)) {
                map2.put("AC10", strE7);
            }
        }
        return map2;
    }
}
