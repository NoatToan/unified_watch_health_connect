package com.huawei.hms.framework.network.grs;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.g.g;
import com.huawei.hms.framework.network.grs.local.model.CountryCodeBean;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    private static final String e = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GrsBaseInfo f13265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.e.a f13266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f13267c;
    private com.huawei.hms.framework.network.grs.e.c d;

    public void a(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, Context context, int i) {
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        String str3 = a(str, bVar, context).get(str2);
        if (!bVar.a()) {
            this.f13267c.a(new com.huawei.hms.framework.network.grs.g.j.c(this.f13265a, context), new b(str, str2, iQueryUrlCallBack, str3, context, this.f13265a, this.f13266b), str, this.d, i);
        } else if (TextUtils.isEmpty(str3)) {
            Logger.i(e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty", str, str2);
            iQueryUrlCallBack.onCallBackFail(-5);
        } else {
            Logger.i(e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(str3));
            iQueryUrlCallBack.onCallBackSuccess(str3);
        }
    }

    public void a(String str, IQueryUrlsCallBack iQueryUrlsCallBack, Context context, int i) {
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        Map<String, String> mapA = a(str, bVar, context);
        if (!bVar.a()) {
            this.f13267c.a(new com.huawei.hms.framework.network.grs.g.j.c(this.f13265a, context), new C0113a(str, mapA, iQueryUrlsCallBack, context, this.f13265a, this.f13266b), str, this.d, i);
        } else if (mapA.isEmpty()) {
            Logger.i(e, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty", str);
            iQueryUrlsCallBack.onCallBackFail(-5);
        } else {
            String str2 = e;
            Logger.i(str2, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(new JSONObject(mapA).toString()));
            Logger.i(str2, "ayncGetGrsUrls: %s", StringUtils.anonymizeMessage(new JSONObject(mapA).toString()));
            iQueryUrlsCallBack.onCallBackSuccess(mapA);
        }
    }

    public Map<String, String> a(String str, Context context, int i) {
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        Map<String, String> mapA = a(str, bVar, context);
        if (bVar.a() && !mapA.isEmpty()) {
            Logger.i(e, "Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(new JSONObject(mapA).toString()));
            return mapA;
        }
        String strA = a(context, str, i);
        Map<String, String> mapA2 = a(strA, str);
        if (!mapA2.isEmpty()) {
            Logger.i(e, "GrsClientManager.synGetGrsUrls: Get URL from Current Called GRS Server Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(new JSONObject(mapA2).toString()));
            return mapA2;
        }
        if (mapA.isEmpty()) {
            if (!TextUtils.isEmpty(strA)) {
                Logger.e(e, "The serviceName[%s] is not configured on the GRS server.", str);
            }
            String str2 = e;
            Logger.i(str2, "GrsClientManager.synGetGrsUrls: Get URL from Local JSON File.");
            mapA = com.huawei.hms.framework.network.grs.f.b.a(context.getPackageName()).a(context, this.f13266b, this.f13265a, str, true);
            if (mapA == null || mapA.isEmpty()) {
                Logger.e(str2, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details", str);
            }
        }
        Logger.i(e, "GrsClientManager.synGetGrsUrls: Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(mapA != null ? new JSONObject(mapA).toString() : ""));
        return mapA;
    }

    public String a(String str, String str2, Context context, int i) {
        String str3 = e;
        Logger.i(str3, "synGetGrsUrl start");
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        String strA = a(str, bVar, context).get(str2);
        if (bVar.a() && !TextUtils.isEmpty(strA)) {
            Logger.i(str3, "GrsClientManager.synGetGrsUrl: Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(strA));
            return strA;
        }
        String strA2 = a(context, str, i);
        String str4 = a(strA2, str).get(str2);
        if (!TextUtils.isEmpty(str4)) {
            Logger.i(str3, "GrsClientManager.synGetGrsUrl: Get URL from Current Called GRS Server, Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(str4));
            return str4;
        }
        if (TextUtils.isEmpty(strA)) {
            if (!TextUtils.isEmpty(strA2)) {
                Logger.e(str3, "The serviceName[%s][%s] is not configured on the GRS server.", str, str2);
            }
            Logger.i(str3, "GrsClientManager.synGetGrsUrl: Get URL from Local JSON File.");
            strA = com.huawei.hms.framework.network.grs.f.b.a(context.getPackageName()).a(context, this.f13266b, this.f13265a, str, str2, true);
            if (strA == null || strA.isEmpty()) {
                Logger.e(str3, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details", str, str2);
            }
        }
        Logger.i(str3, "GrsClientManager.synGetGrsUrl: Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(strA));
        return strA;
    }

    public String a(Context context, String str, int i) {
        String str2 = e;
        Logger.i(str2, "synGetGrsUrl synGetUrlsFromServer start");
        com.huawei.hms.framework.network.grs.g.d dVarA = this.f13267c.a(new com.huawei.hms.framework.network.grs.g.j.c(this.f13265a, context), str, this.d, i);
        Logger.i(str2, "synGetUrlsFromServer::" + dVarA);
        if (dVarA == null) {
            return "";
        }
        return dVarA.m() ? this.f13266b.a().a(this.f13265a.getGrsParasKey(true, true, context), "") : dVarA.j();
    }

    public static Map<String, String> a(JSONObject jSONObject) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String string = jSONObject.get(next).toString();
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string)) {
                    concurrentHashMap.put(next, string);
                }
            }
            return concurrentHashMap;
        } catch (JSONException e2) {
            Logger.w(e, "getServiceUrls occur a JSONException: %s", StringUtils.anonymizeMessage(e2.getMessage()));
            return concurrentHashMap;
        }
    }

    public static Map<String, String> a(String str, String str2) {
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(str)) {
            Logger.w(e, "isSpExpire jsonValue from server is null.");
            return map;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.has(str2) ? jSONObject.getJSONObject(str2) : null;
            if (jSONObject2 == null) {
                Logger.w(e, "getServiceNameUrls: paser null from server json data by {%s}.", str2);
                return map;
            }
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject2.get(next).toString());
            }
            return map;
        } catch (JSONException e2) {
            Logger.w(e, "Method{getServiceNameUrls} query url from SP occur an JSONException: %s", StringUtils.anonymizeMessage(e2.getMessage()));
            return map;
        }
    }

    private Map<String, String> a(String str, com.huawei.hms.framework.network.grs.e.b bVar, Context context) {
        Map<String, String> mapA = this.f13266b.a(this.f13265a, str, bVar, context);
        if (mapA != null && !mapA.isEmpty()) {
            Logger.i(e, "GrsClientManager.getUrlsLocal: Get URL from GRS Server Cache");
            return mapA;
        }
        Map<String, String> mapA2 = com.huawei.hms.framework.network.grs.f.b.a(context.getPackageName()).a(context, this.f13266b, this.f13265a, str, false);
        Logger.i(e, "GrsClientManager.getUrlsLocal: Get URL from Local JSON File");
        return mapA2 != null ? mapA2 : new HashMap();
    }

    /* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: classes10.dex */
    static class C0113a implements com.huawei.hms.framework.network.grs.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f13268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Map<String, String> f13269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        IQueryUrlsCallBack f13270c;
        Context d;
        GrsBaseInfo e;
        com.huawei.hms.framework.network.grs.e.a f;

        @Override // com.huawei.hms.framework.network.grs.b
        public void a(com.huawei.hms.framework.network.grs.g.d dVar) {
            String strJ = dVar.j();
            Map<String, String> mapA = a.a(strJ, this.f13268a);
            if (!mapA.isEmpty()) {
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls: Get URL from Current Called GRS Server Return [%s] Urls: %s", this.f13268a, StringUtils.anonymizeMessage(new JSONObject(mapA).toString()));
                this.f13270c.onCallBackSuccess(mapA);
                return;
            }
            Map<String, String> map = this.f13269b;
            if (map != null && !map.isEmpty()) {
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls: Return [%s] Url: %s", this.f13268a, StringUtils.anonymizeMessage(new JSONObject(this.f13269b).toString()));
                this.f13270c.onCallBackSuccess(this.f13269b);
                return;
            }
            if (this.f13269b == null) {
                if (!TextUtils.isEmpty(strJ)) {
                    Logger.e(a.e, "The serviceName[%s] is not configured on the GRS server.", this.f13268a);
                }
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls: Get URL from Local JSON File");
                Map<String, String> mapA2 = com.huawei.hms.framework.network.grs.f.b.a(this.d.getPackageName()).a(this.d, this.f, this.e, this.f13268a, true);
                if (mapA2 == null || mapA2.isEmpty()) {
                    Logger.e(a.e, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details", this.f13268a);
                }
                if (mapA2 == null) {
                    mapA2 = new ConcurrentHashMap<>();
                }
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s", this.f13268a, StringUtils.anonymizeMessage(new JSONObject(mapA2).toString()));
                this.f13270c.onCallBackSuccess(mapA2);
                return;
            }
            Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty", this.f13268a);
            this.f13270c.onCallBackFail(-5);
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a() {
            Map<String, String> map = this.f13269b;
            if (map != null && !map.isEmpty()) {
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s", this.f13268a, StringUtils.anonymizeMessage(new JSONObject(this.f13269b).toString()));
                this.f13270c.onCallBackSuccess(this.f13269b);
                return;
            }
            if (this.f13269b == null) {
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls: Get URL from Local JSON File");
                Map<String, String> mapA = com.huawei.hms.framework.network.grs.f.b.a(this.d.getPackageName()).a(this.d, this.f, this.e, this.f13268a, true);
                if (mapA == null || mapA.isEmpty()) {
                    Logger.e(a.e, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details", this.f13268a);
                }
                if (mapA == null) {
                    mapA = new ConcurrentHashMap<>();
                }
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s", this.f13268a, StringUtils.anonymizeMessage(new JSONObject(mapA).toString()));
                this.f13270c.onCallBackSuccess(mapA);
                return;
            }
            Logger.i(a.e, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty", this.f13268a);
            this.f13270c.onCallBackFail(-3);
        }

        C0113a(String str, Map<String, String> map, IQueryUrlsCallBack iQueryUrlsCallBack, Context context, GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.a aVar) {
            this.f13268a = str;
            this.f13269b = map;
            this.f13270c = iQueryUrlsCallBack;
            this.d = context;
            this.e = grsBaseInfo;
            this.f = aVar;
        }
    }

    static class b implements com.huawei.hms.framework.network.grs.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f13271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f13272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        IQueryUrlCallBack f13273c;
        String d;
        Context e;
        GrsBaseInfo f;
        com.huawei.hms.framework.network.grs.e.a g;

        @Override // com.huawei.hms.framework.network.grs.b
        public void a(com.huawei.hms.framework.network.grs.g.d dVar) {
            String strJ = dVar.j();
            Map<String, String> mapA = a.a(strJ, this.f13271a);
            if (mapA.containsKey(this.f13272b)) {
                String str = a.e;
                String str2 = this.f13271a;
                String str3 = this.f13272b;
                Logger.i(str, "GrsClientManager.ayncGetGrsUrl: Get URL from Current Called GRS Server, Return [%s][%s] Url: %s", str2, str3, StringUtils.anonymizeMessage(mapA.get(str3)));
                this.f13273c.onCallBackSuccess(mapA.get(this.f13272b));
                return;
            }
            if (!TextUtils.isEmpty(this.d)) {
                String str4 = a.e;
                String str5 = this.f13271a;
                String str6 = this.f13272b;
                Logger.i(str4, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", str5, str6, StringUtils.anonymizeMessage(mapA.get(str6)));
                this.f13273c.onCallBackSuccess(this.d);
                return;
            }
            if (TextUtils.isEmpty(this.d)) {
                if (!TextUtils.isEmpty(strJ)) {
                    Logger.e(a.e, "The serviceName[%s][%s] is not configured on the GRS server.", this.f13271a, this.f13272b);
                }
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrl: Get URL from Local JSON File");
                String strA = com.huawei.hms.framework.network.grs.f.b.a(this.e.getPackageName()).a(this.e, this.g, this.f, this.f13271a, this.f13272b, true);
                if (strA == null || strA.isEmpty()) {
                    Logger.e(a.e, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details", this.f13271a, this.f13272b);
                }
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.f13271a, this.f13272b, StringUtils.anonymizeMessage(strA));
                this.f13273c.onCallBackSuccess(strA);
                return;
            }
            Logger.i(a.e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty", this.f13271a, this.f13272b);
            this.f13273c.onCallBackFail(-5);
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a() {
            if (!TextUtils.isEmpty(this.d)) {
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.f13271a, this.f13272b, StringUtils.anonymizeMessage(this.d));
                this.f13273c.onCallBackSuccess(this.d);
                return;
            }
            if (TextUtils.isEmpty(this.d)) {
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrl: Get URL from Local JSON File");
                String strA = com.huawei.hms.framework.network.grs.f.b.a(this.e.getPackageName()).a(this.e, this.g, this.f, this.f13271a, this.f13272b, true);
                if (strA == null || strA.isEmpty()) {
                    Logger.e(a.e, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details", this.f13271a, this.f13272b);
                }
                Logger.i(a.e, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.f13271a, this.f13272b, StringUtils.anonymizeMessage(strA));
                this.f13273c.onCallBackSuccess(strA);
                return;
            }
            Logger.i(a.e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty", this.f13271a, this.f13272b);
            this.f13273c.onCallBackFail(-3);
        }

        b(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, String str3, Context context, GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.a aVar) {
            this.f13271a = str;
            this.f13272b = str2;
            this.f13273c = iQueryUrlCallBack;
            this.d = str3;
            this.e = context;
            this.f = grsBaseInfo;
            this.g = aVar;
        }
    }

    public static Map<String, Map<String, String>> a(String str) {
        String str2 = e;
        Logger.i(str2, "getServicesUrlsMap spValue:" + str);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        if (TextUtils.isEmpty(str)) {
            Logger.v(str2, "isSpExpire jsonValue is null.");
            return concurrentHashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (!TextUtils.isEmpty(next)) {
                    concurrentHashMap.put(next, a(jSONObject2));
                }
            }
            return concurrentHashMap;
        } catch (JSONException e2) {
            Logger.w(e, "getServicesUrlsMap occur a JSONException: %s", StringUtils.anonymizeMessage(e2.getMessage()));
            return concurrentHashMap;
        }
    }

    public static CountryCodeBean a(Context context, boolean z) {
        return new CountryCodeBean(context, z);
    }

    public a(GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.a aVar, g gVar, com.huawei.hms.framework.network.grs.e.c cVar) {
        this.f13265a = grsBaseInfo;
        this.f13266b = aVar;
        this.f13267c = gVar;
        this.d = cVar;
    }
}
