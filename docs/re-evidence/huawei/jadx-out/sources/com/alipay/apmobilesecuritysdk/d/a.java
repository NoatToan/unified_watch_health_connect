package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import defpackage.kj;
import defpackage.kz;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static Map<String, String> a(Context context, Map<String, String> map) {
        HashMap map2;
        synchronized (a.class) {
            String strE = kj.e(map, "appchannel", "");
            map2 = new HashMap();
            map2.put("AA1", context.getPackageName());
            map2.put("AA2", kz.a().d(context));
            map2.put("AA3", "APPSecuritySDK-ALIPAYSDK");
            map2.put("AA4", "3.4.0.202506100708");
            map2.put("AA6", strE);
        }
        return map2;
    }
}
