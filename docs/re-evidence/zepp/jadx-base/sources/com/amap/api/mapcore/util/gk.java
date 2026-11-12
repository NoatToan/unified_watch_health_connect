package com.amap.api.mapcore.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.amap.api.maps.AMapException;
import com.xmlywind.sdk.common.Constants;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
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
import org.cybergarage.upnp.UPnP;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class gk {
    private static volatile boolean C = false;
    public static int a = -1;
    public static String b = "";
    public static Context c = null;
    private static String k = "6";
    private static String l = "4";
    private static String m = "9";
    private static String n = "8";
    private static volatile boolean o = true;
    private static Vector<d> p = new Vector<>();
    private static Map<String, Integer> q = new HashMap();
    private static String r = null;
    private static long s = 0;
    public static volatile boolean d = false;
    private static volatile ConcurrentHashMap<String, Long> t = new ConcurrentHashMap<>(8);
    private static volatile ConcurrentHashMap<String, Long> u = new ConcurrentHashMap<>(8);
    private static volatile ConcurrentHashMap<String, c> v = new ConcurrentHashMap<>(8);
    private static boolean w = false;
    public static int e = 5000;
    public static boolean f = true;
    public static boolean g = false;
    private static int x = 3;
    public static boolean h = true;
    public static boolean i = false;
    private static int y = 3;
    public static boolean j = false;
    private static ConcurrentHashMap<String, Boolean> z = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, Boolean> A = new ConcurrentHashMap<>();
    private static ArrayList<io.a> B = new ArrayList<>();
    private static Queue<io.c> D = new LinkedList();

    public static class a {

        @Deprecated
        public JSONObject a;

        @Deprecated
        public JSONObject b;
        public String c;
        public int d = -1;
        public long e = 0;
        public JSONObject f;
        public C0107a g;
        public b h;
        private boolean i;

        /* JADX INFO: renamed from: com.amap.api.mapcore.util.gk$a$a, reason: collision with other inner class name */
        public static class C0107a {
            public boolean a;
            public boolean b;
            public JSONObject c;
        }

        public static class b {
            public boolean a;
        }
    }

    public static class b extends il {
        private String g;
        private Map<String, String> h;
        private String i;
        private String j;
        private String k;

        public b(Context context, gt gtVar, String str, Map<String, String> map, String str2, String str3, String str4) {
            super(context, gtVar);
            this.g = str;
            this.h = map;
            this.i = str2;
            this.j = str3;
            this.k = str4;
            setHttpProtocol(ir.c.HTTPS);
            setDegradeAbility(ir.a.FIX);
        }

        private static String a(String str, String str2) {
            try {
                return !TextUtils.isEmpty(str2) ? Uri.parse(str).buildUpon().encodedAuthority(str2).build().toString() : str;
            } catch (Throwable unused) {
                return str;
            }
        }

        @Override // com.amap.api.mapcore.util.il
        public final byte[] d() {
            return null;
        }

        @Override // com.amap.api.mapcore.util.il
        public final byte[] e() {
            String strT = gn.t(((il) this).e);
            if (!TextUtils.isEmpty(strT)) {
                strT = gr.b(new StringBuilder(strT).reverse().toString());
            }
            HashMap map = new HashMap();
            map.put("authkey", TextUtils.isEmpty(this.g) ? "" : this.g);
            map.put("plattype", "android");
            map.put("product", ((il) this).f.a());
            map.put("version", ((il) this).f.b());
            map.put("output", "json");
            StringBuilder sb = new StringBuilder();
            sb.append(Build.VERSION.SDK_INT);
            map.put("androidversion", sb.toString());
            map.put("deviceId", strT);
            map.put("manufacture", Build.MANUFACTURER);
            Map<String, String> map2 = this.h;
            if (map2 != null && !map2.isEmpty()) {
                map.putAll(this.h);
            }
            map.put("abitype", gu.a(((il) this).e));
            map.put(Constants.EXT, ((il) this).f.e());
            return gu.a(gu.a(map));
        }

        @Override // com.amap.api.mapcore.util.il
        public final String f() {
            return UPnP.VERSION;
        }

        @Override // com.amap.api.mapcore.util.ir
        public final String getIPDNSName() {
            return !TextUtils.isEmpty(this.k) ? this.k : super.getIPDNSName();
        }

        @Override // com.amap.api.mapcore.util.gq, com.amap.api.mapcore.util.ir
        public final String getIPV6URL() {
            return a("https://dualstack-arestapi.amap.com/v3/iasdkauth", this.j);
        }

        @Override // com.amap.api.mapcore.util.ir
        public final Map<String, String> getRequestHead() {
            if (TextUtils.isEmpty(this.k)) {
                return null;
            }
            HashMap map = new HashMap();
            map.put("host", this.k);
            return map;
        }

        @Override // com.amap.api.mapcore.util.ir
        public final String getURL() {
            return a("https://restsdk.amap.com/v3/iasdkauth", this.i);
        }
    }

    public static class c {
        public gt a;
        public String b;

        private c() {
        }
    }

    public static class d {
        private String a;
        private String b;
        private AtomicInteger c;

        public d(String str, String str2, int i) {
            this.a = str;
            this.b = str2;
            this.c = new AtomicInteger(i);
        }

        public final void a(String str) {
            this.b = str;
        }

        public final String b() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("a", this.a);
                jSONObject.put("f", this.b);
                jSONObject.put("h", this.c.get());
                return jSONObject.toString();
            } catch (Throwable unused) {
                return "";
            }
        }

        public final int a() {
            AtomicInteger atomicInteger = this.c;
            if (atomicInteger == null) {
                return 0;
            }
            return atomicInteger.get();
        }

        public static d b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new d(jSONObject.optString("a"), jSONObject.optString("f"), jSONObject.optInt("h"));
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public static class e {
        public static boolean a = true;
        public static boolean b = false;
        public static boolean c = true;
        public static int d = 0;
        public static boolean e = false;
        public static int f;
    }

    public static void a(Context context, String str) {
        gj.a(context, str);
    }

    public static boolean b() {
        Integer num;
        Context context = c;
        if (context == null) {
            return false;
        }
        String strS = gn.s(context);
        return (TextUtils.isEmpty(strS) || (num = q.get(strS.toUpperCase())) == null || num.intValue() < 2) ? false : true;
    }

    private static void c(Context context) {
        if (context == null) {
            return;
        }
        f = hp.a(context, "open_common", "a13", true);
        h = hp.a(context, "open_common", "a6", true);
        g = hp.a(context, "open_common", "a7", false);
        e = hp.a(context, "open_common", "a8", 5000);
        x = hp.a(context, "open_common", "a9", 3);
        i = hp.a(context, "open_common", "a10", false);
        y = hp.a(context, "open_common", "a11", 3);
        j = hp.a(context, "open_common", "a12", false);
    }

    public static void d() {
        if (d) {
            return;
        }
        try {
            Context context = c;
            if (context == null) {
                return;
            }
            d = true;
            gp.a.a.a(context);
            b(context);
            c(context);
            e.a = hp.a(context, "open_common", "ucf", e.a);
            e.b = hp.a(context, "open_common", "fsv2", e.b);
            e.c = hp.a(context, "open_common", "usc", e.c);
            e.d = hp.a(context, "open_common", "umv", e.d);
            e.e = hp.a(context, "open_common", "ust", e.e);
            e.f = hp.a(context, "open_common", "ustv", e.f);
        } catch (Throwable unused) {
        }
    }

    public static boolean e(String str) {
        d dVarA;
        try {
            if (TextUtils.isEmpty(str) || !i) {
                return false;
            }
            if (!(A.get(str) == null)) {
                return false;
            }
            Context context = c;
            if (context == null || (dVarA = a(context, b(str, "a15"), "open_common")) == null || dVarA.a() < y) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static io.c f() {
        synchronized (D) {
            io.c cVarPoll = D.poll();
            if (cVarPoll != null) {
                return cVarPoll;
            }
            return null;
        }
    }

    public static boolean a(String str, boolean z2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return z2;
            }
            String[] strArrSplit = URLDecoder.decode(str).split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
            return strArrSplit[strArrSplit.length - 1].charAt(4) % 2 == 1;
        } catch (Throwable unused) {
            return z2;
        }
    }

    private static void b(Context context) {
        if (context == null) {
            return;
        }
        o = hp.a(context, "open_common", "a2", true);
    }

    public static synchronized void b(String str, boolean z2) {
        a(str, z2, (String) null, (String) null, (String) null);
    }

    public static io.a e() {
        if (C) {
            return null;
        }
        synchronized (B) {
            if (C) {
                return null;
            }
            Collections.sort(B);
            if (B.size() <= 0) {
                return null;
            }
            io.a aVarA = B.get(0).clone();
            C = true;
            return aVarA;
        }
    }

    public static a a(Context context, gt gtVar, String str, String str2, String str3, String str4) {
        return a(context, gtVar, str, null, str2, str3, str4);
    }

    public static synchronized void b(String str) {
        if (u == null) {
            return;
        }
        if (u.containsKey(str)) {
            u.remove(str);
        }
    }

    public static synchronized long c(String str) {
        try {
            if (t == null) {
                t = new ConcurrentHashMap<>(8);
            }
            if (t.containsKey(str)) {
                return t.get(str).longValue();
            }
        } catch (Throwable th) {
            hk.a(th, "at", "glcut");
        }
        return 0L;
    }

    public static void a(Context context) {
        if (context != null) {
            c = context.getApplicationContext();
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x020c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:109:0x020d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0213  */
    /* JADX WARN: Code duplicated, block: B:114:0x021f  */
    /* JADX WARN: Code duplicated, block: B:117:0x022f A[Catch: all -> 0x02ca, TryCatch #17 {all -> 0x02ca, blocks: (B:115:0x0224, B:117:0x022f, B:119:0x0236, B:142:0x0292, B:144:0x029a, B:141:0x028f, B:123:0x0241, B:125:0x024a, B:127:0x0258, B:128:0x025e, B:130:0x0268, B:131:0x026c, B:133:0x027a, B:136:0x0281, B:138:0x0287), top: B:162:0x0224, inners: #19 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0236 A[Catch: all -> 0x02ca, TryCatch #17 {all -> 0x02ca, blocks: (B:115:0x0224, B:117:0x022f, B:119:0x0236, B:142:0x0292, B:144:0x029a, B:141:0x028f, B:123:0x0241, B:125:0x024a, B:127:0x0258, B:128:0x025e, B:130:0x0268, B:131:0x026c, B:133:0x027a, B:136:0x0281, B:138:0x0287), top: B:162:0x0224, inners: #19 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0239  */
    /* JADX WARN: Code duplicated, block: B:121:0x023b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0241 A[Catch: all -> 0x02ca, TryCatch #17 {all -> 0x02ca, blocks: (B:115:0x0224, B:117:0x022f, B:119:0x0236, B:142:0x0292, B:144:0x029a, B:141:0x028f, B:123:0x0241, B:125:0x024a, B:127:0x0258, B:128:0x025e, B:130:0x0268, B:131:0x026c, B:133:0x027a, B:136:0x0281, B:138:0x0287), top: B:162:0x0224, inners: #19 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0248  */
    /* JADX WARN: Code duplicated, block: B:127:0x0258 A[Catch: all -> 0x02ca, TryCatch #17 {all -> 0x02ca, blocks: (B:115:0x0224, B:117:0x022f, B:119:0x0236, B:142:0x0292, B:144:0x029a, B:141:0x028f, B:123:0x0241, B:125:0x024a, B:127:0x0258, B:128:0x025e, B:130:0x0268, B:131:0x026c, B:133:0x027a, B:136:0x0281, B:138:0x0287), top: B:162:0x0224, inners: #19 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x0268 A[Catch: all -> 0x02ca, TryCatch #17 {all -> 0x02ca, blocks: (B:115:0x0224, B:117:0x022f, B:119:0x0236, B:142:0x0292, B:144:0x029a, B:141:0x028f, B:123:0x0241, B:125:0x024a, B:127:0x0258, B:128:0x025e, B:130:0x0268, B:131:0x026c, B:133:0x027a, B:136:0x0281, B:138:0x0287), top: B:162:0x0224, inners: #19 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x027a A[Catch: all -> 0x02ca, TRY_LEAVE, TryCatch #17 {all -> 0x02ca, blocks: (B:115:0x0224, B:117:0x022f, B:119:0x0236, B:142:0x0292, B:144:0x029a, B:141:0x028f, B:123:0x0241, B:125:0x024a, B:127:0x0258, B:128:0x025e, B:130:0x0268, B:131:0x026c, B:133:0x027a, B:136:0x0281, B:138:0x0287), top: B:162:0x0224, inners: #19 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x0287 A[Catch: all -> 0x028e, TRY_LEAVE, TryCatch #19 {all -> 0x028e, blocks: (B:136:0x0281, B:138:0x0287), top: B:166:0x0281, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x029a A[Catch: all -> 0x02ca, TRY_LEAVE, TryCatch #17 {all -> 0x02ca, blocks: (B:115:0x0224, B:117:0x022f, B:119:0x0236, B:142:0x0292, B:144:0x029a, B:141:0x028f, B:123:0x0241, B:125:0x024a, B:127:0x0258, B:128:0x025e, B:130:0x0268, B:131:0x026c, B:133:0x027a, B:136:0x0281, B:138:0x0287), top: B:162:0x0224, inners: #19 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x02be A[Catch: all -> 0x02ce, TryCatch #18 {all -> 0x02ce, blocks: (B:145:0x02a1, B:147:0x02be, B:148:0x02c4), top: B:164:0x02a1 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x02c4 A[Catch: all -> 0x02ce, TRY_LEAVE, TryCatch #18 {all -> 0x02ce, blocks: (B:145:0x02a1, B:147:0x02be, B:148:0x02c4), top: B:164:0x02a1 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10, types: [com.amap.api.mapcore.util.gk$a] */
    /* JADX WARN: Type inference failed for: r13v16, types: [com.amap.api.mapcore.util.gk$a] */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [com.amap.api.mapcore.util.gk$a] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.String] */
    private static a a(Context context, gt gtVar, String str, Map<String, String> map, String str2, String str3, String str4) {
        ?? IsEmpty;
        String str5;
        String str6;
        String str7;
        String str8;
        ?? string;
        is isVarB;
        byte[] bArr;
        ?? r18;
        ?? r13;
        ?? r7;
        String str9;
        JSONObject jSONObject;
        int i2;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        JSONObject jSONObject2;
        boolean zA;
        List<String> list;
        String str15 = "infocode";
        ?? r14 = "result";
        String str16 = "ver";
        a aVar = new a();
        aVar.f = new JSONObject();
        if (context != null) {
            c = context.getApplicationContext();
        }
        d();
        if (gtVar != null) {
            try {
                if (!TextUtils.isEmpty(gtVar.a())) {
                    String strC = gtVar.c();
                    if (TextUtils.isEmpty(strC)) {
                        strC = gtVar.b();
                    }
                    IsEmpty = TextUtils.isEmpty(strC);
                    if (IsEmpty == 0) {
                        IsEmpty = gtVar.a();
                        hj.a(IsEmpty, strC);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        String strA = null;
        try {
            new ik();
            boolean zIsEmpty = TextUtils.isEmpty(str);
            try {
                if (zIsEmpty) {
                    string = str;
                } else {
                    try {
                        StringBuilder sb = new StringBuilder();
                        try {
                            sb.append(str);
                            sb.append(";15K;16H;17I;17S;183");
                            string = sb.toString();
                        } catch (gi e2) {
                            e = e2;
                            throw e;
                        } catch (Throwable unused2) {
                            throw new gi(AMapException.ERROR_UNKNOWN);
                        }
                    } catch (gi e3) {
                        e = e3;
                    } catch (Throwable unused3) {
                    }
                }
                try {
                    if (!w) {
                        hj.d = hp.a(context, "open_common", "a4", true);
                        hj.e = hp.a(context, "open_common", "a5", true);
                        w = true;
                    }
                } catch (Throwable unused4) {
                }
                try {
                    str7 = "result";
                    r14 = aVar;
                    str8 = "ver";
                    str16 = "at";
                    str5 = "infocode";
                    str15 = "lc";
                    str6 = "info";
                    try {
                        isVarB = ik.b(new b(context, gtVar, string, map, str2, str3, str4));
                        if (zIsEmpty) {
                            return r14;
                        }
                        if (isVarB != null) {
                            try {
                                bArr = isVarB.a;
                                try {
                                    Map<String, List<String>> map2 = isVarB.b;
                                    if (map2 != null && map2.containsKey("lct") && (list = map2.get("lct")) != null && list.size() > 0) {
                                        String str17 = list.get(0);
                                        if (!TextUtils.isEmpty(str17)) {
                                            long jLongValue = Long.valueOf(str17).longValue();
                                            r14.e = jLongValue;
                                            if (gtVar != null && jLongValue != 0) {
                                                String strA2 = gtVar.a();
                                                if (!TextUtils.isEmpty(strA2)) {
                                                    b(strA2, r14.e);
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable th) {
                                    try {
                                        hn.c(th, str16, "lct");
                                    } catch (gi e4) {
                                        e = e4;
                                        r14.c = e.a();
                                        a(context, gtVar, e.a());
                                        hn.a(gtVar, "/v3/iasdkauth", e);
                                        r13 = r14;
                                        r18 = string;
                                    } catch (IllegalBlockSizeException e5) {
                                        e = e5;
                                        a(context, gtVar, e);
                                        r13 = r14;
                                        r18 = string;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        hn.c(th, str16, str15);
                                        a(context, gtVar, th);
                                        r13 = r14;
                                        r18 = string;
                                    }
                                }
                            } catch (gi e6) {
                                e = e6;
                                bArr = null;
                                r14.c = e.a();
                                a(context, gtVar, e.a());
                                hn.a(gtVar, "/v3/iasdkauth", e);
                                r13 = r14;
                                r18 = string;
                            } catch (IllegalBlockSizeException e7) {
                                e = e7;
                                bArr = null;
                                a(context, gtVar, e);
                                r13 = r14;
                                r18 = string;
                            } catch (Throwable th3) {
                                th = th3;
                                bArr = null;
                                hn.c(th, str16, str15);
                                a(context, gtVar, th);
                                r13 = r14;
                                r18 = string;
                            }
                        } else {
                            bArr = null;
                        }
                        byte[] bArr2 = new byte[16];
                        byte[] bArr3 = new byte[bArr.length - 16];
                        System.arraycopy(bArr, 0, bArr2, 0, 16);
                        System.arraycopy(bArr, 16, bArr3, 0, bArr.length - 16);
                        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, gu.c("EQUVT"));
                        Cipher cipher = Cipher.getInstance(gu.c("CQUVTL0NCQy9QS0NTNVBhZGRpbmc"));
                        cipher.init(2, secretKeySpec, new IvParameterSpec(gu.c()));
                        strA = gu.a(cipher.doFinal(bArr3));
                        r13 = r14;
                        r18 = string;
                        r7 = r18;
                        if (bArr == null) {
                            return r13;
                        }
                        if (TextUtils.isEmpty(strA)) {
                            strA = gu.a(bArr);
                        }
                        str9 = strA;
                        if (TextUtils.isEmpty(str9)) {
                            a(context, gtVar, "result is null");
                        }
                        try {
                            jSONObject = new JSONObject(str9);
                            if (jSONObject.has("status")) {
                                i2 = jSONObject.getInt("status");
                                if (i2 == 1) {
                                    a = 1;
                                } else if (i2 == 0) {
                                    if (isVarB != null) {
                                        str10 = isVarB.c;
                                        str11 = isVarB.d;
                                    } else {
                                        str10 = "authcsid";
                                        str11 = "authgsid";
                                    }
                                    gu.a(context, str10, str11, jSONObject);
                                    a = 0;
                                    str12 = str6;
                                    if (jSONObject.has(str12)) {
                                        b = jSONObject.getString(str12);
                                    }
                                    String str18 = str5;
                                    hn.a(gtVar, "/v3/iasdkauth", b, str11, str10, jSONObject.has(str18) ? jSONObject.getString(str18) : "");
                                    if (a == 0) {
                                        r13.c = b;
                                        return r13;
                                    }
                                }
                                str13 = str8;
                                try {
                                    if (jSONObject.has(str13)) {
                                        r13.d = jSONObject.getInt(str13);
                                    }
                                } catch (Throwable th4) {
                                    hk.a(th4, str16, str15);
                                }
                                str14 = str7;
                                if (gu.a(jSONObject, str14)) {
                                    JSONObject jSONObject3 = jSONObject.getJSONObject(str14);
                                    a(context, gtVar, (String) r7, (a) r13, jSONObject3);
                                    try {
                                        jSONObject2 = jSONObject3.getJSONObject("15K");
                                        zA = a(jSONObject2.optString("isTargetAble"), false);
                                        if (!a(jSONObject2.optString("able"), false)) {
                                            gp gpVar = gp.a.a;
                                            gp.b(context);
                                        } else {
                                            gp.a.a.a(context, zA);
                                        }
                                    } catch (Throwable unused5) {
                                    }
                                }
                            }
                        } catch (Throwable th5) {
                            hk.a(th5, str16, str15);
                        }
                        return r13;
                    } catch (gi e8) {
                        e = e8;
                        throw e;
                    } catch (Throwable unused6) {
                        throw new gi(AMapException.ERROR_UNKNOWN);
                    }
                } catch (gi e9) {
                    e = e9;
                } catch (Throwable unused7) {
                }
            } catch (gi e10) {
                e = e10;
                string = IsEmpty;
                isVarB = null;
                bArr = null;
                r14.c = e.a();
                a(context, gtVar, e.a());
                hn.a(gtVar, "/v3/iasdkauth", e);
                r13 = r14;
                r18 = string;
                r7 = r18;
                if (bArr == null) {
                    return r13;
                }
                if (TextUtils.isEmpty(strA)) {
                    strA = gu.a(bArr);
                }
                str9 = strA;
                if (TextUtils.isEmpty(str9)) {
                    a(context, gtVar, "result is null");
                }
                jSONObject = new JSONObject(str9);
                if (jSONObject.has("status")) {
                    i2 = jSONObject.getInt("status");
                    if (i2 == 1) {
                        a = 1;
                    } else if (i2 == 0) {
                        if (isVarB != null) {
                            str10 = isVarB.c;
                            str11 = isVarB.d;
                        } else {
                            str10 = "authcsid";
                            str11 = "authgsid";
                        }
                        gu.a(context, str10, str11, jSONObject);
                        a = 0;
                        str12 = str6;
                        if (jSONObject.has(str12)) {
                            b = jSONObject.getString(str12);
                        }
                        String str19 = str5;
                        hn.a(gtVar, "/v3/iasdkauth", b, str11, str10, jSONObject.has(str19) ? jSONObject.getString(str19) : "");
                        if (a == 0) {
                            r13.c = b;
                            return r13;
                        }
                    }
                    str13 = str8;
                    if (jSONObject.has(str13)) {
                        r13.d = jSONObject.getInt(str13);
                    }
                    str14 = str7;
                    if (gu.a(jSONObject, str14)) {
                        JSONObject jSONObject4 = jSONObject.getJSONObject(str14);
                        a(context, gtVar, (String) r7, (a) r13, jSONObject4);
                        jSONObject2 = jSONObject4.getJSONObject("15K");
                        zA = a(jSONObject2.optString("isTargetAble"), false);
                        if (!a(jSONObject2.optString("able"), false)) {
                            gp gpVar2 = gp.a.a;
                            gp.b(context);
                        } else {
                            gp.a.a.a(context, zA);
                        }
                    }
                }
                return r13;
            } catch (IllegalBlockSizeException e11) {
                e = e11;
                string = IsEmpty;
                isVarB = null;
                bArr = null;
                a(context, gtVar, e);
                r13 = r14;
                r18 = string;
                r7 = r18;
                if (bArr == null) {
                    return r13;
                }
                if (TextUtils.isEmpty(strA)) {
                    strA = gu.a(bArr);
                }
                str9 = strA;
                if (TextUtils.isEmpty(str9)) {
                    a(context, gtVar, "result is null");
                }
                jSONObject = new JSONObject(str9);
                if (jSONObject.has("status")) {
                    i2 = jSONObject.getInt("status");
                    if (i2 == 1) {
                        a = 1;
                    } else if (i2 == 0) {
                        if (isVarB != null) {
                            str10 = isVarB.c;
                            str11 = isVarB.d;
                        } else {
                            str10 = "authcsid";
                            str11 = "authgsid";
                        }
                        gu.a(context, str10, str11, jSONObject);
                        a = 0;
                        str12 = str6;
                        if (jSONObject.has(str12)) {
                            b = jSONObject.getString(str12);
                        }
                        String str110 = str5;
                        hn.a(gtVar, "/v3/iasdkauth", b, str11, str10, jSONObject.has(str110) ? jSONObject.getString(str110) : "");
                        if (a == 0) {
                            r13.c = b;
                            return r13;
                        }
                    }
                    str13 = str8;
                    if (jSONObject.has(str13)) {
                        r13.d = jSONObject.getInt(str13);
                    }
                    str14 = str7;
                    if (gu.a(jSONObject, str14)) {
                        JSONObject jSONObject5 = jSONObject.getJSONObject(str14);
                        a(context, gtVar, (String) r7, (a) r13, jSONObject5);
                        jSONObject2 = jSONObject5.getJSONObject("15K");
                        zA = a(jSONObject2.optString("isTargetAble"), false);
                        if (!a(jSONObject2.optString("able"), false)) {
                            gp gpVar3 = gp.a.a;
                            gp.b(context);
                        } else {
                            gp.a.a.a(context, zA);
                        }
                    }
                }
                return r13;
            } catch (Throwable th6) {
                th = th6;
                string = IsEmpty;
                isVarB = null;
                bArr = null;
                hn.c(th, str16, str15);
                a(context, gtVar, th);
                r13 = r14;
                r18 = string;
                r7 = r18;
                if (bArr == null) {
                    return r13;
                }
                if (TextUtils.isEmpty(strA)) {
                    strA = gu.a(bArr);
                }
                str9 = strA;
                if (TextUtils.isEmpty(str9)) {
                    a(context, gtVar, "result is null");
                }
                jSONObject = new JSONObject(str9);
                if (jSONObject.has("status")) {
                    i2 = jSONObject.getInt("status");
                    if (i2 == 1) {
                        a = 1;
                    } else if (i2 == 0) {
                        if (isVarB != null) {
                            str10 = isVarB.c;
                            str11 = isVarB.d;
                        } else {
                            str10 = "authcsid";
                            str11 = "authgsid";
                        }
                        gu.a(context, str10, str11, jSONObject);
                        a = 0;
                        str12 = str6;
                        if (jSONObject.has(str12)) {
                            b = jSONObject.getString(str12);
                        }
                        String str111 = str5;
                        hn.a(gtVar, "/v3/iasdkauth", b, str11, str10, jSONObject.has(str111) ? jSONObject.getString(str111) : "");
                        if (a == 0) {
                            r13.c = b;
                            return r13;
                        }
                    }
                    str13 = str8;
                    if (jSONObject.has(str13)) {
                        r13.d = jSONObject.getInt(str13);
                    }
                    str14 = str7;
                    if (gu.a(jSONObject, str14)) {
                        JSONObject jSONObject6 = jSONObject.getJSONObject(str14);
                        a(context, gtVar, (String) r7, (a) r13, jSONObject6);
                        jSONObject2 = jSONObject6.getJSONObject("15K");
                        zA = a(jSONObject2.optString("isTargetAble"), false);
                        if (!a(jSONObject2.optString("able"), false)) {
                            gp gpVar4 = gp.a.a;
                            gp.b(context);
                        } else {
                            gp.a.a.a(context, zA);
                        }
                    }
                }
                return r13;
            }
        } catch (gi e12) {
            e = e12;
            IsEmpty = str;
            str5 = "infocode";
            str6 = "info";
            str7 = "result";
            str8 = "ver";
            r14 = aVar;
            str16 = "at";
            str15 = "lc";
        } catch (IllegalBlockSizeException e13) {
            e = e13;
            IsEmpty = str;
            str5 = "infocode";
            str6 = "info";
            str7 = "result";
            str8 = "ver";
            r14 = aVar;
            str16 = "at";
            str15 = "lc";
        } catch (Throwable th7) {
            th = th7;
            IsEmpty = str;
            str5 = "infocode";
            str6 = "info";
            str7 = "result";
            str8 = "ver";
            r14 = aVar;
            str16 = "at";
            str15 = "lc";
        }
    }

    private static synchronized void b(String str, long j2) {
        try {
            if (v != null && v.containsKey(str)) {
                if (t == null) {
                    t = new ConcurrentHashMap<>(8);
                }
                t.put(str, Long.valueOf(j2));
                Context context = c;
                if (context != null) {
                    SharedPreferences.Editor editorA = hp.a(context, "open_common");
                    hp.a(editorA, str, j2);
                    hp.a(editorA);
                }
            }
        } catch (Throwable th) {
            hk.a(th, "at", "ucut");
        }
    }

    public static boolean d(String str) {
        d dVarA;
        try {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            if (!f) {
                return false;
            }
            if (!(z.get(str) == null)) {
                return false;
            }
            Context context = c;
            return context == null || (dVarA = a(context, b(str, "a14"), "open_common")) == null || dVarA.a() < x;
        } catch (Throwable unused) {
            return true;
        }
    }

    public static void c(io.c cVar) {
        if (cVar != null && j) {
            synchronized (D) {
                D.offer(cVar);
                io.b();
            }
        }
    }

    public static void c() {
        try {
            d dVarA = a(c, "IPV6_CONFIG_NAME", "open_common");
            String strA = gu.a(System.currentTimeMillis(), "yyyyMMdd");
            if (!strA.equals(dVarA.b)) {
                dVarA.a(strA);
                dVarA.c.set(0);
            }
            dVarA.c.incrementAndGet();
            a(c, "IPV6_CONFIG_NAME", "open_common", dVarA);
        } catch (Throwable unused) {
        }
    }

    private static String b(String str, String str2) {
        return str2 + "_" + gr.a(str.getBytes());
    }

    public static void b(io.c cVar) {
        synchronized (B) {
            boolean z2 = false;
            for (int i2 = 0; i2 < B.size(); i2++) {
                io.a aVar = B.get(i2);
                if (cVar.c.equals(aVar.b) && cVar.d.equals(aVar.e)) {
                    int i3 = cVar.m;
                    int i4 = aVar.f;
                    if (i3 == i4) {
                        if (i4 == 1) {
                            aVar.i = ((((long) aVar.j.get()) * aVar.i) + cVar.f) / ((long) (aVar.j.get() + 1));
                        }
                        aVar.j.getAndIncrement();
                        z2 = true;
                    }
                }
            }
            if (!z2) {
                B.add(new io.a(cVar));
            }
            io.b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:105:0x0210 A[Catch: all -> 0x0298, TryCatch #12 {all -> 0x0298, blocks: (B:103:0x020a, B:105:0x0210, B:107:0x024e, B:109:0x0252, B:111:0x0256, B:113:0x025a, B:115:0x025e, B:117:0x0262), top: B:162:0x020a }] */
    /* JADX WARN: Code duplicated, block: B:107:0x024e A[Catch: all -> 0x0298, TryCatch #12 {all -> 0x0298, blocks: (B:103:0x020a, B:105:0x0210, B:107:0x024e, B:109:0x0252, B:111:0x0256, B:113:0x025a, B:115:0x025e, B:117:0x0262), top: B:162:0x020a }] */
    /* JADX WARN: Code duplicated, block: B:124:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:152:0x02c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x02ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x020a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:? A[RETURN, SYNTHETIC] */
    private static void a(Context context, gt gtVar, String str, a aVar, JSONObject jSONObject) throws JSONException {
        String str2;
        String str3;
        String str4;
        boolean zA;
        Context context2;
        JSONObject jSONObject2;
        boolean zA2;
        boolean zA3;
        boolean zA4;
        int iOptInt;
        boolean zA5;
        int iOptInt2;
        a.C0107a c0107a = new a.C0107a();
        c0107a.a = false;
        c0107a.b = false;
        aVar.g = c0107a;
        try {
            String[] strArrSplit = str.split(";");
            if (strArrSplit != null && strArrSplit.length > 0) {
                int length = strArrSplit.length;
                int i2 = 0;
                while (i2 < length) {
                    String str5 = strArrSplit[i2];
                    if (jSONObject.has(str5)) {
                        aVar.f.putOpt(str5, jSONObject.get(str5));
                    }
                    i2++;
                    strArrSplit = strArrSplit;
                }
            }
        } catch (Throwable th) {
            hk.a(th, "at", com.xiaomi.market.sdk.Constants.JSON_COUNTRY);
        }
        if (gu.a(jSONObject, "16H")) {
            try {
                aVar.i = a(jSONObject.getJSONObject("16H").optString("able"), false);
            } catch (Throwable th2) {
                hk.a(th2, "AuthConfigManager", "load 16H");
            }
        }
        if (gu.a(jSONObject, "11K")) {
            try {
                JSONObject jSONObject3 = jSONObject.getJSONObject("11K");
                c0107a.a = a(jSONObject3.getString("able"), false);
                if (jSONObject3.has("off")) {
                    c0107a.c = jSONObject3.getJSONObject("off");
                }
            } catch (Throwable th3) {
                hk.a(th3, "AuthConfigManager", "load 11K");
            }
        }
        if (gu.a(jSONObject, "145")) {
            try {
                aVar.a = jSONObject.getJSONObject("145");
            } catch (Throwable th4) {
                hk.a(th4, "AuthConfigManager", "load 145");
            }
        }
        if (gu.a(jSONObject, "14D")) {
            try {
                aVar.b = jSONObject.getJSONObject("14D");
            } catch (Throwable th5) {
                hk.a(th5, "AuthConfigManager", "load 14D");
            }
        }
        if (gu.a(jSONObject, "151")) {
            try {
                JSONObject jSONObject4 = jSONObject.getJSONObject("151");
                a.b bVar = new a.b();
                if (jSONObject4 != null) {
                    bVar.a = a(jSONObject4.optString("able"), false);
                }
                aVar.h = bVar;
            } catch (Throwable th6) {
                hk.a(th6, "AuthConfigManager", "load 151");
            }
        }
        if (gu.a(jSONObject, "17S")) {
            try {
                JSONObject jSONObject5 = jSONObject.getJSONObject("17S");
                if (jSONObject5 != null && (zA = a(jSONObject5.optString("able"), false)) != o) {
                    o = zA;
                    if (context != null) {
                        SharedPreferences.Editor editorA = hp.a(context, "open_common");
                        hp.a(editorA, "a2", zA);
                        hp.a(editorA);
                    }
                }
                if (jSONObject5 != null) {
                    boolean zA6 = a(jSONObject5.optString("static_enable"), true);
                    boolean zA7 = a(jSONObject5.optString("static_ip_direct_enable"), false);
                    int iOptInt3 = jSONObject5.optInt("static_timeout", 5) * 1000;
                    int iOptInt4 = jSONObject5.optInt("static_retry", 3);
                    str2 = "ustv";
                    try {
                        boolean zA8 = a(jSONObject5.optString("bgp_enable"), true);
                        str3 = "ust";
                        try {
                            boolean zA9 = a(jSONObject5.optString("bgp_ip_direct_enable"), false);
                            str4 = "umv";
                            try {
                                int iOptInt5 = jSONObject5.optInt("bgp_retry", 3);
                                boolean zA10 = a(jSONObject5.optString("perf_data_upload_enable"), false);
                                if (zA6 != f || zA7 != g || iOptInt3 != e || iOptInt4 != x || zA8 != h || zA9 != i || iOptInt5 != y || zA10 != j) {
                                    f = zA6;
                                    g = zA7;
                                    e = iOptInt3;
                                    x = iOptInt4;
                                    h = zA8;
                                    i = zA9;
                                    y = iOptInt5;
                                    j = zA10;
                                    if (context != null) {
                                        SharedPreferences.Editor editorA2 = hp.a(context, "open_common");
                                        hp.a(editorA2, "a13", zA6);
                                        hp.a(editorA2, "a6", zA8);
                                        hp.a(editorA2, "a7", zA7);
                                        hp.a(editorA2, "a8", iOptInt3);
                                        hp.a(editorA2, "a9", iOptInt4);
                                        hp.a(editorA2, "a10", zA9);
                                        hp.a(editorA2, "a11", iOptInt5);
                                        hp.a(editorA2, "a12", zA10);
                                        hp.a(editorA2);
                                    }
                                }
                                io.b();
                                io.b();
                                io.b();
                                io.b();
                                io.b();
                            } catch (Throwable th7) {
                                th = th7;
                                hk.a(th, "AuthConfigManager", "load 17S");
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            str4 = "umv";
                            hk.a(th, "AuthConfigManager", "load 17S");
                            if (gu.a(jSONObject, "15K")) {
                                try {
                                    jSONObject2 = jSONObject.getJSONObject("15K");
                                    if (jSONObject2 != null) {
                                        zA2 = a(jSONObject2.optString("ucf"), e.a);
                                        zA3 = a(jSONObject2.optString("fsv2"), e.b);
                                        zA4 = a(jSONObject2.optString("usc"), e.c);
                                        String str6 = str4;
                                        iOptInt = jSONObject2.optInt(str6, e.d);
                                        String str7 = str3;
                                        zA5 = a(jSONObject2.optString(str7), e.e);
                                        String str8 = str2;
                                        iOptInt2 = jSONObject2.optInt(str8, e.f);
                                        if (zA2 != e.a) {
                                        }
                                        e.a = zA2;
                                        e.b = zA3;
                                        e.c = zA4;
                                        e.d = iOptInt;
                                        e.e = zA5;
                                        e.f = iOptInt2;
                                        context2 = context;
                                        try {
                                            SharedPreferences.Editor editorA3 = hp.a(context2, "open_common");
                                            hp.a(editorA3, "ucf", e.a);
                                            hp.a(editorA3, "fsv2", e.b);
                                            hp.a(editorA3, "usc", e.c);
                                            hp.a(editorA3, str6, e.d);
                                            hp.a(editorA3, str7, e.e);
                                            hp.a(editorA3, str8, e.f);
                                            hp.a(editorA3);
                                        } catch (Throwable unused) {
                                        }
                                    } else {
                                        context2 = context;
                                    }
                                } catch (Throwable th9) {
                                    context2 = context;
                                    hk.a(th9, "AuthConfigManager", "load 15K");
                                }
                            } else {
                                context2 = context;
                            }
                            if (gu.a(jSONObject, "183")) {
                                try {
                                    in.a(gtVar, jSONObject.getJSONObject("183"));
                                } catch (Throwable th10) {
                                    hk.a(th10, "AuthConfigManager", "load 183");
                                }
                            }
                            if (gu.a(jSONObject, "17I")) {
                                try {
                                    JSONObject jSONObject6 = jSONObject.getJSONObject("17I");
                                    boolean zA11 = a(jSONObject6.optString("na"), false);
                                    boolean zA12 = a(jSONObject6.optString("aa"), false);
                                    hj.d = zA11;
                                    hj.e = zA12;
                                    SharedPreferences.Editor editorA4 = hp.a(context2, "open_common");
                                    hp.a(editorA4, "a4", zA11);
                                    hp.a(editorA4, "a5", zA12);
                                    hp.a(editorA4);
                                } catch (Throwable th11) {
                                    hk.a(th11, "AuthConfigManager", "load 17I");
                                    return;
                                }
                            }
                        }
                    } catch (Throwable th12) {
                        th = th12;
                        str3 = "ust";
                        str4 = "umv";
                        hk.a(th, "AuthConfigManager", "load 17S");
                        if (gu.a(jSONObject, "15K")) {
                            jSONObject2 = jSONObject.getJSONObject("15K");
                            if (jSONObject2 != null) {
                                zA2 = a(jSONObject2.optString("ucf"), e.a);
                                zA3 = a(jSONObject2.optString("fsv2"), e.b);
                                zA4 = a(jSONObject2.optString("usc"), e.c);
                                String str9 = str4;
                                iOptInt = jSONObject2.optInt(str9, e.d);
                                String str10 = str3;
                                zA5 = a(jSONObject2.optString(str10), e.e);
                                String str11 = str2;
                                iOptInt2 = jSONObject2.optInt(str11, e.f);
                                if (zA2 != e.a) {
                                }
                                e.a = zA2;
                                e.b = zA3;
                                e.c = zA4;
                                e.d = iOptInt;
                                e.e = zA5;
                                e.f = iOptInt2;
                                context2 = context;
                                SharedPreferences.Editor editorA5 = hp.a(context2, "open_common");
                                hp.a(editorA5, "ucf", e.a);
                                hp.a(editorA5, "fsv2", e.b);
                                hp.a(editorA5, "usc", e.c);
                                hp.a(editorA5, str9, e.d);
                                hp.a(editorA5, str10, e.e);
                                hp.a(editorA5, str11, e.f);
                                hp.a(editorA5);
                            } else {
                                context2 = context;
                            }
                        } else {
                            context2 = context;
                        }
                        if (gu.a(jSONObject, "183")) {
                            in.a(gtVar, jSONObject.getJSONObject("183"));
                        }
                        if (gu.a(jSONObject, "17I")) {
                            JSONObject jSONObject7 = jSONObject.getJSONObject("17I");
                            boolean zA13 = a(jSONObject7.optString("na"), false);
                            boolean zA14 = a(jSONObject7.optString("aa"), false);
                            hj.d = zA13;
                            hj.e = zA14;
                            SharedPreferences.Editor editorA6 = hp.a(context2, "open_common");
                            hp.a(editorA6, "a4", zA13);
                            hp.a(editorA6, "a5", zA14);
                            hp.a(editorA6);
                        }
                    }
                } else {
                    str2 = "ustv";
                    str3 = "ust";
                    str4 = "umv";
                }
            } catch (Throwable th13) {
                th = th13;
                str2 = "ustv";
            }
        } else {
            str2 = "ustv";
            str3 = "ust";
            str4 = "umv";
        }
        if (gu.a(jSONObject, "15K")) {
            jSONObject2 = jSONObject.getJSONObject("15K");
            if (jSONObject2 != null) {
                zA2 = a(jSONObject2.optString("ucf"), e.a);
                zA3 = a(jSONObject2.optString("fsv2"), e.b);
                zA4 = a(jSONObject2.optString("usc"), e.c);
                String str12 = str4;
                iOptInt = jSONObject2.optInt(str12, e.d);
                String str13 = str3;
                zA5 = a(jSONObject2.optString(str13), e.e);
                String str14 = str2;
                iOptInt2 = jSONObject2.optInt(str14, e.f);
                if (zA2 != e.a && zA3 == e.b && zA4 == e.c && iOptInt == e.d && zA5 == e.e && iOptInt2 == e.d) {
                    context2 = context;
                } else {
                    e.a = zA2;
                    e.b = zA3;
                    e.c = zA4;
                    e.d = iOptInt;
                    e.e = zA5;
                    e.f = iOptInt2;
                    context2 = context;
                    SharedPreferences.Editor editorA7 = hp.a(context2, "open_common");
                    hp.a(editorA7, "ucf", e.a);
                    hp.a(editorA7, "fsv2", e.b);
                    hp.a(editorA7, "usc", e.c);
                    hp.a(editorA7, str12, e.d);
                    hp.a(editorA7, str13, e.e);
                    hp.a(editorA7, str14, e.f);
                    hp.a(editorA7);
                }
            } else {
                context2 = context;
            }
        } else {
            context2 = context;
        }
        if (gu.a(jSONObject, "183")) {
            in.a(gtVar, jSONObject.getJSONObject("183"));
        }
        if (gu.a(jSONObject, "17I")) {
            JSONObject jSONObject8 = jSONObject.getJSONObject("17I");
            boolean zA15 = a(jSONObject8.optString("na"), false);
            boolean zA16 = a(jSONObject8.optString("aa"), false);
            hj.d = zA15;
            hj.e = zA16;
            SharedPreferences.Editor editorA8 = hp.a(context2, "open_common");
            hp.a(editorA8, "a4", zA15);
            hp.a(editorA8, "a5", zA16);
            hp.a(editorA8);
        }
    }

    private static void a(Context context, gt gtVar, Throwable th) {
        a(context, gtVar, th.getMessage());
    }

    public static void a(String str, boolean z2, boolean z3, boolean z4) {
        if (TextUtils.isEmpty(str) || c == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("url", str);
        map.put("downLevel", String.valueOf(z2));
        map.put("ant", gn.p(c) == 0 ? "0" : "1");
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
            iz izVar = new iz(c, "core", "2.0", "O002");
            izVar.a(string);
            ja.a(izVar, c);
        } catch (gi unused) {
        }
    }

    public static void a(io.c cVar) {
        if (cVar == null || c == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("serverip", cVar.c);
        map.put("hostname", cVar.e);
        map.put("path", cVar.d);
        map.put("csid", cVar.a);
        map.put("degrade", String.valueOf(cVar.b.a()));
        map.put("errorcode", String.valueOf(cVar.m));
        map.put("errorsubcode", String.valueOf(cVar.n));
        map.put("connecttime", String.valueOf(cVar.h));
        map.put("writetime", String.valueOf(cVar.i));
        map.put("readtime", String.valueOf(cVar.j));
        map.put("datasize", String.valueOf(cVar.l));
        map.put("totaltime", String.valueOf(cVar.f));
        String string = new JSONObject(map).toString();
        "--埋点--".concat(String.valueOf(string));
        io.b();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            iz izVar = new iz(c, "core", "2.0", "O008");
            izVar.a(string);
            ja.a(izVar, c);
        } catch (gi unused) {
        }
    }

    private static void a(Context context, gt gtVar, String str) {
        HashMap map = new HashMap();
        map.put("amap_sdk_auth_fail", "1");
        map.put("amap_sdk_auth_fail_type", str);
        map.put("amap_sdk_name", gtVar.a());
        map.put("amap_sdk_version", gtVar.c());
        String string = new JSONObject(map).toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            iz izVar = new iz(context, "core", "2.0", "O001");
            izVar.a(string);
            ja.a(izVar, context);
        } catch (gi unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0067 A[Catch: all -> 0x00f2, TryCatch #0 {all -> 0x00f2, blocks: (B:5:0x0008, B:7:0x0014, B:9:0x001a, B:11:0x0022, B:14:0x0032, B:16:0x0038, B:20:0x004a, B:21:0x0061, B:23:0x0067, B:25:0x0077, B:26:0x0084, B:28:0x008a, B:30:0x0098, B:32:0x00a0, B:33:0x00a3, B:35:0x00a7, B:37:0x00af, B:39:0x00bf, B:42:0x00c6, B:44:0x00cf, B:46:0x00dd, B:48:0x00e5, B:17:0x003b), top: B:77:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x008a A[Catch: all -> 0x00f2, TryCatch #0 {all -> 0x00f2, blocks: (B:5:0x0008, B:7:0x0014, B:9:0x001a, B:11:0x0022, B:14:0x0032, B:16:0x0038, B:20:0x004a, B:21:0x0061, B:23:0x0067, B:25:0x0077, B:26:0x0084, B:28:0x008a, B:30:0x0098, B:32:0x00a0, B:33:0x00a3, B:35:0x00a7, B:37:0x00af, B:39:0x00bf, B:42:0x00c6, B:44:0x00cf, B:46:0x00dd, B:48:0x00e5, B:17:0x003b), top: B:77:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0126  */
    /* JADX WARN: Code duplicated, block: B:80:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0098 A[SYNTHETIC] */
    public static boolean a() {
        boolean z2;
        Integer num;
        String displayName;
        Iterator<InterfaceAddress> it2;
        int i2;
        InetAddress address;
        Inet4Address inet4Address;
        d dVarA;
        Context context = c;
        if (context != null) {
            try {
                if (context != null) {
                    String strS = gn.s(context);
                    if (TextUtils.isEmpty(r) || TextUtils.isEmpty(strS) || !r.equals(strS) || System.currentTimeMillis() - s >= 60000) {
                        if (!TextUtils.isEmpty(strS)) {
                            r = strS;
                        }
                        s = System.currentTimeMillis();
                        q.clear();
                        for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                            if (!networkInterface.getInterfaceAddresses().isEmpty()) {
                                displayName = networkInterface.getDisplayName();
                                it2 = networkInterface.getInterfaceAddresses().iterator();
                                i2 = 0;
                                while (it2.hasNext()) {
                                    address = it2.next().getAddress();
                                    if (address instanceof Inet6Address) {
                                        if (!a((Inet6Address) address)) {
                                            i2 |= 2;
                                        }
                                    } else if (address instanceof Inet4Address) {
                                        inet4Address = (Inet4Address) address;
                                        if (a(inet4Address) && !inet4Address.getHostAddress().startsWith(gu.c("FMTkyLjE2OC40My4"))) {
                                            i2 |= 1;
                                        }
                                    }
                                }
                                if (i2 == 0) {
                                    if (displayName == null && displayName.startsWith("wlan")) {
                                        q.put("WIFI", Integer.valueOf(i2));
                                    } else if (displayName == null && displayName.startsWith("rmnet")) {
                                        q.put("MOBILE", Integer.valueOf(i2));
                                    }
                                }
                            }
                        }
                    }
                } else if (System.currentTimeMillis() - s >= 10000) {
                    s = System.currentTimeMillis();
                    q.clear();
                    while (r0.hasNext()) {
                        if (!networkInterface.getInterfaceAddresses().isEmpty()) {
                            displayName = networkInterface.getDisplayName();
                            it2 = networkInterface.getInterfaceAddresses().iterator();
                            i2 = 0;
                            while (it2.hasNext()) {
                                address = it2.next().getAddress();
                                if (address instanceof Inet6Address) {
                                    if (!a((Inet6Address) address)) {
                                        i2 |= 2;
                                    }
                                } else if (address instanceof Inet4Address) {
                                    inet4Address = (Inet4Address) address;
                                    if (a(inet4Address)) {
                                    }
                                }
                            }
                            if (i2 == 0) {
                                if (displayName == null) {
                                }
                                if (displayName == null) {
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                hk.a(th, "at", "ipstack");
            }
            if (!b()) {
                return false;
            }
            Context context2 = c;
            if (context2 != null) {
                String strS2 = gn.s(context2);
                if (TextUtils.isEmpty(strS2) || (num = q.get(strS2.toUpperCase())) == null || num.intValue() != 2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
        }
        return o && (dVarA = a(c, "IPV6_CONFIG_NAME", "open_common")) != null && dVarA.a() < 5;
    }

    private static boolean a(InetAddress inetAddress) {
        return inetAddress.isLoopbackAddress() || inetAddress.isLinkLocalAddress() || inetAddress.isAnyLocalAddress();
    }

    private static void a(Context context, String str, String str2, d dVar) {
        if (dVar == null || TextUtils.isEmpty(dVar.a)) {
            return;
        }
        String strB = dVar.b();
        if (TextUtils.isEmpty(strB) || context == null) {
            return;
        }
        SharedPreferences.Editor editorA = hp.a(context, str2);
        editorA.putString(str, strB);
        hp.a(editorA);
    }

    public static synchronized boolean a(String str, long j2) {
        boolean z2 = false;
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (j2 > c(str)) {
                long jLongValue = 0;
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

    public static synchronized void a(final String str, boolean z2, final String str2, final String str3, final String str4) {
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
                    in.a(true, str);
                }
                hn.d().submit(new Runnable() { // from class: com.amap.api.mapcore.util.gk.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        c cVar = (c) gk.v.get(str);
                        if (cVar == null) {
                            return;
                        }
                        gk.a(gk.c, cVar.a, cVar.b, str2, str3, str4);
                    }
                });
            }
        } catch (Throwable th) {
            hk.a(th, "at", "lca");
        }
    }

    public static synchronized boolean a(String str) {
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
            hk.a(th, "at", "cslct");
        }
        return false;
    }

    public static void a(boolean z2, String str) {
        try {
            "--markHostNameFailed---hostname=".concat(String.valueOf(str));
            io.b();
            if (f || z2) {
                if ((i || !z2) && !TextUtils.isEmpty(str)) {
                    if (!z2) {
                        if (z.get(str) != null) {
                            return;
                        }
                        z.put(str, Boolean.TRUE);
                        a(b(str, "a14"), "open_common");
                        return;
                    }
                    if (A.get(str) != null) {
                        return;
                    }
                    A.put(str, Boolean.TRUE);
                    a(b(str, "a15"), "open_common");
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static void a(String str, String str2) {
        d dVarA = a(c, str, str2);
        String strA = gu.a(System.currentTimeMillis(), "yyyyMMdd");
        if (!strA.equals(dVarA.b)) {
            dVarA.a(strA);
            dVarA.c.set(0);
        }
        dVarA.c.incrementAndGet();
        a(c, str, str2, dVarA);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e A[Catch: all -> 0x0084, LOOP:0: B:23:0x0068->B:25:0x006e, LOOP_END, TryCatch #0 {, blocks: (B:9:0x000d, B:10:0x0013, B:12:0x0019, B:14:0x0029, B:16:0x0033, B:18:0x0039, B:20:0x003f, B:21:0x0046, B:22:0x005c, B:23:0x0068, B:25:0x006e, B:26:0x007f, B:27:0x0082), top: B:33:0x000d }] */
    public static void a(boolean z2, io.a aVar) {
        if (!C || aVar == null) {
            return;
        }
        synchronized (B) {
            if (z2) {
                Iterator<io.a> it2 = B.iterator();
                while (it2.hasNext()) {
                    io.a next = it2.next();
                    if (next.b.equals(aVar.b) && next.e.equals(aVar.e) && next.f == aVar.f) {
                        if (next.j == aVar.j) {
                            it2.remove();
                            io.b();
                        } else {
                            next.j.set(next.j.get() - aVar.j.get());
                            io.b();
                        }
                    }
                }
                C = false;
                io.b();
                for (io.a aVar2 : B) {
                    String str = aVar2.e;
                    Objects.toString(aVar2.j);
                    io.b();
                }
                io.b();
            } else {
                C = false;
                io.b();
                while (r4.hasNext()) {
                    String str2 = aVar2.e;
                    Objects.toString(aVar2.j);
                    io.b();
                }
                io.b();
            }
            throw th;
        }
    }

    public static a a(Context context, gt gtVar, String str, Map<String, String> map) {
        return a(context, gtVar, str, map, null, null, null);
    }

    private static synchronized d a(Context context, String str, String str2) {
        d dVar;
        if (!TextUtils.isEmpty(str)) {
            int i2 = 0;
            while (true) {
                if (i2 >= p.size()) {
                    dVar = null;
                    break;
                }
                dVar = p.get(i2);
                if (dVar != null && str.equals(dVar.a)) {
                    break;
                }
                i2++;
            }
        } else {
            dVar = null;
            break;
        }
        if (dVar != null) {
            return dVar;
        }
        if (context == null) {
            return null;
        }
        d dVarB = d.b(hp.b(context, str2, str, ""));
        String strA = gu.a(System.currentTimeMillis(), "yyyyMMdd");
        if (dVarB == null) {
            dVarB = new d(str, strA, 0);
        }
        if (!strA.equals(dVarB.b)) {
            dVarB.a(strA);
            dVarB.c.set(0);
        }
        p.add(dVarB);
        return dVarB;
    }
}
