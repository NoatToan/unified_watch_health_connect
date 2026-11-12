package com.loc;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.appevents.UserDataStore;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.huami.passport.Configs;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class eh {
    private static int A = 0;
    private static volatile int B = 0;
    private static boolean C = true;
    private static boolean D = true;
    private static int E = -1;
    private static long F = 0;
    public static volatile long a = 0;
    public static volatile String b = "apilocate.amap.com";
    public static volatile String c = "dualstack.apilocate.amap.com";
    public static volatile String d = "";
    private static boolean m = false;
    private static long n = 0;
    private static long o = 0;
    private static long p = 5000;
    private static boolean q = false;
    private static int r = 0;
    private static boolean s = false;
    private static int t = 0;
    private static boolean u = false;
    private static boolean v = true;
    private static int w = 1000;
    private static int x = 200;
    private static boolean y = false;
    private static int z = 20;
    private static ArrayList<String> G = new ArrayList<>();
    private static ArrayList<String> H = new ArrayList<>();
    private static volatile boolean I = false;
    private static boolean J = false;
    private static int K = 3000;
    private static int L = 3000;
    private static boolean M = true;
    private static long N = 300000;
    private static boolean O = true;
    private static int P = 80;
    public static long e = 3600000;
    private static boolean Q = false;
    private static boolean R = true;
    private static boolean S = false;
    public static volatile long f = 0;
    private static volatile boolean T = false;
    public static boolean g = false;
    public static boolean h = true;
    private static boolean U = true;
    private static long V = -1;
    private static boolean W = true;
    private static int X = 1;
    private static boolean Y = true;
    private static int Z = 5;
    private static boolean aa = false;
    private static String ab = "CMjAzLjEwNy4xLjEvMTU0MDgxL2Q";
    private static long ac = 0;
    public static boolean i = false;
    public static boolean j = false;
    public static int k = CacheDataSink.DEFAULT_BUFFER_SIZE;
    public static int l = 10800000;

    public static class a {
        public boolean a = false;
        public String b = "0";
        public boolean c = false;
        public int d = 5;
    }

    public static int A() {
        return X;
    }

    public static long B() {
        return ac;
    }

    private static boolean C() {
        try {
            if (f <= 0) {
                f = eo.b();
                return false;
            }
            if (Math.abs(eo.b() - f) >= e) {
                g = true;
                return true;
            }
            return false;
        } catch (Throwable th) {
            ei.a(th, "aut", "isNeedRequest");
        }
    }

    private static a a(JSONObject jSONObject, String str) {
        a aVar = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            if (jSONObject2 == null) {
                return null;
            }
            a aVar2 = new a();
            try {
                aVar2.a = l.a(jSONObject2.optString("b"), false);
                aVar2.b = jSONObject2.optString("t");
                aVar2.c = l.a(jSONObject2.optString(UserDataStore.STATE), false);
                aVar2.d = jSONObject2.optInt("i", 0);
                return aVar2;
            } catch (Throwable th) {
                th = th;
                aVar = aVar2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        ei.a(th, "AuthUtil", "getLocateObj");
        return aVar;
    }

    public static boolean a() {
        return q;
    }

    public static boolean a(long j2) {
        long jB = eo.b();
        return m && jB - o <= n && jB - j2 >= p;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003a A[DONT_GENERATE, EXC_TOP_SPLITTER, PHI: r1 r2
      0x003a: PHI (r1v2 boolean) = (r1v1 boolean), (r1v4 boolean) binds: [B:12:0x0046, B:7:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r2v2 android.content.SharedPreferences$Editor) = (r2v1 android.content.SharedPreferences$Editor), (r2v3 android.content.SharedPreferences$Editor) binds: [B:12:0x0046, B:7:0x0038] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static boolean a(Context context) {
        C = true;
        boolean zA = false;
        SharedPreferences.Editor editorA = null;
        try {
            T = true;
            l.a aVarA = l.a(context, ei.c(), ei.d(), b, c, d);
            if (aVarA != null) {
                editorA = en.a(context, "pref");
                a = aVarA.c;
                en.a(editorA, "clut", a);
                zA = a(context, aVarA);
            }
            f = eo.b();
            if (editorA != null) {
            }
        } catch (Throwable th) {
            try {
                ei.a(th, "AuthUtil", "getConfig");
            } finally {
                if (editorA != null) {
                    try {
                        en.a(editorA);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return zA;
    }

    public static boolean a(Context context, long j2) {
        SharedPreferences.Editor editorA;
        if (!J) {
            return false;
        }
        long jA = eo.a();
        if (jA - j2 < K) {
            return false;
        }
        if (L == -1) {
            return true;
        }
        if (eo.a(jA, en.a(context, "pref", "ngpsTime", 0L))) {
            int iA = en.a(context, "pref", "ngpsCount", 0);
            if (iA >= L) {
                return false;
            }
            editorA = en.a(context, "pref");
            en.a(editorA, "ngpsCount", iA + 1);
        } else {
            try {
                SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref", 0).edit();
                editorEdit.putLong("ngpsTime", jA);
                editorEdit.putInt("ngpsCount", 0);
                en.a(editorEdit);
            } catch (Throwable th) {
                ei.a(th, "AuthUtil", "resetPrefsNGPS");
            }
            editorA = en.a(context, "pref");
            en.a(editorA, "ngpsCount", 1);
        }
        en.a(editorA);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0202  */
    private static boolean a(Context context, l.a aVar) {
        SharedPreferences.Editor editorA;
        String str;
        String str2;
        int i2;
        JSONArray jSONArrayOptJSONArray;
        try {
            editorA = en.a(context, "pref");
            try {
                l.a.C0736a c0736a = aVar.e;
                if (c0736a != null) {
                    boolean z2 = c0736a.a;
                    v = z2;
                    en.a(editorA, Constants.EXCEPTION, z2);
                    JSONObject jSONObject = c0736a.c;
                    if (jSONObject != null) {
                        w = jSONObject.optInt(UserDataStore.FIRST_NAME, w);
                        int iOptInt = jSONObject.optInt("mpn", x);
                        x = iOptInt;
                        if (iOptInt > 500) {
                            x = 500;
                        }
                        if (x < 30) {
                            x = 30;
                        }
                        y = l.a(jSONObject.optString("igu"), y);
                        z = jSONObject.optInt("ms", z);
                        B = jSONObject.optInt("rot", 0);
                        A = jSONObject.optInt("pms", 0);
                    }
                    str = "c";
                    try {
                        az.a(w, y, z, A);
                        bb.a(y, A);
                        en.a(editorA, UserDataStore.FIRST_NAME, w);
                        en.a(editorA, "mpn", x);
                        en.a(editorA, "igu", y);
                        en.a(editorA, "ms", z);
                        en.a(editorA, "rot", B);
                        en.a(editorA, "pms", A);
                    } catch (Throwable th) {
                        th = th;
                        try {
                            ei.a(th, "AuthUtil", "loadConfigDataUploadException");
                        } catch (Throwable unused) {
                            if (editorA == null) {
                                return false;
                            }
                            try {
                                en.a(editorA);
                                return false;
                            } catch (Throwable unused2) {
                                return false;
                            }
                        }
                    }
                } else {
                    str = "c";
                }
            } catch (Throwable th2) {
                th = th2;
                str = "c";
            }
            JSONObject jSONObject2 = aVar.d;
            if (jSONObject2 == null) {
                if (editorA != null) {
                    try {
                        en.a(editorA);
                    } catch (Throwable unused3) {
                    }
                }
                return true;
            }
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("13S");
                if (jSONObjectOptJSONObject != null) {
                    try {
                        long jOptInt = jSONObjectOptJSONObject.optInt("at", 123) * 60 * 1000;
                        e = jOptInt;
                        en.a(editorA, "13S_at", jOptInt);
                    } catch (Throwable th3) {
                        ei.a(th3, "AuthUtil", "requestSdkAuthInterval");
                    }
                    try {
                        boolean zA = l.a(jSONObjectOptJSONObject.optString("re"), h);
                        h = zA;
                        en.a(editorA, "fr", zA);
                    } catch (Throwable th4) {
                        ei.a(th4, "AuthUtil", "checkReLocationAble");
                    }
                    try {
                        boolean zA2 = l.a(jSONObjectOptJSONObject.optString("nla"), R);
                        R = zA2;
                        en.a(editorA, "13S_nla", zA2);
                    } catch (Throwable unused4) {
                    }
                    try {
                        boolean zA3 = l.a(jSONObjectOptJSONObject.optString("asw"), U);
                        U = zA3;
                        en.a(editorA, "asw", zA3);
                    } catch (Throwable unused5) {
                    }
                    try {
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("mlpl");
                        if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0 && context != null) {
                            for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                                boolean zB = eo.b(context, jSONArrayOptJSONArray2.getString(i3));
                                S = zB;
                                if (zB) {
                                    break;
                                }
                            }
                        }
                    } catch (Throwable unused6) {
                    }
                }
            } catch (Throwable th5) {
                ei.a(th5, "AuthUtil", "loadConfigAbleStatus");
            }
            try {
                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("11H");
                if (jSONObjectOptJSONObject2 != null && l.a(jSONObjectOptJSONObject2.optString("able"), false)) {
                    a aVarA = a(jSONObjectOptJSONObject2, "fs");
                    if (aVarA != null) {
                        q = aVarA.c;
                        try {
                            r = Integer.parseInt(aVarA.b);
                        } catch (Throwable th6) {
                            ei.a(th6, "AuthUtil", "loadconfig part2");
                        }
                    }
                    a aVarA2 = a(jSONObjectOptJSONObject2, Configs.Params.US);
                    if (aVarA2 != null) {
                        s = aVarA2.c;
                        u = aVarA2.a;
                        try {
                            t = Integer.parseInt(aVarA2.b);
                        } catch (Throwable th7) {
                            ei.a(th7, "AuthUtil", "loadconfig part1");
                        }
                        if (t < 2) {
                            s = false;
                        }
                    }
                    a aVarA3 = a(jSONObjectOptJSONObject2, "rs");
                    if (aVarA3 != null) {
                        boolean z3 = aVarA3.c;
                        m = z3;
                        if (z3) {
                            o = eo.b();
                            p = aVarA3.d * 1000;
                        }
                        try {
                            n = Integer.parseInt(aVarA3.b) * 1000;
                        } catch (Throwable th8) {
                            ei.a(th8, "AuthUtil", "loadconfig part");
                        }
                    }
                }
            } catch (Throwable th9) {
                ei.a(th9, "AuthUtil", "loadConfigDataLocate");
            }
            try {
                JSONObject jSONObjectOptJSONObject3 = jSONObject2.optJSONObject("11F");
                if (jSONObjectOptJSONObject3 != null) {
                    boolean zA4 = l.a(jSONObjectOptJSONObject3.optString("able"), J);
                    J = zA4;
                    if (zA4) {
                        str2 = str;
                        try {
                            int iOptInt2 = jSONObjectOptJSONObject3.optInt(str2, 0);
                            if (iOptInt2 == 0) {
                                K = 3000;
                            } else {
                                K = iOptInt2 * 1000;
                            }
                            L = jSONObjectOptJSONObject3.getInt("t") / 2;
                        } catch (Throwable th10) {
                            th = th10;
                            ei.a(th, "AuthUtil", "loadConfigDataNgps");
                        }
                    } else {
                        str2 = str;
                    }
                } else {
                    str2 = str;
                }
            } catch (Throwable th11) {
                th = th11;
                str2 = str;
            }
            try {
                JSONObject jSONObjectOptJSONObject4 = jSONObject2.optJSONObject("11G");
                if (jSONObjectOptJSONObject4 != null) {
                    boolean zA5 = l.a(jSONObjectOptJSONObject4.optString("able"), M);
                    M = zA5;
                    if (zA5) {
                        N = jSONObjectOptJSONObject4.optInt(str2, 300) * 1000;
                    }
                    en.a(editorA, "ca", M);
                    en.a(editorA, UserDataStore.CITY, N);
                }
            } catch (Throwable th12) {
                ei.a(th12, "AuthUtil", "loadConfigDataCacheAble");
            }
            try {
                JSONObject jSONObjectOptJSONObject5 = jSONObject2.optJSONObject("13J");
                if (jSONObjectOptJSONObject5 != null) {
                    boolean zA6 = l.a(jSONObjectOptJSONObject5.optString("able"), O);
                    O = zA6;
                    if (zA6) {
                        P = jSONObjectOptJSONObject5.optInt(str2, P);
                    }
                    en.a(editorA, "13J_able", O);
                    en.a(editorA, "13J_c", P);
                }
            } catch (Throwable th13) {
                ei.a(th13, "AuthUtil", "loadConfigDataGpsGeoAble");
            }
            try {
                JSONObject jSONObjectOptJSONObject6 = jSONObject2.optJSONObject("15O");
                if (jSONObjectOptJSONObject6 != null) {
                    if (l.a(jSONObjectOptJSONObject6.optString("able"), false) && ((jSONArrayOptJSONArray = jSONObjectOptJSONObject6.optJSONArray("fl")) == null || jSONArrayOptJSONArray.length() <= 0 || jSONArrayOptJSONArray.toString().contains(Build.MANUFACTURER))) {
                        V = jSONObjectOptJSONObject6.optInt("iv", 30) * 1000;
                    } else {
                        V = -1L;
                    }
                    en.a(editorA, "awsi", V);
                }
            } catch (Throwable unused7) {
            }
            try {
                JSONObject jSONObjectOptJSONObject7 = jSONObject2.optJSONObject("15U");
                if (jSONObjectOptJSONObject7 != null) {
                    boolean zA7 = l.a(jSONObjectOptJSONObject7.optString("able"), W);
                    int iOptInt3 = jSONObjectOptJSONObject7.optInt("yn", X);
                    ac = jSONObjectOptJSONObject7.optLong("sysTime", ac);
                    en.a(editorA, "15ua", zA7);
                    en.a(editorA, "15un", iOptInt3);
                    en.a(editorA, "15ust", ac);
                }
            } catch (Throwable unused8) {
            }
            try {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("17Y");
                if (jSONObject3 != null) {
                    boolean zA8 = l.a(jSONObject3.optString("able"), i);
                    i = zA8;
                    en.a(editorA, "17ya", zA8);
                    boolean zA9 = l.a(jSONObject3.optString("mup"), j);
                    j = zA9;
                    en.a(editorA, "17ym", zA9);
                    int iOptInt4 = jSONObject3.optInt("max", 20);
                    if (iOptInt4 > 0) {
                        en.a(editorA, "17yx", iOptInt4);
                        k = iOptInt4 * 1024;
                    }
                    int iOptInt5 = jSONObject3.optInt("inv", 3);
                    if (iOptInt5 > 0) {
                        en.a(editorA, "17yi", iOptInt5);
                        l = iOptInt5 * 60 * 60 * 1000;
                    }
                }
            } catch (Throwable unused9) {
            }
            try {
                JSONObject jSONObjectOptJSONObject8 = jSONObject2.optJSONObject("17J");
                if (jSONObjectOptJSONObject8 != null) {
                    boolean zA10 = l.a(jSONObjectOptJSONObject8.optString("able"), false);
                    Y = zA10;
                    en.a(editorA, "ok9", zA10);
                    if (zA10) {
                        String strOptString = jSONObjectOptJSONObject8.optString("auth");
                        String strOptString2 = jSONObjectOptJSONObject8.optString("ht");
                        ab = strOptString2;
                        en.a(editorA, "ok11", strOptString2);
                        l.a(strOptString, false);
                        aa = l.a(jSONObjectOptJSONObject8.optString("nr"), false);
                        String strOptString3 = jSONObjectOptJSONObject8.optString("tm");
                        if (!TextUtils.isEmpty(strOptString3) && (i2 = Integer.parseInt(strOptString3)) > 0 && i2 < 20) {
                            Z = i2;
                            en.a(editorA, "ok10", i2);
                        }
                    }
                }
            } catch (Throwable unused10) {
            }
            if (editorA != null) {
                try {
                    en.a(editorA);
                } catch (Throwable unused11) {
                }
            }
            return true;
        } catch (Throwable unused12) {
            editorA = null;
        }
    }

    public static boolean a(Context context, boolean z2) {
        if (context == null) {
            return false;
        }
        try {
            if (C()) {
                return true;
            }
            return z2 && !T;
        } catch (Throwable th) {
            ei.a(th, "aut", "isConfigNeedUpdate");
            return false;
        }
    }

    public static int b() {
        return r;
    }

    public static void b(Context context) {
        if (I) {
            return;
        }
        I = true;
        try {
            v = en.a(context, "pref", Constants.EXCEPTION, v);
            c(context);
        } catch (Throwable th) {
            ei.a(th, "AuthUtil", "loadLastAbleState p1");
        }
        try {
            w = en.a(context, "pref", UserDataStore.FIRST_NAME, w);
            x = en.a(context, "pref", "mpn", x);
            y = en.a(context, "pref", "igu", y);
            z = en.a(context, "pref", "ms", z);
            B = en.a(context, "pref", "rot", 0);
            int iA = en.a(context, "pref", "pms", 0);
            A = iA;
            az.a(w, y, z, iA);
            bb.a(y, A);
        } catch (Throwable unused) {
        }
        try {
            M = en.a(context, "pref", "ca", M);
            N = en.a(context, "pref", UserDataStore.CITY, N);
        } catch (Throwable unused2) {
        }
        try {
            h = en.a(context, "pref", "fr", h);
        } catch (Throwable unused3) {
        }
        try {
            U = en.a(context, "pref", "asw", U);
        } catch (Throwable unused4) {
        }
        try {
            V = en.a(context, "pref", "awsi", V);
        } catch (Throwable unused5) {
        }
        try {
            W = en.a(context, "pref", "15ua", W);
            X = en.a(context, "pref", "15un", X);
            ac = en.a(context, "pref", "15ust", ac);
        } catch (Throwable unused6) {
        }
        try {
            Y = en.a(context, "pref", "ok9", Y);
            Z = en.a(context, "pref", "ok10", Z);
            ab = en.a(context, "pref", "ok11", ab);
        } catch (Throwable unused7) {
        }
        try {
            i = en.a(context, "pref", "17ya", false);
            j = en.a(context, "pref", "17ym", false);
            l = en.a(context, "pref", "17yi", 2) * 60 * 60 * 1000;
            k = en.a(context, "pref", "17yx", 100) * 1024;
        } catch (Throwable unused8) {
        }
        try {
            f = eo.b();
            e = en.a(context, "pref", "13S_at", e);
            R = en.a(context, "pref", "13S_nla", R);
            O = en.a(context, "pref", "13J_able", O);
            P = en.a(context, "pref", "13J_c", P);
        } catch (Throwable unused9) {
        }
    }

    public static boolean b(long j2) {
        if (!M) {
            return false;
        }
        long jA = eo.a() - j2;
        long j3 = N;
        return j3 < 0 || jA < j3;
    }

    public static void c(Context context) {
        try {
            t tVarC = ei.c();
            tVarC.a(v);
            ab.a(context, tVarC);
        } catch (Throwable unused) {
        }
    }

    public static boolean c() {
        return s;
    }

    public static int d() {
        return t;
    }

    public static long d(Context context) {
        return a > 0 ? a : en.a(context, "pref", "clut", 0L);
    }

    public static boolean e() {
        return u;
    }

    public static boolean f() {
        return v;
    }

    public static int g() {
        return x;
    }

    public static int h() {
        if (B < 0) {
            B = 0;
        }
        return B;
    }

    public static boolean i() {
        return C;
    }

    public static void j() {
        C = false;
    }

    public static boolean k() {
        return J;
    }

    public static long l() {
        return N;
    }

    public static boolean m() {
        return M;
    }

    public static boolean n() {
        return O;
    }

    public static int o() {
        return P;
    }

    public static boolean p() {
        return R;
    }

    public static boolean q() {
        return S;
    }

    public static boolean r() {
        boolean z2 = g;
        if (!z2) {
            return z2;
        }
        g = false;
        return true;
    }

    public static boolean s() {
        return h;
    }

    public static boolean t() {
        return U;
    }

    public static long u() {
        return V;
    }

    public static boolean v() {
        return aa;
    }

    public static boolean w() {
        return Y;
    }

    public static int x() {
        return Z;
    }

    public static String y() {
        return u.c(ab);
    }

    public static boolean z() {
        return W && X > 0;
    }
}
