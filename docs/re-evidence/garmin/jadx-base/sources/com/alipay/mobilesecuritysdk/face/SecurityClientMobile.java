package com.alipay.mobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.a.a;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import java.util.HashMap;
import java.util.Map;
import oi0.c;

/* JADX INFO: loaded from: classes7.dex */
public class SecurityClientMobile {
    public static synchronized String GetApdid(Context context, Map<String, String> map) {
        HashMap map2 = new HashMap();
        map2.put("utdid", c.f("utdid", map));
        map2.put("tid", c.f("tid", map));
        map2.put("userId", c.f("userId", map));
        APSecuritySdk.getInstance(context).initToken(0, map2, null);
        return a.a(context);
    }
}
