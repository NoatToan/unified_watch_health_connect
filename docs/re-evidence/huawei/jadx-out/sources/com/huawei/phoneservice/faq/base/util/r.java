package com.huawei.phoneservice.faq.base.util;

import android.text.TextUtils;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.phoneservice.faq.base.entity.FaqSdkServiceUrlResponse;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class r {
    public static String h() {
        return i.d().getSdk(FaqConstants.SDK_URL_YUN);
    }

    public static String a(String str) {
        StringBuilder sb;
        String str2;
        if ("Y".equals(i.d().getSdk(FaqConstants.FAQ_USE_OLD_DOMAIN))) {
            sb = new StringBuilder();
            sb.append(c());
            str2 = "/secured/CCPC/EN/";
        } else {
            sb = new StringBuilder();
            sb.append(i());
            str2 = "/forward/ccpc_gateway_sdk/";
        }
        sb.append(str2);
        sb.append(str);
        sb.append("/1");
        return sb.toString();
    }

    public static String i() {
        return i.d().getSdk(FaqConstants.SDK_URL_SGW);
    }

    public static String c() {
        return i.d().getSdk(FaqConstants.SDK_URL_MD);
    }

    public static String a() {
        String sdk = i.d().getSdk(FaqConstants.GRS_URL_LOGSERVICE);
        g.e("FaqSdk", "getLogServiceUrl urls " + sdk);
        return sdk;
    }

    public static String d() {
        String sdk = i.d().getSdk(FaqConstants.FAQ_MODELTYPE);
        return k.b(sdk) ? c.b() : sdk;
    }

    public static String b() {
        String sdk = i.d().getSdk(FaqConstants.GRS_URL_SGW);
        g.e("FaqSdk", "getInitSgwUrl urls " + sdk);
        return sdk;
    }

    public static void c(Map<String, String> map, Map<String, String> map2) {
        if (map == null || map2 == null) {
            return;
        }
        String str = map.get(FaqConstants.GRS_SERVICE_KEY_CCPC);
        if (!TextUtils.isEmpty(str)) {
            map2.put(FaqConstants.GRS_URL_CCPC, str);
        }
        String str2 = map.get(FaqConstants.GRS_SERVICE_KEY_SGW);
        if (!TextUtils.isEmpty(str2)) {
            map2.put(FaqConstants.GRS_URL_SGW, str2);
        }
        String str3 = map.get("ROOT");
        if (!TextUtils.isEmpty(str3)) {
            map2.put(FaqConstants.GRS_URL_LOGSERVICE, str3);
        }
        String str4 = map.get(FaqConstants.GRS_SERVICE_KEY_DMPA);
        if (!TextUtils.isEmpty(str4)) {
            map2.put(FaqConstants.GRS_URL_DMPA, str4);
        }
        i.d().apply();
    }

    public static void d(FaqSdkServiceUrlResponse.ServiceUrl serviceUrl, Map<String, String> map) {
        if (!TextUtils.isEmpty(serviceUrl.b())) {
            map.put(FaqConstants.SDK_URL_HA, serviceUrl.b());
        }
        if (!TextUtils.isEmpty(serviceUrl.c())) {
            map.put(FaqConstants.SDK_URL_MD, serviceUrl.c());
        }
        if (!TextUtils.isEmpty(serviceUrl.d())) {
            map.put(FaqConstants.SDK_URL_SGW, serviceUrl.d());
        }
        if (!TextUtils.isEmpty(serviceUrl.e())) {
            map.put(FaqConstants.SDK_URL_YUN, serviceUrl.e());
        }
        i.d().apply();
    }

    public static Map<String, String> b(Map<String, String> map) {
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.remove(FaqConstants.SDK_URL_HA);
        map2.remove(FaqConstants.SDK_URL_MD);
        map2.remove(FaqConstants.SDK_URL_SGW);
        map2.remove(FaqConstants.SDK_URL_YUN);
        map2.remove(FaqConstants.GRS_URL_CCPC);
        map2.remove(FaqConstants.GRS_URL_SGW);
        map2.remove(FaqConstants.GRS_URL_LOGSERVICE);
        map2.remove(FaqConstants.GRS_URL_DMPA);
        return map2;
    }

    public static String e() {
        String sdk = i.d().getSdk(FaqConstants.GRS_URL_CCPC);
        g.e("FaqSdk", "getInitCcpcUrl urls " + sdk);
        return sdk;
    }
}
