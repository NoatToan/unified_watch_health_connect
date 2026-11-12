package com.alipay.sdk.m.m;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.m.u.e;
import com.alipay.sdk.m.u.j;
import com.alipay.sdk.m.u.n;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.huami.ecg.core.db.entity.EcgData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static final String A = "DynCon";
    public static final int B = 10000;
    public static final String C = "https://h5.m.taobao.com/mlapp/olist.html";
    public static final int D = 10;
    public static final boolean E = true;
    public static final boolean F = true;
    public static final boolean G = false;
    public static final boolean H = true;
    public static final boolean I = true;
    public static final String J = "";
    public static final boolean K = false;
    public static final boolean L = false;
    public static final boolean M = false;
    public static final boolean N = false;
    public static final boolean O = true;
    public static final String P = "";
    public static final boolean Q = false;
    public static final boolean R = false;
    public static final boolean S = false;
    public static final int T = 1000;
    public static final boolean U = true;
    public static final String V = "";
    public static final int W = 1000;
    public static final int X = 20000;
    public static final String Y = "alipay_cashier_dynamic_config";
    public static final String Z = "timeout";
    public static final String a0 = "h5_port_degrade";
    public static final String b0 = "st_sdk_config";
    public static final String c0 = "tbreturl";
    public static final String d0 = "launchAppSwitch";
    public static final String e0 = "configQueryInterval";
    public static final String f0 = "deg_log_mcgw";
    public static final String g0 = "deg_start_srv_first";
    public static final String h0 = "prev_jump_dual";
    public static final String i0 = "use_sc_only";
    public static final String j0 = "retry_aidl_activity_not_start";
    public static final String k0 = "bind_use_imp";
    public static final String l0 = "retry_bnd_once";
    public static final String m0 = "skip_trans";
    public static final String n0 = "start_trans";
    public static final String o0 = "up_before_pay";
    public static final String p0 = "lck_k";
    public static final String q0 = "use_sc_lck_a";
    public static final String r0 = "utdid_factor";
    public static final String s0 = "cfg_max_time";
    public static final String t0 = "get_oa_id";
    public static final String u0 = "notifyFailApp";
    public static final String v0 = "scheme_pay_2";
    public static final String w0 = "intercept_batch";
    public static final String x0 = "bind_with_startActivity";
    public static a y0;
    public JSONObject w;
    public int a = 10000;
    public boolean b = false;
    public String c = C;
    public int d = 10;
    public boolean e = true;
    public boolean f = true;
    public boolean g = false;
    public boolean h = false;
    public boolean i = true;
    public boolean j = true;
    public String k = "";
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public boolean o = false;
    public boolean p = true;
    public String q = "";
    public String r = "";
    public boolean s = false;
    public boolean t = false;
    public int u = 1000;
    public boolean v = false;
    public boolean x = true;
    public List<b> y = null;
    public int z = -1;

    /* JADX INFO: renamed from: com.alipay.sdk.m.m.a$a, reason: collision with other inner class name */
    public class RunnableC0089a implements Runnable {
        public final /* synthetic */ com.alipay.sdk.m.s.a a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ int d;

        public RunnableC0089a(com.alipay.sdk.m.s.a aVar, Context context, boolean z, int i) {
            this.a = aVar;
            this.b = context;
            this.c = z;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.alipay.sdk.m.p.b bVarA = new com.alipay.sdk.m.q.b().a(this.a, this.b);
                if (bVarA != null) {
                    a.this.A(this.a, bVarA.a());
                    a.this.z(com.alipay.sdk.m.s.a.f());
                    com.alipay.sdk.m.k.a.a(this.a, com.alipay.sdk.m.k.b.l, "offcfg|" + this.c + AESEncryptionHelper.SEPARATOR + this.d);
                }
            } catch (Throwable th) {
                e.a(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(com.alipay.sdk.m.s.a aVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(b0);
            com.alipay.sdk.m.u.a.a(aVar, jSONObjectOptJSONObject, com.alipay.sdk.m.u.a.a(aVar, jSONObject));
            if (jSONObjectOptJSONObject != null) {
                C(jSONObjectOptJSONObject);
            } else {
                e.e(A, "empty config");
            }
        } catch (Throwable th) {
            e.a(th);
        }
    }

    private void B(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            C(new JSONObject(str));
        } catch (Throwable th) {
            e.a(th);
        }
    }

    private void C(JSONObject jSONObject) {
        this.a = jSONObject.optInt("timeout", 10000);
        this.b = jSONObject.optBoolean(a0, false);
        this.c = jSONObject.optString(c0, C).trim();
        this.d = jSONObject.optInt(e0, 10);
        this.y = b.a(jSONObject.optJSONArray(d0));
        this.e = jSONObject.optBoolean(v0, true);
        this.f = jSONObject.optBoolean(w0, true);
        this.h = jSONObject.optBoolean(f0, false);
        this.i = jSONObject.optBoolean(g0, true);
        this.j = jSONObject.optBoolean(h0, true);
        this.k = jSONObject.optString(i0, "");
        this.l = jSONObject.optBoolean(k0, false);
        this.m = jSONObject.optBoolean(l0, false);
        this.n = jSONObject.optBoolean(m0, false);
        this.o = jSONObject.optBoolean(n0, false);
        this.p = jSONObject.optBoolean(o0, true);
        this.q = jSONObject.optString(p0, "");
        this.s = jSONObject.optBoolean(q0, false);
        this.t = jSONObject.optBoolean(j0, false);
        this.v = jSONObject.optBoolean(u0, false);
        this.r = jSONObject.optString(x0, "");
        this.u = jSONObject.optInt(s0, 1000);
        this.x = jSONObject.optBoolean(t0, true);
        this.w = jSONObject.optJSONObject(com.alipay.sdk.m.u.a.b);
    }

    private int D() {
        return this.u;
    }

    private JSONObject y() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("timeout", k());
        jSONObject.put(a0, v());
        jSONObject.put(c0, q());
        jSONObject.put(e0, d());
        jSONObject.put(d0, b.a(l()));
        jSONObject.put(v0, i());
        jSONObject.put(w0, h());
        jSONObject.put(f0, e());
        jSONObject.put(g0, f());
        jSONObject.put(h0, m());
        jSONObject.put(i0, g());
        jSONObject.put(k0, b());
        jSONObject.put(l0, n());
        jSONObject.put(m0, p());
        jSONObject.put(n0, x());
        jSONObject.put(o0, r());
        jSONObject.put(q0, o());
        jSONObject.put(p0, j());
        jSONObject.put(x0, c());
        jSONObject.put(j0, w());
        jSONObject.put(s0, D());
        jSONObject.put(t0, u());
        jSONObject.put(u0, t());
        jSONObject.put(com.alipay.sdk.m.u.a.b, a());
        return jSONObject;
    }

    public static a z() {
        if (y0 == null) {
            a aVar = new a();
            y0 = aVar;
            aVar.s();
        }
        return y0;
    }

    public boolean b() {
        return this.l;
    }

    public String c() {
        return this.r;
    }

    public int d() {
        return this.d;
    }

    public boolean e() {
        return this.h;
    }

    public boolean f() {
        return this.i;
    }

    public String g() {
        return this.k;
    }

    public boolean h() {
        return this.f;
    }

    public boolean i() {
        return this.e;
    }

    public String j() {
        return this.q;
    }

    public int k() {
        int i = this.a;
        if (i < 1000 || i > 20000) {
            e.b(A, "time(def) = 10000");
            return 10000;
        }
        e.b(A, "time = " + this.a);
        return this.a;
    }

    public List<b> l() {
        return this.y;
    }

    public boolean m() {
        return this.j;
    }

    public boolean n() {
        return this.m;
    }

    public boolean o() {
        return this.s;
    }

    public boolean p() {
        return this.n;
    }

    public String q() {
        return this.c;
    }

    public boolean r() {
        return this.p;
    }

    public void s() {
        Context contextB = com.alipay.sdk.m.s.b.d().b();
        String strA = j.a(com.alipay.sdk.m.s.a.f(), contextB, Y, null);
        try {
            this.z = Integer.parseInt(j.a(com.alipay.sdk.m.s.a.f(), contextB, r0, EcgData.DEFAULT_DIGIT_VALUE));
        } catch (Exception unused) {
        }
        B(strA);
    }

    public boolean t() {
        return this.v;
    }

    public boolean u() {
        return this.x;
    }

    public boolean v() {
        return this.b;
    }

    public boolean w() {
        return this.t;
    }

    public boolean x() {
        return this.o;
    }

    public static final class b {
        public final String a;
        public final int b;
        public final String c;

        public b(String str, int i, String str2) {
            this.a = str;
            this.b = i;
            this.c = str2;
        }

        public static b a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            return new b(jSONObject.optString("pn"), jSONObject.optInt("v", 0), jSONObject.optString("pk"));
        }

        public String toString() {
            return String.valueOf(a(this));
        }

        public static List<b> a(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                b bVarA = a(jSONArray.optJSONObject(i));
                if (bVarA != null) {
                    arrayList.add(bVarA);
                }
            }
            return arrayList;
        }

        public static JSONObject a(b bVar) {
            if (bVar == null) {
                return null;
            }
            try {
                return new JSONObject().put("pn", bVar.a).put("v", bVar.b).put("pk", bVar.c);
            } catch (JSONException e) {
                e.a(e);
                return null;
            }
        }

        public static JSONArray a(List<b> list) {
            if (list == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            Iterator<b> it2 = list.iterator();
            while (it2.hasNext()) {
                jSONArray.put(a(it2.next()));
            }
            return jSONArray;
        }
    }

    public JSONObject a() {
        return this.w;
    }

    public void a(boolean z) {
        this.g = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(com.alipay.sdk.m.s.a aVar) {
        try {
            JSONObject jSONObjectY = y();
            j.b(aVar, com.alipay.sdk.m.s.b.d().b(), Y, jSONObjectY.toString());
        } catch (Exception e) {
            e.a(e);
        }
    }

    public void a(com.alipay.sdk.m.s.a aVar, Context context, boolean z, int i) {
        com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, "oncfg|" + z + AESEncryptionHelper.SEPARATOR + i);
        RunnableC0089a runnableC0089a = new RunnableC0089a(aVar, context, z, i);
        if (z && !n.h()) {
            int iD = D();
            if (n.a(iD, runnableC0089a, "AlipayDCPBlok")) {
                return;
            }
            com.alipay.sdk.m.k.a.b(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.i0, "" + iD);
            return;
        }
        Thread thread = new Thread(runnableC0089a);
        thread.setName("AlipayDCP");
        thread.start();
    }

    public boolean a(Context context, int i) {
        if (this.z == -1) {
            this.z = n.a();
            j.b(com.alipay.sdk.m.s.a.f(), context, r0, String.valueOf(this.z));
        }
        return this.z < i;
    }
}
