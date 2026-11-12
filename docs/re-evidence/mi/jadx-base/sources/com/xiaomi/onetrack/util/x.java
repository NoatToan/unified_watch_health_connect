package com.xiaomi.onetrack.util;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f14002a = "RegionDomainManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f14003b = "CN";
    private static final String c = "INTL";
    private static final String d = "IN";
    private static final String e = "RU";
    private static final String f = "http://";
    private static final String g = "https://";
    private static final String h = "tracking.miui.com";
    private static final String i = "tracking.intl.miui.com";
    private static final String j = "tracking.rus.miui.com";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f14004k = "tracking.india.miui.com";
    private static final String l = "sdkconfig.ad.xiaomi.com";
    private static final String m = "sdkconfig.ad.intl.xiaomi.com";
    private static final String n = "sdkconfig.ad.india.xiaomi.com";
    private static final String o = "sdkconfig.ad.rus.xiaomi.com";
    private static final String p = "/track/v4";
    private static final String q = "/track/key_get";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f14005r = "/api/v4/detail/config";
    private static final String s = "/api/v4/detail/config_common";
    private static ConcurrentHashMap<String, String> u = new ConcurrentHashMap<>();
    private Context t;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final x f14006a = new x();

        private a() {
        }
    }

    public static x a() {
        return a.f14006a;
    }

    private void f() {
        try {
            String strH = aa.h();
            if (TextUtils.isEmpty(strH)) {
                return;
            }
            a(new JSONObject(strH));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    private String g() {
        return g;
    }

    private String h() {
        return a(q.h(), q.i());
    }

    private String i() {
        boolean zH = q.h();
        String strI = q.i();
        if (!zH) {
            return l;
        }
        if (TextUtils.equals(strI, "IN")) {
            return n;
        }
        return TextUtils.equals(strI, "RU") ? o : m;
    }

    public String b() {
        try {
            if (TextUtils.isEmpty(aa.l())) {
                com.xiaomi.onetrack.b.e.b();
            }
        } catch (Exception e2) {
            p.a(f14002a, "getTrackingUrl: " + e2.toString());
        }
        return a(g(), h(), p);
    }

    public String c() {
        return a(g(), i(), f14005r);
    }

    public String d() {
        return a(g(), i(), s);
    }

    public String e() {
        return a(g(), h(), q);
    }

    private x() {
        u.put("IN", f14004k);
        u.put("RU", j);
        f();
    }

    public synchronized void a(JSONObject jSONObject) {
        try {
            p.a(f14002a, "updateHostMap:" + jSONObject.toString());
            try {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strOptString = jSONObject.optString(next);
                    if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(strOptString)) {
                        u.put(next, strOptString);
                    }
                }
                aa.b(new JSONObject(u).toString());
            } catch (Exception e2) {
                p.a(f14002a, "updateHostMap: " + e2.toString());
            }
            p.a(f14002a, "merge config:" + new JSONObject(u).toString());
        } catch (Throwable th) {
            throw th;
        }
    }

    public String a(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    private String a(boolean z, String str) {
        if (!z) {
            return h;
        }
        String str2 = u.get(str);
        return TextUtils.isEmpty(str2) ? i : str2;
    }
}
