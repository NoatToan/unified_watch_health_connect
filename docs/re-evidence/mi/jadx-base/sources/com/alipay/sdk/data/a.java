package com.alipay.sdk.data;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.util.c;
import com.alipay.sdk.util.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static a q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5832a = 10000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5833b = false;
    public String c = "https://h5.m.taobao.com/mlapp/olist.html";
    public int d = 10;
    public boolean e = true;
    public boolean f = true;
    public boolean g = false;
    public boolean h = false;
    public boolean i = true;
    public boolean j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f5834k = "";
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public boolean o = false;
    public List<C0118a> p = null;

    /* JADX INFO: renamed from: com.alipay.sdk.data.a$a, reason: collision with other inner class name */
    public static final class C0118a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5838b;
        public final String c;

        public C0118a(String str, int i, String str2) {
            this.f5837a = str;
            this.f5838b = i;
            this.c = str2;
        }

        public static C0118a a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            return new C0118a(jSONObject.optString("pn"), jSONObject.optInt("v", 0), jSONObject.optString("pk"));
        }

        public static List<C0118a> b(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                C0118a c0118aA = a(jSONArray.optJSONObject(i));
                if (c0118aA != null) {
                    arrayList.add(c0118aA);
                }
            }
            return arrayList;
        }

        public static JSONArray c(List<C0118a> list) {
            if (list == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            Iterator<C0118a> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(d(it.next()));
            }
            return jSONArray;
        }

        public static JSONObject d(C0118a c0118a) {
            if (c0118a == null) {
                return null;
            }
            try {
                return new JSONObject().put("pn", c0118a.f5837a).put("v", c0118a.f5838b).put("pk", c0118a.c);
            } catch (JSONException e) {
                c.d(e);
                return null;
            }
        }

        public String toString() {
            return String.valueOf(d(this));
        }
    }

    public static a w() {
        if (q == null) {
            a aVar = new a();
            q = aVar;
            aVar.x();
        }
        return q;
    }

    public int a() {
        int i = this.f5832a;
        if (i < 1000 || i > 20000) {
            c.b("DynCon", "time(def) = 10000");
            return 10000;
        }
        c.b("DynCon", "time = " + this.f5832a);
        return this.f5832a;
    }

    public final void d(com.alipay.sdk.sys.a aVar) {
        try {
            g.b(aVar, com.alipay.sdk.sys.b.a().c(), "alipay_cashier_dynamic_config", y().toString());
        } catch (Exception e) {
            c.d(e);
        }
    }

    public void e(final com.alipay.sdk.sys.a aVar, final Context context) {
        new Thread(new Runnable() { // from class: com.alipay.sdk.data.a.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.alipay.sdk.packet.b bVarA = new com.alipay.sdk.packet.impl.b().a(aVar, context);
                    if (bVarA != null) {
                        a.this.h(bVarA.b());
                        a.this.d(com.alipay.sdk.sys.a.a());
                    }
                } catch (Throwable th) {
                    c.d(th);
                }
            }
        }).start();
    }

    public final void f(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            g(new JSONObject(str));
        } catch (Throwable th) {
            c.d(th);
        }
    }

    public final void g(JSONObject jSONObject) {
        this.f5832a = jSONObject.optInt("timeout", 10000);
        this.f5833b = jSONObject.optBoolean("h5_port_degrade", false);
        this.c = jSONObject.optString("tbreturl", "https://h5.m.taobao.com/mlapp/olist.html").trim();
        this.d = jSONObject.optInt("configQueryInterval", 10);
        this.p = C0118a.b(jSONObject.optJSONArray("launchAppSwitch"));
        this.e = jSONObject.optBoolean("scheme_pay_2", true);
        this.f = jSONObject.optBoolean("intercept_batch", true);
        this.h = jSONObject.optBoolean("deg_log_mcgw", false);
        this.i = jSONObject.optBoolean("deg_start_srv_first", true);
        this.j = jSONObject.optBoolean("prev_jump_dual", true);
        this.f5834k = jSONObject.optString("use_sc_only", "");
        this.l = jSONObject.optBoolean("bind_use_imp", false);
        this.m = jSONObject.optBoolean("retry_bnd_once", false);
        this.n = jSONObject.optBoolean("skip_trans", false);
        this.o = jSONObject.optBoolean("up_before_pay", false);
    }

    public final void h(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("st_sdk_config");
            if (jSONObjectOptJSONObject != null) {
                g(jSONObjectOptJSONObject);
            } else {
                c.g("DynCon", "empty config");
            }
        } catch (Throwable th) {
            c.d(th);
        }
    }

    public boolean i() {
        return this.f5833b;
    }

    public boolean j() {
        return this.e;
    }

    public boolean k() {
        return this.f;
    }

    public String l() {
        return this.c;
    }

    public int m() {
        return this.d;
    }

    public boolean n() {
        return this.h;
    }

    public boolean o() {
        return this.i;
    }

    public boolean p() {
        return this.j;
    }

    public String q() {
        return this.f5834k;
    }

    public boolean r() {
        return this.l;
    }

    public boolean s() {
        return this.m;
    }

    public boolean t() {
        return this.n;
    }

    public boolean u() {
        return this.o;
    }

    public List<C0118a> v() {
        return this.p;
    }

    public final void x() {
        f(g.c(com.alipay.sdk.sys.a.a(), com.alipay.sdk.sys.b.a().c(), "alipay_cashier_dynamic_config", null));
    }

    public final JSONObject y() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("timeout", a());
        jSONObject.put("h5_port_degrade", i());
        jSONObject.put("tbreturl", l());
        jSONObject.put("configQueryInterval", m());
        jSONObject.put("launchAppSwitch", C0118a.c(v()));
        jSONObject.put("scheme_pay_2", j());
        jSONObject.put("intercept_batch", k());
        jSONObject.put("deg_log_mcgw", n());
        jSONObject.put("deg_start_srv_first", o());
        jSONObject.put("prev_jump_dual", p());
        jSONObject.put("use_sc_only", q());
        jSONObject.put("bind_use_imp", r());
        jSONObject.put("retry_bnd_once", s());
        jSONObject.put("skip_trans", t());
        jSONObject.put("up_before_pay", u());
        return jSONObject;
    }
}
