package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public static synchronized Map<String, String> a(Context context, Map<String, String> map) {
        HashMap map2;
        String str;
        String strF = oi0.c.f("appchannel", map);
        map2 = new HashMap();
        map2.put("AA1", context.getPackageName());
        int i14 = hg.a.f83644a;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 16).versionName;
        } catch (Exception unused) {
            str = "0.0.0";
        }
        map2.put("AA2", str);
        map2.put("AA3", "APPSecuritySDK-ALIPAYSDK");
        map2.put("AA4", "3.4.0.202311031119");
        map2.put("AA6", strF);
        return map2;
    }
}
