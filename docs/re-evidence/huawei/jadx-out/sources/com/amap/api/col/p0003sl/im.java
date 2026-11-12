package com.amap.api.col.p0003sl;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.amap.api.maps.AMapException;
import com.amap.apis.utils.core.api.AMapUtilCoreApi;
import com.huawei.openalliance.ad.constant.OsType;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import ohos.ace.plugin.wifimanager.WifiDeviceUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class im {
    private static volatile boolean D = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f2768a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f2769b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Context f2770c = null;
    private static String k = "6";
    private static String l = "4";
    private static String m = "9";
    private static String n = "8";
    private static volatile boolean o = true;
    private static Vector<e> p = new Vector<>();
    private static Map<String, Integer> q = new HashMap();
    private static String r = null;
    private static long s = 0;
    public static volatile boolean d = false;
    private static volatile ConcurrentHashMap<String, g> t = new ConcurrentHashMap<>(8);
    private static volatile ConcurrentHashMap<String, Long> u = new ConcurrentHashMap<>(8);
    private static volatile ConcurrentHashMap<String, d> v = new ConcurrentHashMap<>(8);
    private static boolean w = false;
    private static boolean x = false;
    public static int e = 5000;
    public static boolean f = true;
    public static boolean g = false;
    private static int y = 3;
    public static boolean h = true;
    public static boolean i = false;
    private static int z = 3;
    public static boolean j = false;
    private static ConcurrentHashMap<String, Boolean> A = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, Boolean> B = new ConcurrentHashMap<>();
    private static ArrayList<kx.a> C = new ArrayList<>();
    private static Queue<kx.c> E = new LinkedList();

    public interface a {
        void a(b bVar);
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static boolean f2787a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static boolean f2788b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static boolean f2789c = true;
        public static int d = 0;
        public static boolean e = false;
        public static int f;
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f2790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f2791b;

        g(Long l, String str) {
            this.f2790a = 0L;
            this.f2791b = "";
            this.f2790a = l.longValue();
            this.f2791b = str;
        }
    }

    public static void a(Context context, String str) {
        il.a(context, str);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Deprecated
        public JSONObject f2774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Deprecated
        public JSONObject f2775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f2776c;
        public int d = -1;
        public long e = 0;
        public JSONObject f;
        public a g;
        public C0028b h;
        private boolean i;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f2777a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f2778b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public JSONObject f2779c;
        }

        /* JADX INFO: renamed from: com.amap.api.col.3sl.im$b$b, reason: collision with other inner class name */
        public static final class C0028b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f2780a;
        }
    }

    public static boolean a(String str, boolean z2) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] strArrSplit = URLDecoder.decode(str).split("/");
                return strArrSplit[strArrSplit.length - 1].charAt(4) % 2 == 1;
            }
        } catch (Throwable unused) {
        }
        return z2;
    }

    public static b a(Context context, ix ixVar, String str, Map<String, String> map) {
        return b(context, ixVar, str, map);
    }

    private static b b(Context context, ix ixVar, String str, Map<String, String> map) {
        return a(context, ixVar, str, map, null, null, null);
    }

    public static b a(Context context, ix ixVar, String str, String str2, String str3, String str4) {
        return a(context, ixVar, str, null, str2, str3, str4);
    }

    public static void a(Context context) {
        if (context != null) {
            f2770c = context.getApplicationContext();
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f9 A[Catch: all -> 0x0262, TRY_LEAVE, TryCatch #0 {all -> 0x0262, blocks: (B:84:0x01b9, B:86:0x01c4, B:88:0x01cb, B:115:0x0229, B:117:0x022f, B:114:0x0225, B:91:0x01d2, B:95:0x01dd, B:97:0x01eb, B:98:0x01f1, B:100:0x01f9, B:104:0x0201, B:106:0x020e, B:109:0x0215, B:111:0x021b), top: B:129:0x01b9, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:106:0x020e A[Catch: all -> 0x0262, TRY_LEAVE, TryCatch #0 {all -> 0x0262, blocks: (B:84:0x01b9, B:86:0x01c4, B:88:0x01cb, B:115:0x0229, B:117:0x022f, B:114:0x0225, B:91:0x01d2, B:95:0x01dd, B:97:0x01eb, B:98:0x01f1, B:100:0x01f9, B:104:0x0201, B:106:0x020e, B:109:0x0215, B:111:0x021b), top: B:129:0x01b9, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x021b A[Catch: all -> 0x0224, TRY_LEAVE, TryCatch #1 {all -> 0x0224, blocks: (B:109:0x0215, B:111:0x021b), top: B:130:0x0215, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x022f A[Catch: all -> 0x0262, TRY_LEAVE, TryCatch #0 {all -> 0x0262, blocks: (B:84:0x01b9, B:86:0x01c4, B:88:0x01cb, B:115:0x0229, B:117:0x022f, B:114:0x0225, B:91:0x01d2, B:95:0x01dd, B:97:0x01eb, B:98:0x01f1, B:100:0x01f9, B:104:0x0201, B:106:0x020e, B:109:0x0215, B:111:0x021b), top: B:129:0x01b9, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0253 A[Catch: all -> 0x0266, TryCatch #8 {all -> 0x0266, blocks: (B:118:0x0236, B:120:0x0253, B:121:0x025a), top: B:135:0x0236 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x025a A[Catch: all -> 0x0266, TRY_LEAVE, TryCatch #8 {all -> 0x0266, blocks: (B:118:0x0236, B:120:0x0253, B:121:0x025a), top: B:135:0x0236 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:86:0x01c4 A[Catch: all -> 0x0262, TryCatch #0 {all -> 0x0262, blocks: (B:84:0x01b9, B:86:0x01c4, B:88:0x01cb, B:115:0x0229, B:117:0x022f, B:114:0x0225, B:91:0x01d2, B:95:0x01dd, B:97:0x01eb, B:98:0x01f1, B:100:0x01f9, B:104:0x0201, B:106:0x020e, B:109:0x0215, B:111:0x021b), top: B:129:0x01b9, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01cb A[Catch: all -> 0x0262, TryCatch #0 {all -> 0x0262, blocks: (B:84:0x01b9, B:86:0x01c4, B:88:0x01cb, B:115:0x0229, B:117:0x022f, B:114:0x0225, B:91:0x01d2, B:95:0x01dd, B:97:0x01eb, B:98:0x01f1, B:100:0x01f9, B:104:0x0201, B:106:0x020e, B:109:0x0215, B:111:0x021b), top: B:129:0x01b9, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x01d2 A[Catch: all -> 0x0262, TRY_LEAVE, TryCatch #0 {all -> 0x0262, blocks: (B:84:0x01b9, B:86:0x01c4, B:88:0x01cb, B:115:0x0229, B:117:0x022f, B:114:0x0225, B:91:0x01d2, B:95:0x01dd, B:97:0x01eb, B:98:0x01f1, B:100:0x01f9, B:104:0x0201, B:106:0x020e, B:109:0x0215, B:111:0x021b), top: B:129:0x01b9, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:97:0x01eb A[Catch: all -> 0x0262, TryCatch #0 {all -> 0x0262, blocks: (B:84:0x01b9, B:86:0x01c4, B:88:0x01cb, B:115:0x0229, B:117:0x022f, B:114:0x0225, B:91:0x01d2, B:95:0x01dd, B:97:0x01eb, B:98:0x01f1, B:100:0x01f9, B:104:0x0201, B:106:0x020e, B:109:0x0215, B:111:0x021b), top: B:129:0x01b9, inners: #1 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10, types: [com.amap.api.col.3sl.im$b] */
    /* JADX WARN: Type inference failed for: r12v11, types: [com.amap.api.col.3sl.im$b] */
    /* JADX WARN: Type inference failed for: r12v15, types: [com.amap.api.col.3sl.im$b] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [com.amap.api.col.3sl.im$b] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    private static b a(Context context, ix ixVar, String str, Map<String, String> map, String str2, String str3, String str4) throws ik {
        String str5;
        String str6;
        String str7;
        String str8;
        String strC;
        lb lbVarA;
        byte[] bArr;
        String str9;
        String str10;
        JSONObject jSONObject;
        int i2;
        String str11;
        String str12;
        String str13;
        String str14;
        String string;
        String str15;
        String str16;
        JSONObject jSONObject2;
        boolean zA;
        String str17 = "infocode";
        ?? r12 = "result";
        String str18 = RecommendConstants.VER;
        b bVar = new b();
        bVar.f = new JSONObject();
        if (context != null) {
            f2770c = context.getApplicationContext();
        }
        e();
        String strA = null;
        try {
            a(ixVar);
            new kt();
            boolean zIsEmpty = TextUtils.isEmpty(str);
            try {
                if (zIsEmpty) {
                    strC = str;
                } else {
                    try {
                        strC = c(str);
                    } catch (ik e2) {
                        e = e2;
                        throw e;
                    } catch (Throwable unused) {
                        throw new ik(AMapException.ERROR_UNKNOWN);
                    }
                }
                try {
                    d(context);
                    e(context);
                    str6 = "result";
                    String str19 = strC;
                    r12 = bVar;
                    str8 = RecommendConstants.VER;
                    str18 = "at";
                    str5 = "infocode";
                    str17 = "lc";
                    str7 = CloudParamKeys.INFO;
                    try {
                        lbVarA = kt.a(new c(context, ixVar, str19, map, str2, str3, str4));
                        if (!zIsEmpty) {
                            if (lbVarA != null) {
                                try {
                                    bArr = lbVarA.f3037a;
                                    try {
                                        Map<String, List<String>> map2 = lbVarA.f3038b;
                                        if (map2 != null && map2.containsKey("lct")) {
                                            List<String> list = map2.get("lct");
                                            List<String> list2 = map2.get("lct-info");
                                            r12.e = a(list);
                                            String strB = b(list2);
                                            if (r12.e != 0 && ixVar != null) {
                                                String strA2 = ixVar.a();
                                                if (!TextUtils.isEmpty(strA2)) {
                                                    a(strA2, r12.e, strB);
                                                }
                                            }
                                        }
                                    } catch (Throwable th) {
                                        try {
                                            th.printStackTrace();
                                            jv.c(th, str18, "lct");
                                        } catch (ik e3) {
                                            e = e3;
                                            r12.f2776c = e.a();
                                            a(context, ixVar, e.a());
                                            jv.a(ixVar, "/v3/iasdkauth", e);
                                            r12 = r12;
                                        } catch (IllegalBlockSizeException e4) {
                                            e = e4;
                                            a(context, ixVar, e);
                                            r12 = r12;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            jv.c(th, str18, str17);
                                            a(context, ixVar, th);
                                            r12 = r12;
                                        }
                                    }
                                } catch (ik e5) {
                                    e = e5;
                                    bArr = null;
                                    r12.f2776c = e.a();
                                    a(context, ixVar, e.a());
                                    jv.a(ixVar, "/v3/iasdkauth", e);
                                    r12 = r12;
                                } catch (IllegalBlockSizeException e6) {
                                    e = e6;
                                    bArr = null;
                                    a(context, ixVar, e);
                                    r12 = r12;
                                } catch (Throwable th3) {
                                    th = th3;
                                    bArr = null;
                                    jv.c(th, str18, str17);
                                    a(context, ixVar, th);
                                    r12 = r12;
                                }
                            } else {
                                bArr = null;
                            }
                            byte[] bArr2 = new byte[16];
                            byte[] bArr3 = new byte[bArr.length - 16];
                            System.arraycopy(bArr, 0, bArr2, 0, 16);
                            System.arraycopy(bArr, 16, bArr3, 0, bArr.length - 16);
                            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, iy.c("EQUVT"));
                            Cipher cipher = Cipher.getInstance(iy.c("CQUVTL0NCQy9QS0NTNVBhZGRpbmc"));
                            cipher.init(2, secretKeySpec, new IvParameterSpec(iy.c()));
                            strA = iy.a(cipher.doFinal(bArr3));
                            r12 = r12;
                            str9 = strC;
                            if (bArr != null) {
                                if (TextUtils.isEmpty(strA)) {
                                    strA = iy.a(bArr);
                                }
                                str10 = strA;
                                if (TextUtils.isEmpty(str10)) {
                                    a(context, ixVar, "result is null");
                                }
                                try {
                                    jSONObject = new JSONObject(str10);
                                    if (jSONObject.has("status")) {
                                        i2 = jSONObject.getInt("status");
                                        if (i2 == 1) {
                                            f2768a = 1;
                                        } else if (i2 != 0) {
                                            if (lbVarA != null) {
                                                str11 = "authcsid";
                                                str12 = "authgsid";
                                            } else {
                                                str11 = lbVarA.f3039c;
                                                str12 = lbVarA.d;
                                            }
                                            String str20 = str11;
                                            String str21 = str12;
                                            iy.a(context, str20, str21, jSONObject);
                                            f2768a = 0;
                                            str13 = str7;
                                            if (jSONObject.has(str13)) {
                                                f2769b = jSONObject.getString(str13);
                                            }
                                            str14 = str5;
                                            if (jSONObject.has(str14)) {
                                                string = "";
                                            } else {
                                                string = jSONObject.getString(str14);
                                            }
                                            jv.a(ixVar, "/v3/iasdkauth", f2769b, str21, str20, string);
                                            if (f2768a == 0) {
                                                r12.f2776c = f2769b;
                                            }
                                        }
                                        str15 = str8;
                                        try {
                                            if (jSONObject.has(str15)) {
                                                r12.d = jSONObject.getInt(str15);
                                            }
                                        } catch (Throwable th4) {
                                            js.a(th4, str18, str17);
                                        }
                                        str16 = str6;
                                        if (iy.a(jSONObject, str16)) {
                                            JSONObject jSONObject3 = jSONObject.getJSONObject(str16);
                                            a(context, ixVar, str9, (b) r12, jSONObject3);
                                            try {
                                                jSONObject2 = jSONObject3.getJSONObject("15K");
                                                zA = a(jSONObject2.optString("isTargetAble"), false);
                                                if (!a(jSONObject2.optString("able"), false)) {
                                                    ir.a();
                                                    ir.b(context);
                                                } else {
                                                    ir.a().a(context, zA);
                                                }
                                            } catch (Throwable unused2) {
                                            }
                                        }
                                    }
                                } catch (Throwable th5) {
                                    js.a(th5, str18, str17);
                                }
                            }
                        }
                    } catch (ik e7) {
                        throw e7;
                    } catch (Throwable unused3) {
                        throw new ik(AMapException.ERROR_UNKNOWN);
                    }
                } catch (ik e8) {
                    e = e8;
                    throw e;
                } catch (Throwable unused4) {
                    throw new ik(AMapException.ERROR_UNKNOWN);
                }
            } catch (ik e9) {
                e = e9;
                lbVarA = null;
                bArr = null;
                r12.f2776c = e.a();
                a(context, ixVar, e.a());
                jv.a(ixVar, "/v3/iasdkauth", e);
                r12 = r12;
                str9 = strC;
                if (bArr != null) {
                    if (TextUtils.isEmpty(strA)) {
                        strA = iy.a(bArr);
                    }
                    str10 = strA;
                    if (TextUtils.isEmpty(str10)) {
                        a(context, ixVar, "result is null");
                    }
                    jSONObject = new JSONObject(str10);
                    if (jSONObject.has("status")) {
                        i2 = jSONObject.getInt("status");
                        if (i2 == 1) {
                            f2768a = 1;
                        } else if (i2 != 0) {
                            if (lbVarA != null) {
                                str11 = "authcsid";
                                str12 = "authgsid";
                            } else {
                                str11 = lbVarA.f3039c;
                                str12 = lbVarA.d;
                            }
                            String str22 = str11;
                            String str23 = str12;
                            iy.a(context, str22, str23, jSONObject);
                            f2768a = 0;
                            str13 = str7;
                            if (jSONObject.has(str13)) {
                                f2769b = jSONObject.getString(str13);
                            }
                            str14 = str5;
                            if (jSONObject.has(str14)) {
                                string = "";
                            } else {
                                string = jSONObject.getString(str14);
                            }
                            jv.a(ixVar, "/v3/iasdkauth", f2769b, str23, str22, string);
                            if (f2768a == 0) {
                                r12.f2776c = f2769b;
                            }
                        }
                        str15 = str8;
                        if (jSONObject.has(str15)) {
                            r12.d = jSONObject.getInt(str15);
                        }
                        str16 = str6;
                        if (iy.a(jSONObject, str16)) {
                            JSONObject jSONObject4 = jSONObject.getJSONObject(str16);
                            a(context, ixVar, str9, (b) r12, jSONObject4);
                            jSONObject2 = jSONObject4.getJSONObject("15K");
                            zA = a(jSONObject2.optString("isTargetAble"), false);
                            if (!a(jSONObject2.optString("able"), false)) {
                                ir.a();
                                ir.b(context);
                            } else {
                                ir.a().a(context, zA);
                            }
                        }
                    }
                }
                return r12;
            } catch (IllegalBlockSizeException e10) {
                e = e10;
                lbVarA = null;
                bArr = null;
                a(context, ixVar, e);
                r12 = r12;
                str9 = strC;
                if (bArr != null) {
                    if (TextUtils.isEmpty(strA)) {
                        strA = iy.a(bArr);
                    }
                    str10 = strA;
                    if (TextUtils.isEmpty(str10)) {
                        a(context, ixVar, "result is null");
                    }
                    jSONObject = new JSONObject(str10);
                    if (jSONObject.has("status")) {
                        i2 = jSONObject.getInt("status");
                        if (i2 == 1) {
                            f2768a = 1;
                        } else if (i2 != 0) {
                            if (lbVarA != null) {
                                str11 = "authcsid";
                                str12 = "authgsid";
                            } else {
                                str11 = lbVarA.f3039c;
                                str12 = lbVarA.d;
                            }
                            String str24 = str11;
                            String str25 = str12;
                            iy.a(context, str24, str25, jSONObject);
                            f2768a = 0;
                            str13 = str7;
                            if (jSONObject.has(str13)) {
                                f2769b = jSONObject.getString(str13);
                            }
                            str14 = str5;
                            if (jSONObject.has(str14)) {
                                string = "";
                            } else {
                                string = jSONObject.getString(str14);
                            }
                            jv.a(ixVar, "/v3/iasdkauth", f2769b, str25, str24, string);
                            if (f2768a == 0) {
                                r12.f2776c = f2769b;
                            }
                        }
                        str15 = str8;
                        if (jSONObject.has(str15)) {
                            r12.d = jSONObject.getInt(str15);
                        }
                        str16 = str6;
                        if (iy.a(jSONObject, str16)) {
                            JSONObject jSONObject5 = jSONObject.getJSONObject(str16);
                            a(context, ixVar, str9, (b) r12, jSONObject5);
                            jSONObject2 = jSONObject5.getJSONObject("15K");
                            zA = a(jSONObject2.optString("isTargetAble"), false);
                            if (!a(jSONObject2.optString("able"), false)) {
                                ir.a();
                                ir.b(context);
                            } else {
                                ir.a().a(context, zA);
                            }
                        }
                    }
                }
                return r12;
            } catch (Throwable th6) {
                th = th6;
                lbVarA = null;
                bArr = null;
                jv.c(th, str18, str17);
                a(context, ixVar, th);
                r12 = r12;
                str9 = strC;
                if (bArr != null) {
                    if (TextUtils.isEmpty(strA)) {
                        strA = iy.a(bArr);
                    }
                    str10 = strA;
                    if (TextUtils.isEmpty(str10)) {
                        a(context, ixVar, "result is null");
                    }
                    jSONObject = new JSONObject(str10);
                    if (jSONObject.has("status")) {
                        i2 = jSONObject.getInt("status");
                        if (i2 == 1) {
                            f2768a = 1;
                        } else if (i2 != 0) {
                            if (lbVarA != null) {
                                str11 = "authcsid";
                                str12 = "authgsid";
                            } else {
                                str11 = lbVarA.f3039c;
                                str12 = lbVarA.d;
                            }
                            String str26 = str11;
                            String str27 = str12;
                            iy.a(context, str26, str27, jSONObject);
                            f2768a = 0;
                            str13 = str7;
                            if (jSONObject.has(str13)) {
                                f2769b = jSONObject.getString(str13);
                            }
                            str14 = str5;
                            if (jSONObject.has(str14)) {
                                string = "";
                            } else {
                                string = jSONObject.getString(str14);
                            }
                            jv.a(ixVar, "/v3/iasdkauth", f2769b, str27, str26, string);
                            if (f2768a == 0) {
                                r12.f2776c = f2769b;
                            }
                        }
                        str15 = str8;
                        if (jSONObject.has(str15)) {
                            r12.d = jSONObject.getInt(str15);
                        }
                        str16 = str6;
                        if (iy.a(jSONObject, str16)) {
                            JSONObject jSONObject6 = jSONObject.getJSONObject(str16);
                            a(context, ixVar, str9, (b) r12, jSONObject6);
                            jSONObject2 = jSONObject6.getJSONObject("15K");
                            zA = a(jSONObject2.optString("isTargetAble"), false);
                            if (!a(jSONObject2.optString("able"), false)) {
                                ir.a();
                                ir.b(context);
                            } else {
                                ir.a().a(context, zA);
                            }
                        }
                    }
                }
                return r12;
            }
        } catch (ik e11) {
            e = e11;
            str5 = "infocode";
            str6 = "result";
            str7 = CloudParamKeys.INFO;
            str8 = RecommendConstants.VER;
            r12 = bVar;
            str18 = "at";
            str17 = "lc";
            strC = str;
        } catch (IllegalBlockSizeException e12) {
            e = e12;
            str5 = "infocode";
            str6 = "result";
            str7 = CloudParamKeys.INFO;
            str8 = RecommendConstants.VER;
            r12 = bVar;
            str18 = "at";
            str17 = "lc";
            strC = str;
        } catch (Throwable th7) {
            th = th7;
            str5 = "infocode";
            str6 = "result";
            str7 = CloudParamKeys.INFO;
            str8 = RecommendConstants.VER;
            r12 = bVar;
            str18 = "at";
            str17 = "lc";
            strC = str;
        }
        return r12;
    }

    private static String b(List<String> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    String str = list.get(0);
                    return !TextUtils.isEmpty(str) ? str : "";
                }
                return "";
            } catch (Exception unused) {
                return "";
            }
        }
        return "";
    }

    public static long a(List<String> list) {
        if (list == null) {
            return 0L;
        }
        try {
            if (list.size() <= 0) {
                return 0L;
            }
            String str = list.get(0);
            if (TextUtils.isEmpty(str)) {
                return 0L;
            }
            return Long.valueOf(str).longValue();
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:154:0x0304 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x02c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x02ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0208 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:97:0x020e A[Catch: all -> 0x0298, TryCatch #12 {all -> 0x0298, blocks: (B:95:0x0208, B:97:0x020e, B:99:0x024d, B:101:0x0251, B:103:0x0255, B:105:0x0259, B:107:0x025d, B:109:0x0261), top: B:160:0x0208 }] */
    private static void a(Context context, ix ixVar, String str, b bVar, JSONObject jSONObject) throws JSONException {
        String str2;
        String str3;
        boolean zA;
        Context context2;
        JSONObject jSONObject2;
        boolean zA2;
        boolean zA3;
        boolean zA4;
        String str4;
        int iOptInt;
        String str5;
        boolean zA5;
        int iOptInt2;
        b.a aVar = new b.a();
        aVar.f2777a = false;
        aVar.f2778b = false;
        bVar.g = aVar;
        try {
            String[] strArrSplit = str.split(";");
            if (strArrSplit != null && strArrSplit.length > 0) {
                for (String str6 : strArrSplit) {
                    if (jSONObject.has(str6)) {
                        bVar.f.putOpt(str6, jSONObject.get(str6));
                    }
                }
            }
        } catch (Throwable th) {
            js.a(th, "at", "co");
        }
        if (iy.a(jSONObject, "16H")) {
            try {
                bVar.i = a(jSONObject.getJSONObject("16H").optString("able"), false);
            } catch (Throwable th2) {
                js.a(th2, "AuthConfigManager", "load 16H");
            }
        }
        if (iy.a(jSONObject, "11K")) {
            try {
                JSONObject jSONObject3 = jSONObject.getJSONObject("11K");
                aVar.f2777a = a(jSONObject3.getString("able"), false);
                if (jSONObject3.has("off")) {
                    aVar.f2779c = jSONObject3.getJSONObject("off");
                }
            } catch (Throwable th3) {
                js.a(th3, "AuthConfigManager", "load 11K");
            }
        }
        if (iy.a(jSONObject, "145")) {
            try {
                bVar.f2774a = jSONObject.getJSONObject("145");
            } catch (Throwable th4) {
                js.a(th4, "AuthConfigManager", "load 145");
            }
        }
        if (iy.a(jSONObject, "14D")) {
            try {
                bVar.f2775b = jSONObject.getJSONObject("14D");
            } catch (Throwable th5) {
                js.a(th5, "AuthConfigManager", "load 14D");
            }
        }
        if (iy.a(jSONObject, "151")) {
            try {
                JSONObject jSONObject4 = jSONObject.getJSONObject("151");
                b.C0028b c0028b = new b.C0028b();
                if (jSONObject4 != null) {
                    c0028b.f2780a = a(jSONObject4.optString("able"), false);
                }
                bVar.h = c0028b;
            } catch (Throwable th6) {
                js.a(th6, "AuthConfigManager", "load 151");
            }
        }
        if (!iy.a(jSONObject, "17S")) {
            str2 = "ust";
            str3 = "umv";
        } else {
            try {
                JSONObject jSONObject5 = jSONObject.getJSONObject("17S");
                if (jSONObject5 != null && (zA = a(jSONObject5.optString("able"), false)) != o) {
                    o = zA;
                    if (context != null) {
                        SharedPreferences.Editor editorA = ki.a(context, "open_common");
                        ki.a(editorA, "a2", zA);
                        ki.a(editorA);
                    }
                }
                if (jSONObject5 == null) {
                    str2 = "ust";
                    str3 = "umv";
                } else {
                    boolean zA6 = a(jSONObject5.optString("static_enable"), true);
                    boolean zA7 = a(jSONObject5.optString("static_ip_direct_enable"), false);
                    int iOptInt3 = jSONObject5.optInt("static_timeout", 5) * 1000;
                    int iOptInt4 = jSONObject5.optInt("static_retry", 3);
                    boolean zA8 = a(jSONObject5.optString("bgp_enable"), true);
                    str2 = "ust";
                    try {
                        boolean zA9 = a(jSONObject5.optString("bgp_ip_direct_enable"), false);
                        str3 = "umv";
                        try {
                            int iOptInt5 = jSONObject5.optInt("bgp_retry", 3);
                            boolean zA10 = a(jSONObject5.optString("perf_data_upload_enable"), false);
                            if (zA6 != f || zA7 != g || iOptInt3 != e || iOptInt4 != y || zA8 != h || zA9 != i || iOptInt5 != z || zA10 != j) {
                                f = zA6;
                                g = zA7;
                                e = iOptInt3;
                                y = iOptInt4;
                                h = zA8;
                                i = zA9;
                                z = iOptInt5;
                                j = zA10;
                                if (context != null) {
                                    SharedPreferences.Editor editorA2 = ki.a(context, "open_common");
                                    ki.a(editorA2, "a13", zA6);
                                    ki.a(editorA2, "a6", zA8);
                                    ki.a(editorA2, "a7", zA7);
                                    ki.a(editorA2, "a8", iOptInt3);
                                    ki.a(editorA2, "a9", iOptInt4);
                                    ki.a(editorA2, "a10", zA9);
                                    ki.a(editorA2, "a11", iOptInt5);
                                    ki.a(editorA2, "a12", zA10);
                                    ki.a(editorA2);
                                }
                            }
                            kx.b();
                            kx.b();
                            kx.b();
                            kx.b();
                            kx.b();
                        } catch (Throwable th7) {
                            th = th7;
                            js.a(th, "AuthConfigManager", "load 17S");
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        str3 = "umv";
                        js.a(th, "AuthConfigManager", "load 17S");
                        if (iy.a(jSONObject, "15K")) {
                            try {
                                jSONObject2 = jSONObject.getJSONObject("15K");
                                if (jSONObject2 != null) {
                                    zA2 = a(jSONObject2.optString("ucf"), f.f2787a);
                                    zA3 = a(jSONObject2.optString("fsv2"), f.f2788b);
                                    zA4 = a(jSONObject2.optString("usc"), f.f2789c);
                                    str4 = str3;
                                    iOptInt = jSONObject2.optInt(str4, f.d);
                                    str5 = str2;
                                    zA5 = a(jSONObject2.optString(str5), f.e);
                                    iOptInt2 = jSONObject2.optInt("ustv", f.f);
                                    if (zA2 != f.f2787a) {
                                    }
                                    f.f2787a = zA2;
                                    f.f2788b = zA3;
                                    f.f2789c = zA4;
                                    f.d = iOptInt;
                                    f.e = zA5;
                                    f.f = iOptInt2;
                                    context2 = context;
                                    try {
                                        SharedPreferences.Editor editorA3 = ki.a(context2, "open_common");
                                        ki.a(editorA3, "ucf", f.f2787a);
                                        ki.a(editorA3, "fsv2", f.f2788b);
                                        ki.a(editorA3, "usc", f.f2789c);
                                        ki.a(editorA3, str4, f.d);
                                        ki.a(editorA3, str5, f.e);
                                        ki.a(editorA3, "ustv", f.f);
                                        ki.a(editorA3);
                                    } catch (Throwable unused) {
                                    }
                                } else {
                                    context2 = context;
                                }
                            } catch (Throwable th9) {
                                context2 = context;
                                js.a(th9, "AuthConfigManager", "load 15K");
                            }
                        } else {
                            context2 = context;
                        }
                        if (iy.a(jSONObject, "183")) {
                            try {
                                kw.a(ixVar, jSONObject.getJSONObject("183"));
                            } catch (Throwable th10) {
                                js.a(th10, "AuthConfigManager", "load 183");
                            }
                        }
                        if (iy.a(jSONObject, "17I")) {
                            try {
                                JSONObject jSONObject6 = jSONObject.getJSONObject("17I");
                                boolean zA11 = a(jSONObject6.optString("na"), false);
                                boolean zA12 = a(jSONObject6.optString("aa"), false);
                                jg.d = zA11;
                                jg.e = zA12;
                                SharedPreferences.Editor editorA4 = ki.a(context2, "open_common");
                                ki.a(editorA4, "a4", zA11);
                                ki.a(editorA4, "a5", zA12);
                                ki.a(editorA4);
                            } catch (Throwable th11) {
                                js.a(th11, "AuthConfigManager", "load 17I");
                            }
                        }
                        if (iy.a(jSONObject, "1A4")) {
                            try {
                                JSONObject jSONObject7 = jSONObject.getJSONObject("1A4");
                                String strOptString = jSONObject7.optString("ada");
                                boolean zA13 = a(strOptString, iz.f2849c);
                                long jOptLong = jSONObject7.optLong("iv", iz.f2847a);
                                iz.d = zA13;
                                iz.f2848b = jOptLong;
                                SharedPreferences.Editor editorA5 = ki.a(context2, "open_common");
                                ki.a(editorA5, "a16", strOptString);
                                ki.a(editorA5, "a17", jOptLong);
                                ki.a(editorA5);
                            } catch (Throwable th12) {
                                js.a(th12, "AuthConfigManager", "load 1A4");
                                return;
                            }
                        }
                    }
                }
            } catch (Throwable th13) {
                th = th13;
                str2 = "ust";
            }
        }
        if (iy.a(jSONObject, "15K")) {
            jSONObject2 = jSONObject.getJSONObject("15K");
            if (jSONObject2 != null) {
                zA2 = a(jSONObject2.optString("ucf"), f.f2787a);
                zA3 = a(jSONObject2.optString("fsv2"), f.f2788b);
                zA4 = a(jSONObject2.optString("usc"), f.f2789c);
                str4 = str3;
                iOptInt = jSONObject2.optInt(str4, f.d);
                str5 = str2;
                zA5 = a(jSONObject2.optString(str5), f.e);
                iOptInt2 = jSONObject2.optInt("ustv", f.f);
                if (zA2 != f.f2787a && zA3 == f.f2788b && zA4 == f.f2789c && iOptInt == f.d && zA5 == f.e && iOptInt2 == f.d) {
                    context2 = context;
                } else {
                    f.f2787a = zA2;
                    f.f2788b = zA3;
                    f.f2789c = zA4;
                    f.d = iOptInt;
                    f.e = zA5;
                    f.f = iOptInt2;
                    context2 = context;
                    SharedPreferences.Editor editorA6 = ki.a(context2, "open_common");
                    ki.a(editorA6, "ucf", f.f2787a);
                    ki.a(editorA6, "fsv2", f.f2788b);
                    ki.a(editorA6, "usc", f.f2789c);
                    ki.a(editorA6, str4, f.d);
                    ki.a(editorA6, str5, f.e);
                    ki.a(editorA6, "ustv", f.f);
                    ki.a(editorA6);
                }
            } else {
                context2 = context;
            }
        } else {
            context2 = context;
        }
        if (iy.a(jSONObject, "183")) {
            kw.a(ixVar, jSONObject.getJSONObject("183"));
        }
        if (iy.a(jSONObject, "17I")) {
            JSONObject jSONObject8 = jSONObject.getJSONObject("17I");
            boolean zA14 = a(jSONObject8.optString("na"), false);
            boolean zA15 = a(jSONObject8.optString("aa"), false);
            jg.d = zA14;
            jg.e = zA15;
            SharedPreferences.Editor editorA7 = ki.a(context2, "open_common");
            ki.a(editorA7, "a4", zA14);
            ki.a(editorA7, "a5", zA15);
            ki.a(editorA7);
        }
        if (iy.a(jSONObject, "1A4")) {
            JSONObject jSONObject9 = jSONObject.getJSONObject("1A4");
            String strOptString2 = jSONObject9.optString("ada");
            boolean zA16 = a(strOptString2, iz.f2849c);
            long jOptLong2 = jSONObject9.optLong("iv", iz.f2847a);
            iz.d = zA16;
            iz.f2848b = jOptLong2;
            SharedPreferences.Editor editorA8 = ki.a(context2, "open_common");
            ki.a(editorA8, "a16", strOptString2);
            ki.a(editorA8, "a17", jOptLong2);
            ki.a(editorA8);
        }
    }

    private static void a(Context context, ix ixVar, Throwable th) {
        a(context, ixVar, th.getMessage());
    }

    public static void a(String str, boolean z2, boolean z3, boolean z4) {
        if (TextUtils.isEmpty(str) || f2770c == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("url", str);
        map.put("downLevel", String.valueOf(z2));
        map.put("ant", ip.j(f2770c) == 0 ? "0" : "1");
        if (z4) {
            map.put("type", z2 ? m : n);
        } else {
            map.put("type", z2 ? k : l);
        }
        map.put("status", z3 ? "0" : "1");
        String string = new JSONObject(map).toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            li liVar = new li(f2770c, "core", "2.0", "O002");
            liVar.a(string);
            lj.a(liVar, f2770c);
        } catch (ik unused) {
        }
    }

    public static void a(kx.c cVar) {
        if (cVar == null || f2770c == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("serverip", cVar.f3011c);
        map.put("hostname", cVar.e);
        map.put(BleConstants.KEY_PATH, cVar.d);
        map.put("csid", cVar.f3009a);
        map.put("degrade", String.valueOf(cVar.f3010b.a()));
        map.put(OpAnalyticsConstants.ERROR_CODE, String.valueOf(cVar.m));
        map.put("errorsubcode", String.valueOf(cVar.n));
        map.put("connecttime", String.valueOf(cVar.h));
        map.put("writetime", String.valueOf(cVar.i));
        map.put("readtime", String.valueOf(cVar.j));
        map.put("datasize", String.valueOf(cVar.l));
        map.put("totaltime", String.valueOf(cVar.f));
        String string = new JSONObject(map).toString();
        "--埋点--".concat(String.valueOf(string));
        kx.b();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            li liVar = new li(f2770c, "core", "2.0", "O008");
            liVar.a(string);
            lj.a(liVar, f2770c);
        } catch (ik unused) {
        }
    }

    private static void a(Context context, ix ixVar, String str) {
        HashMap map = new HashMap();
        map.put("amap_sdk_auth_fail", "1");
        map.put("amap_sdk_auth_fail_type", str);
        map.put("amap_sdk_name", ixVar.a());
        map.put("amap_sdk_version", ixVar.c());
        String string = new JSONObject(map).toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            li liVar = new li(context, "core", "2.0", "O001");
            liVar.a(string);
            lj.a(liVar, context);
        } catch (ik unused) {
        }
    }

    static final class c extends ku {
        private String h;
        private Map<String, String> i;
        private String j;
        private String k;
        private String l;

        @Override // com.amap.api.col.p0003sl.ku
        public final byte[] c() {
            return null;
        }

        c(Context context, ix ixVar, String str, Map<String, String> map, String str2, String str3, String str4) {
            super(context, ixVar);
            this.h = str;
            this.i = map;
            this.j = str2;
            this.k = str3;
            this.l = str4;
            setHttpProtocol(la.c.HTTPS);
            setDegradeAbility(la.a.FIX);
        }

        @Override // com.amap.api.col.p0003sl.la
        public final Map<String, String> getRequestHead() {
            if (TextUtils.isEmpty(this.l)) {
                return null;
            }
            HashMap map = new HashMap();
            map.put("host", this.l);
            return map;
        }

        @Override // com.amap.api.col.p0003sl.la
        public final String getURL() {
            return a("https://restsdk.amap.com/v3/iasdkauth", this.j);
        }

        @Override // com.amap.api.col.p0003sl.is, com.amap.api.col.p0003sl.la
        public final String getIPV6URL() {
            return a("https://dualstack-arestapi.amap.com/v3/iasdkauth", this.k);
        }

        private static String a(String str, String str2) {
            try {
                return !TextUtils.isEmpty(str2) ? Uri.parse(str).buildUpon().encodedAuthority(str2).build().toString() : str;
            } catch (Throwable unused) {
                return str;
            }
        }

        @Override // com.amap.api.col.p0003sl.ku
        protected final String e() {
            return "3.0";
        }

        @Override // com.amap.api.col.p0003sl.la
        protected final String getIPDNSName() {
            if (!TextUtils.isEmpty(this.l)) {
                return this.l;
            }
            return super.getIPDNSName();
        }

        @Override // com.amap.api.col.p0003sl.ku
        public final byte[] d() {
            String strP = ip.p(this.f2986a);
            if (!TextUtils.isEmpty(strP)) {
                strP = it.b(new StringBuilder(strP).reverse().toString());
            }
            HashMap map = new HashMap();
            map.put("authkey", TextUtils.isEmpty(this.h) ? "" : this.h);
            map.put("plattype", OsType.ANDROID);
            map.put("ccver", "1");
            map.put(com.huawei.hwcloudjs.a.d, this.f2987b.a());
            map.put("version", this.f2987b.b());
            map.put("output", "json");
            StringBuilder sb = new StringBuilder();
            sb.append(Build.VERSION.SDK_INT);
            map.put("androidversion", sb.toString());
            map.put("deviceId", strP);
            map.put("manufacture", Build.MANUFACTURER);
            Map<String, String> map2 = this.i;
            if (map2 != null && !map2.isEmpty()) {
                map.putAll(this.i);
            }
            map.put("abitype", iy.a(this.f2986a));
            map.put("ext", this.f2987b.d());
            return iy.a(iy.a(map));
        }
    }

    public static boolean a() {
        e eVarA;
        if (f2770c != null) {
            i();
            if (!c()) {
                return false;
            }
            if (b()) {
                return true;
            }
        }
        return o && (eVarA = a(f2770c, "IPV6_CONFIG_NAME", "open_common")) != null && eVarA.a() < 5;
    }

    private static boolean a(InetAddress inetAddress) {
        return inetAddress.isLoopbackAddress() || inetAddress.isLinkLocalAddress() || inetAddress.isAnyLocalAddress();
    }

    private static void i() {
        try {
            Context context = f2770c;
            if (context != null) {
                String strO = ip.o(context);
                if (!TextUtils.isEmpty(r) && !TextUtils.isEmpty(strO) && r.equals(strO) && System.currentTimeMillis() - s < 60000) {
                    return;
                }
                if (!TextUtils.isEmpty(strO)) {
                    r = strO;
                }
            } else if (System.currentTimeMillis() - s < 10000) {
                return;
            }
            s = System.currentTimeMillis();
            q.clear();
            if (AMapUtilCoreApi.getCollectIPEnable()) {
                for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                    if (!networkInterface.getInterfaceAddresses().isEmpty()) {
                        String displayName = networkInterface.getDisplayName();
                        Iterator<InterfaceAddress> it = networkInterface.getInterfaceAddresses().iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            InetAddress address = it.next().getAddress();
                            if (address instanceof Inet6Address) {
                                if (!a((Inet6Address) address)) {
                                    i2 |= 2;
                                }
                            } else if (address instanceof Inet4Address) {
                                Inet4Address inet4Address = (Inet4Address) address;
                                if (!a(inet4Address) && !inet4Address.getHostAddress().startsWith(iy.c("FMTkyLjE2OC40My4"))) {
                                    i2 |= 1;
                                }
                            }
                        }
                        if (i2 != 0) {
                            if (displayName != null && displayName.startsWith("wlan")) {
                                q.put(WifiDeviceUtils.NETWORKINFO_TYPE_NAME, Integer.valueOf(i2));
                            } else if (displayName != null && displayName.startsWith("rmnet")) {
                                q.put("MOBILE", Integer.valueOf(i2));
                            }
                        }
                    }
                }
                return;
            }
            q.put(WifiDeviceUtils.NETWORKINFO_TYPE_NAME, 3);
            q.put("MOBILE", 3);
        } catch (Throwable th) {
            js.a(th, "at", "ipstack");
        }
    }

    public static boolean b() {
        Integer num;
        Context context = f2770c;
        if (context == null) {
            return false;
        }
        String strO = ip.o(context);
        return (TextUtils.isEmpty(strO) || (num = q.get(strO.toUpperCase())) == null || num.intValue() != 2) ? false : true;
    }

    public static boolean c() {
        Integer num;
        Context context = f2770c;
        if (context == null) {
            return false;
        }
        String strO = ip.o(context);
        return (TextUtils.isEmpty(strO) || (num = q.get(strO.toUpperCase())) == null || num.intValue() < 2) ? false : true;
    }

    public static void d() {
        try {
            e eVarA = a(f2770c, "IPV6_CONFIG_NAME", "open_common");
            String strA = iy.a(System.currentTimeMillis(), "yyyyMMdd");
            if (!strA.equals(eVarA.f2785b)) {
                eVarA.a(strA);
                eVarA.f2786c.set(0);
            }
            eVarA.f2786c.incrementAndGet();
            a(f2770c, "IPV6_CONFIG_NAME", "open_common", eVarA);
        } catch (Throwable unused) {
        }
    }

    public static void b(Context context) {
        if (context == null) {
            return;
        }
        o = ki.a(context, "open_common", "a2", true);
    }

    private static void c(Context context) {
        if (context == null) {
            return;
        }
        f = ki.a(context, "open_common", "a13", true);
        h = ki.a(context, "open_common", "a6", true);
        g = ki.a(context, "open_common", "a7", false);
        e = ki.a(context, "open_common", "a8", 5000);
        y = ki.a(context, "open_common", "a9", 3);
        i = ki.a(context, "open_common", "a10", false);
        z = ki.a(context, "open_common", "a11", 3);
        j = ki.a(context, "open_common", "a12", false);
    }

    private static void a(Context context, String str, String str2, e eVar) {
        if (eVar == null || TextUtils.isEmpty(eVar.f2784a)) {
            return;
        }
        String strB = eVar.b();
        if (TextUtils.isEmpty(strB) || context == null) {
            return;
        }
        SharedPreferences.Editor editorA = ki.a(context, str2);
        editorA.putString(str, strB);
        ki.a(editorA);
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f2784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f2785b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private AtomicInteger f2786c;

        public e(String str, String str2, int i) {
            this.f2784a = str;
            this.f2785b = str2;
            this.f2786c = new AtomicInteger(i);
        }

        public final void a(String str) {
            this.f2785b = str;
        }

        public final int a() {
            AtomicInteger atomicInteger = this.f2786c;
            if (atomicInteger == null) {
                return 0;
            }
            return atomicInteger.get();
        }

        public final String b() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("a", this.f2784a);
                jSONObject.put("f", this.f2785b);
                jSONObject.put("h", this.f2786c.get());
                return jSONObject.toString();
            } catch (Throwable unused) {
                return "";
            }
        }

        public static e b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new e(jSONObject.optString("a"), jSONObject.optString("f"), jSONObject.optInt("h"));
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public static void e() {
        if (d) {
            return;
        }
        try {
            Context context = f2770c;
            if (context == null) {
                return;
            }
            d = true;
            ir.a().a(context);
            b(context);
            c(context);
            f.f2787a = ki.a(context, "open_common", "ucf", f.f2787a);
            f.f2788b = ki.a(context, "open_common", "fsv2", f.f2788b);
            f.f2789c = ki.a(context, "open_common", "usc", f.f2789c);
            f.d = ki.a(context, "open_common", "umv", f.d);
            f.e = ki.a(context, "open_common", "ust", f.e);
            f.f = ki.a(context, "open_common", "ustv", f.f);
        } catch (Throwable unused) {
        }
    }

    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ix f2781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f2782b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        a f2783c;

        private d() {
        }

        /* synthetic */ d(byte b2) {
            this();
        }
    }

    public static String a(String str) {
        d dVar;
        if (!v.containsKey(str) || (dVar = v.get(str)) == null) {
            return null;
        }
        return dVar.f2782b;
    }

    public static ix b(String str) {
        d dVar = v.get(str);
        if (dVar != null) {
            return dVar.f2781a;
        }
        return null;
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return str + ";15K;16H;17I;1A4;17S;183";
    }

    public static void a(Context context, ix ixVar, String str, a aVar) {
        synchronized (im.class) {
            if (context == null || ixVar == null) {
                return;
            }
            try {
                if (f2770c == null) {
                    f2770c = context.getApplicationContext();
                }
                String strA = ixVar.a();
                if (TextUtils.isEmpty(strA)) {
                    return;
                }
                a(ixVar);
                if (v == null) {
                    v = new ConcurrentHashMap<>(8);
                }
                if (u == null) {
                    u = new ConcurrentHashMap<>(8);
                }
                if (t == null) {
                    t = new ConcurrentHashMap<>(8);
                }
                if (!v.containsKey(strA)) {
                    d dVar = new d((byte) 0);
                    dVar.f2781a = ixVar;
                    dVar.f2782b = str;
                    dVar.f2783c = aVar;
                    v.put(strA, dVar);
                    t.put(strA, new g(Long.valueOf(ki.a(f2770c, "open_common", strA, 0L)), ki.b(f2770c, "open_common", strA + "lct-info", "")));
                    d(f2770c);
                    e(f2770c);
                }
            } catch (Throwable th) {
                js.a(th, "at", "rglc");
            }
        }
    }

    public static boolean a(String str, long j2) {
        synchronized (im.class) {
            boolean z2 = false;
            try {
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                g gVarF = f(str);
                long jLongValue = 0;
                if (j2 != (gVarF != null ? gVarF.f2790a : 0L)) {
                    if (u != null && u.containsKey(str)) {
                        jLongValue = u.get(str).longValue();
                    }
                    if (SystemClock.elapsedRealtime() - jLongValue > 30000) {
                        z2 = true;
                    }
                }
            } catch (Throwable unused) {
            }
            return z2;
        }
    }

    public static void b(String str, boolean z2) {
        synchronized (im.class) {
            a(str, z2, (String) null, (String) null, (String) null);
        }
    }

    public static void a(final String str, boolean z2, final String str2, final String str3, final String str4) {
        synchronized (im.class) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (u == null) {
                    u = new ConcurrentHashMap<>(8);
                }
                u.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
                if (v == null) {
                    return;
                }
                if (v.containsKey(str)) {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    if (z2) {
                        kw.a(true, str);
                    }
                    ma.a().a(new mb() { // from class: com.amap.api.col.3sl.im.1
                        @Override // com.amap.api.col.p0003sl.mb
                        public final void runTask() {
                            d dVar = (d) im.v.get(str);
                            if (dVar == null) {
                                return;
                            }
                            a aVar = dVar.f2783c;
                            b bVarA = im.a(im.f2770c, dVar.f2781a, dVar.f2782b, str2, str3, str4);
                            if (bVarA == null || aVar == null) {
                                return;
                            }
                            aVar.a(bVarA);
                        }
                    });
                }
            } catch (Throwable th) {
                js.a(th, "at", "lca");
            }
        }
    }

    public static boolean d(String str) {
        synchronized (im.class) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                if (v == null) {
                    return false;
                }
                if (u == null) {
                    u = new ConcurrentHashMap<>(8);
                }
                if (v.containsKey(str) && !u.containsKey(str)) {
                    u.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
                    return true;
                }
            } catch (Throwable th) {
                js.a(th, "at", "cslct");
            }
            return false;
        }
    }

    public static void e(String str) {
        synchronized (im.class) {
            if (u == null) {
                return;
            }
            if (u.containsKey(str)) {
                u.remove(str);
            }
        }
    }

    public static g f(String str) {
        synchronized (im.class) {
            try {
                if (t == null) {
                    t = new ConcurrentHashMap<>(8);
                }
                if (t.containsKey(str)) {
                    return t.get(str);
                }
                return new g(0L, "");
            } catch (Throwable th) {
                js.a(th, "at", "glcut");
            }
            throw th;
        }
    }

    private static void a(String str, long j2, String str2) {
        synchronized (im.class) {
            try {
                if (v != null && v.containsKey(str)) {
                    if (t == null) {
                        t = new ConcurrentHashMap<>(8);
                    }
                    t.put(str, new g(Long.valueOf(j2), str2));
                    Context context = f2770c;
                    if (context != null) {
                        SharedPreferences.Editor editorA = ki.a(context, "open_common");
                        ki.a(editorA, str, j2);
                        ki.a(editorA, str + "lct-info", str2);
                        ki.a(editorA);
                    }
                }
            } catch (Throwable th) {
                js.a(th, "at", "ucut");
            }
        }
    }

    private static void a(ix ixVar) {
        if (ixVar != null) {
            try {
                if (TextUtils.isEmpty(ixVar.a())) {
                    return;
                }
                String strC = ixVar.c();
                if (TextUtils.isEmpty(strC)) {
                    strC = ixVar.b();
                }
                if (TextUtils.isEmpty(strC)) {
                    return;
                }
                jg.a(ixVar.a(), strC);
            } catch (Throwable unused) {
            }
        }
    }

    private static void d(Context context) {
        try {
            if (w) {
                return;
            }
            jg.d = ki.a(context, "open_common", "a4", true);
            jg.e = ki.a(context, "open_common", "a5", true);
            w = true;
        } catch (Throwable unused) {
        }
    }

    private static void e(Context context) {
        try {
            if (x) {
                return;
            }
            iz.d = a(ki.b(context, "open_common", "a16", ""), true);
            iz.f2848b = ki.a(context, "open_common", "a17", iz.f2847a);
            x = true;
        } catch (Throwable unused) {
        }
    }

    public static void a(boolean z2, String str) {
        try {
            "--markHostNameFailed---hostname=".concat(String.valueOf(str));
            kx.b();
            if (f || z2) {
                if ((i || !z2) && !TextUtils.isEmpty(str)) {
                    if (!z2) {
                        if (A.get(str) != null) {
                            return;
                        }
                        A.put(str, Boolean.TRUE);
                        a(b(str, "a14"), "open_common");
                        return;
                    }
                    if (B.get(str) != null) {
                        return;
                    }
                    B.put(str, Boolean.TRUE);
                    a(b(str, "a15"), "open_common");
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static void a(String str, String str2) {
        e eVarA = a(f2770c, str, str2);
        String strA = iy.a(System.currentTimeMillis(), "yyyyMMdd");
        if (!strA.equals(eVarA.f2785b)) {
            eVarA.a(strA);
            eVarA.f2786c.set(0);
        }
        eVarA.f2786c.incrementAndGet();
        a(f2770c, str, str2, eVarA);
    }

    public static boolean g(String str) {
        Context context;
        e eVarA;
        try {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            return f && A.get(str) == null && ((context = f2770c) == null || (eVarA = a(context, b(str, "a14"), "open_common")) == null || eVarA.a() < y);
        } catch (Throwable unused) {
            return true;
        }
    }

    public static boolean h(String str) {
        Context context;
        e eVarA;
        try {
            return !TextUtils.isEmpty(str) && i && B.get(str) == null && ((context = f2770c) == null || (eVarA = a(context, b(str, "a15"), "open_common")) == null || eVarA.a() < z);
        } catch (Throwable unused) {
        }
    }

    private static String b(String str, String str2) {
        return str2 + "_" + it.a(str.getBytes());
    }

    public static void b(kx.c cVar) {
        synchronized (C) {
            boolean z2 = false;
            for (int i2 = 0; i2 < C.size(); i2++) {
                kx.a aVar = C.get(i2);
                if (cVar.f3011c.equals(aVar.f3005b) && cVar.d.equals(aVar.e) && cVar.m == aVar.f) {
                    if (aVar.f == 1) {
                        aVar.i = ((((long) aVar.j.get()) * aVar.i) + cVar.f) / ((long) (aVar.j.get() + 1));
                    }
                    aVar.j.getAndIncrement();
                    z2 = true;
                }
            }
            if (!z2) {
                C.add(new kx.a(cVar));
            }
            kx.b();
        }
    }

    public static kx.a f() {
        if (D) {
            return null;
        }
        synchronized (C) {
            if (D) {
                return null;
            }
            Collections.sort(C);
            if (C.size() <= 0) {
                return null;
            }
            kx.a aVarClone = C.get(0).clone();
            D = true;
            return aVarClone;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e A[Catch: all -> 0x0086, LOOP:0: B:23:0x0068->B:25:0x006e, LOOP_END, TryCatch #0 {, blocks: (B:9:0x000d, B:10:0x0013, B:12:0x0019, B:14:0x0029, B:16:0x0033, B:18:0x0039, B:20:0x003f, B:21:0x0046, B:22:0x005c, B:23:0x0068, B:25:0x006e, B:26:0x0081, B:27:0x0084), top: B:33:0x000d }] */
    public static void a(boolean z2, kx.a aVar) {
        if (!D || aVar == null) {
            return;
        }
        synchronized (C) {
            if (z2) {
                Iterator<kx.a> it = C.iterator();
                while (it.hasNext()) {
                    kx.a next = it.next();
                    if (next.f3005b.equals(aVar.f3005b) && next.e.equals(aVar.e) && next.f == aVar.f) {
                        if (next.j == aVar.j) {
                            it.remove();
                            kx.b();
                        } else {
                            next.j.set(next.j.get() - aVar.j.get());
                            kx.b();
                        }
                    }
                }
                D = false;
                kx.b();
                for (kx.a aVar2 : C) {
                    String str = aVar2.e;
                    Objects.toString(aVar2.j);
                    int i2 = aVar2.f;
                    kx.b();
                }
                kx.b();
            } else {
                D = false;
                kx.b();
                while (r4.hasNext()) {
                    String str2 = aVar2.e;
                    Objects.toString(aVar2.j);
                    int i3 = aVar2.f;
                    kx.b();
                }
                kx.b();
            }
            throw th;
        }
    }

    public static void c(kx.c cVar) {
        if (cVar != null && j) {
            synchronized (E) {
                E.offer(cVar);
                kx.b();
            }
        }
    }

    public static kx.c g() {
        synchronized (E) {
            kx.c cVarPoll = E.poll();
            if (cVarPoll != null) {
                return cVarPoll;
            }
            return null;
        }
    }

    private static e a(Context context, String str, String str2) {
        e eVar;
        synchronized (im.class) {
            if (!TextUtils.isEmpty(str)) {
                int i2 = 0;
                while (true) {
                    if (i2 >= p.size()) {
                        eVar = null;
                        break;
                    }
                    eVar = p.get(i2);
                    if (eVar != null && str.equals(eVar.f2784a)) {
                        break;
                    }
                    i2++;
                }
            } else {
                eVar = null;
                break;
            }
            if (eVar != null) {
                return eVar;
            }
            if (context == null) {
                return null;
            }
            e eVarB = e.b(ki.b(context, str2, str, ""));
            String strA = iy.a(System.currentTimeMillis(), "yyyyMMdd");
            if (eVarB == null) {
                eVarB = new e(str, strA, 0);
            }
            if (!strA.equals(eVarB.f2785b)) {
                eVarB.a(strA);
                eVarB.f2786c.set(0);
            }
            p.add(eVarB);
            return eVarB;
        }
    }
}
