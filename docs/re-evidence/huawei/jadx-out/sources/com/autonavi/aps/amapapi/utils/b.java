package com.autonavi.aps.amapapi.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import androidx.media3.datasource.cache.CacheDataSink;
import com.amap.api.col.p0003sl.im;
import com.amap.api.col.p0003sl.ix;
import com.amap.api.col.p0003sl.iy;
import com.amap.api.col.p0003sl.jv;
import com.amap.api.col.p0003sl.lh;
import com.amap.api.col.p0003sl.lj;
import com.huawei.health.suggestion.model.FitRunPlayAudio;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    private static volatile boolean i = false;
    private static boolean j = true;
    private static int k = 1000;
    private static int l = 200;
    private static boolean m = false;
    private static int n = 20;
    private static int o = 0;
    private static volatile int p = 0;
    private static boolean q = true;
    private static boolean r = false;
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
    static long f3994a = 3600000;
    private static boolean E = false;
    private static boolean F = true;
    private static boolean G = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile long f3995b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static boolean f3996c = false;
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
    public static int f = CacheDataSink.DEFAULT_BUFFER_SIZE;
    public static int g = 10800000;
    public static boolean h = false;

    public static void a(final Context context) {
        if (i) {
            return;
        }
        i = true;
        im.a(context, c.c(), c.d(), new im.a() { // from class: com.autonavi.aps.amapapi.utils.b.1
            @Override // com.amap.api.col.3sl.im.a
            public final void a(im.b bVar) {
                b.a(context, bVar);
            }
        });
    }

    public static boolean a() {
        return j;
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

    private static void a(im.b bVar, SharedPreferences.Editor editor) {
        try {
            im.b.a aVar = bVar.g;
            if (aVar != null) {
                boolean z2 = aVar.f2777a;
                j = z2;
                j.a(editor, TrackConstants$Events.EXCEPTION, z2);
                JSONObject jSONObject = aVar.f2779c;
                if (jSONObject != null) {
                    k = jSONObject.optInt("fn", k);
                    int iOptInt = jSONObject.optInt("mpn", l);
                    l = iOptInt;
                    if (iOptInt > 500) {
                        l = 500;
                    }
                    if (l < 30) {
                        l = 30;
                    }
                    m = im.a(jSONObject.optString("igu"), false);
                    n = jSONObject.optInt("ms", n);
                    p = jSONObject.optInt("rot", 0);
                    o = jSONObject.optInt("pms", 0);
                }
                lh.a(k, m, n, o);
                lj.a(m, o);
                j.a(editor, "fn", k);
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

    private static void a(JSONObject jSONObject, SharedPreferences.Editor editor) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("11G");
            if (jSONObjectOptJSONObject != null) {
                boolean zA = im.a(jSONObjectOptJSONObject.optString("able"), true);
                x = zA;
                if (zA) {
                    y = jSONObjectOptJSONObject.optInt("c", 300) * 1000;
                }
                z = im.a(jSONObjectOptJSONObject.optString("fa"), false);
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

    static boolean a(Context context, im.b bVar) {
        SharedPreferences.Editor editorA;
        try {
            editorA = j.a(context, "pref");
            try {
                a(bVar, editorA);
                c(context);
                JSONObject jSONObject = bVar.f;
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

    private static void b(JSONObject jSONObject, SharedPreferences.Editor editor) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("197");
            if (jSONObject2 != null) {
                boolean zA = im.a(jSONObject2.optString("able"), false);
                j.a(editor, "197a", zA);
                if (zA) {
                    j.a(editor, "197dv", jSONObject2.optString("sv", ""));
                    j.a(editor, "197tv", jSONObject2.optString("tv", ""));
                } else {
                    j.a(editor, "197dv", "");
                    j.a(editor, "197tv", "");
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static void c(JSONObject jSONObject, SharedPreferences.Editor editor) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("1A6");
            if (jSONObject2 != null) {
                boolean zA = im.a(jSONObject2.optString("ic"), false);
                j.a(editor, "1A6", zA);
                h = zA;
            }
        } catch (Throwable unused) {
        }
    }

    public static void b(Context context) {
        if (w) {
            return;
        }
        w = true;
        try {
            j = j.a(context, "pref", TrackConstants$Events.EXCEPTION, j);
            c(context);
        } catch (Throwable th) {
            c.a(th, "AuthUtil", "loadLastAbleState p1");
        }
        try {
            k = j.a(context, "pref", "fn", k);
            l = j.a(context, "pref", "mpn", l);
            m = j.a(context, "pref", "igu", m);
            n = j.a(context, "pref", "ms", n);
            p = j.a(context, "pref", "rot", 0);
            int iA = j.a(context, "pref", "pms", 0);
            o = iA;
            lh.a(k, m, n, iA);
            lj.a(m, o);
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
            f3996c = j.a(context, "pref", "fr", f3996c);
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
            f3995b = k.b();
            f3994a = j.a(context, "pref", "13S_at", f3994a);
            F = j.a(context, "pref", "13S_nla", F);
            B = j.a(context, "pref", "13J_able", B);
            C = j.a(context, "pref", "13J_c", C);
            D = j.a(context, "pref", "13J_t", D);
        } catch (Throwable th10) {
            c.a(th10, "AuthUtil", "loadLastAbleState p10");
        }
        im.b(context);
        try {
            String strA = j.a(context, "pref", "13S_mlpl", (String) null);
            if (!TextUtils.isEmpty(strA)) {
                G = a(context, new JSONArray(iy.c(strA)));
            }
        } catch (Throwable th11) {
            c.a(th11, "AuthUtil", "loadLastAbleState p11");
        }
        try {
            boolean zA = j.a(context, "pref", "197a", false);
            String strA2 = j.a(context, "pref", "197dv", "");
            String strA3 = j.a(context, "pref", "197tv", "");
            if (zA && c.f3998a.equals(strA2)) {
                for (String str : c.f3999b) {
                    if (str.equals(strA3)) {
                        c.f3998a = strA3;
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

    public static long d() {
        return y;
    }

    public static boolean e() {
        return x;
    }

    public static boolean a(long j2) {
        if (!x) {
            return false;
        }
        long jA = k.a();
        long j3 = y;
        return j3 < 0 || jA - j2 < j3;
    }

    public static boolean f() {
        return z;
    }

    public static double g() {
        return A;
    }

    public static void c(Context context) {
        try {
            ix ixVarC = c.c();
            ixVarC.a(j);
            jv.a(context, ixVarC);
        } catch (Throwable unused) {
        }
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

    private static void d(JSONObject jSONObject, SharedPreferences.Editor editor) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("13J");
            if (jSONObjectOptJSONObject != null) {
                boolean zA = im.a(jSONObjectOptJSONObject.optString("able"), true);
                B = zA;
                if (zA) {
                    C = jSONObjectOptJSONObject.optInt("c", C);
                    D = jSONObjectOptJSONObject.optInt(FitRunPlayAudio.PLAY_TYPE_T, D);
                }
                j.a(editor, "13J_able", B);
                j.a(editor, "13J_c", C);
                j.a(editor, "13J_t", D);
            }
        } catch (Throwable th) {
            c.a(th, "AuthUtil", "loadConfigDataGpsGeoAble");
        }
    }

    public static boolean k() {
        return F;
    }

    public static boolean l() {
        return G;
    }

    private static void a(Context context, JSONObject jSONObject, SharedPreferences.Editor editor) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("13S");
            if (jSONObjectOptJSONObject != null) {
                try {
                    long jOptInt = jSONObjectOptJSONObject.optInt("at", 123) * 60000;
                    f3994a = jOptInt;
                    j.a(editor, "13S_at", jOptInt);
                } catch (Throwable th) {
                    c.a(th, "AuthUtil", "requestSdkAuthInterval");
                }
                e(jSONObjectOptJSONObject, editor);
                try {
                    boolean zA = im.a(jSONObjectOptJSONObject.optString("nla"), true);
                    F = zA;
                    j.a(editor, "13S_nla", zA);
                } catch (Throwable unused) {
                }
                try {
                    boolean zA2 = im.a(jSONObjectOptJSONObject.optString("asw"), true);
                    H = zA2;
                    j.a(editor, "asw", zA2);
                } catch (Throwable unused2) {
                }
                try {
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("mlpl");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0 && context != null) {
                        j.a(editor, "13S_mlpl", iy.b(jSONArrayOptJSONArray.toString()));
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

    public static boolean m() {
        return f3996c;
    }

    private static void e(JSONObject jSONObject, SharedPreferences.Editor editor) {
        if (jSONObject == null) {
            return;
        }
        try {
            boolean zA = im.a(jSONObject.optString("re"), false);
            f3996c = zA;
            j.a(editor, "fr", zA);
        } catch (Throwable th) {
            c.a(th, "AuthUtil", "checkReLocationAble");
        }
    }

    public static boolean n() {
        return H;
    }

    public static long o() {
        return I;
    }

    private static void f(JSONObject jSONObject, SharedPreferences.Editor editor) {
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("15O");
            if (jSONObjectOptJSONObject != null) {
                if (im.a(jSONObjectOptJSONObject.optString("able"), false) && ((jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("fl")) == null || jSONArrayOptJSONArray.length() <= 0 || jSONArrayOptJSONArray.toString().contains(Build.MANUFACTURER))) {
                    I = jSONObjectOptJSONObject.optInt("iv", 30) * 1000;
                } else {
                    I = -1L;
                }
                j.a(editor, "awsi", I);
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean p() {
        return N;
    }

    public static boolean q() {
        return L;
    }

    public static String r() {
        return iy.c(O);
    }

    private static void g(JSONObject jSONObject, SharedPreferences.Editor editor) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("17Y");
            if (jSONObject2 != null) {
                boolean zA = im.a(jSONObject2.optString("able"), false);
                d = zA;
                j.a(editor, "17ya", zA);
                boolean zA2 = im.a(jSONObject2.optString("mup"), false);
                e = zA2;
                j.a(editor, "17ym", zA2);
                int iOptInt = jSONObject2.optInt("max", 20);
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
                boolean zA = im.a(jSONObjectOptJSONObject.optString("able"), true);
                int iOptInt = jSONObjectOptJSONObject.optInt("yn", K);
                P = jSONObjectOptJSONObject.optLong("sysTime", P);
                j.a(editor, "15ua", zA);
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
                boolean zA = im.a(jSONObjectOptJSONObject.optString("able"), false);
                L = zA;
                j.a(editor, "ok9", zA);
                if (zA) {
                    String strOptString = jSONObjectOptJSONObject.optString("auth");
                    String strOptString2 = jSONObjectOptJSONObject.optString("ht");
                    O = strOptString2;
                    j.a(editor, "ok11", strOptString2);
                    im.a(strOptString, false);
                    N = im.a(jSONObjectOptJSONObject.optString("nr"), false);
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

    public static boolean s() {
        return J && K > 0;
    }

    public static int t() {
        return K;
    }

    public static long u() {
        return P;
    }
}
