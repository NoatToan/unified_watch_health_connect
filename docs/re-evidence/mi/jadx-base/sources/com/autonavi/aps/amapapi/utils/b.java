package com.autonavi.aps.amapapi.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.x0;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment;
import com.xiaomi.onetrack.b.m;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnDeviceUtils;
import defpackage.e6t;
import defpackage.g6t;
import defpackage.m2t;
import defpackage.o0t;
import defpackage.p0t;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    private static volatile boolean i = false;
    private static boolean j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f6902k = 1000;
    private static int l = 200;
    private static boolean m = false;
    private static int n = 20;
    private static int o = 0;
    private static volatile int p = 0;
    private static boolean q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static boolean f6903r = false;
    private static int s = -1;
    private static long t;
    private static ArrayList<String> u = new ArrayList<>();
    private static ArrayList<String> v = new ArrayList<>();
    private static volatile boolean w = false;
    private static boolean x = true;
    private static long y = 300000;
    private static boolean z = false;
    private static double A = 0.618d;
    private static boolean B = true;
    private static int C = 80;
    private static int D = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static long f6900a = 3600000;
    private static boolean E = false;
    private static boolean F = true;
    private static boolean G = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile long f6901b = 0;
    static boolean c = false;
    private static boolean H = true;
    private static long I = -1;
    private static boolean J = true;
    private static int K = 1;
    private static boolean L = false;
    private static int M = 5;
    private static boolean N = false;
    private static String O = "CMjAzLjEwNy4xLjEvMTU0MDgxL2Q";
    private static long P = 0;
    public static boolean d = false;
    public static boolean e = false;
    public static int f = 20480;
    public static int g = 10800000;
    public static boolean h = false;

    public static void a(final Context context) {
        if (i) {
            return;
        }
        i = true;
        x0.i(context, c.c(), c.d(), new x0.b() { // from class: com.autonavi.aps.amapapi.utils.b.1
            @Override // com.amap.api.col.3sl.x0.b
            public final void a(x0.c cVar) {
                b.a(context, cVar);
            }
        });
    }

    public static int b() {
        return l;
    }

    public static int c() {
        if (p < 0) {
            p = 0;
        }
        return p;
    }

    public static long d() {
        return y;
    }

    public static boolean e() {
        return x;
    }

    public static boolean f() {
        return z;
    }

    public static double g() {
        return A;
    }

    public static boolean h() {
        return B;
    }

    public static int i() {
        return C;
    }

    public static int j() {
        return D;
    }

    public static boolean k() {
        return F;
    }

    public static boolean l() {
        return G;
    }

    public static boolean m() {
        return c;
    }

    public static boolean n() {
        return H;
    }

    public static long o() {
        return I;
    }

    public static boolean p() {
        return N;
    }

    public static boolean q() {
        return L;
    }

    public static String r() {
        return p0t.t(O);
    }

    public static boolean s() {
        return J && K > 0;
    }

    public static int t() {
        return K;
    }

    public static long u() {
        return P;
    }

    private static void b(JSONObject jSONObject, SharedPreferences.Editor editor) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("197");
            if (jSONObject2 != null) {
                boolean zX = x0.x(jSONObject2.optString("able"), false);
                j.a(editor, "197a", zX);
                if (zX) {
                    j.a(editor, "197dv", jSONObject2.optString(m.e, ""));
                    j.a(editor, "197tv", jSONObject2.optString(RnDeviceUtils.CATEGORY_TV, ""));
                } else {
                    j.a(editor, "197dv", "");
                    j.a(editor, "197tv", "");
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static void d(JSONObject jSONObject, SharedPreferences.Editor editor) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("13J");
            if (jSONObjectOptJSONObject != null) {
                boolean zX = x0.x(jSONObjectOptJSONObject.optString("able"), true);
                B = zX;
                if (zX) {
                    C = jSONObjectOptJSONObject.optInt(PluginDeviceInfo.FICONON, C);
                    D = jSONObjectOptJSONObject.optInt(DeviceTagInterface.CUSTOM_TAG_TYPE, D);
                }
                j.a(editor, "13J_able", B);
                j.a(editor, "13J_c", C);
                j.a(editor, "13J_t", D);
            }
        } catch (Throwable th) {
            c.a(th, "AuthUtil", "loadConfigDataGpsGeoAble");
        }
    }

    private static void e(JSONObject jSONObject, SharedPreferences.Editor editor) {
        if (jSONObject == null) {
            return;
        }
        try {
            boolean zX = x0.x(jSONObject.optString(m.h), false);
            c = zX;
            j.a(editor, "fr", zX);
        } catch (Throwable th) {
            c.a(th, "AuthUtil", "checkReLocationAble");
        }
    }

    private static void f(JSONObject jSONObject, SharedPreferences.Editor editor) {
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("15O");
            if (jSONObjectOptJSONObject != null) {
                if (x0.x(jSONObjectOptJSONObject.optString("able"), false) && ((jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("fl")) == null || jSONArrayOptJSONArray.length() <= 0 || jSONArrayOptJSONArray.toString().contains(Build.MANUFACTURER))) {
                    I = jSONObjectOptJSONObject.optInt("iv", 30) * 1000;
                } else {
                    I = -1L;
                }
                j.a(editor, "awsi", I);
            }
        } catch (Throwable unused) {
        }
    }

    private static void g(JSONObject jSONObject, SharedPreferences.Editor editor) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("17Y");
            if (jSONObject2 != null) {
                boolean zX = x0.x(jSONObject2.optString("able"), false);
                d = zX;
                j.a(editor, "17ya", zX);
                boolean zX2 = x0.x(jSONObject2.optString("mup"), false);
                e = zX2;
                j.a(editor, "17ym", zX2);
                int iOptInt = jSONObject2.optInt(VibrateModeSetFragment.MAX, 20);
                if (iOptInt > 0) {
                    j.a(editor, "17yx", iOptInt);
                    f = iOptInt * 1024;
                }
                int iOptInt2 = jSONObject2.optInt("inv", 3);
                if (iOptInt2 > 0) {
                    j.a(editor, "17yi", iOptInt2);
                    g = iOptInt2 * 3600000;
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static void h(JSONObject jSONObject, SharedPreferences.Editor editor) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("15U");
            if (jSONObjectOptJSONObject != null) {
                boolean zX = x0.x(jSONObjectOptJSONObject.optString("able"), true);
                int iOptInt = jSONObjectOptJSONObject.optInt("yn", K);
                P = jSONObjectOptJSONObject.optLong("sysTime", P);
                j.a(editor, "15ua", zX);
                j.a(editor, "15un", iOptInt);
                j.a(editor, "15ust", P);
            }
        } catch (Throwable unused) {
        }
    }

    private static void i(JSONObject jSONObject, SharedPreferences.Editor editor) {
        int i2;
        if (jSONObject == null) {
            return;
        }
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("17J");
            if (jSONObjectOptJSONObject != null) {
                boolean zX = x0.x(jSONObjectOptJSONObject.optString("able"), false);
                L = zX;
                j.a(editor, "ok9", zX);
                if (zX) {
                    String strOptString = jSONObjectOptJSONObject.optString("auth");
                    String strOptString2 = jSONObjectOptJSONObject.optString("ht");
                    O = strOptString2;
                    j.a(editor, "ok11", strOptString2);
                    x0.x(strOptString, false);
                    N = x0.x(jSONObjectOptJSONObject.optString("nr"), false);
                    String strOptString3 = jSONObjectOptJSONObject.optString("tm");
                    if (TextUtils.isEmpty(strOptString3) || (i2 = Integer.parseInt(strOptString3)) <= 0 || i2 >= 20) {
                        return;
                    }
                    M = i2;
                    j.a(editor, "ok10", i2);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean a() {
        return j;
    }

    private static void c(JSONObject jSONObject, SharedPreferences.Editor editor) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("1A6");
            if (jSONObject2 != null) {
                boolean zX = x0.x(jSONObject2.optString("ic"), false);
                j.a(editor, "1A6", zX);
                h = zX;
            }
        } catch (Throwable unused) {
        }
    }

    private static void a(x0.c cVar, SharedPreferences.Editor editor) {
        try {
            x0.c.a aVar = cVar.g;
            if (aVar != null) {
                boolean z2 = aVar.f6309a;
                j = z2;
                j.a(editor, "exception", z2);
                JSONObject jSONObject = aVar.c;
                if (jSONObject != null) {
                    f6902k = jSONObject.optInt("fn", f6902k);
                    int iOptInt = jSONObject.optInt("mpn", l);
                    l = iOptInt;
                    if (iOptInt > 500) {
                        l = 500;
                    }
                    if (l < 30) {
                        l = 30;
                    }
                    m = x0.x(jSONObject.optString("igu"), false);
                    n = jSONObject.optInt("ms", n);
                    p = jSONObject.optInt("rot", 0);
                    o = jSONObject.optInt("pms", 0);
                }
                e6t.c(f6902k, m, n, o);
                g6t.f(m, o);
                j.a(editor, "fn", f6902k);
                j.a(editor, "mpn", l);
                j.a(editor, "igu", m);
                j.a(editor, "ms", n);
                j.a(editor, "rot", p);
                j.a(editor, "pms", o);
            }
        } catch (Throwable th) {
            c.a(th, "AuthUtil", "loadConfigDataUploadException");
        }
    }

    public static void c(Context context) {
        try {
            o0t o0tVarC = c.c();
            o0tVarC.c(j);
            m2t.g(context, o0tVarC);
        } catch (Throwable unused) {
        }
    }

    public static void b(Context context) {
        if (w) {
            return;
        }
        w = true;
        try {
            j = j.a(context, "pref", "exception", j);
            c(context);
        } catch (Throwable th) {
            c.a(th, "AuthUtil", "loadLastAbleState p1");
        }
        try {
            f6902k = j.a(context, "pref", "fn", f6902k);
            l = j.a(context, "pref", "mpn", l);
            m = j.a(context, "pref", "igu", m);
            n = j.a(context, "pref", "ms", n);
            p = j.a(context, "pref", "rot", 0);
            int iA = j.a(context, "pref", "pms", 0);
            o = iA;
            e6t.c(f6902k, m, n, iA);
            g6t.f(m, o);
        } catch (Throwable th2) {
            c.a(th2, "AuthUtil", "loadLastAbleState p2");
        }
        try {
            x = j.a(context, "pref", "ca", x);
            y = j.a(context, "pref", "ct", y);
            z = j.a(context, "pref", "11G_fa", z);
            double dDoubleValue = Double.valueOf(j.a(context, "pref", "11G_ms", String.valueOf(A))).doubleValue();
            A = dDoubleValue;
            A = Math.max(0.2d, dDoubleValue);
        } catch (Throwable th3) {
            c.a(th3, "AuthUtil", "loadLastAbleState p3");
        }
        try {
            c = j.a(context, "pref", "fr", c);
        } catch (Throwable th4) {
            c.a(th4, "AuthUtil", "loadLastAbleState p4");
        }
        try {
            H = j.a(context, "pref", "asw", H);
        } catch (Throwable th5) {
            c.a(th5, "AuthUtil", "loadLastAbleState p5");
        }
        try {
            I = j.a(context, "pref", "awsi", I);
        } catch (Throwable th6) {
            c.a(th6, "AuthUtil", "loadLastAbleState p6");
        }
        try {
            J = j.a(context, "pref", "15ua", J);
            K = j.a(context, "pref", "15un", K);
            P = j.a(context, "pref", "15ust", P);
        } catch (Throwable th7) {
            c.a(th7, "AuthUtil", "loadLastAbleState p7");
        }
        try {
            L = j.a(context, "pref", "ok9", L);
            M = j.a(context, "pref", "ok10", M);
            O = j.a(context, "pref", "ok11", O);
        } catch (Throwable th8) {
            c.a(th8, "AuthUtil", "loadLastAbleState p8");
        }
        try {
            d = j.a(context, "pref", "17ya", false);
            e = j.a(context, "pref", "17ym", false);
            g = j.a(context, "pref", "17yi", 2) * 3600000;
            f = j.a(context, "pref", "17yx", 100) * 1024;
        } catch (Throwable th9) {
            c.a(th9, "AuthUtil", "loadLastAbleState p9");
        }
        try {
            f6901b = k.b();
            f6900a = j.a(context, "pref", "13S_at", f6900a);
            F = j.a(context, "pref", "13S_nla", F);
            B = j.a(context, "pref", "13J_able", B);
            C = j.a(context, "pref", "13J_c", C);
            D = j.a(context, "pref", "13J_t", D);
        } catch (Throwable th10) {
            c.a(th10, "AuthUtil", "loadLastAbleState p10");
        }
        x0.D(context);
        try {
            String strA = j.a(context, "pref", "13S_mlpl", (String) null);
            if (!TextUtils.isEmpty(strA)) {
                G = a(context, new JSONArray(p0t.t(strA)));
            }
        } catch (Throwable th11) {
            c.a(th11, "AuthUtil", "loadLastAbleState p11");
        }
        try {
            boolean zA = j.a(context, "pref", "197a", false);
            String strA2 = j.a(context, "pref", "197dv", "");
            String strA3 = j.a(context, "pref", "197tv", "");
            if (zA && c.f6905a.equals(strA2)) {
                for (String str : c.f6906b) {
                    if (str.equals(strA3)) {
                        c.f6905a = strA3;
                    }
                }
            }
        } catch (Throwable th12) {
            c.a(th12, "AuthUtil", "loadLastAbleState p12");
        }
        try {
            h = j.a(context, "pref", "1A6", h);
        } catch (Throwable th13) {
            c.a(th13, "AuthUtil", "loadSdkEnableConfig p13");
        }
    }

    private static void a(JSONObject jSONObject, SharedPreferences.Editor editor) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("11G");
            if (jSONObjectOptJSONObject != null) {
                boolean zX = x0.x(jSONObjectOptJSONObject.optString("able"), true);
                x = zX;
                if (zX) {
                    y = jSONObjectOptJSONObject.optInt(PluginDeviceInfo.FICONON, 300) * 1000;
                }
                z = x0.x(jSONObjectOptJSONObject.optString("fa"), false);
                A = Math.min(1.0d, Math.max(0.2d, jSONObjectOptJSONObject.optDouble("ms", 0.618d)));
                j.a(editor, "ca", x);
                j.a(editor, "ct", y);
                j.a(editor, "11G_fa", z);
                j.a(editor, "11G_ms", String.valueOf(A));
            }
        } catch (Throwable th) {
            c.a(th, "AuthUtil", "loadConfigDataCacheAble");
        }
    }

    public static boolean a(Context context, x0.c cVar) {
        SharedPreferences.Editor editorA;
        try {
            editorA = j.a(context, "pref");
            try {
                a(cVar, editorA);
                c(context);
                JSONObject jSONObject = cVar.f;
                if (jSONObject == null) {
                    if (editorA != null) {
                        try {
                            j.a(editorA);
                        } catch (Throwable unused) {
                        }
                    }
                    return true;
                }
                a(context, jSONObject, editorA);
                a(jSONObject, editorA);
                d(jSONObject, editorA);
                f(jSONObject, editorA);
                h(jSONObject, editorA);
                g(jSONObject, editorA);
                i(jSONObject, editorA);
                b(jSONObject, editorA);
                c(jSONObject, editorA);
                if (editorA != null) {
                    try {
                        j.a(editorA);
                    } catch (Throwable unused2) {
                    }
                }
                return true;
            } catch (Throwable unused3) {
                if (editorA == null) {
                    return false;
                }
                try {
                    j.a(editorA);
                    return false;
                } catch (Throwable unused4) {
                    return false;
                }
            }
        } catch (Throwable unused5) {
            editorA = null;
        }
    }

    public static boolean a(long j2) {
        if (!x) {
            return false;
        }
        long jA = k.a() - j2;
        long j3 = y;
        return j3 < 0 || jA < j3;
    }

    private static void a(Context context, JSONObject jSONObject, SharedPreferences.Editor editor) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("13S");
            if (jSONObjectOptJSONObject != null) {
                try {
                    long jOptInt = jSONObjectOptJSONObject.optInt("at", 123) * 60000;
                    f6900a = jOptInt;
                    j.a(editor, "13S_at", jOptInt);
                } catch (Throwable th) {
                    c.a(th, "AuthUtil", "requestSdkAuthInterval");
                }
                e(jSONObjectOptJSONObject, editor);
                try {
                    boolean zX = x0.x(jSONObjectOptJSONObject.optString("nla"), true);
                    F = zX;
                    j.a(editor, "13S_nla", zX);
                } catch (Throwable unused) {
                }
                try {
                    boolean zX2 = x0.x(jSONObjectOptJSONObject.optString("asw"), true);
                    H = zX2;
                    j.a(editor, "asw", zX2);
                } catch (Throwable unused2) {
                }
                try {
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("mlpl");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0 && context != null) {
                        j.a(editor, "13S_mlpl", p0t.p(jSONArrayOptJSONArray.toString()));
                        G = a(context, jSONArrayOptJSONArray);
                    } else {
                        G = false;
                        j.a(editor, "13S_mlpl");
                    }
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable th2) {
            c.a(th2, "AuthUtil", "loadConfigAbleStatus");
        }
    }

    private static boolean a(Context context, JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0 && context != null) {
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        if (k.b(context, jSONArray.getString(i2))) {
                            return true;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
