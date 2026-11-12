package com.xiaomi.onetrack.f;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.fitness.yrn_config.YRNConstants;
import com.xiaomi.onetrack.BuildConfig;
import com.xiaomi.onetrack.Configuration;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.onetrack.util.DeviceUtil;
import com.xiaomi.onetrack.util.aa;
import com.xiaomi.onetrack.util.ac;
import com.xiaomi.onetrack.util.o;
import com.xiaomi.onetrack.util.p;
import com.xiaomi.onetrack.util.q;
import com.xiaomi.onetrack.util.v;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f13875a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f13876b = 1;
    public static final int c = 2;
    private static final String d = "Event";
    private long e;
    private String f;
    private String g;
    private String h;
    private int i;
    private JSONObject j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f13877k;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f13878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f13879b;
        private String c;
        private String d;
        private int e;
        private JSONObject f;
        private long g;

        public a a(long j) {
            this.f13878a = this.f13878a;
            return this;
        }

        public a b(String str) {
            this.c = str;
            return this;
        }

        public a c(String str) {
            this.d = str;
            return this;
        }

        public a a(String str) {
            this.f13879b = str;
            return this;
        }

        public a b(long j) {
            this.g = j;
            return this;
        }

        public a a(int i) {
            this.e = i;
            return this;
        }

        public a a(JSONObject jSONObject) {
            this.f = jSONObject;
            return this;
        }

        public b a() {
            return new b(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.onetrack.f.b$b, reason: collision with other inner class name */
    public static class C0832b {
        public static String A = "sdk_mode";
        public static String B = "ot_first_day";
        public static String C = "ot_test_env";
        public static String D = "ot_privacy_policy";
        public static String E = "market_name";
        public static String F = "ot_ad";
        public static String G = "ot_basic_mode";
        public static String H = "ot_ad_monitor";
        public static String I = "ot_hybrid_type";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static String f13880a = "event";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static String f13881b = "imei";
        public static String c = "oaid";
        public static String d = "sn";
        public static String e = "gaid";
        public static String f = "android_id";
        public static String g = "instance_id";
        public static String h = "mfrs";
        public static String i = "model";
        public static String j = "platform";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static String f13882k = "miui";
        public static String l = "build";
        public static String m = "os_ver";
        public static String n = "app_id";
        public static String o = "app_ver";
        public static String p = "pkg";
        public static String q = "channel";

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static String f13883r = "e_ts";
        public static String s = "tz";
        public static String t = "net";
        public static String u = "region";
        public static String v = "plugin_id";
        public static String w = "sdk_ver";
        public static String x = "uid";
        public static String y = "uid_type";
        public static String z = "sid";
    }

    public void a(long j) {
        this.e = j;
    }

    public long b() {
        return this.e;
    }

    public String c() {
        return this.f;
    }

    public String d() {
        return this.g;
    }

    public String e() {
        return this.h;
    }

    public int f() {
        return this.i;
    }

    public JSONObject g() {
        return this.j;
    }

    public long h() {
        return this.f13877k;
    }

    public boolean i() {
        try {
            JSONObject jSONObject = this.j;
            return (jSONObject == null || !jSONObject.has(com.xiaomi.onetrack.api.c.f13756b) || !this.j.has(com.xiaomi.onetrack.api.c.f13755a) || TextUtils.isEmpty(this.f) || TextUtils.isEmpty(this.g)) ? false : true;
        } catch (Exception e) {
            p.b(d, "check event isValid error, ", e);
            return false;
        }
    }

    public b() {
    }

    public void a(String str) {
        this.f = str;
    }

    public void b(String str) {
        this.g = str;
    }

    public void c(String str) {
        this.h = str;
    }

    private b(a aVar) {
        this.e = aVar.f13878a;
        this.f = aVar.f13879b;
        this.g = aVar.c;
        this.h = aVar.d;
        this.i = aVar.e;
        this.j = aVar.f;
        this.f13877k = aVar.g;
    }

    public void a(int i) {
        this.i = i;
    }

    public void b(JSONObject jSONObject) {
        this.j = jSONObject;
    }

    public static JSONObject a(String str, Configuration configuration, OneTrack.IEventHook iEventHook, v vVar, boolean z, boolean z2) throws JSONException {
        return a(str, configuration, iEventHook, "", vVar, z, z2);
    }

    public void b(long j) {
        this.f13877k = j;
    }

    public static JSONObject a(String str, Configuration configuration, OneTrack.IEventHook iEventHook, String str2, v vVar, boolean z, boolean z2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Context contextB = com.xiaomi.onetrack.f.a.b();
        jSONObject.put(C0832b.f13880a, str);
        if (!z) {
            if (q.a() ? q.h() : configuration.isInternational()) {
                if (iEventHook != null && iEventHook.isRecommendEvent(str)) {
                    String strP = DeviceUtil.p(contextB);
                    if (!TextUtils.isEmpty(strP)) {
                        jSONObject.put(C0832b.e, strP);
                    }
                }
            } else {
                jSONObject.put(C0832b.f13881b, DeviceUtil.b(contextB));
                jSONObject.put(C0832b.c, com.xiaomi.onetrack.util.oaid.a.a().a(contextB));
            }
            jSONObject.put(C0832b.g, o.a().b());
            a(jSONObject, configuration, str2);
            a(jSONObject, contextB);
            jSONObject.put(C0832b.z, q.f());
        }
        jSONObject.put(C0832b.h, DeviceUtil.e());
        jSONObject.put(C0832b.i, DeviceUtil.c());
        jSONObject.put(C0832b.j, YRNConstants.PLATFORM);
        jSONObject.put(C0832b.f13882k, q.d());
        jSONObject.put(C0832b.l, q.c());
        jSONObject.put(C0832b.m, q.e());
        jSONObject.put(C0832b.o, com.xiaomi.onetrack.f.a.c());
        jSONObject.put(C0832b.f13883r, System.currentTimeMillis());
        jSONObject.put(C0832b.s, q.b());
        jSONObject.put(C0832b.t, com.xiaomi.onetrack.g.c.a(contextB).toString());
        jSONObject.put(C0832b.u, q.i());
        jSONObject.put(C0832b.w, BuildConfig.SDK_VERSION);
        if (z2) {
            jSONObject.put(C0832b.n, configuration.getAdEventAppId());
        } else {
            jSONObject.put(C0832b.n, configuration.getAppId());
        }
        jSONObject.put(C0832b.F, z2);
        jSONObject.put(C0832b.p, com.xiaomi.onetrack.f.a.e());
        jSONObject.put(C0832b.q, !TextUtils.isEmpty(configuration.getChannel()) ? configuration.getChannel() : "default");
        jSONObject.put(C0832b.A, (configuration.getMode() != null ? configuration.getMode() : OneTrack.Mode.APP).getType());
        jSONObject.put(C0832b.B, ac.d(aa.B()));
        if (p.c) {
            jSONObject.put(C0832b.C, true);
        }
        jSONObject.put(C0832b.D, vVar.a());
        jSONObject.put(C0832b.E, DeviceUtil.d());
        jSONObject.put(C0832b.G, z);
        return jSONObject;
    }

    public static JSONObject a(com.xiaomi.onetrack.api.d dVar, Configuration configuration, OneTrack.IEventHook iEventHook, v vVar, boolean z, boolean z2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Context contextB = com.xiaomi.onetrack.f.a.b();
        jSONObject.put(C0832b.f13880a, dVar.a());
        if (!z) {
            if (q.a() ? q.h() : configuration.isInternational()) {
                if (iEventHook != null && iEventHook.isRecommendEvent(dVar.a())) {
                    String strP = DeviceUtil.p(contextB);
                    if (!TextUtils.isEmpty(strP)) {
                        jSONObject.put(C0832b.e, strP);
                    }
                }
            } else {
                jSONObject.put(C0832b.f13881b, DeviceUtil.b(contextB));
                jSONObject.put(C0832b.c, com.xiaomi.onetrack.util.oaid.a.a().a(contextB));
            }
            jSONObject.put(C0832b.g, o.a().b());
            jSONObject.put(C0832b.v, configuration.getPluginId());
            if (!TextUtils.isEmpty(dVar.e()) && !TextUtils.isEmpty(dVar.f())) {
                jSONObject.put(C0832b.x, dVar.e());
                jSONObject.put(C0832b.y, dVar.f());
            }
            jSONObject.put(C0832b.z, q.f());
        }
        jSONObject.put(C0832b.F, z2);
        jSONObject.put(C0832b.h, DeviceUtil.e());
        jSONObject.put(C0832b.i, DeviceUtil.c());
        jSONObject.put(C0832b.j, YRNConstants.PLATFORM);
        jSONObject.put(C0832b.f13882k, q.d());
        jSONObject.put(C0832b.l, q.c());
        jSONObject.put(C0832b.m, q.e());
        jSONObject.put(C0832b.o, com.xiaomi.onetrack.f.a.c());
        jSONObject.put(C0832b.f13883r, dVar.b());
        jSONObject.put(C0832b.s, q.b());
        jSONObject.put(C0832b.t, com.xiaomi.onetrack.g.c.a(contextB).toString());
        jSONObject.put(C0832b.u, q.i());
        jSONObject.put(C0832b.w, BuildConfig.SDK_VERSION);
        jSONObject.put(C0832b.n, dVar.c());
        jSONObject.put(C0832b.p, com.xiaomi.onetrack.f.a.e());
        jSONObject.put(C0832b.q, !TextUtils.isEmpty(dVar.d()) ? dVar.d() : "default");
        jSONObject.put(C0832b.A, (configuration.getMode() != null ? configuration.getMode() : OneTrack.Mode.APP).getType());
        jSONObject.put(C0832b.B, ac.d(aa.B()));
        if (p.c) {
            jSONObject.put(C0832b.C, true);
        }
        jSONObject.put(C0832b.D, vVar.a());
        jSONObject.put(C0832b.E, DeviceUtil.d());
        jSONObject.put(C0832b.G, z);
        jSONObject.put(C0832b.I, "JS");
        return jSONObject;
    }

    private static void a(JSONObject jSONObject, Context context) throws JSONException {
        String strU = aa.u();
        String strW = aa.w();
        if (TextUtils.isEmpty(strU) || TextUtils.isEmpty(strW)) {
            return;
        }
        jSONObject.put(C0832b.x, strU);
        jSONObject.put(C0832b.y, strW);
    }

    private static void a(JSONObject jSONObject, Configuration configuration, String str) throws JSONException {
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put(C0832b.v, str);
        } else {
            jSONObject.put(C0832b.v, configuration.getPluginId());
        }
    }
}
