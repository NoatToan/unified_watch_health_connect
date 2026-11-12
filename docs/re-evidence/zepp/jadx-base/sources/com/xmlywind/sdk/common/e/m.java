package com.xmlywind.sdk.common.e;

import com.xmlywind.logger.SigmobLog;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class m {
    public static String a() {
        return "appId=" + com.xmlywind.sdk.common.a.n().ab() + com.alipay.sdk.m.s.a.l + ("sdkVersion=" + com.xmlywind.sdk.common.a.a);
    }

    public static String a(Map<String, String> map, String str) {
        com.xmlywind.sdk.common.utils.m.a.a(str);
        if (map == null || map.isEmpty()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str2 : map.keySet()) {
            try {
                jSONObject.put(str2, map.get(str2));
            } catch (Throwable unused) {
                SigmobLog.d("Unable to add " + str2 + " to JSON body.");
            }
        }
        return jSONObject.toString();
    }

    public static boolean a(String str) {
        try {
            HashSet hashSetI = f.i();
            return hashSetI != null && hashSetI.contains(str);
        } catch (Throwable th) {
            SigmobLog.e(th.getMessage());
        }
    }

    public static boolean b(String str) {
        return true;
    }
}
