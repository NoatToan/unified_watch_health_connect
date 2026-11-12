package ah;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Looper;
import android.text.TextUtils;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import java.util.ArrayList;
import java.util.Iterator;
import nh.d;
import nh.k;
import nh.n;
import nh.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static a f3244z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public JSONObject f3266v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3245a = 10000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3246b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f3247c = "https://h5.m.taobao.com/mlapp/olist.html";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3248d = 10;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3249e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3250f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3251g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3252h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3253i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3254j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3255k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f3256l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3257m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3258n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f3259o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f3260p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f3261q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f3262r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f3263s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3264t = 1000;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f3265u = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f3267w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList f3268x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f3269y = -1;

    /* JADX INFO: renamed from: ah.a$a, reason: collision with other inner class name */
    public class RunnableC0056a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ lh.a f3270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f3271b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f3272c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f3273d;

        public RunnableC0056a(lh.a aVar, Context context, boolean z14, int i14) {
            this.f3270a = aVar;
            this.f3271b = context;
            this.f3272c = z14;
            this.f3273d = i14;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            lh.a aVar2 = this.f3270a;
            try {
                fh.b bVarA = new hh.b().a(this.f3271b, "", aVar2);
                if (bVarA != null) {
                    a.b(aVar, aVar2, bVarA.f71573b);
                    try {
                        k.c("alipay_cashier_dynamic_config", aVar.a().toString(), lh.b.b().f112390a, null);
                    } catch (Exception e4) {
                        d.a(e4);
                    }
                    wg.a.b("offcfg|" + this.f3272c + "|" + this.f3273d, aVar2);
                }
            } catch (Throwable th3) {
                d.a(th3);
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f3276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f3277c;

        public b(String str, int i14, String str2) {
            this.f3275a = str;
            this.f3276b = i14;
            this.f3277c = str2;
        }

        public static JSONObject a(b bVar) {
            if (bVar == null) {
                return null;
            }
            try {
                return new JSONObject().put("pn", bVar.f3275a).put("v", bVar.f3276b).put("pk", bVar.f3277c);
            } catch (JSONException e4) {
                d.a(e4);
                return null;
            }
        }

        public final String toString() {
            return String.valueOf(a(this));
        }
    }

    public static void b(a aVar, lh.a aVar2, String str) {
        aVar.getClass();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("st_sdk_config");
            String strOptString = jSONObject.optString("ap_resp");
            JSONObject jSONObject2 = null;
            try {
                if (!TextUtils.isEmpty(strOptString)) {
                    jSONObject2 = new JSONObject(strOptString);
                }
            } catch (JSONException e4) {
                wg.a.d(aVar2, "biz", "APMEx2", e4);
            }
            if (jSONObjectOptJSONObject != null && jSONObject2 != null) {
                try {
                    jSONObjectOptJSONObject.putOpt("ap_args", jSONObject2);
                } catch (JSONException e14) {
                    wg.a.d(aVar2, "biz", "APMEx2", e14);
                }
            }
            if (jSONObjectOptJSONObject != null) {
                aVar.d(jSONObjectOptJSONObject);
            }
        } catch (Throwable th3) {
            d.a(th3);
        }
    }

    public static a g() {
        if (f3244z == null) {
            a aVar = new a();
            f3244z = aVar;
            Context context = lh.b.b().f112390a;
            String strB = k.b("alipay_cashier_dynamic_config", null, context, null);
            try {
                aVar.f3269y = Integer.parseInt(k.b("utdid_factor", "-1", context, null));
            } catch (Exception unused) {
            }
            if (!TextUtils.isEmpty(strB)) {
                try {
                    aVar.d(new JSONObject(strB));
                } catch (Throwable th3) {
                    d.a(th3);
                }
            }
        }
        return f3244z;
    }

    public final JSONObject a() throws JSONException {
        JSONArray jSONArray;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("timeout", f());
        jSONObject.put("h5_port_degrade", this.f3246b);
        jSONObject.put("tbreturl", this.f3247c);
        jSONObject.put("configQueryInterval", this.f3248d);
        ArrayList arrayList = this.f3268x;
        if (arrayList == null) {
            jSONArray = null;
        } else {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray2.put(b.a((b) it.next()));
            }
            jSONArray = jSONArray2;
        }
        jSONObject.put("launchAppSwitch", jSONArray);
        jSONObject.put("intercept_batch", this.f3249e);
        jSONObject.put("deg_log_mcgw", this.f3251g);
        jSONObject.put("deg_start_srv_first", this.f3252h);
        jSONObject.put("prev_jump_dual", this.f3253i);
        jSONObject.put("bind_use_imp", this.f3254j);
        jSONObject.put("retry_bnd_once", this.f3255k);
        jSONObject.put("skip_trans", this.f3256l);
        jSONObject.put("start_trans", this.f3257m);
        jSONObject.put("up_before_pay", this.f3258n);
        jSONObject.put("use_sc_lck_a", this.f3263s);
        jSONObject.put("lck_k", this.f3259o);
        jSONObject.put("bind_with_startActivity", this.f3260p);
        jSONObject.put("cfg_max_time", this.f3264t);
        jSONObject.put("get_oa_id", this.f3267w);
        jSONObject.put("notifyFailApp", this.f3265u);
        jSONObject.put("enableStartActivityFallback", this.f3261q);
        jSONObject.put("enableBindExFallback", this.f3262r);
        jSONObject.put("startactivity_in_ui_thread", this.f3250f);
        jSONObject.put("ap_args", this.f3266v);
        return jSONObject;
    }

    public final void c(lh.a aVar, Context context, boolean z14, int i14) {
        boolean zBlock;
        wg.a.b("oncfg|" + z14 + "|" + i14, aVar);
        RunnableC0056a runnableC0056a = new RunnableC0056a(aVar, context, z14, i14);
        if (!z14 || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            Thread thread = new Thread(runnableC0056a);
            thread.setName("AlipayDCP");
            thread.start();
            return;
        }
        int i15 = this.f3264t;
        long j8 = i15;
        ConditionVariable conditionVariable = new ConditionVariable();
        Thread thread2 = new Thread(new o(runnableC0056a, conditionVariable));
        if (!TextUtils.isEmpty("AlipayDCPBlok")) {
            thread2.setName("AlipayDCPBlok");
        }
        thread2.start();
        try {
            if (j8 <= 0) {
                conditionVariable.block();
                zBlock = true;
            } else {
                zBlock = conditionVariable.block(j8);
            }
        } catch (Throwable unused) {
        }
        if (zBlock) {
            return;
        }
        wg.a.g(aVar, "biz", "LogAppFetchConfigTimeout", "" + i15);
    }

    public final void d(JSONObject jSONObject) {
        this.f3245a = jSONObject.optInt("timeout", 10000);
        this.f3246b = jSONObject.optBoolean("h5_port_degrade", false);
        this.f3247c = jSONObject.optString("tbreturl", "https://h5.m.taobao.com/mlapp/olist.html").trim();
        this.f3248d = jSONObject.optInt("configQueryInterval", 10);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("launchAppSwitch");
        ArrayList arrayList = null;
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList2 = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i14 = 0; i14 < length; i14++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i14);
                b bVar = jSONObjectOptJSONObject == null ? null : new b(jSONObjectOptJSONObject.optString("pn"), jSONObjectOptJSONObject.optInt("v", 0), jSONObjectOptJSONObject.optString("pk"));
                if (bVar != null) {
                    arrayList2.add(bVar);
                }
            }
            arrayList = arrayList2;
        }
        this.f3268x = arrayList;
        this.f3249e = jSONObject.optBoolean("intercept_batch", true);
        this.f3251g = jSONObject.optBoolean("deg_log_mcgw", false);
        this.f3252h = jSONObject.optBoolean("deg_start_srv_first", true);
        this.f3253i = jSONObject.optBoolean("prev_jump_dual", true);
        this.f3254j = jSONObject.optBoolean("bind_use_imp", false);
        this.f3255k = jSONObject.optBoolean("retry_bnd_once", false);
        this.f3256l = jSONObject.optBoolean("skip_trans", false);
        this.f3257m = jSONObject.optBoolean("start_trans", false);
        this.f3258n = jSONObject.optBoolean("up_before_pay", true);
        this.f3259o = jSONObject.optString("lck_k", "");
        this.f3263s = jSONObject.optBoolean("use_sc_lck_a", false);
        this.f3265u = jSONObject.optBoolean("notifyFailApp", false);
        this.f3260p = jSONObject.optString("bind_with_startActivity", "");
        this.f3264t = jSONObject.optInt("cfg_max_time", 1000);
        this.f3267w = jSONObject.optBoolean("get_oa_id", true);
        this.f3261q = jSONObject.optBoolean("enableStartActivityFallback", false);
        this.f3262r = jSONObject.optBoolean("enableBindExFallback", false);
        this.f3250f = jSONObject.optBoolean("startactivity_in_ui_thread", false);
        this.f3266v = jSONObject.optJSONObject("ap_args");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [int] */
    /* JADX WARN: Type inference failed for: r11v9 */
    public final boolean e(int i14, Context context) {
        boolean z14;
        boolean z15 = false;
        int i15 = -1;
        if (this.f3269y == -1) {
            String strA = lh.b.b().a();
            if (TextUtils.isEmpty(strA)) {
                z14 = false;
            } else {
                String strReplaceAll = strA.replaceAll("=", "");
                if (strReplaceAll.length() >= 5) {
                    strReplaceAll = strReplaceAll.substring(0, 5);
                }
                int iPow = (int) Math.pow(2.0d, 6);
                int length = strReplaceAll.length();
                long j8 = 0;
                int i16 = 0;
                int i17 = length;
                while (i16 < length) {
                    int i18 = i16 + 1;
                    String strSubstring = strReplaceAll.substring(i16, i18);
                    ?? r14 = z15;
                    while (true) {
                        if (r14 >= 64) {
                            r14 = z15;
                            break;
                        }
                        if (strSubstring.equals(String.valueOf(n.f126133b[r14 == true ? 1 : 0]))) {
                            break;
                        }
                        r14 = (r14 == true ? 1 : 0) + 1;
                    }
                    j8 += ((long) Integer.parseInt(String.valueOf((int) r14))) * ((long) Math.pow(iPow, i17 - 1));
                    i17--;
                    i16 = i18;
                    z15 = z15;
                    i15 = i15;
                }
                z14 = z15;
                i15 = (int) (j8 % AbstractComponentTracker.LINGERING_TIMEOUT);
                if (i15 < 0) {
                    i15 *= -1;
                }
            }
            this.f3269y = i15;
            k.c("utdid_factor", String.valueOf(i15), context, null);
        } else {
            z14 = false;
        }
        if (this.f3269y < i14) {
            return true;
        }
        return z14;
    }

    public final int f() {
        int i14 = this.f3245a;
        if (i14 < 1000 || i14 > 20000) {
            return 10000;
        }
        return i14;
    }
}
