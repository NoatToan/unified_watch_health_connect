package com.loc;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.amap.api.mapcore.util.hl;
import com.amap.api.maps.AMapException;
import com.xmlywind.sdk.common.Constants;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.cybergarage.upnp.UPnP;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class l {
    public static int a = -1;
    public static String b = "";
    public static Context c = null;
    private static volatile boolean e = true;
    private static Vector<c> f = new Vector<>();
    private static Map<String, Integer> g = new HashMap();
    private static String h = null;
    private static long i = 0;
    public static volatile boolean d = false;

    public static class a {
        public String a;
        public int b = -1;
        public long c = 0;
        public JSONObject d;
        public C0736a e;
        public b f;
        private boolean g;

        /* JADX INFO: renamed from: com.loc.l$a$a, reason: collision with other inner class name */
        public static class C0736a {
            public boolean a;
            public boolean b;
            public JSONObject c;
        }

        public static class b {
            public boolean a;
        }
    }

    public static class b extends ar {
        private String f;
        private Map<String, String> g;
        private boolean h;
        private String i;
        private String j;
        private String k;

        public b(Context context, t tVar, String str, String str2, String str3, String str4) {
            super(context, tVar);
            this.f = str;
            this.g = null;
            this.h = Build.VERSION.SDK_INT != 19;
            this.i = str2;
            this.j = str3;
            this.k = str4;
        }

        public final boolean a() {
            return this.h;
        }

        @Override // com.loc.ar
        public final byte[] a_() {
            return null;
        }

        @Override // com.loc.au
        public final Map<String, String> b() {
            if (TextUtils.isEmpty(this.k)) {
                return null;
            }
            HashMap map = new HashMap();
            map.put("host", this.k);
            return map;
        }

        @Override // com.loc.au
        public final String c() {
            String str = this.h ? "https://restapi.amap.com/v3/iasdkauth" : "http://restapi.amap.com/v3/iasdkauth";
            try {
                return !TextUtils.isEmpty(this.i) ? str.replace("restapi.amap.com", this.i) : str;
            } catch (Throwable unused) {
                return str;
            }
        }

        @Override // com.loc.q, com.loc.au
        public final String d() {
            try {
                String str = this.h ? "https://restapi.amap.com/v3/iasdkauth" : "http://restapi.amap.com/v3/iasdkauth";
                try {
                    if (!TextUtils.isEmpty(this.j)) {
                        return str.replace("restapi.amap.com", this.j);
                    }
                } catch (Throwable unused) {
                }
                Uri uri = Uri.parse(str);
                return uri.buildUpon().authority("dualstack-" + uri.getAuthority()).build().toString();
            } catch (Throwable unused2) {
                return null;
            }
        }

        @Override // com.loc.ar
        public final byte[] f() {
            String strW = n.w(this.a);
            if (TextUtils.isEmpty(strW)) {
                strW = n.i(this.a);
            }
            if (!TextUtils.isEmpty(strW)) {
                strW = r.a(new StringBuilder(strW).reverse().toString());
            }
            HashMap map = new HashMap();
            map.put("authkey", this.f);
            map.put("plattype", "android");
            map.put("product", this.b.a());
            map.put("version", this.b.b());
            map.put("output", "json");
            StringBuilder sb = new StringBuilder();
            sb.append(Build.VERSION.SDK_INT);
            map.put("androidversion", sb.toString());
            map.put("deviceId", strW);
            map.put("manufacture", Build.MANUFACTURER);
            Map<String, String> map2 = this.g;
            if (map2 != null && !map2.isEmpty()) {
                map.putAll(this.g);
            }
            map.put("abitype", u.a(this.a));
            map.put(Constants.EXT, this.b.d());
            return u.a(u.a(map));
        }

        @Override // com.loc.ar
        public final String g() {
            return UPnP.VERSION;
        }

        @Override // com.loc.au
        public final String h() {
            return !TextUtils.isEmpty(this.k) ? this.k : super.h();
        }
    }

    public static class c {
        private String a;
        private String b;
        private AtomicInteger c;

        public c(String str, String str2, int i) {
            this.a = str;
            this.b = str2;
            this.c = new AtomicInteger(i);
        }

        public static c b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new c(jSONObject.optString("a"), jSONObject.optString("f"), jSONObject.optInt("h"));
            } catch (Throwable unused) {
                return null;
            }
        }

        public final int a() {
            AtomicInteger atomicInteger = this.c;
            if (atomicInteger == null) {
                return 0;
            }
            return atomicInteger.get();
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
    }

    public static class d {
        public static boolean a = true;
        public static boolean b = false;
        public static boolean c = true;
        public static int d = 0;
        public static boolean e = false;
        public static int f;
    }

    public static a a(Context context, t tVar, String str, String str2, String str3, String str4) {
        return b(context, tVar, str, str2, str3, str4);
    }

    public static void a(int i2) {
        if (i2 != 2) {
            return;
        }
        try {
            c cVarB = b(c, "IPV6_CONFIG_NAME");
            String strA = u.a(System.currentTimeMillis(), "yyyyMMdd");
            if (!strA.equals(cVarB.b)) {
                cVarB.a(strA);
                cVarB.c.set(0);
            }
            cVarB.c.incrementAndGet();
            Context context = c;
            if (cVarB != null && !TextUtils.isEmpty(cVarB.a)) {
                String strB = cVarB.b();
                if (TextUtils.isEmpty(strB) || context == null) {
                    return;
                }
                new x("IPV6_CONFIG_NAME").a(context, "i", strB);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(Context context) {
        if (context != null) {
            c = context.getApplicationContext();
        }
    }

    private static void a(Context context, t tVar, String str) {
        HashMap map = new HashMap();
        map.put("amap_sdk_auth_fail", "1");
        map.put("amap_sdk_auth_fail_type", str);
        map.put("amap_sdk_name", tVar.a());
        map.put("amap_sdk_version", tVar.c());
        String string = new JSONObject(map).toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            ba baVar = new ba(context, "core", "1.0", "O001");
            baVar.a(string);
            bb.a(baVar, context);
        } catch (j unused) {
        }
    }

    private static void a(Context context, t tVar, Throwable th) {
        a(context, tVar, th.getMessage());
    }

    public static void a(Context context, String str) {
        k.a(context, str);
    }

    private static void a(Context context, String str, a aVar, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject2;
        boolean zA;
        a.C0736a c0736a = new a.C0736a();
        c0736a.a = false;
        c0736a.b = false;
        aVar.e = c0736a;
        try {
            String[] strArrSplit = str.split(";");
            if (strArrSplit != null && strArrSplit.length > 0) {
                for (String str2 : strArrSplit) {
                    if (jSONObject.has(str2)) {
                        aVar.d.putOpt(str2, jSONObject.get(str2));
                    }
                }
            }
        } catch (Throwable th) {
            y.a(th, "at", com.xiaomi.market.sdk.Constants.JSON_COUNTRY);
        }
        if (u.a(jSONObject, "16H")) {
            aVar.g = a(jSONObject.getJSONObject("16H").optString("able"), false);
        }
        if (u.a(jSONObject, "11K")) {
            try {
                JSONObject jSONObject3 = jSONObject.getJSONObject("11K");
                c0736a.a = a(jSONObject3.getString("able"), false);
                if (jSONObject3.has("off")) {
                    c0736a.c = jSONObject3.getJSONObject("off");
                }
            } catch (Throwable th2) {
                y.a(th2, "AuthConfigManager", "loadException");
            }
        }
        if (u.a(jSONObject, "151")) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("151");
            a.b bVar = new a.b();
            if (jSONObject4 != null) {
                bVar.a = a(jSONObject4.optString("able"), false);
            }
            aVar.f = bVar;
        }
        if (u.a(jSONObject, "17S") && (jSONObject2 = jSONObject.getJSONObject("17S")) != null && (zA = a(jSONObject2.optString("able"), false)) != e) {
            e = zA;
            if (context != null) {
                new x("IPV6_CONFIG_NAME").a(context, hl.k, zA);
            }
        }
        if (!u.a(jSONObject, "15K") || (jSONObjectOptJSONObject = jSONObject.optJSONObject("15K")) == null) {
            return;
        }
        boolean zA2 = a(jSONObjectOptJSONObject.optString("ucf"), d.a);
        boolean zA3 = a(jSONObjectOptJSONObject.optString("fsv2"), d.b);
        boolean zA4 = a(jSONObjectOptJSONObject.optString("usc"), d.c);
        int iOptInt = jSONObjectOptJSONObject.optInt("umv", d.d);
        boolean zA5 = a(jSONObjectOptJSONObject.optString("ust"), d.e);
        int iOptInt2 = jSONObjectOptJSONObject.optInt("ustv", d.f);
        if (zA2 == d.a && zA3 == d.b && zA4 == d.c && iOptInt == d.d && zA5 == d.e && iOptInt2 == d.d) {
            return;
        }
        d.a = zA2;
        d.b = zA3;
        d.c = zA4;
        d.d = iOptInt;
        d.e = zA5;
        d.f = iOptInt2;
        try {
            SharedPreferences.Editor editorC = x.c(context, "Https_Config");
            x.a(editorC, "ucf", d.a);
            x.a(editorC, "fsv2", d.b);
            x.a(editorC, "usc", d.c);
            x.a(editorC, "umv", d.d);
            x.a(editorC, "ust", d.e);
            x.a(editorC, "ustv", d.f);
            x.a(editorC);
        } catch (Throwable unused) {
        }
    }

    public static void a(String str, boolean z, boolean z2, boolean z3, long j) {
        if (TextUtils.isEmpty(str) || c == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("url", str);
        map.put("downLevel", String.valueOf(z2));
        map.put("ant", n.q(c) == 0 ? "0" : "1");
        map.put("type", z ? "6" : "4");
        map.put("status", z3 ? "0" : "1");
        map.put("duration", String.valueOf(j));
        String string = new JSONObject(map).toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            ba baVar = new ba(c, "core", "1.0", "O002");
            baVar.a(string);
            bb.a(baVar, c);
        } catch (j unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0067 A[Catch: all -> 0x00ee, TryCatch #0 {all -> 0x00ee, blocks: (B:5:0x0008, B:7:0x0014, B:9:0x001a, B:11:0x0022, B:14:0x0032, B:16:0x0038, B:20:0x004a, B:21:0x0061, B:23:0x0067, B:25:0x0077, B:26:0x0084, B:28:0x008a, B:30:0x0098, B:32:0x00a0, B:33:0x00a3, B:35:0x00a7, B:37:0x00af, B:39:0x00bf, B:42:0x00c6, B:44:0x00cf, B:45:0x00d7, B:47:0x00dd, B:49:0x00e5, B:17:0x003b), top: B:69:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x008a A[Catch: all -> 0x00ee, TryCatch #0 {all -> 0x00ee, blocks: (B:5:0x0008, B:7:0x0014, B:9:0x001a, B:11:0x0022, B:14:0x0032, B:16:0x0038, B:20:0x004a, B:21:0x0061, B:23:0x0067, B:25:0x0077, B:26:0x0084, B:28:0x008a, B:30:0x0098, B:32:0x00a0, B:33:0x00a3, B:35:0x00a7, B:37:0x00af, B:39:0x00bf, B:42:0x00c6, B:44:0x00cf, B:45:0x00d7, B:47:0x00dd, B:49:0x00e5, B:17:0x003b), top: B:69:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0061 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0084 A[SYNTHETIC] */
    public static boolean a() {
        String displayName;
        Iterator<InterfaceAddress> it2;
        int i2;
        Map<String, Integer> map;
        String str;
        Integer numValueOf;
        InetAddress address;
        Inet4Address inet4Address;
        c cVarB;
        Context context = c;
        if (context != null) {
            try {
                if (context != null) {
                    String strV = n.v(context);
                    if (TextUtils.isEmpty(h) || TextUtils.isEmpty(strV) || !h.equals(strV) || System.currentTimeMillis() - i >= 60000) {
                        if (!TextUtils.isEmpty(strV)) {
                            h = strV;
                        }
                        i = System.currentTimeMillis();
                        g.clear();
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
                                        if (a(inet4Address) && !inet4Address.getHostAddress().startsWith(u.c("FMTkyLjE2OC40My4"))) {
                                            i2 |= 1;
                                        }
                                    }
                                }
                                if (i2 == 0) {
                                    if (displayName == null && displayName.startsWith("wlan")) {
                                        map = g;
                                        str = "WIFI";
                                        numValueOf = Integer.valueOf(i2);
                                    } else if (displayName == null && displayName.startsWith("rmnet")) {
                                        map = g;
                                        str = "MOBILE";
                                        numValueOf = Integer.valueOf(i2);
                                    }
                                    map.put(str, numValueOf);
                                }
                            }
                        }
                    }
                } else if (System.currentTimeMillis() - i >= 10000) {
                    i = System.currentTimeMillis();
                    g.clear();
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
                                    if (displayName == null) {
                                    }
                                } else if (displayName == null) {
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                y.a(th, "at", "ipstack");
            }
            if (!c()) {
                return false;
            }
            if (b()) {
                return true;
            }
        }
        return e && (cVarB = b(c, "IPV6_CONFIG_NAME")) != null && cVarB.a() < 5;
    }

    public static boolean a(String str, boolean z) {
        try {
            if (TextUtils.isEmpty(str)) {
                return z;
            }
            String[] strArrSplit = URLDecoder.decode(str).split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
            return strArrSplit[strArrSplit.length - 1].charAt(4) % 2 == 1;
        } catch (Throwable unused) {
            return z;
        }
    }

    private static boolean a(InetAddress inetAddress) {
        return inetAddress.isLoopbackAddress() || inetAddress.isLinkLocalAddress() || inetAddress.isAnyLocalAddress();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:104:0x01e3 A[Catch: all -> 0x02a6, TryCatch #5 {all -> 0x02a6, blocks: (B:102:0x01d8, B:104:0x01e3, B:106:0x01ea, B:110:0x01f5, B:112:0x01fe, B:114:0x020a, B:115:0x0210, B:117:0x0218, B:118:0x021c), top: B:152:0x01d8 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01ea A[Catch: all -> 0x02a6, TryCatch #5 {all -> 0x02a6, blocks: (B:102:0x01d8, B:104:0x01e3, B:106:0x01ea, B:110:0x01f5, B:112:0x01fe, B:114:0x020a, B:115:0x0210, B:117:0x0218, B:118:0x021c), top: B:152:0x01d8 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x01ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:110:0x01f5 A[Catch: all -> 0x02a6, TryCatch #5 {all -> 0x02a6, blocks: (B:102:0x01d8, B:104:0x01e3, B:106:0x01ea, B:110:0x01f5, B:112:0x01fe, B:114:0x020a, B:115:0x0210, B:117:0x0218, B:118:0x021c), top: B:152:0x01d8 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:114:0x020a A[Catch: all -> 0x02a6, TryCatch #5 {all -> 0x02a6, blocks: (B:102:0x01d8, B:104:0x01e3, B:106:0x01ea, B:110:0x01f5, B:112:0x01fe, B:114:0x020a, B:115:0x0210, B:117:0x0218, B:118:0x021c), top: B:152:0x01d8 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0218 A[Catch: all -> 0x02a6, TryCatch #5 {all -> 0x02a6, blocks: (B:102:0x01d8, B:104:0x01e3, B:106:0x01ea, B:110:0x01f5, B:112:0x01fe, B:114:0x020a, B:115:0x0210, B:117:0x0218, B:118:0x021c), top: B:152:0x01d8 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0230 A[Catch: all -> 0x02a4, TRY_LEAVE, TryCatch #4 {all -> 0x02a4, blocks: (B:131:0x0249, B:133:0x024f, B:135:0x025e, B:130:0x0246, B:120:0x0229, B:122:0x0230, B:125:0x0238, B:127:0x023e), top: B:151:0x0229, inners: #19 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x023e A[Catch: all -> 0x0245, TRY_LEAVE, TryCatch #19 {all -> 0x0245, blocks: (B:125:0x0238, B:127:0x023e), top: B:160:0x0238, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x024f A[Catch: all -> 0x02a4, TryCatch #4 {all -> 0x02a4, blocks: (B:131:0x0249, B:133:0x024f, B:135:0x025e, B:130:0x0246, B:120:0x0229, B:122:0x0230, B:125:0x0238, B:127:0x023e), top: B:151:0x0229, inners: #19 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x025e A[Catch: all -> 0x02a4, TRY_LEAVE, TryCatch #4 {all -> 0x02a4, blocks: (B:131:0x0249, B:133:0x024f, B:135:0x025e, B:130:0x0246, B:120:0x0229, B:122:0x0230, B:125:0x0238, B:127:0x023e), top: B:151:0x0229, inners: #19 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x0298 A[Catch: all -> 0x02ab, TryCatch #7 {all -> 0x02ab, blocks: (B:136:0x027b, B:138:0x0298, B:139:0x029e), top: B:156:0x027b }] */
    /* JADX WARN: Code duplicated, block: B:139:0x029e A[Catch: all -> 0x02ab, TRY_LEAVE, TryCatch #7 {all -> 0x02ab, blocks: (B:136:0x027b, B:138:0x0298, B:139:0x029e), top: B:156:0x027b }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:96:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30, types: [com.loc.l$a] */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [com.loc.l$a] */
    /* JADX WARN: Type inference failed for: r7v9, types: [com.loc.l$a] */
    private static a b(Context context, t tVar, String str, String str2, String str3, String str4) {
        ?? r7;
        String str5;
        String str6;
        String string;
        av avVarA;
        byte[] bArr;
        ?? r8;
        String str7;
        ?? r9;
        String str8;
        ?? r10;
        String str9;
        String str10;
        JSONObject jSONObject;
        int i2;
        String str11;
        String str12;
        JSONObject jSONObject2;
        String str13;
        JSONObject jSONObject3;
        boolean zA;
        ?? r11;
        List<String> list;
        ?? r12 = "lct";
        String str14 = "lc";
        a aVar = new a();
        aVar.d = new JSONObject();
        p.a.a.a(context);
        b(context);
        if (context != null) {
            c = context.getApplicationContext();
        }
        String strA = null;
        try {
            try {
                try {
                    try {
                        new aq();
                        try {
                            StringBuilder sb = new StringBuilder();
                            try {
                                sb.append(str);
                                sb.append(";15K;16H;17I;17S");
                                string = sb.toString();
                                try {
                                    str5 = "17I";
                                    str7 = "lc";
                                    try {
                                        b bVar = new b(context, tVar, string, str2, str3, str4);
                                        avVarA = aq.a(bVar, bVar.a());
                                        if (avVarA != null) {
                                            try {
                                                bArr = avVarA.a;
                                                try {
                                                    Map<String, List<String>> map = avVarA.b;
                                                    if (map == null || !map.containsKey("lct") || (list = map.get("lct")) == null || list.size() <= 0) {
                                                        r11 = aVar;
                                                    } else {
                                                        r12 = aVar;
                                                        try {
                                                            r12.c = Long.valueOf(list.get(0)).longValue();
                                                            r11 = r12;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            str14 = "at";
                                                            try {
                                                                ab.b(th, str14, "lct");
                                                                r12 = r12;
                                                            } catch (j e2) {
                                                                e = e2;
                                                                str6 = str7;
                                                                r8 = r12;
                                                                r8.a = e.a();
                                                                a(context, tVar, e.a());
                                                                ab.a(tVar, "/v3/iasdkauth", e);
                                                                r9 = r8;
                                                                str8 = string;
                                                                r10 = r9;
                                                            } catch (IllegalBlockSizeException e3) {
                                                                e = e3;
                                                                str6 = str7;
                                                                r7 = r12;
                                                                a(context, tVar, e);
                                                                r9 = r7;
                                                                str8 = string;
                                                                r10 = r9;
                                                            } catch (Throwable th2) {
                                                                e = th2;
                                                                str6 = str7;
                                                                ab.b(e, str14, str6);
                                                                r7 = r12;
                                                                a(context, tVar, e);
                                                                r9 = r7;
                                                                str8 = string;
                                                                r10 = r9;
                                                            }
                                                        }
                                                    }
                                                    str14 = "at";
                                                    r12 = r11;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    r12 = aVar;
                                                }
                                            } catch (j e4) {
                                                e = e4;
                                                r12 = aVar;
                                                str14 = "at";
                                                bArr = null;
                                                str6 = str7;
                                                r8 = r12;
                                                r8.a = e.a();
                                                a(context, tVar, e.a());
                                                ab.a(tVar, "/v3/iasdkauth", e);
                                                r9 = r8;
                                                str8 = string;
                                                r10 = r9;
                                            } catch (IllegalBlockSizeException e5) {
                                                e = e5;
                                                r12 = aVar;
                                                str14 = "at";
                                                bArr = null;
                                                str6 = str7;
                                                r7 = r12;
                                                a(context, tVar, e);
                                                r9 = r7;
                                                str8 = string;
                                                r10 = r9;
                                            } catch (Throwable th4) {
                                                e = th4;
                                                r12 = aVar;
                                                str14 = "at";
                                                bArr = null;
                                                str6 = str7;
                                                ab.b(e, str14, str6);
                                                r7 = r12;
                                                a(context, tVar, e);
                                                r9 = r7;
                                                str8 = string;
                                                r10 = r9;
                                            }
                                        } else {
                                            r12 = aVar;
                                            str14 = "at";
                                            bArr = null;
                                        }
                                        byte[] bArr2 = new byte[16];
                                        byte[] bArr3 = new byte[bArr.length - 16];
                                        System.arraycopy(bArr, 0, bArr2, 0, 16);
                                        System.arraycopy(bArr, 16, bArr3, 0, bArr.length - 16);
                                        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, com.huami.network.hmnetwork.utils.a.a);
                                        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                                        cipher.init(2, secretKeySpec, new IvParameterSpec(u.c()));
                                        strA = u.a(cipher.doFinal(bArr3));
                                        str8 = string;
                                        str6 = str7;
                                        r10 = r12;
                                    } catch (j e6) {
                                        e = e6;
                                        throw e;
                                    } catch (Throwable unused) {
                                        throw new j(AMapException.ERROR_UNKNOWN);
                                    }
                                } catch (j e7) {
                                    e = e7;
                                } catch (Throwable unused2) {
                                }
                            } catch (j e8) {
                                e = e8;
                                throw e;
                            } catch (Throwable unused3) {
                                throw new j(AMapException.ERROR_UNKNOWN);
                            }
                        } catch (j e9) {
                            e = e9;
                        } catch (Throwable unused4) {
                        }
                    } catch (j e10) {
                        e = e10;
                        r12 = aVar;
                        str7 = "lc";
                        str5 = "17I";
                        str14 = "at";
                        string = str;
                        avVarA = null;
                        bArr = null;
                        str6 = str7;
                        r8 = r12;
                        r8.a = e.a();
                        a(context, tVar, e.a());
                        ab.a(tVar, "/v3/iasdkauth", e);
                        r9 = r8;
                        str8 = string;
                        r10 = r9;
                        if (bArr == null) {
                            return r10;
                        }
                        if (TextUtils.isEmpty(strA)) {
                            strA = u.a(bArr);
                        }
                        str9 = strA;
                        if (TextUtils.isEmpty(str9)) {
                            a(context, tVar, "result is null");
                        }
                        try {
                            jSONObject = new JSONObject(str9);
                            if (jSONObject.has("status")) {
                                i2 = jSONObject.getInt("status");
                                try {
                                    if (i2 == 1) {
                                        a = 1;
                                    } else {
                                        if (i2 == 0) {
                                            if (avVarA != null) {
                                                str11 = avVarA.c;
                                                str12 = avVarA.d;
                                            } else {
                                                str11 = "authcsid";
                                                str12 = "authgsid";
                                            }
                                            u.a(context, str11, str12, jSONObject);
                                            a = 0;
                                            if (jSONObject.has("info")) {
                                                b = jSONObject.getString("info");
                                            }
                                            String str15 = str11;
                                            str10 = str14;
                                            try {
                                                ab.a(tVar, "/v3/iasdkauth", b, str12, str15, jSONObject.has("infocode") ? jSONObject.getString("infocode") : "");
                                                if (a == 0) {
                                                    r10.a = b;
                                                    return r10;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                y.a(th, str10, str6);
                                            }
                                        }
                                        if (jSONObject.has("ver")) {
                                            r10.b = jSONObject.getInt("ver");
                                        }
                                        if (u.a(jSONObject, "result")) {
                                            jSONObject2 = jSONObject.getJSONObject("result");
                                            a(context, str8, r10, jSONObject2);
                                            str13 = str5;
                                            if (u.a(jSONObject2, str13)) {
                                                JSONObject jSONObject4 = jSONObject2.getJSONObject(str13);
                                                boolean zA2 = a(jSONObject4.optString("na"), false);
                                                boolean zA3 = a(jSONObject4.optString("aa"), false);
                                                v.e = zA2;
                                                v.f = zA3;
                                            }
                                            try {
                                                jSONObject3 = jSONObject2.getJSONObject("15K");
                                                zA = a(jSONObject3.optString("isTargetAble"), false);
                                                if (a(jSONObject3.optString("able"), false)) {
                                                    p.a.a.a(context, zA);
                                                } else {
                                                    p.a.a.b(context);
                                                }
                                            } catch (Throwable unused5) {
                                            }
                                        }
                                    }
                                    if (jSONObject.has("ver")) {
                                        r10.b = jSONObject.getInt("ver");
                                    }
                                } catch (Throwable th6) {
                                    y.a(th6, str10, str6);
                                }
                                str10 = str14;
                                if (u.a(jSONObject, "result")) {
                                    jSONObject2 = jSONObject.getJSONObject("result");
                                    a(context, str8, r10, jSONObject2);
                                    str13 = str5;
                                    if (u.a(jSONObject2, str13)) {
                                        JSONObject jSONObject5 = jSONObject2.getJSONObject(str13);
                                        boolean zA4 = a(jSONObject5.optString("na"), false);
                                        boolean zA5 = a(jSONObject5.optString("aa"), false);
                                        v.e = zA4;
                                        v.f = zA5;
                                    }
                                    jSONObject3 = jSONObject2.getJSONObject("15K");
                                    zA = a(jSONObject3.optString("isTargetAble"), false);
                                    if (a(jSONObject3.optString("able"), false)) {
                                        p.a.a.b(context);
                                    } else {
                                        p.a.a.a(context, zA);
                                    }
                                }
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            str10 = str14;
                        }
                        return r10;
                    } catch (IllegalBlockSizeException e11) {
                        e = e11;
                        r12 = aVar;
                        str7 = "lc";
                        str5 = "17I";
                        str14 = "at";
                        string = str;
                        avVarA = null;
                        bArr = null;
                        str6 = str7;
                        r7 = r12;
                        a(context, tVar, e);
                        r9 = r7;
                        str8 = string;
                        r10 = r9;
                        if (bArr == null) {
                            return r10;
                        }
                        if (TextUtils.isEmpty(strA)) {
                            strA = u.a(bArr);
                        }
                        str9 = strA;
                        if (TextUtils.isEmpty(str9)) {
                            a(context, tVar, "result is null");
                        }
                        jSONObject = new JSONObject(str9);
                        if (jSONObject.has("status")) {
                            i2 = jSONObject.getInt("status");
                            if (i2 == 1) {
                                a = 1;
                            } else {
                                if (i2 == 0) {
                                    if (avVarA != null) {
                                        str11 = avVarA.c;
                                        str12 = avVarA.d;
                                    } else {
                                        str11 = "authcsid";
                                        str12 = "authgsid";
                                    }
                                    u.a(context, str11, str12, jSONObject);
                                    a = 0;
                                    if (jSONObject.has("info")) {
                                        b = jSONObject.getString("info");
                                    }
                                    String str16 = str11;
                                    str10 = str14;
                                    ab.a(tVar, "/v3/iasdkauth", b, str12, str16, jSONObject.has("infocode") ? jSONObject.getString("infocode") : "");
                                    if (a == 0) {
                                        r10.a = b;
                                        return r10;
                                    }
                                }
                                if (jSONObject.has("ver")) {
                                    r10.b = jSONObject.getInt("ver");
                                }
                                if (u.a(jSONObject, "result")) {
                                    jSONObject2 = jSONObject.getJSONObject("result");
                                    a(context, str8, r10, jSONObject2);
                                    str13 = str5;
                                    if (u.a(jSONObject2, str13)) {
                                        JSONObject jSONObject6 = jSONObject2.getJSONObject(str13);
                                        boolean zA6 = a(jSONObject6.optString("na"), false);
                                        boolean zA7 = a(jSONObject6.optString("aa"), false);
                                        v.e = zA6;
                                        v.f = zA7;
                                    }
                                    jSONObject3 = jSONObject2.getJSONObject("15K");
                                    zA = a(jSONObject3.optString("isTargetAble"), false);
                                    if (a(jSONObject3.optString("able"), false)) {
                                        p.a.a.b(context);
                                    } else {
                                        p.a.a.a(context, zA);
                                    }
                                }
                            }
                            str10 = str14;
                            if (jSONObject.has("ver")) {
                                r10.b = jSONObject.getInt("ver");
                            }
                            if (u.a(jSONObject, "result")) {
                                jSONObject2 = jSONObject.getJSONObject("result");
                                a(context, str8, r10, jSONObject2);
                                str13 = str5;
                                if (u.a(jSONObject2, str13)) {
                                    JSONObject jSONObject7 = jSONObject2.getJSONObject(str13);
                                    boolean zA8 = a(jSONObject7.optString("na"), false);
                                    boolean zA9 = a(jSONObject7.optString("aa"), false);
                                    v.e = zA8;
                                    v.f = zA9;
                                }
                                jSONObject3 = jSONObject2.getJSONObject("15K");
                                zA = a(jSONObject3.optString("isTargetAble"), false);
                                if (a(jSONObject3.optString("able"), false)) {
                                    p.a.a.b(context);
                                } else {
                                    p.a.a.a(context, zA);
                                }
                            }
                        }
                        return r10;
                    }
                } catch (j e12) {
                    e = e12;
                    string = str;
                    avVarA = null;
                    bArr = null;
                    str6 = str7;
                    r8 = r12;
                    r8.a = e.a();
                    a(context, tVar, e.a());
                    ab.a(tVar, "/v3/iasdkauth", e);
                    r9 = r8;
                    str8 = string;
                    r10 = r9;
                    if (bArr == null) {
                        return r10;
                    }
                    if (TextUtils.isEmpty(strA)) {
                        strA = u.a(bArr);
                    }
                    str9 = strA;
                    if (TextUtils.isEmpty(str9)) {
                        a(context, tVar, "result is null");
                    }
                    jSONObject = new JSONObject(str9);
                    if (jSONObject.has("status")) {
                        i2 = jSONObject.getInt("status");
                        if (i2 == 1) {
                            a = 1;
                        } else {
                            if (i2 == 0) {
                                if (avVarA != null) {
                                    str11 = avVarA.c;
                                    str12 = avVarA.d;
                                } else {
                                    str11 = "authcsid";
                                    str12 = "authgsid";
                                }
                                u.a(context, str11, str12, jSONObject);
                                a = 0;
                                if (jSONObject.has("info")) {
                                    b = jSONObject.getString("info");
                                }
                                String str17 = str11;
                                str10 = str14;
                                ab.a(tVar, "/v3/iasdkauth", b, str12, str17, jSONObject.has("infocode") ? jSONObject.getString("infocode") : "");
                                if (a == 0) {
                                    r10.a = b;
                                    return r10;
                                }
                            }
                            if (jSONObject.has("ver")) {
                                r10.b = jSONObject.getInt("ver");
                            }
                            if (u.a(jSONObject, "result")) {
                                jSONObject2 = jSONObject.getJSONObject("result");
                                a(context, str8, r10, jSONObject2);
                                str13 = str5;
                                if (u.a(jSONObject2, str13)) {
                                    JSONObject jSONObject8 = jSONObject2.getJSONObject(str13);
                                    boolean zA10 = a(jSONObject8.optString("na"), false);
                                    boolean zA11 = a(jSONObject8.optString("aa"), false);
                                    v.e = zA10;
                                    v.f = zA11;
                                }
                                jSONObject3 = jSONObject2.getJSONObject("15K");
                                zA = a(jSONObject3.optString("isTargetAble"), false);
                                if (a(jSONObject3.optString("able"), false)) {
                                    p.a.a.b(context);
                                } else {
                                    p.a.a.a(context, zA);
                                }
                            }
                        }
                        str10 = str14;
                        if (jSONObject.has("ver")) {
                            r10.b = jSONObject.getInt("ver");
                        }
                        if (u.a(jSONObject, "result")) {
                            jSONObject2 = jSONObject.getJSONObject("result");
                            a(context, str8, r10, jSONObject2);
                            str13 = str5;
                            if (u.a(jSONObject2, str13)) {
                                JSONObject jSONObject9 = jSONObject2.getJSONObject(str13);
                                boolean zA12 = a(jSONObject9.optString("na"), false);
                                boolean zA13 = a(jSONObject9.optString("aa"), false);
                                v.e = zA12;
                                v.f = zA13;
                            }
                            jSONObject3 = jSONObject2.getJSONObject("15K");
                            zA = a(jSONObject3.optString("isTargetAble"), false);
                            if (a(jSONObject3.optString("able"), false)) {
                                p.a.a.b(context);
                            } else {
                                p.a.a.a(context, zA);
                            }
                        }
                    }
                    return r10;
                } catch (IllegalBlockSizeException e13) {
                    e = e13;
                    string = str;
                    avVarA = null;
                    bArr = null;
                    str6 = str7;
                    r7 = r12;
                    a(context, tVar, e);
                    r9 = r7;
                    str8 = string;
                    r10 = r9;
                    if (bArr == null) {
                        return r10;
                    }
                    if (TextUtils.isEmpty(strA)) {
                        strA = u.a(bArr);
                    }
                    str9 = strA;
                    if (TextUtils.isEmpty(str9)) {
                        a(context, tVar, "result is null");
                    }
                    jSONObject = new JSONObject(str9);
                    if (jSONObject.has("status")) {
                        i2 = jSONObject.getInt("status");
                        if (i2 == 1) {
                            a = 1;
                        } else {
                            if (i2 == 0) {
                                if (avVarA != null) {
                                    str11 = avVarA.c;
                                    str12 = avVarA.d;
                                } else {
                                    str11 = "authcsid";
                                    str12 = "authgsid";
                                }
                                u.a(context, str11, str12, jSONObject);
                                a = 0;
                                if (jSONObject.has("info")) {
                                    b = jSONObject.getString("info");
                                }
                                String str18 = str11;
                                str10 = str14;
                                ab.a(tVar, "/v3/iasdkauth", b, str12, str18, jSONObject.has("infocode") ? jSONObject.getString("infocode") : "");
                                if (a == 0) {
                                    r10.a = b;
                                    return r10;
                                }
                            }
                            if (jSONObject.has("ver")) {
                                r10.b = jSONObject.getInt("ver");
                            }
                            if (u.a(jSONObject, "result")) {
                                jSONObject2 = jSONObject.getJSONObject("result");
                                a(context, str8, r10, jSONObject2);
                                str13 = str5;
                                if (u.a(jSONObject2, str13)) {
                                    JSONObject jSONObject10 = jSONObject2.getJSONObject(str13);
                                    boolean zA14 = a(jSONObject10.optString("na"), false);
                                    boolean zA15 = a(jSONObject10.optString("aa"), false);
                                    v.e = zA14;
                                    v.f = zA15;
                                }
                                jSONObject3 = jSONObject2.getJSONObject("15K");
                                zA = a(jSONObject3.optString("isTargetAble"), false);
                                if (a(jSONObject3.optString("able"), false)) {
                                    p.a.a.b(context);
                                } else {
                                    p.a.a.a(context, zA);
                                }
                            }
                        }
                        str10 = str14;
                        if (jSONObject.has("ver")) {
                            r10.b = jSONObject.getInt("ver");
                        }
                        if (u.a(jSONObject, "result")) {
                            jSONObject2 = jSONObject.getJSONObject("result");
                            a(context, str8, r10, jSONObject2);
                            str13 = str5;
                            if (u.a(jSONObject2, str13)) {
                                JSONObject jSONObject11 = jSONObject2.getJSONObject(str13);
                                boolean zA16 = a(jSONObject11.optString("na"), false);
                                boolean zA17 = a(jSONObject11.optString("aa"), false);
                                v.e = zA16;
                                v.f = zA17;
                            }
                            jSONObject3 = jSONObject2.getJSONObject("15K");
                            zA = a(jSONObject3.optString("isTargetAble"), false);
                            if (a(jSONObject3.optString("able"), false)) {
                                p.a.a.b(context);
                            } else {
                                p.a.a.a(context, zA);
                            }
                        }
                    }
                    return r10;
                } catch (Throwable th8) {
                    e = th8;
                    string = str;
                    avVarA = null;
                    bArr = null;
                    str6 = str7;
                    ab.b(e, str14, str6);
                    r7 = r12;
                    a(context, tVar, e);
                    r9 = r7;
                    str8 = string;
                    r10 = r9;
                    if (bArr == null) {
                        return r10;
                    }
                    if (TextUtils.isEmpty(strA)) {
                        strA = u.a(bArr);
                    }
                    str9 = strA;
                    if (TextUtils.isEmpty(str9)) {
                        a(context, tVar, "result is null");
                    }
                    jSONObject = new JSONObject(str9);
                    if (jSONObject.has("status")) {
                        i2 = jSONObject.getInt("status");
                        if (i2 == 1) {
                            a = 1;
                        } else {
                            if (i2 == 0) {
                                if (avVarA != null) {
                                    str11 = avVarA.c;
                                    str12 = avVarA.d;
                                } else {
                                    str11 = "authcsid";
                                    str12 = "authgsid";
                                }
                                u.a(context, str11, str12, jSONObject);
                                a = 0;
                                if (jSONObject.has("info")) {
                                    b = jSONObject.getString("info");
                                }
                                String str19 = str11;
                                str10 = str14;
                                ab.a(tVar, "/v3/iasdkauth", b, str12, str19, jSONObject.has("infocode") ? jSONObject.getString("infocode") : "");
                                if (a == 0) {
                                    r10.a = b;
                                    return r10;
                                }
                            }
                            if (jSONObject.has("ver")) {
                                r10.b = jSONObject.getInt("ver");
                            }
                            if (u.a(jSONObject, "result")) {
                                jSONObject2 = jSONObject.getJSONObject("result");
                                a(context, str8, r10, jSONObject2);
                                str13 = str5;
                                if (u.a(jSONObject2, str13)) {
                                    JSONObject jSONObject12 = jSONObject2.getJSONObject(str13);
                                    boolean zA18 = a(jSONObject12.optString("na"), false);
                                    boolean zA19 = a(jSONObject12.optString("aa"), false);
                                    v.e = zA18;
                                    v.f = zA19;
                                }
                                jSONObject3 = jSONObject2.getJSONObject("15K");
                                zA = a(jSONObject3.optString("isTargetAble"), false);
                                if (a(jSONObject3.optString("able"), false)) {
                                    p.a.a.b(context);
                                } else {
                                    p.a.a.a(context, zA);
                                }
                            }
                        }
                        str10 = str14;
                        if (jSONObject.has("ver")) {
                            r10.b = jSONObject.getInt("ver");
                        }
                        if (u.a(jSONObject, "result")) {
                            jSONObject2 = jSONObject.getJSONObject("result");
                            a(context, str8, r10, jSONObject2);
                            str13 = str5;
                            if (u.a(jSONObject2, str13)) {
                                JSONObject jSONObject13 = jSONObject2.getJSONObject(str13);
                                boolean zA110 = a(jSONObject13.optString("na"), false);
                                boolean zA111 = a(jSONObject13.optString("aa"), false);
                                v.e = zA110;
                                v.f = zA111;
                            }
                            jSONObject3 = jSONObject2.getJSONObject("15K");
                            zA = a(jSONObject3.optString("isTargetAble"), false);
                            if (a(jSONObject3.optString("able"), false)) {
                                p.a.a.b(context);
                            } else {
                                p.a.a.a(context, zA);
                            }
                        }
                    }
                    return r10;
                }
            } catch (Throwable th9) {
                e = th9;
                r12 = aVar;
                str7 = "lc";
                str5 = "17I";
                str14 = "at";
            }
        } catch (j e14) {
            e = e14;
            r8 = aVar;
            str5 = "17I";
            str6 = "lc";
            str14 = "at";
            string = str;
            avVarA = null;
            bArr = null;
        } catch (IllegalBlockSizeException e15) {
            e = e15;
            r7 = aVar;
            str5 = "17I";
            str6 = "lc";
            str14 = "at";
            string = str;
            avVarA = null;
            bArr = null;
        }
        if (bArr == null) {
            return r10;
        }
        if (TextUtils.isEmpty(strA)) {
            strA = u.a(bArr);
        }
        str9 = strA;
        if (TextUtils.isEmpty(str9)) {
            a(context, tVar, "result is null");
        }
        jSONObject = new JSONObject(str9);
        if (jSONObject.has("status")) {
            i2 = jSONObject.getInt("status");
            if (i2 == 1) {
                a = 1;
            } else {
                if (i2 == 0) {
                    if (avVarA != null) {
                        str11 = avVarA.c;
                        str12 = avVarA.d;
                    } else {
                        str11 = "authcsid";
                        str12 = "authgsid";
                    }
                    u.a(context, str11, str12, jSONObject);
                    a = 0;
                    if (jSONObject.has("info")) {
                        b = jSONObject.getString("info");
                    }
                    String str110 = str11;
                    str10 = str14;
                    ab.a(tVar, "/v3/iasdkauth", b, str12, str110, jSONObject.has("infocode") ? jSONObject.getString("infocode") : "");
                    if (a == 0) {
                        r10.a = b;
                        return r10;
                    }
                }
                if (jSONObject.has("ver")) {
                    r10.b = jSONObject.getInt("ver");
                }
                if (u.a(jSONObject, "result")) {
                    jSONObject2 = jSONObject.getJSONObject("result");
                    a(context, str8, r10, jSONObject2);
                    str13 = str5;
                    if (u.a(jSONObject2, str13)) {
                        JSONObject jSONObject14 = jSONObject2.getJSONObject(str13);
                        boolean zA112 = a(jSONObject14.optString("na"), false);
                        boolean zA113 = a(jSONObject14.optString("aa"), false);
                        v.e = zA112;
                        v.f = zA113;
                    }
                    jSONObject3 = jSONObject2.getJSONObject("15K");
                    zA = a(jSONObject3.optString("isTargetAble"), false);
                    if (a(jSONObject3.optString("able"), false)) {
                        p.a.a.b(context);
                    } else {
                        p.a.a.a(context, zA);
                    }
                }
            }
            str10 = str14;
            if (jSONObject.has("ver")) {
                r10.b = jSONObject.getInt("ver");
            }
            if (u.a(jSONObject, "result")) {
                jSONObject2 = jSONObject.getJSONObject("result");
                a(context, str8, r10, jSONObject2);
                str13 = str5;
                if (u.a(jSONObject2, str13)) {
                    JSONObject jSONObject15 = jSONObject2.getJSONObject(str13);
                    boolean zA114 = a(jSONObject15.optString("na"), false);
                    boolean zA115 = a(jSONObject15.optString("aa"), false);
                    v.e = zA114;
                    v.f = zA115;
                }
                jSONObject3 = jSONObject2.getJSONObject("15K");
                zA = a(jSONObject3.optString("isTargetAble"), false);
                if (a(jSONObject3.optString("able"), false)) {
                    p.a.a.b(context);
                } else {
                    p.a.a.a(context, zA);
                }
            }
        }
        return r10;
    }

    private static synchronized c b(Context context, String str) {
        c cVar;
        if (!TextUtils.isEmpty(str)) {
            int i2 = 0;
            while (true) {
                if (i2 >= f.size()) {
                    cVar = null;
                    break;
                }
                cVar = f.get(i2);
                if (cVar != null && str.equals(cVar.a)) {
                    break;
                }
                i2++;
            }
        } else {
            cVar = null;
            break;
        }
        if (cVar != null) {
            return cVar;
        }
        if (context == null) {
            return null;
        }
        c cVarB = c.b(new x(str).b(context, "i"));
        String strA = u.a(System.currentTimeMillis(), "yyyyMMdd");
        if (cVarB == null) {
            cVarB = new c("IPV6_CONFIG_NAME", strA, 0);
        }
        if (!strA.equals(cVarB.b)) {
            cVarB.a(strA);
            cVarB.c.set(0);
        }
        f.add(cVarB);
        return cVarB;
    }

    private static void b(Context context) {
        if (context == null) {
            return;
        }
        e = new x("IPV6_CONFIG_NAME").a(context, hl.k);
    }

    public static boolean b() {
        Integer num;
        Context context = c;
        if (context == null) {
            return false;
        }
        String strV = n.v(context);
        return (TextUtils.isEmpty(strV) || (num = g.get(strV.toUpperCase())) == null || num.intValue() != 2) ? false : true;
    }

    public static boolean c() {
        Integer num;
        Context context = c;
        if (context == null) {
            return false;
        }
        String strV = n.v(context);
        return (TextUtils.isEmpty(strV) || (num = g.get(strV.toUpperCase())) == null || num.intValue() < 2) ? false : true;
    }

    public static void d() {
        if (d) {
            return;
        }
        try {
            d = true;
            Context context = c;
            if (context == null) {
                return;
            }
            p.a.a.a(c);
            b(c);
            d.a = x.a(context, "Https_Config", "ucf", d.a);
            d.b = x.a(context, "Https_Config", "fsv2", d.b);
            d.c = x.a(context, "Https_Config", "usc", d.c);
            d.d = x.a(context, "Https_Config", "umv", d.d);
            d.e = x.a(context, "Https_Config", "ust", d.e);
            d.f = x.a(context, "Https_Config", "ustv", d.f);
        } catch (Throwable unused) {
        }
    }
}
