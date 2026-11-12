package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.network.embedded.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class mx {
    public static mx d;
    public JSONObject e;
    public int h = 10000;
    public boolean j = false;
    public String l = "https://h5.m.taobao.com/mlapp/olist.html";
    public int k = 10;
    public boolean m = true;
    public boolean n = false;
    public boolean o = false;
    public boolean t = false;
    public boolean r = true;
    public boolean p = true;
    public boolean q = false;
    public boolean s = true;
    public boolean y = false;
    public boolean u = false;
    public boolean v = false;
    public boolean w = true;
    public String x = "";
    public String aa = "";
    public boolean ad = false;
    public boolean ac = false;
    public boolean ab = false;
    public int z = 1000;
    public boolean af = false;
    public Boolean ag = null;
    public Boolean ah = null;
    public Boolean ae = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f42620c = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f42619b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f42618a = null;
    public boolean f = true;
    public List<d> i = null;
    public int g = -1;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f42621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ on f42622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f42623c;
        public final /* synthetic */ int d;

        public a(on onVar, Context context, boolean z, int i) {
            this.f42622b = onVar;
            this.f42621a = context;
            this.f42623c = z;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                nw nwVarA = new oa().a(this.f42622b, this.f42621a);
                if (nwVarA != null) {
                    mx.this.b(this.f42622b, nwVarA.e());
                    mx.this.i(on.d());
                    mu.b(this.f42622b, "biz", "offcfg|" + this.f42623c + "|" + this.d);
                }
            } catch (Throwable th) {
                oq.c(th);
            }
        }
    }

    public static mx c() {
        if (d == null) {
            mx mxVar = new mx();
            d = mxVar;
            mxVar.v();
        }
        return d;
    }

    public boolean a() {
        return this.n;
    }

    public boolean aa() {
        return this.af;
    }

    public boolean ab() {
        return this.ad;
    }

    public boolean ac() {
        return this.f;
    }

    public boolean ad() {
        return this.j;
    }

    public final JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("timeout", k());
        jSONObject.put("h5_port_degrade", ad());
        jSONObject.put("tbreturl", w());
        jSONObject.put("configQueryInterval", j());
        jSONObject.put("launchAppSwitch", d.a(p()));
        jSONObject.put("intercept_batch", m());
        jSONObject.put("deg_log_mcgw", n());
        jSONObject.put("deg_start_srv_first", o());
        jSONObject.put("prev_jump_dual", s());
        jSONObject.put("bind_use_imp", f());
        jSONObject.put("bind_use_allow_activity_starts", h());
        jSONObject.put("retry_bnd_once", t());
        jSONObject.put("skip_trans", q());
        jSONObject.put("start_trans", e());
        jSONObject.put("up_before_pay", x());
        jSONObject.put("use_sc_lck_a", r());
        jSONObject.put("lck_k", l());
        jSONObject.put("bind_with_startActivity", i());
        jSONObject.put("cfg_max_time", g());
        jSONObject.put("get_oa_id", ac());
        jSONObject.put("notifyFailApp", aa());
        jSONObject.put("enableStartActivityFallback", ab());
        jSONObject.put("enableBindExFallback", u());
        jSONObject.put("startactivity_in_ui_thread", a());
        jSONObject.put("ap_args", d());
        Boolean bool = this.ag;
        if (bool != null) {
            jSONObject.put("optimize_trans_activity_degrade", bool);
        }
        Boolean bool2 = this.ah;
        if (bool2 != null) {
            jSONObject.put("register_app_degrade", bool2);
        }
        Boolean bool3 = this.f42620c;
        if (bool3 != null) {
            jSONObject.put("sdk_pre_heat", bool3);
        }
        Boolean bool4 = this.f42619b;
        if (bool4 != null) {
            jSONObject.put("external_sdk_data_degrade", bool4);
        }
        Boolean bool5 = this.f42618a;
        if (bool5 != null) {
            jSONObject.put("local_web_pay", bool5);
        }
        Boolean bool6 = this.ae;
        if (bool6 != null) {
            jSONObject.put("degrade_web_ua_version", bool6);
        }
        return jSONObject;
    }

    public boolean e() {
        return this.v;
    }

    public boolean f() {
        return this.q;
    }

    public final int g() {
        return this.z;
    }

    public boolean h() {
        return this.s;
    }

    public String i() {
        return this.aa;
    }

    public int j() {
        return this.k;
    }

    public int k() {
        int i = this.h;
        if (i < 1000 || i > 20000) {
            oq.b("DynCon", "time(def) = 10000");
            return 10000;
        }
        oq.b("DynCon", "time = " + this.h);
        return this.h;
    }

    public String l() {
        return this.x;
    }

    public boolean m() {
        return this.m;
    }

    public boolean n() {
        return this.t;
    }

    public boolean o() {
        return this.r;
    }

    public List<d> p() {
        return this.i;
    }

    public boolean q() {
        return this.u;
    }

    public boolean r() {
        return this.ab;
    }

    public boolean s() {
        return this.p;
    }

    public boolean t() {
        return this.y;
    }

    public boolean u() {
        return this.ac;
    }

    public void v() {
        Context contextC = ol.e().c();
        String strD = or.d(on.d(), contextC, "alipay_cashier_dynamic_config", null);
        try {
            this.g = Integer.parseInt(or.d(on.d(), contextC, "utdid_factor", "-1"));
        } catch (Exception unused) {
        }
        e(strD);
    }

    public String w() {
        return this.l;
    }

    public boolean x() {
        return this.w;
    }

    public boolean y() {
        Boolean bool = this.ae;
        return bool != null && bool.booleanValue();
    }

    public boolean b(on onVar) {
        a(onVar, "register_app_degrade", String.valueOf(this.ah));
        Boolean bool = this.ah;
        return bool != null && bool.booleanValue();
    }

    public boolean c(on onVar) {
        a(onVar, "sdk_pre_heat", String.valueOf(this.f42620c));
        Boolean bool = this.f42620c;
        return bool != null && bool.booleanValue();
    }

    public boolean d(on onVar) {
        a(onVar, "optimize_trans_activity_degrade", String.valueOf(this.ag));
        Boolean bool = this.ag;
        return bool != null && bool.booleanValue();
    }

    public boolean e(on onVar) {
        a(onVar, "local_web_pay", String.valueOf(this.f42618a));
        Boolean bool = this.f42618a;
        return bool != null && bool.booleanValue();
    }

    public final void i(on onVar) {
        try {
            or.c(onVar, ol.e().c(), "alipay_cashier_dynamic_config", b().toString());
        } catch (Exception e) {
            oq.c(e);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f42624a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f42625c;
        public final int d;

        public d(String str, int i, String str2) {
            this.f42625c = str;
            this.d = i;
            this.f42624a = str2;
        }

        public static d d(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            return new d(jSONObject.optString("pn"), jSONObject.optInt("v", 0), jSONObject.optString("pk"));
        }

        public String toString() {
            return String.valueOf(a(this));
        }

        public static List<d> c(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                d dVarD = d(jSONArray.optJSONObject(i));
                if (dVarD != null) {
                    arrayList.add(dVarD);
                }
            }
            return arrayList;
        }

        public static JSONObject a(d dVar) {
            if (dVar == null) {
                return null;
            }
            try {
                return new JSONObject().put("pn", dVar.f42625c).put("v", dVar.d).put("pk", dVar.f42624a);
            } catch (JSONException e) {
                oq.c(e);
                return null;
            }
        }

        public static JSONArray a(List<d> list) {
            if (list == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            Iterator<d> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(a(it.next()));
            }
            return jSONArray;
        }
    }

    public JSONObject d() {
        return this.e;
    }

    public boolean a(on onVar) {
        a(onVar, "external_sdk_data_degrade", String.valueOf(this.f42619b));
        Boolean bool = this.f42619b;
        return bool != null && bool.booleanValue();
    }

    public final void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            e(new JSONObject(str));
        } catch (Throwable th) {
            oq.c(th);
        }
    }

    public final void b(on onVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("st_sdk_config");
            om.c(onVar, jSONObjectOptJSONObject, om.c(onVar, jSONObject));
            if (jSONObjectOptJSONObject != null) {
                e(jSONObjectOptJSONObject);
            } else {
                oq.a("DynCon", "empty config");
            }
        } catch (Throwable th) {
            oq.c(th);
        }
    }

    public final void e(JSONObject jSONObject) {
        this.h = jSONObject.optInt("timeout", 10000);
        this.j = jSONObject.optBoolean("h5_port_degrade", false);
        this.l = jSONObject.optString("tbreturl", "https://h5.m.taobao.com/mlapp/olist.html").trim();
        this.k = jSONObject.optInt("configQueryInterval", 10);
        this.i = d.c(jSONObject.optJSONArray("launchAppSwitch"));
        this.m = jSONObject.optBoolean("intercept_batch", true);
        this.t = jSONObject.optBoolean("deg_log_mcgw", false);
        this.r = jSONObject.optBoolean("deg_start_srv_first", true);
        this.p = jSONObject.optBoolean("prev_jump_dual", true);
        this.q = jSONObject.optBoolean("bind_use_imp", false);
        this.s = jSONObject.optBoolean("bind_use_allow_activity_starts", true);
        this.y = jSONObject.optBoolean("retry_bnd_once", false);
        this.u = jSONObject.optBoolean("skip_trans", false);
        this.v = jSONObject.optBoolean("start_trans", false);
        this.w = jSONObject.optBoolean("up_before_pay", true);
        this.x = jSONObject.optString("lck_k", "");
        this.ab = jSONObject.optBoolean("use_sc_lck_a", false);
        this.af = jSONObject.optBoolean("notifyFailApp", false);
        this.aa = jSONObject.optString("bind_with_startActivity", "");
        this.z = jSONObject.optInt("cfg_max_time", 1000);
        this.f = jSONObject.optBoolean("get_oa_id", true);
        this.ad = jSONObject.optBoolean("enableStartActivityFallback", false);
        this.ac = jSONObject.optBoolean("enableBindExFallback", false);
        this.n = jSONObject.optBoolean("startactivity_in_ui_thread", false);
        this.e = jSONObject.optJSONObject("ap_args");
        if (jSONObject.has("optimize_trans_activity_degrade")) {
            this.ag = Boolean.valueOf(jSONObject.optBoolean("optimize_trans_activity_degrade", false));
        } else {
            this.ag = null;
        }
        if (jSONObject.has("register_app_degrade")) {
            this.ah = Boolean.valueOf(jSONObject.optBoolean("register_app_degrade", false));
        } else {
            this.ah = null;
        }
        if (jSONObject.has("sdk_pre_heat")) {
            this.f42620c = Boolean.valueOf(jSONObject.optBoolean("sdk_pre_heat", false));
        } else {
            this.f42620c = null;
        }
        if (jSONObject.has("external_sdk_data_degrade")) {
            this.f42619b = Boolean.valueOf(jSONObject.optBoolean("external_sdk_data_degrade", false));
        } else {
            this.f42619b = null;
        }
        if (jSONObject.has("local_web_pay")) {
            this.f42618a = Boolean.valueOf(jSONObject.optBoolean("local_web_pay", false));
        } else {
            this.f42618a = null;
        }
        if (jSONObject.has("degrade_web_ua_version")) {
            this.ae = Boolean.valueOf(jSONObject.optBoolean("degrade_web_ua_version", false));
        } else {
            this.ae = null;
        }
    }

    public void a(on onVar, Context context, boolean z, int i) {
        mu.b(onVar, "biz", "oncfg|" + z + "|" + i);
        a aVar = new a(onVar, context, z, i);
        if (z && !ox.i()) {
            int iG = g();
            if (ox.a(iG, aVar, "AlipayDCPBlok")) {
                return;
            }
            mu.e(onVar, "biz", "LogAppFetchConfigTimeout", "" + iG);
            return;
        }
        Thread thread = new Thread(aVar);
        thread.setName("AlipayDCP");
        thread.start();
    }

    public boolean e(Context context, int i) {
        if (this.g == -1) {
            this.g = ox.e();
            or.c(on.d(), context, "utdid_factor", String.valueOf(this.g));
        }
        return this.g < i;
    }

    public final void a(on onVar, String str, String str2) {
        if (onVar == null) {
            return;
        }
        mu.d(onVar, "biz", j.m, str + "|" + str2);
    }
}
