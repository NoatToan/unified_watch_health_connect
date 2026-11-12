package lib.android.paypal.com.magnessdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.StatFs;
import defpackage.znn;
import defpackage.zno;
import defpackage.znp;
import defpackage.znq;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
public abstract class g {
    static final int A = 16;
    static final int A0 = 69;
    static final int B = 17;
    static final int B0 = 70;
    static final int C = 18;
    static final int C0 = 71;
    static final int D = 19;
    static final int D0 = 72;
    static final int E = 20;
    static final int E0 = 73;
    static final int F = 21;
    static final int F0 = 74;
    static final int G = 22;
    static final int G0 = 75;
    static final int H = 23;
    static final int H0 = 76;
    static final int I = 25;
    static final int I0 = 77;
    static final int J = 26;
    static final int J0 = 78;
    static final int K = 27;
    static final int K0 = 79;
    static final int L = 28;
    static final int L0 = 80;
    static final int M = 29;
    static final int M0 = 81;
    static final int N = 30;
    static final int N0 = 82;
    static final int O = 31;
    static final int O0 = 83;
    static final int P = 32;
    static final int P0 = 84;
    static final int Q = 33;
    static final int Q0 = 85;
    static final int R = 34;
    static final int R0 = 86;
    static final int S = 35;
    static final int S0 = 87;
    static final int T = 36;
    static final int T0 = 88;
    static final int U = 37;
    static final int U0 = 89;
    static final int V = 38;
    static final int V0 = 90;
    static final int W = 39;
    static final int W0 = 91;
    static final int X = 40;
    static final int X0 = 92;
    static final int Y = 41;
    static final int Y0 = 93;
    static final int Z = 42;
    static final int Z0 = 94;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f40292a = -400;
    static final int a0 = 43;
    static final int a1 = 95;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f40293b = -401;
    static final int b0 = 44;
    static final int b1 = 96;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f40294c = -402;
    static final int c0 = 45;
    static final int c1 = 97;
    public static final int d = -403;
    static final int d0 = 46;
    static final int d1 = 98;
    public static final int e = -405;
    static final int e0 = 47;
    static final int e1 = 99;
    static final int f = 12345;
    static final int f0 = 48;
    static final int f1 = 100;
    static final double g = 12345.0d;
    static final int g0 = 49;
    static final int g1 = 101;
    static final long h = 12345;
    static final int h0 = 50;
    static final int h1 = 102;
    static final float i = 12345.0f;
    static final int i0 = 51;
    static final int i1 = 103;
    static final String j = "default";
    static final int j0 = 52;
    public static boolean j1 = false;
    static final int k = 0;
    static final int k0 = 53;
    public static String k1 = null;
    static final int l = 1;
    static final int l0 = 54;
    static final int l1 = 600;
    static final int m = 2;
    static final int m0 = 55;
    static final int m1 = 601;
    static final int n = 3;
    static final int n0 = 56;
    static final int n1 = 1;
    static final int o = 4;
    static final int o0 = 57;
    static final int o1 = 2;
    static final int p = 5;
    static final int p0 = 58;
    static final int p1 = 3;
    static final int q = 6;
    static final int q0 = 59;
    public static final String q1 = "s";
    static final int r = 7;
    static final int r0 = 60;
    public static final String r1 = "hw";
    static final int s = 8;
    static final int s0 = 61;
    public static final String s1 = "ts";
    static final int t = 9;
    static final int t0 = 62;
    public static final String t1 = "td";
    static final int u = 10;
    static final int u0 = 63;
    static final int u1 = 100;
    static final int v = 11;
    static final int v0 = 64;
    static final int v1 = 10000;
    static final int w = 12;
    static final int w0 = 65;
    static final int w1 = 1000000;
    static final int x = 13;
    static final int x0 = 66;
    static final int y = 14;
    static final int y0 = 67;
    static final int z = 15;
    static final int z0 = 68;

    /* JADX INFO: loaded from: classes3.dex */
    @Retention(RetentionPolicy.SOURCE)
    @interface a {
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Retention(RetentionPolicy.SOURCE)
    @interface b {
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Retention(RetentionPolicy.SOURCE)
    @interface c {
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Retention(RetentionPolicy.SOURCE)
    @interface d {
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Retention(RetentionPolicy.SOURCE)
    @interface e {
    }

    protected abstract JSONObject a();

    protected abstract JSONObject a(MagnesSettings magnesSettings, znn znnVar, zno znoVar);

    protected abstract void a(int i2, MagnesSettings magnesSettings);

    public JSONObject b(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("RiskManagerMG", 0);
        k1 = sharedPreferences.getString("RiskManagerMG", "");
        long jCurrentTimeMillis = sharedPreferences.getLong("RiskManagerMGTIMESTAMP", 0L);
        if (k1.equals("") && jCurrentTimeMillis == 0) {
            k1 = znp.c(true);
            jCurrentTimeMillis = System.currentTimeMillis();
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("RiskManagerMG", k1);
            editorEdit.putLong("RiskManagerMGTIMESTAMP", jCurrentTimeMillis);
            editorEdit.apply();
        }
        HashMap<String, String> map = new HashMap<>();
        map.put("id", k1);
        map.put("created_at", jCurrentTimeMillis + "");
        return a(map);
    }

    boolean a(JSONObject jSONObject, int i2, Context context) {
        try {
            String strA = a(context);
            String strB = znp.b("5.5.1.release");
            List<String> listE = znp.e(jSONObject.getJSONArray(lib.android.paypal.com.magnessdk.c.i.EXCLUDED.toString()));
            if (listE == null) {
                return false;
            }
            if (!znp.a(listE, strB)) {
                return true;
            }
            List<String> listE2 = znp.e(jSONObject.getJSONArray(lib.android.paypal.com.magnessdk.c.i.APP_IDS.toString()));
            List<Integer> listC = znp.c(jSONObject.getJSONArray(lib.android.paypal.com.magnessdk.c.i.APP_SOURCES.toString()));
            if (listC == null || !listC.contains(Integer.valueOf(i2))) {
                return listE2 == null || !znp.a(listE2, strA);
            }
            return false;
        } catch (Exception e2) {
            lib.android.paypal.com.magnessdk.log.a.e(getClass(), 3, e2);
            return false;
        }
    }

    public boolean a(znn znnVar, int i2, String str, String str2, Context context) {
        try {
            JSONObject jSONObjectOptJSONObject = znnVar.a().optJSONObject(str2);
            if (jSONObjectOptJSONObject != null && !str.equalsIgnoreCase("")) {
                String string = jSONObjectOptJSONObject.getString(lib.android.paypal.com.magnessdk.c.i.MIN_VERSION.toString());
                String strB = znp.b("5.5.1.release");
                if (!string.equalsIgnoreCase("") && a(strB, string)) {
                    if (jSONObjectOptJSONObject.getBoolean(lib.android.paypal.com.magnessdk.c.i.OPEN.toString())) {
                        return a(jSONObjectOptJSONObject, i2, context);
                    }
                    if (i2 != MagnesSource.PAYPAL.getVersion() && i2 != MagnesSource.VENMO.getVersion()) {
                        return false;
                    }
                    return a(jSONObjectOptJSONObject.optInt(lib.android.paypal.com.magnessdk.c.i.RAMP_THRESHOLD.toString(), 0), str, str2);
                }
            }
            return false;
        } catch (Exception e2) {
            lib.android.paypal.com.magnessdk.log.a.e(getClass(), 3, e2);
            return false;
        }
    }

    boolean a(String str, String str2) {
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        int i2 = 0;
        while (true) {
            if (i2 >= strArrSplit.length && i2 >= strArrSplit2.length) {
                return false;
            }
            if (i2 >= strArrSplit.length || i2 >= strArrSplit2.length) {
                if (i2 < strArrSplit.length) {
                    if (Integer.parseInt(strArrSplit[i2]) != 0) {
                        return true;
                    }
                } else if (i2 < strArrSplit2.length && Integer.parseInt(strArrSplit2[i2]) != 0) {
                    return false;
                }
            } else {
                if (Integer.parseInt(strArrSplit[i2]) < Integer.parseInt(strArrSplit2[i2])) {
                    return false;
                }
                if (Integer.parseInt(strArrSplit[i2]) > Integer.parseInt(strArrSplit2[i2])) {
                    return true;
                }
            }
            i2++;
        }
    }

    public boolean a(Context context, String str) {
        try {
            return context.checkCallingOrSelfPermission(str) == 0;
        } catch (Exception e2) {
            lib.android.paypal.com.magnessdk.log.a.e(getClass(), 3, e2);
            return false;
        }
    }

    public JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObjectA = a();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                Object objOpt = jSONObjectA.opt(next);
                if (objOpt == null || !(objOpt instanceof JSONObject)) {
                    objOpt = jSONObject.get(next);
                } else {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    Iterator<String> itKeys2 = jSONObject2.keys();
                    while (itKeys2.hasNext()) {
                        String next2 = itKeys2.next();
                        ((JSONObject) objOpt).put(next2, jSONObject2.get(next2));
                    }
                }
                jSONObjectA.put(next, objOpt);
            } catch (JSONException e2) {
                lib.android.paypal.com.magnessdk.log.a.e(getClass(), 3, e2);
            }
        }
        return jSONObjectA;
    }

    public String a(Context context) throws PackageManager.NameNotFoundException {
        return context.getPackageName();
    }

    public Object a(Object obj) {
        boolean z2 = obj instanceof Integer;
        Integer numValueOf = Integer.valueOf(f40292a);
        if (z2) {
            return ((Integer) obj).intValue() == f ? numValueOf : obj;
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue() == g ? numValueOf : obj;
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue() == h ? numValueOf : obj;
        }
        if (obj instanceof Float) {
            return ((Float) obj).floatValue() == i ? numValueOf : obj;
        }
        if (obj instanceof String) {
            return obj.equals("default") ? "-400" : obj;
        }
        return numValueOf;
    }

    public long a(int i2) {
        String absolutePath;
        long blockSize;
        int blockCount;
        File file = new File("/storage");
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                absolutePath = "";
                break;
            }
            int length = fileArrListFiles.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    absolutePath = "";
                    break;
                }
                File file2 = fileArrListFiles[i3];
                if (file2.exists()) {
                    try {
                        if (android.os.Environment.isExternalStorageRemovable(file2)) {
                            absolutePath = file2.getAbsolutePath();
                            break;
                        }
                        continue;
                    } catch (Exception e2) {
                        lib.android.paypal.com.magnessdk.log.a.e(getClass(), 3, e2);
                    }
                }
                i3++;
            }
            if (!absolutePath.isEmpty()) {
                File file3 = new File(absolutePath);
                if (file3.exists()) {
                    StatFs statFs = new StatFs(file3.getPath());
                    if (i2 == 600) {
                        blockSize = statFs.getBlockSize();
                        blockCount = statFs.getAvailableBlocks();
                    } else if (i2 == 601) {
                        blockSize = statFs.getBlockSize();
                        blockCount = statFs.getBlockCount();
                    }
                    return blockSize * ((long) blockCount);
                }
            }
        }
        return h;
    }

    public static JSONObject b(String str, JSONArray jSONArray, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pairing_id", str);
        jSONObject.put(str2, jSONArray);
        return jSONObject;
    }

    public static boolean a(znn znnVar, String str) {
        JSONObject jSONObjectOptJSONObject = znnVar.a().optJSONObject(str);
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optInt(lib.android.paypal.com.magnessdk.c.i.RAMP_THRESHOLD.toString(), 0) < 0;
    }

    public static boolean a(String str) {
        return a(znq.d().b(), str);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    private boolean a(int i2, String str, String str2) {
        byte b2;
        if (str != null && !str.equalsIgnoreCase("")) {
            String lowerCase = str.toLowerCase();
            int iAbs = Math.abs(i2);
            int iAbs2 = Math.abs(lowerCase.hashCode());
            if (iAbs2 > 0) {
                str2.hashCode();
                str2.hashCode();
                int iHashCode = str2.hashCode();
                if (iHashCode != 115) {
                    if (iHashCode != 3343) {
                        if (iHashCode != 3696) {
                            if (iHashCode == 3711 && str2.equals("ts")) {
                                b2 = 3;
                            } else {
                                b2 = -1;
                            }
                        } else if (str2.equals(t1)) {
                            b2 = 2;
                        } else {
                            b2 = -1;
                        }
                    } else if (str2.equals(r1)) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                } else if (str2.equals("s")) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
                if (b2 != 0) {
                    if (b2 == 1) {
                        iAbs2 /= 100;
                    } else if (b2 == 2) {
                        iAbs2 /= 1000000;
                    } else {
                        if (b2 != 3) {
                            return false;
                        }
                        iAbs2 /= 10000;
                    }
                }
                int i3 = iAbs2 % 100;
                if (i3 < iAbs) {
                    j1 = true;
                }
                if (i3 < iAbs) {
                    return true;
                }
            }
        }
        return false;
    }

    static JSONObject a(JSONObject jSONObject, JSONArray jSONArray, String str) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(lib.android.paypal.com.magnessdk.c.a.FEATURE.toString(), str);
        jSONObject2.put(lib.android.paypal.com.magnessdk.c.a.PAYLOAD.toString(), jSONArray);
        lib.android.paypal.com.magnessdk.c.a aVar = lib.android.paypal.com.magnessdk.c.a.AUDIT_KEY;
        if (!jSONObject.has(aVar.toString())) {
            return null;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray(aVar.toString());
        jSONArray2.put(jSONObject2);
        jSONObject.put(aVar.toString(), jSONArray2);
        return jSONObject;
    }

    static JSONObject a(JSONObject jSONObject, Object obj, String str) throws JSONException {
        JSONArray jSONArray = jSONObject.has(str) ? jSONObject.getJSONArray(str) : new JSONArray();
        jSONArray.put(obj);
        jSONObject.put(str, jSONArray);
        return jSONObject;
    }

    private JSONObject a(HashMap<String, String> map) {
        try {
            return new JSONObject("{\"id\":" + map.get("id") + ",\"created_at\":" + map.get("created_at") + "}");
        } catch (JSONException unused) {
            return null;
        }
    }

    public static JSONObject a(String str, JSONArray jSONArray, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(lib.android.paypal.com.magnessdk.c.a.FEATURE.toString(), str2);
        jSONObject.put(lib.android.paypal.com.magnessdk.c.a.PAYLOAD.toString(), jSONArray);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("pairing_id", str);
        jSONObject2.put(lib.android.paypal.com.magnessdk.c.a.AUDIT_KEY.toString(), znp.d(jSONObject));
        return jSONObject2;
    }
}
