package com.alipay.mobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.a.a;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import defpackage.kj;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class SecurityClientMobile {
    public static String GetApdid(Context context, Map<String, String> map) {
        String strB;
        synchronized (SecurityClientMobile.class) {
            HashMap map2 = new HashMap();
            map2.put("utdid", kj.e(map, "utdid", ""));
            map2.put("tid", kj.e(map, "tid", ""));
            map2.put(JsbMapKeyNames.H5_USER_ID, kj.e(map, JsbMapKeyNames.H5_USER_ID, ""));
            APSecuritySdk.getInstance(context).initToken(0, map2, null);
            strB = a.b(context);
        }
        return strB;
    }
}
