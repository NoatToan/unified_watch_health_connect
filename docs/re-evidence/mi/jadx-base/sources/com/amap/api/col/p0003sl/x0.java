package com.amap.api.col.p0003sl;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.amap.api.maps.AMapException;
import com.mibi.sdk.common.CommonConstants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.ai.android.utils.NetworkUtils;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.phonenum.data.AccountCertification;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.e0t;
import defpackage.f6t;
import defpackage.f7t;
import defpackage.g6t;
import defpackage.h0t;
import defpackage.i4t;
import defpackage.j2t;
import defpackage.k0t;
import defpackage.m0t;
import defpackage.m2t;
import defpackage.o0t;
import defpackage.p0t;
import defpackage.q0t;
import defpackage.s5;
import defpackage.t1t;
import defpackage.t4t;
import defpackage.v4t;
import defpackage.v5t;
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
import kotlinx.coroutines.DebugKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class x0 {
    public static volatile boolean D = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f6303a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f6304b = "";
    public static String c = "6";
    public static String d = "4";
    public static String e = "9";
    public static String f = "8";
    public static Context g = null;
    public static volatile boolean h = true;
    public static Vector<f> i = new Vector<>();
    public static Map<String, Integer> j = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static String f6305k = null;
    public static long l = 0;
    public static volatile boolean m = false;
    public static volatile ConcurrentHashMap<String, h> n = new ConcurrentHashMap<>(8);
    public static volatile ConcurrentHashMap<String, Long> o = new ConcurrentHashMap<>(8);
    public static volatile ConcurrentHashMap<String, e> p = new ConcurrentHashMap<>(8);
    public static boolean q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static boolean f6306r = false;
    public static int s = 5000;
    public static boolean t = true;
    public static boolean u = false;
    public static int v = 3;
    public static boolean w = true;
    public static boolean x = false;
    public static int y = 3;
    public static boolean z = false;
    public static ConcurrentHashMap<String, Boolean> A = new ConcurrentHashMap<>();
    public static ConcurrentHashMap<String, Boolean> B = new ConcurrentHashMap<>();
    public static ArrayList<d1.a> C = new ArrayList<>();
    public static Queue<d1.c> E = new LinkedList();

    public class a extends f7t {
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String g;
        public final /* synthetic */ String h;

        public a(String str, String str2, String str3, String str4) {
            this.d = str;
            this.e = str2;
            this.g = str3;
            this.h = str4;
        }

        @Override // defpackage.f7t
        public final void runTask() {
            e eVar = (e) x0.p.get(this.d);
            if (eVar == null) {
                return;
            }
            b bVar = eVar.c;
            c cVarB = x0.b(x0.g, eVar.f6313a, eVar.f6314b, this.e, this.g, this.h);
            if (cVarB == null || bVar == null) {
                return;
            }
            bVar.a(cVarB);
        }
    }

    public interface b {
        void a(c cVar);
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Deprecated
        public JSONObject f6307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Deprecated
        public JSONObject f6308b;
        public String c;
        public int d = -1;
        public long e = 0;
        public JSONObject f;
        public a g;
        public b h;
        public boolean i;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f6309a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f6310b;
            public JSONObject c;
        }

        public static class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f6311a;
        }
    }

    public static class d extends t4t {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public String f6312r;
        public Map<String, String> s;
        public String t;
        public String u;
        public String v;

        public d(Context context, o0t o0tVar, String str, Map<String, String> map, String str2, String str3, String str4) {
            super(context, o0tVar);
            this.f6312r = str;
            this.s = map;
            this.t = str2;
            this.u = str3;
            this.v = str4;
            setHttpProtocol(la.c.HTTPS);
            setDegradeAbility(la.a.FIX);
        }

        public static String m(String str, String str2) {
            try {
                return !TextUtils.isEmpty(str2) ? Uri.parse(str).buildUpon().encodedAuthority(str2).build().toString() : str;
            } catch (Throwable unused) {
                return str;
            }
        }

        @Override // defpackage.t4t
        public final byte[] c() {
            return null;
        }

        @Override // defpackage.t4t
        public final byte[] d() {
            String strW = h0t.W(((t4t) this).f34316a);
            if (!TextUtils.isEmpty(strW)) {
                strW = m0t.d(new StringBuilder(strW).reverse().toString());
            }
            HashMap map = new HashMap();
            map.put("authkey", TextUtils.isEmpty(this.f6312r) ? "" : this.f6312r);
            map.put("plattype", PluginPackageConstant.RN_DIR_A);
            map.put("ccver", "1");
            map.put("product", ((t4t) this).f34317b.a());
            map.put("version", ((t4t) this).f34317b.e());
            map.put("output", "json");
            StringBuilder sb = new StringBuilder();
            sb.append(Build.VERSION.SDK_INT);
            map.put("androidversion", sb.toString());
            map.put("deviceId", strW);
            map.put("manufacture", Build.MANUFACTURER);
            Map<String, String> map2 = this.s;
            if (map2 != null && !map2.isEmpty()) {
                map.putAll(this.s);
            }
            map.put("abitype", p0t.d(((t4t) this).f34316a));
            map.put("ext", ((t4t) this).f34317b.g());
            return p0t.n(p0t.f(map));
        }

        @Override // defpackage.t4t
        public final String e() {
            return "3.0";
        }

        @Override // com.amap.api.col.p0003sl.la
        public final String getIPDNSName() {
            return !TextUtils.isEmpty(this.v) ? this.v : super.getIPDNSName();
        }

        @Override // defpackage.l0t, com.amap.api.col.p0003sl.la
        public final String getIPV6URL() {
            return m("https://dualstack-arestapi.amap.com/v3/iasdkauth", this.u);
        }

        @Override // com.amap.api.col.p0003sl.la
        public final Map<String, String> getRequestHead() {
            if (TextUtils.isEmpty(this.v)) {
                return null;
            }
            HashMap map = new HashMap();
            map.put(com.xiaomi.onetrack.api.b.E, this.v);
            return map;
        }

        @Override // com.amap.api.col.p0003sl.la
        public final String getURL() {
            return m("https://restsdk.amap.com/v3/iasdkauth", this.t);
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o0t f6313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f6314b;
        public b c;

        public e() {
        }

        public /* synthetic */ e(byte b2) {
            this();
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f6315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f6316b;
        public AtomicInteger c;

        public f(String str, String str2, int i) {
            this.f6315a = str;
            this.f6316b = str2;
            this.c = new AtomicInteger(i);
        }

        public static f d(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new f(jSONObject.optString(PluginDeviceInfo.FMODEL), jSONObject.optString(PluginDeviceInfo.FBLUETOOTHPAIR), jSONObject.optInt("h"));
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

        public final void c(String str) {
            this.f6316b = str;
        }

        public final String e() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(PluginDeviceInfo.FMODEL, this.f6315a);
                jSONObject.put(PluginDeviceInfo.FBLUETOOTHPAIR, this.f6316b);
                jSONObject.put("h", this.c.get());
                return jSONObject.toString();
            } catch (Throwable unused) {
                return "";
            }
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static boolean f6317a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static boolean f6318b = false;
        public static boolean c = true;
        public static int d = 0;
        public static boolean e = false;
        public static int f;
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f6319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f6320b;

        public h(Long l, String str) {
            this.f6319a = 0L;
            this.f6320b = "";
            this.f6319a = l.longValue();
            this.f6320b = str;
        }
    }

    public static o0t A(String str) {
        e eVar = p.get(str);
        if (eVar != null) {
            return eVar.f6313a;
        }
        return null;
    }

    public static String B(String str, String str2) {
        return str2 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + m0t.b(str.getBytes());
    }

    public static String C(List<String> list) {
        if (list == null) {
            return "";
        }
        try {
            if (list.size() <= 0) {
                return "";
            }
            String str = list.get(0);
            return !TextUtils.isEmpty(str) ? str : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static void D(Context context) {
        if (context == null) {
            return;
        }
        h = i4t.l(context, "open_common", "a2", true);
    }

    public static void E(d1.c cVar) {
        synchronized (C) {
            boolean z2 = false;
            for (int i2 = 0; i2 < C.size(); i2++) {
                try {
                    d1.a aVar = C.get(i2);
                    if (cVar.c.equals(aVar.f5994b) && cVar.d.equals(aVar.e)) {
                        int i3 = cVar.m;
                        int i4 = aVar.f;
                        if (i3 == i4) {
                            z2 = true;
                            if (i4 == 1) {
                                aVar.i = ((((long) aVar.j.get()) * aVar.i) + cVar.f) / ((long) (aVar.j.get() + 1));
                            }
                            aVar.j.getAndIncrement();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z2) {
                C.add(new d1.a(cVar));
            }
            d1.s();
        }
    }

    public static synchronized void F(String str, boolean z2) {
        r(str, z2, null, null, null);
    }

    public static boolean G() {
        Integer num;
        Context context = g;
        if (context == null) {
            return false;
        }
        String strU = h0t.U(context);
        return (TextUtils.isEmpty(strU) || (num = j.get(strU.toUpperCase())) == null || num.intValue() != 2) ? false : true;
    }

    public static String H(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return str + ";15K;16H;17I;1A4;17S;183";
    }

    public static void I(Context context) {
        if (context == null) {
            return;
        }
        t = i4t.l(context, "open_common", "a13", true);
        w = i4t.l(context, "open_common", "a6", true);
        u = i4t.l(context, "open_common", "a7", false);
        s = i4t.a(context, "open_common", "a8", 5000);
        v = i4t.a(context, "open_common", "a9", 3);
        x = i4t.l(context, "open_common", "a10", false);
        y = i4t.a(context, "open_common", "a11", 3);
        z = i4t.l(context, "open_common", "a12", false);
    }

    public static void J(d1.c cVar) {
        if (cVar != null && z) {
            synchronized (E) {
                E.offer(cVar);
                d1.s();
            }
        }
    }

    public static boolean K() {
        Integer num;
        Context context = g;
        if (context == null) {
            return false;
        }
        String strU = h0t.U(context);
        return (TextUtils.isEmpty(strU) || (num = j.get(strU.toUpperCase())) == null || num.intValue() < 2) ? false : true;
    }

    public static void L() {
        try {
            f fVarE = e(g, "IPV6_CONFIG_NAME", "open_common");
            String strC = p0t.c(System.currentTimeMillis(), "yyyyMMdd");
            if (!strC.equals(fVarE.f6316b)) {
                fVarE.c(strC);
                fVarE.c.set(0);
            }
            fVarE.c.incrementAndGet();
            m(g, "IPV6_CONFIG_NAME", "open_common", fVarE);
        } catch (Throwable unused) {
        }
    }

    public static void M(Context context) {
        try {
            if (q) {
                return;
            }
            t1t.e = i4t.l(context, "open_common", "a4", true);
            t1t.f = i4t.l(context, "open_common", "a5", true);
            q = true;
        } catch (Throwable unused) {
        }
    }

    public static synchronized boolean N(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (p == null) {
                return false;
            }
            if (o == null) {
                o = new ConcurrentHashMap<>(8);
            }
            if (p.containsKey(str) && !o.containsKey(str)) {
                o.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
                return true;
            }
        } catch (Throwable th) {
            j2t.e(th, "at", "cslct");
        }
        return false;
    }

    public static void O() {
        if (m) {
            return;
        }
        try {
            Context context = g;
            if (context == null) {
                return;
            }
            m = true;
            k0t.a().c(context);
            D(context);
            I(context);
            g.f6317a = i4t.l(context, "open_common", "ucf", g.f6317a);
            g.f6318b = i4t.l(context, "open_common", "fsv2", g.f6318b);
            g.c = i4t.l(context, "open_common", "usc", g.c);
            g.d = i4t.a(context, "open_common", "umv", g.d);
            g.e = i4t.l(context, "open_common", "ust", g.e);
            g.f = i4t.a(context, "open_common", "ustv", g.f);
        } catch (Throwable unused) {
        }
    }

    public static void P(Context context) {
        try {
            if (f6306r) {
                return;
            }
            q0t.d = x(i4t.o(context, "open_common", "a16", ""), true);
            q0t.f30972b = i4t.b(context, "open_common", "a17", q0t.f30971a);
            f6306r = true;
        } catch (Throwable unused) {
        }
    }

    public static synchronized void Q(String str) {
        if (o == null) {
            return;
        }
        if (o.containsKey(str)) {
            o.remove(str);
        }
    }

    public static synchronized h R(String str) {
        try {
            if (n == null) {
                n = new ConcurrentHashMap<>(8);
            }
            if (n.containsKey(str)) {
                return n.get(str);
            }
            return new h(0L, "");
        } catch (Throwable th) {
            j2t.e(th, "at", "glcut");
        }
        throw th;
    }

    public static d1.a S() {
        if (D) {
            return null;
        }
        synchronized (C) {
            try {
                if (D) {
                    return null;
                }
                Collections.sort(C);
                if (C.size() <= 0) {
                    return null;
                }
                d1.a aVarClone = C.get(0).clone();
                D = true;
                return aVarClone;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static d1.c T() {
        synchronized (E) {
            try {
                d1.c cVarPoll = E.poll();
                if (cVarPoll != null) {
                    return cVarPoll;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean U(String str) {
        Context context;
        f fVarE;
        try {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            return t && A.get(str) == null && ((context = g) == null || (fVarE = e(context, B(str, "a14"), "open_common")) == null || fVarE.a() < v);
        } catch (Throwable unused) {
            return true;
        }
    }

    public static boolean W(String str) {
        Context context;
        f fVarE;
        try {
            return !TextUtils.isEmpty(str) && x && B.get(str) == null && ((context = g) == null || (fVarE = e(context, B(str, "a15"), "open_common")) == null || fVarE.a() < y);
        } catch (Throwable unused) {
        }
    }

    public static void X() {
        try {
            Context context = g;
            if (context != null) {
                String strU = h0t.U(context);
                if (!TextUtils.isEmpty(f6305k) && !TextUtils.isEmpty(strU) && f6305k.equals(strU) && System.currentTimeMillis() - l < 60000) {
                    return;
                }
                if (!TextUtils.isEmpty(strU)) {
                    f6305k = strU;
                }
            } else if (System.currentTimeMillis() - l < 10000) {
                return;
            }
            l = System.currentTimeMillis();
            j.clear();
            if (!s5.a()) {
                j.put(NetworkUtils.NETWORK_TYPE_WIFI, 3);
                j.put(AccountCertification.Source.SOURCE_TYPE_OPERATOR_MOBILE, 3);
                return;
            }
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (!networkInterface.getInterfaceAddresses().isEmpty()) {
                    String displayName = networkInterface.getDisplayName();
                    Iterator<InterfaceAddress> it = networkInterface.getInterfaceAddresses().iterator();
                    int i2 = 0;
                    while (it.hasNext()) {
                        InetAddress address = it.next().getAddress();
                        if (address instanceof Inet6Address) {
                            if (!y((Inet6Address) address)) {
                                i2 |= 2;
                            }
                        } else if (address instanceof Inet4Address) {
                            Inet4Address inet4Address = (Inet4Address) address;
                            if (!y(inet4Address) && !inet4Address.getHostAddress().startsWith(p0t.t("FMTkyLjE2OC40My4"))) {
                                i2 |= 1;
                            }
                        }
                    }
                    if (i2 != 0) {
                        if (displayName != null && displayName.startsWith("wlan")) {
                            j.put(NetworkUtils.NETWORK_TYPE_WIFI, Integer.valueOf(i2));
                        } else if (displayName != null && displayName.startsWith("rmnet")) {
                            j.put(AccountCertification.Source.SOURCE_TYPE_OPERATOR_MOBILE, Integer.valueOf(i2));
                        }
                    }
                }
            }
        } catch (Throwable th) {
            j2t.e(th, "at", "ipstack");
        }
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

    public static c b(Context context, o0t o0tVar, String str, String str2, String str3, String str4) {
        return d(context, o0tVar, str, null, str2, str3, str4);
    }

    public static c c(Context context, o0t o0tVar, String str, Map<String, String> map) {
        return z(context, o0tVar, str, map);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0211 A[Catch: all -> 0x01cd, TRY_LEAVE, TryCatch #11 {all -> 0x01cd, blocks: (B:81:0x01b6, B:83:0x01c1, B:85:0x01c8, B:112:0x022c, B:114:0x0232, B:111:0x0228, B:92:0x01d8, B:94:0x01e1, B:96:0x01ef, B:97:0x01f5, B:99:0x01ff, B:100:0x0203, B:102:0x0211, B:104:0x0216, B:106:0x021c), top: B:130:0x01b6, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x021c A[Catch: all -> 0x0223, TRY_LEAVE, TryCatch #3 {all -> 0x0223, blocks: (B:104:0x0216, B:106:0x021c), top: B:125:0x0216, outer: #11 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x0232 A[Catch: all -> 0x01cd, TRY_LEAVE, TryCatch #11 {all -> 0x01cd, blocks: (B:81:0x01b6, B:83:0x01c1, B:85:0x01c8, B:112:0x022c, B:114:0x0232, B:111:0x0228, B:92:0x01d8, B:94:0x01e1, B:96:0x01ef, B:97:0x01f5, B:99:0x01ff, B:100:0x0203, B:102:0x0211, B:104:0x0216, B:106:0x021c), top: B:130:0x01b6, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0256 A[Catch: all -> 0x0268, TryCatch #8 {all -> 0x0268, blocks: (B:115:0x0239, B:117:0x0256, B:118:0x025d), top: B:128:0x0239 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x025d A[Catch: all -> 0x0268, TRY_LEAVE, TryCatch #8 {all -> 0x0268, blocks: (B:115:0x0239, B:117:0x0256, B:118:0x025d), top: B:128:0x0239 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x019e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:75:0x019f  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c1 A[Catch: all -> 0x01cd, TryCatch #11 {all -> 0x01cd, blocks: (B:81:0x01b6, B:83:0x01c1, B:85:0x01c8, B:112:0x022c, B:114:0x0232, B:111:0x0228, B:92:0x01d8, B:94:0x01e1, B:96:0x01ef, B:97:0x01f5, B:99:0x01ff, B:100:0x0203, B:102:0x0211, B:104:0x0216, B:106:0x021c), top: B:130:0x01b6, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01c8 A[Catch: all -> 0x01cd, TryCatch #11 {all -> 0x01cd, blocks: (B:81:0x01b6, B:83:0x01c1, B:85:0x01c8, B:112:0x022c, B:114:0x0232, B:111:0x0228, B:92:0x01d8, B:94:0x01e1, B:96:0x01ef, B:97:0x01f5, B:99:0x01ff, B:100:0x0203, B:102:0x0211, B:104:0x0216, B:106:0x021c), top: B:130:0x01b6, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d8 A[Catch: all -> 0x01cd, TryCatch #11 {all -> 0x01cd, blocks: (B:81:0x01b6, B:83:0x01c1, B:85:0x01c8, B:112:0x022c, B:114:0x0232, B:111:0x0228, B:92:0x01d8, B:94:0x01e1, B:96:0x01ef, B:97:0x01f5, B:99:0x01ff, B:100:0x0203, B:102:0x0211, B:104:0x0216, B:106:0x021c), top: B:130:0x01b6, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01df  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ef A[Catch: all -> 0x01cd, TryCatch #11 {all -> 0x01cd, blocks: (B:81:0x01b6, B:83:0x01c1, B:85:0x01c8, B:112:0x022c, B:114:0x0232, B:111:0x0228, B:92:0x01d8, B:94:0x01e1, B:96:0x01ef, B:97:0x01f5, B:99:0x01ff, B:100:0x0203, B:102:0x0211, B:104:0x0216, B:106:0x021c), top: B:130:0x01b6, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01ff A[Catch: all -> 0x01cd, TryCatch #11 {all -> 0x01cd, blocks: (B:81:0x01b6, B:83:0x01c1, B:85:0x01c8, B:112:0x022c, B:114:0x0232, B:111:0x0228, B:92:0x01d8, B:94:0x01e1, B:96:0x01ef, B:97:0x01f5, B:99:0x01ff, B:100:0x0203, B:102:0x0211, B:104:0x0216, B:106:0x021c), top: B:130:0x01b6, inners: #3 }] */
    /* JADX WARN: Multi-variable type inference failed */
    public static c d(Context context, o0t o0tVar, String str, Map<String, String> map, String str2, String str3, String str4) throws ik {
        String str5;
        String str6;
        String str7;
        String str8;
        String strH;
        v5t v5tVarD;
        byte[] bArr;
        Object obj;
        Object obj2;
        c cVar;
        c cVar2;
        String str9;
        String str10;
        JSONObject jSONObject;
        int i2;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        JSONObject jSONObject2;
        boolean zX;
        Object obj3 = "result";
        String str16 = DeviceTagInterface.TAG_VERSION_CODE;
        String str17 = "info";
        c cVar3 = new c();
        cVar3.f = new JSONObject();
        if (context != null) {
            g = context.getApplicationContext();
        }
        O();
        String strG = null;
        try {
            o(o0tVar);
            new b1();
            boolean zIsEmpty = TextUtils.isEmpty(str);
            try {
                if (zIsEmpty) {
                    strH = str;
                } else {
                    try {
                        strH = H(str);
                    } catch (ik e2) {
                        e = e2;
                        throw e;
                    } catch (Throwable unused) {
                        throw new ik(AMapException.ERROR_UNKNOWN);
                    }
                }
                try {
                    M(context);
                    P(context);
                    str5 = "result";
                    String str18 = strH;
                    c cVar4 = cVar3;
                    str6 = DeviceTagInterface.TAG_VERSION_CODE;
                    str16 = "at";
                    str7 = "infocode";
                    str8 = "info";
                    str17 = "lc";
                    try {
                        v5tVarD = b1.d(new d(context, o0tVar, str18, map, str2, str3, str4));
                        if (zIsEmpty) {
                            return cVar4;
                        }
                        if (v5tVarD != null) {
                            try {
                                bArr = v5tVarD.f36513a;
                                try {
                                    Map<String, List<String>> map2 = v5tVarD.f36514b;
                                    if (map2 != null && map2.containsKey("lct")) {
                                        List<String> list = map2.get("lct");
                                        List<String> list2 = map2.get("lct-info");
                                        cVar4.e = a(list);
                                        String strC = C(list2);
                                        if (cVar4.e != 0 && o0tVar != null) {
                                            String strA = o0tVar.a();
                                            if (!TextUtils.isEmpty(strA)) {
                                                p(strA, cVar4.e, strC);
                                            }
                                        }
                                    }
                                } catch (Throwable th) {
                                    try {
                                        th.printStackTrace();
                                        m2t.r(th, str16, "lct");
                                    } catch (ik e3) {
                                        e = e3;
                                        cVar = cVar4;
                                        cVar.c = e.a();
                                        h(context, o0tVar, e.a());
                                        m2t.j(o0tVar, "/v3/iasdkauth", e);
                                        cVar2 = cVar;
                                    } catch (IllegalBlockSizeException e4) {
                                        e = e4;
                                        obj2 = cVar4;
                                        k(context, o0tVar, e);
                                        cVar2 = obj2;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        obj = cVar4;
                                        m2t.r(th, str16, str17);
                                        k(context, o0tVar, th);
                                        cVar2 = obj;
                                    }
                                }
                            } catch (ik e5) {
                                e = e5;
                                bArr = null;
                                cVar = cVar4;
                                cVar.c = e.a();
                                h(context, o0tVar, e.a());
                                m2t.j(o0tVar, "/v3/iasdkauth", e);
                                cVar2 = cVar;
                            } catch (IllegalBlockSizeException e6) {
                                e = e6;
                                bArr = null;
                                obj2 = cVar4;
                                k(context, o0tVar, e);
                                cVar2 = obj2;
                            } catch (Throwable th3) {
                                th = th3;
                                bArr = null;
                                obj = cVar4;
                                m2t.r(th, str16, str17);
                                k(context, o0tVar, th);
                                cVar2 = obj;
                            }
                        } else {
                            bArr = null;
                        }
                        byte[] bArr2 = new byte[16];
                        byte[] bArr3 = new byte[bArr.length - 16];
                        System.arraycopy(bArr, 0, bArr2, 0, 16);
                        System.arraycopy(bArr, 16, bArr3, 0, bArr.length - 16);
                        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, p0t.t("EQUVT"));
                        Cipher cipher = Cipher.getInstance(p0t.t("CQUVTL0NCQy9QS0NTNVBhZGRpbmc"));
                        cipher.init(2, secretKeySpec, new IvParameterSpec(p0t.u()));
                        strG = p0t.g(cipher.doFinal(bArr3));
                        cVar2 = cVar4;
                        str9 = strH;
                        if (bArr == null) {
                            return cVar2;
                        }
                        if (TextUtils.isEmpty(strG)) {
                            strG = p0t.g(bArr);
                        }
                        str10 = strG;
                        if (TextUtils.isEmpty(str10)) {
                            h(context, o0tVar, "result is null");
                        }
                        try {
                            jSONObject = new JSONObject(str10);
                            if (jSONObject.has("status")) {
                                i2 = jSONObject.getInt("status");
                                if (i2 == 1) {
                                    f6303a = 1;
                                } else if (i2 == 0) {
                                    if (v5tVarD != null) {
                                        str11 = v5tVarD.c;
                                        str12 = v5tVarD.d;
                                    } else {
                                        str11 = "authcsid";
                                        str12 = "authgsid";
                                    }
                                    p0t.i(context, str11, str12, jSONObject);
                                    f6303a = 0;
                                    str13 = str8;
                                    if (jSONObject.has(str13)) {
                                        f6304b = jSONObject.getString(str13);
                                    }
                                    String str19 = str7;
                                    m2t.l(o0tVar, "/v3/iasdkauth", f6304b, str12, str11, jSONObject.has(str19) ? jSONObject.getString(str19) : "");
                                    if (f6303a == 0) {
                                        cVar2.c = f6304b;
                                        return cVar2;
                                    }
                                }
                                str14 = str6;
                                try {
                                    if (jSONObject.has(str14)) {
                                        cVar2.d = jSONObject.getInt(str14);
                                    }
                                } catch (Throwable th4) {
                                    j2t.e(th4, str16, str17);
                                }
                                str15 = str5;
                                if (p0t.l(jSONObject, str15)) {
                                    JSONObject jSONObject3 = jSONObject.getJSONObject(str15);
                                    j(context, o0tVar, str9, cVar2, jSONObject3);
                                    try {
                                        jSONObject2 = jSONObject3.getJSONObject("15K");
                                        zX = x(jSONObject2.optString("isTargetAble"), false);
                                        if (x(jSONObject2.optString("able"), false)) {
                                            k0t.a().d(context, zX);
                                        } else {
                                            k0t.a();
                                            k0t.f(context);
                                        }
                                    } catch (Throwable unused2) {
                                    }
                                }
                            }
                        } catch (Throwable th5) {
                            j2t.e(th5, str16, str17);
                        }
                        return cVar2;
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
                v5tVarD = null;
                bArr = null;
                cVar = obj3;
                cVar.c = e.a();
                h(context, o0tVar, e.a());
                m2t.j(o0tVar, "/v3/iasdkauth", e);
                cVar2 = cVar;
                str9 = strH;
                if (bArr == null) {
                    return cVar2;
                }
                if (TextUtils.isEmpty(strG)) {
                    strG = p0t.g(bArr);
                }
                str10 = strG;
                if (TextUtils.isEmpty(str10)) {
                    h(context, o0tVar, "result is null");
                }
                jSONObject = new JSONObject(str10);
                if (jSONObject.has("status")) {
                    i2 = jSONObject.getInt("status");
                    if (i2 == 1) {
                        f6303a = 1;
                    } else if (i2 == 0) {
                        if (v5tVarD != null) {
                            str11 = v5tVarD.c;
                            str12 = v5tVarD.d;
                        } else {
                            str11 = "authcsid";
                            str12 = "authgsid";
                        }
                        p0t.i(context, str11, str12, jSONObject);
                        f6303a = 0;
                        str13 = str8;
                        if (jSONObject.has(str13)) {
                            f6304b = jSONObject.getString(str13);
                        }
                        String str110 = str7;
                        if (jSONObject.has(str110)) {
                        }
                        m2t.l(o0tVar, "/v3/iasdkauth", f6304b, str12, str11, jSONObject.has(str110) ? jSONObject.getString(str110) : "");
                        if (f6303a == 0) {
                            cVar2.c = f6304b;
                            return cVar2;
                        }
                    }
                    str14 = str6;
                    if (jSONObject.has(str14)) {
                        cVar2.d = jSONObject.getInt(str14);
                    }
                    str15 = str5;
                    if (p0t.l(jSONObject, str15)) {
                        JSONObject jSONObject4 = jSONObject.getJSONObject(str15);
                        j(context, o0tVar, str9, cVar2, jSONObject4);
                        jSONObject2 = jSONObject4.getJSONObject("15K");
                        zX = x(jSONObject2.optString("isTargetAble"), false);
                        if (x(jSONObject2.optString("able"), false)) {
                            k0t.a();
                            k0t.f(context);
                        } else {
                            k0t.a().d(context, zX);
                        }
                    }
                }
                return cVar2;
            } catch (IllegalBlockSizeException e10) {
                e = e10;
                v5tVarD = null;
                bArr = null;
                obj2 = obj3;
                k(context, o0tVar, e);
                cVar2 = obj2;
                str9 = strH;
                if (bArr == null) {
                    return cVar2;
                }
                if (TextUtils.isEmpty(strG)) {
                    strG = p0t.g(bArr);
                }
                str10 = strG;
                if (TextUtils.isEmpty(str10)) {
                    h(context, o0tVar, "result is null");
                }
                jSONObject = new JSONObject(str10);
                if (jSONObject.has("status")) {
                    i2 = jSONObject.getInt("status");
                    if (i2 == 1) {
                        f6303a = 1;
                    } else if (i2 == 0) {
                        if (v5tVarD != null) {
                            str11 = v5tVarD.c;
                            str12 = v5tVarD.d;
                        } else {
                            str11 = "authcsid";
                            str12 = "authgsid";
                        }
                        p0t.i(context, str11, str12, jSONObject);
                        f6303a = 0;
                        str13 = str8;
                        if (jSONObject.has(str13)) {
                            f6304b = jSONObject.getString(str13);
                        }
                        String str111 = str7;
                        if (jSONObject.has(str111)) {
                        }
                        m2t.l(o0tVar, "/v3/iasdkauth", f6304b, str12, str11, jSONObject.has(str111) ? jSONObject.getString(str111) : "");
                        if (f6303a == 0) {
                            cVar2.c = f6304b;
                            return cVar2;
                        }
                    }
                    str14 = str6;
                    if (jSONObject.has(str14)) {
                        cVar2.d = jSONObject.getInt(str14);
                    }
                    str15 = str5;
                    if (p0t.l(jSONObject, str15)) {
                        JSONObject jSONObject5 = jSONObject.getJSONObject(str15);
                        j(context, o0tVar, str9, cVar2, jSONObject5);
                        jSONObject2 = jSONObject5.getJSONObject("15K");
                        zX = x(jSONObject2.optString("isTargetAble"), false);
                        if (x(jSONObject2.optString("able"), false)) {
                            k0t.a();
                            k0t.f(context);
                        } else {
                            k0t.a().d(context, zX);
                        }
                    }
                }
                return cVar2;
            } catch (Throwable th6) {
                th = th6;
                v5tVarD = null;
                bArr = null;
                obj = obj3;
                m2t.r(th, str16, str17);
                k(context, o0tVar, th);
                cVar2 = obj;
                str9 = strH;
                if (bArr == null) {
                    return cVar2;
                }
                if (TextUtils.isEmpty(strG)) {
                    strG = p0t.g(bArr);
                }
                str10 = strG;
                if (TextUtils.isEmpty(str10)) {
                    h(context, o0tVar, "result is null");
                }
                jSONObject = new JSONObject(str10);
                if (jSONObject.has("status")) {
                    i2 = jSONObject.getInt("status");
                    if (i2 == 1) {
                        f6303a = 1;
                    } else if (i2 == 0) {
                        if (v5tVarD != null) {
                            str11 = v5tVarD.c;
                            str12 = v5tVarD.d;
                        } else {
                            str11 = "authcsid";
                            str12 = "authgsid";
                        }
                        p0t.i(context, str11, str12, jSONObject);
                        f6303a = 0;
                        str13 = str8;
                        if (jSONObject.has(str13)) {
                            f6304b = jSONObject.getString(str13);
                        }
                        String str112 = str7;
                        if (jSONObject.has(str112)) {
                        }
                        m2t.l(o0tVar, "/v3/iasdkauth", f6304b, str12, str11, jSONObject.has(str112) ? jSONObject.getString(str112) : "");
                        if (f6303a == 0) {
                            cVar2.c = f6304b;
                            return cVar2;
                        }
                    }
                    str14 = str6;
                    if (jSONObject.has(str14)) {
                        cVar2.d = jSONObject.getInt(str14);
                    }
                    str15 = str5;
                    if (p0t.l(jSONObject, str15)) {
                        JSONObject jSONObject6 = jSONObject.getJSONObject(str15);
                        j(context, o0tVar, str9, cVar2, jSONObject6);
                        jSONObject2 = jSONObject6.getJSONObject("15K");
                        zX = x(jSONObject2.optString("isTargetAble"), false);
                        if (x(jSONObject2.optString("able"), false)) {
                            k0t.a();
                            k0t.f(context);
                        } else {
                            k0t.a().d(context, zX);
                        }
                    }
                }
                return cVar2;
            }
        } catch (ik e11) {
            e = e11;
            str5 = "result";
            str6 = DeviceTagInterface.TAG_VERSION_CODE;
            str7 = "infocode";
            str8 = "info";
            obj3 = cVar3;
            str16 = "at";
            str17 = "lc";
            strH = str;
        } catch (IllegalBlockSizeException e12) {
            e = e12;
            str5 = "result";
            str6 = DeviceTagInterface.TAG_VERSION_CODE;
            str7 = "infocode";
            str8 = "info";
            obj3 = cVar3;
            str16 = "at";
            str17 = "lc";
            strH = str;
        } catch (Throwable th7) {
            th = th7;
            str5 = "result";
            str6 = DeviceTagInterface.TAG_VERSION_CODE;
            str7 = "infocode";
            str8 = "info";
            obj3 = cVar3;
            str16 = "at";
            str17 = "lc";
            strH = str;
        }
    }

    public static synchronized f e(Context context, String str, String str2) {
        f fVar;
        if (!TextUtils.isEmpty(str)) {
            int i2 = 0;
            while (true) {
                if (i2 >= i.size()) {
                    fVar = null;
                    break;
                }
                fVar = i.get(i2);
                if (fVar != null && str.equals(fVar.f6315a)) {
                    break;
                }
                i2++;
            }
        } else {
            fVar = null;
            break;
        }
        if (fVar != null) {
            return fVar;
        }
        if (context == null) {
            return null;
        }
        f fVarD = f.d(i4t.o(context, str2, str, ""));
        String strC = p0t.c(System.currentTimeMillis(), "yyyyMMdd");
        if (fVarD == null) {
            fVarD = new f(str, strC, 0);
        }
        if (!strC.equals(fVarD.f6316b)) {
            fVarD.c(strC);
            fVarD.c.set(0);
        }
        i.add(fVarD);
        return fVarD;
    }

    public static String f(String str) {
        e eVar;
        if (!p.containsKey(str) || (eVar = p.get(str)) == null) {
            return null;
        }
        return eVar.f6314b;
    }

    public static void g(Context context) {
        if (context != null) {
            g = context.getApplicationContext();
        }
    }

    public static void h(Context context, o0t o0tVar, String str) {
        HashMap map = new HashMap();
        map.put("amap_sdk_auth_fail", "1");
        map.put("amap_sdk_auth_fail_type", str);
        map.put("amap_sdk_name", o0tVar.a());
        map.put("amap_sdk_version", o0tVar.f());
        String string = new JSONObject(map).toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            f6t f6tVar = new f6t(context, "core", "2.0", "O001");
            f6tVar.a(string);
            g6t.e(f6tVar, context);
        } catch (ik unused) {
        }
    }

    public static synchronized void i(Context context, o0t o0tVar, String str, b bVar) {
        if (context == null || o0tVar == null) {
            return;
        }
        try {
            if (g == null) {
                g = context.getApplicationContext();
            }
            String strA = o0tVar.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            o(o0tVar);
            if (p == null) {
                p = new ConcurrentHashMap<>(8);
            }
            if (o == null) {
                o = new ConcurrentHashMap<>(8);
            }
            if (n == null) {
                n = new ConcurrentHashMap<>(8);
            }
            if (!p.containsKey(strA)) {
                e eVar = new e((byte) 0);
                eVar.f6313a = o0tVar;
                eVar.f6314b = str;
                eVar.c = bVar;
                p.put(strA, eVar);
                n.put(strA, new h(Long.valueOf(i4t.b(g, "open_common", strA, 0L)), i4t.o(g, "open_common", strA + "lct-info", "")));
                M(g);
                P(g);
            }
        } catch (Throwable th) {
            j2t.e(th, "at", "rglc");
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0203  */
    /* JADX WARN: Code duplicated, block: B:108:0x0217 A[Catch: all -> 0x026a, TryCatch #5 {all -> 0x026a, blocks: (B:106:0x0211, B:108:0x0217, B:110:0x0255, B:112:0x0259, B:114:0x025d, B:116:0x0261, B:118:0x0265, B:123:0x026e), top: B:159:0x0211 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0255 A[Catch: all -> 0x026a, TryCatch #5 {all -> 0x026a, blocks: (B:106:0x0211, B:108:0x0217, B:110:0x0255, B:112:0x0259, B:114:0x025d, B:116:0x0261, B:118:0x0265, B:123:0x026e), top: B:159:0x0211 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:159:0x0211 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0307 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x02ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x02b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:? A[RETURN, SYNTHETIC] */
    public static void j(Context context, o0t o0tVar, String str, c cVar, JSONObject jSONObject) throws JSONException {
        String str2;
        String str3;
        String str4;
        boolean zX;
        Context context2;
        JSONObject jSONObject2;
        boolean zX2;
        boolean zX3;
        boolean zX4;
        int iOptInt;
        boolean zX5;
        int iOptInt2;
        c.a aVar = new c.a();
        aVar.f6309a = false;
        aVar.f6310b = false;
        cVar.g = aVar;
        try {
            String[] strArrSplit = str.split(";");
            if (strArrSplit != null && strArrSplit.length > 0) {
                int length = strArrSplit.length;
                int i2 = 0;
                while (i2 < length) {
                    String str5 = strArrSplit[i2];
                    if (jSONObject.has(str5)) {
                        cVar.f.putOpt(str5, jSONObject.get(str5));
                    }
                    i2++;
                    strArrSplit = strArrSplit;
                }
            }
        } catch (Throwable th) {
            j2t.e(th, "at", CommonConstants.KEY_COUNTRY);
        }
        if (p0t.l(jSONObject, "16H")) {
            try {
                cVar.i = x(jSONObject.getJSONObject("16H").optString("able"), false);
            } catch (Throwable th2) {
                j2t.e(th2, "AuthConfigManager", "load 16H");
            }
        }
        if (p0t.l(jSONObject, "11K")) {
            try {
                JSONObject jSONObject3 = jSONObject.getJSONObject("11K");
                aVar.f6309a = x(jSONObject3.getString("able"), false);
                if (jSONObject3.has(DebugKt.DEBUG_PROPERTY_VALUE_OFF)) {
                    aVar.c = jSONObject3.getJSONObject(DebugKt.DEBUG_PROPERTY_VALUE_OFF);
                }
            } catch (Throwable th3) {
                j2t.e(th3, "AuthConfigManager", "load 11K");
            }
        }
        if (p0t.l(jSONObject, "145")) {
            try {
                cVar.f6307a = jSONObject.getJSONObject("145");
            } catch (Throwable th4) {
                j2t.e(th4, "AuthConfigManager", "load 145");
            }
        }
        if (p0t.l(jSONObject, "14D")) {
            try {
                cVar.f6308b = jSONObject.getJSONObject("14D");
            } catch (Throwable th5) {
                j2t.e(th5, "AuthConfigManager", "load 14D");
            }
        }
        if (p0t.l(jSONObject, "151")) {
            try {
                JSONObject jSONObject4 = jSONObject.getJSONObject("151");
                c.b bVar = new c.b();
                if (jSONObject4 != null) {
                    bVar.f6311a = x(jSONObject4.optString("able"), false);
                }
                cVar.h = bVar;
            } catch (Throwable th6) {
                j2t.e(th6, "AuthConfigManager", "load 151");
            }
        }
        if (p0t.l(jSONObject, "17S")) {
            try {
                JSONObject jSONObject5 = jSONObject.getJSONObject("17S");
                if (jSONObject5 != null && (zX = x(jSONObject5.optString("able"), false)) != h) {
                    h = zX;
                    if (context != null) {
                        SharedPreferences.Editor editorC = i4t.c(context, "open_common");
                        i4t.k(editorC, "a2", zX);
                        i4t.f(editorC);
                    }
                }
                if (jSONObject5 != null) {
                    boolean zX6 = x(jSONObject5.optString("static_enable"), true);
                    boolean zX7 = x(jSONObject5.optString("static_ip_direct_enable"), false);
                    int iOptInt3 = jSONObject5.optInt("static_timeout", 5) * 1000;
                    int iOptInt4 = jSONObject5.optInt("static_retry", 3);
                    str2 = "ustv";
                    try {
                        boolean zX8 = x(jSONObject5.optString("bgp_enable"), true);
                        str3 = "ust";
                        try {
                            boolean zX9 = x(jSONObject5.optString("bgp_ip_direct_enable"), false);
                            str4 = "umv";
                            try {
                                int iOptInt5 = jSONObject5.optInt("bgp_retry", 3);
                                boolean zX10 = x(jSONObject5.optString("perf_data_upload_enable"), false);
                                if (zX6 != t || zX7 != u || iOptInt3 != s || iOptInt4 != v || zX8 != w || zX9 != x || iOptInt5 != y || zX10 != z) {
                                    t = zX6;
                                    u = zX7;
                                    s = iOptInt3;
                                    v = iOptInt4;
                                    w = zX8;
                                    x = zX9;
                                    y = iOptInt5;
                                    z = zX10;
                                    if (context != null) {
                                        SharedPreferences.Editor editorC2 = i4t.c(context, "open_common");
                                        i4t.k(editorC2, "a13", zX6);
                                        i4t.k(editorC2, "a6", zX8);
                                        i4t.k(editorC2, "a7", zX7);
                                        i4t.h(editorC2, "a8", iOptInt3);
                                        i4t.h(editorC2, "a9", iOptInt4);
                                        i4t.k(editorC2, "a10", zX9);
                                        i4t.h(editorC2, "a11", iOptInt5);
                                        i4t.k(editorC2, "a12", zX10);
                                        i4t.f(editorC2);
                                    }
                                }
                                d1.s();
                                d1.s();
                                d1.s();
                                d1.s();
                                d1.s();
                            } catch (Throwable th7) {
                                th = th7;
                                j2t.e(th, "AuthConfigManager", "load 17S");
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            str4 = "umv";
                            j2t.e(th, "AuthConfigManager", "load 17S");
                            if (p0t.l(jSONObject, "15K")) {
                                try {
                                    jSONObject2 = jSONObject.getJSONObject("15K");
                                    if (jSONObject2 != null) {
                                        zX2 = x(jSONObject2.optString("ucf"), g.f6317a);
                                        zX3 = x(jSONObject2.optString("fsv2"), g.f6318b);
                                        zX4 = x(jSONObject2.optString("usc"), g.c);
                                        String str6 = str4;
                                        iOptInt = jSONObject2.optInt(str6, g.d);
                                        String str7 = str3;
                                        zX5 = x(jSONObject2.optString(str7), g.e);
                                        String str8 = str2;
                                        iOptInt2 = jSONObject2.optInt(str8, g.f);
                                        if (zX2 != g.f6317a) {
                                        }
                                        g.f6317a = zX2;
                                        g.f6318b = zX3;
                                        g.c = zX4;
                                        g.d = iOptInt;
                                        g.e = zX5;
                                        g.f = iOptInt2;
                                        context2 = context;
                                        try {
                                            SharedPreferences.Editor editorC3 = i4t.c(context2, "open_common");
                                            i4t.k(editorC3, "ucf", g.f6317a);
                                            i4t.k(editorC3, "fsv2", g.f6318b);
                                            i4t.k(editorC3, "usc", g.c);
                                            i4t.h(editorC3, str6, g.d);
                                            i4t.k(editorC3, str7, g.e);
                                            i4t.h(editorC3, str8, g.f);
                                            i4t.f(editorC3);
                                        } catch (Throwable unused) {
                                        }
                                    } else {
                                        context2 = context;
                                    }
                                } catch (Throwable th9) {
                                    context2 = context;
                                    j2t.e(th9, "AuthConfigManager", "load 15K");
                                }
                            } else {
                                context2 = context;
                            }
                            if (p0t.l(jSONObject, "183")) {
                                try {
                                    v4t.c(o0tVar, jSONObject.getJSONObject("183"));
                                } catch (Throwable th10) {
                                    j2t.e(th10, "AuthConfigManager", "load 183");
                                }
                            }
                            if (p0t.l(jSONObject, "17I")) {
                                try {
                                    JSONObject jSONObject6 = jSONObject.getJSONObject("17I");
                                    boolean zX11 = x(jSONObject6.optString("na"), false);
                                    boolean zX12 = x(jSONObject6.optString("aa"), false);
                                    t1t.e = zX11;
                                    t1t.f = zX12;
                                    SharedPreferences.Editor editorC4 = i4t.c(context2, "open_common");
                                    i4t.k(editorC4, "a4", zX11);
                                    i4t.k(editorC4, "a5", zX12);
                                    i4t.f(editorC4);
                                } catch (Throwable th11) {
                                    j2t.e(th11, "AuthConfigManager", "load 17I");
                                }
                            }
                            if (p0t.l(jSONObject, "1A4")) {
                                try {
                                    JSONObject jSONObject7 = jSONObject.getJSONObject("1A4");
                                    String strOptString = jSONObject7.optString("ada");
                                    boolean zX13 = x(strOptString, q0t.c);
                                    long jOptLong = jSONObject7.optLong("iv", q0t.f30971a);
                                    q0t.d = zX13;
                                    q0t.f30972b = jOptLong;
                                    SharedPreferences.Editor editorC5 = i4t.c(context2, "open_common");
                                    i4t.j(editorC5, "a16", strOptString);
                                    i4t.i(editorC5, "a17", jOptLong);
                                    i4t.f(editorC5);
                                } catch (Throwable th12) {
                                    j2t.e(th12, "AuthConfigManager", "load 1A4");
                                    return;
                                }
                            }
                        }
                    } catch (Throwable th13) {
                        th = th13;
                        str3 = "ust";
                        str4 = "umv";
                        j2t.e(th, "AuthConfigManager", "load 17S");
                        if (p0t.l(jSONObject, "15K")) {
                            jSONObject2 = jSONObject.getJSONObject("15K");
                            if (jSONObject2 != null) {
                                zX2 = x(jSONObject2.optString("ucf"), g.f6317a);
                                zX3 = x(jSONObject2.optString("fsv2"), g.f6318b);
                                zX4 = x(jSONObject2.optString("usc"), g.c);
                                String str9 = str4;
                                iOptInt = jSONObject2.optInt(str9, g.d);
                                String str10 = str3;
                                zX5 = x(jSONObject2.optString(str10), g.e);
                                String str11 = str2;
                                iOptInt2 = jSONObject2.optInt(str11, g.f);
                                if (zX2 != g.f6317a) {
                                }
                                g.f6317a = zX2;
                                g.f6318b = zX3;
                                g.c = zX4;
                                g.d = iOptInt;
                                g.e = zX5;
                                g.f = iOptInt2;
                                context2 = context;
                                SharedPreferences.Editor editorC6 = i4t.c(context2, "open_common");
                                i4t.k(editorC6, "ucf", g.f6317a);
                                i4t.k(editorC6, "fsv2", g.f6318b);
                                i4t.k(editorC6, "usc", g.c);
                                i4t.h(editorC6, str9, g.d);
                                i4t.k(editorC6, str10, g.e);
                                i4t.h(editorC6, str11, g.f);
                                i4t.f(editorC6);
                            } else {
                                context2 = context;
                            }
                        } else {
                            context2 = context;
                        }
                        if (p0t.l(jSONObject, "183")) {
                            v4t.c(o0tVar, jSONObject.getJSONObject("183"));
                        }
                        if (p0t.l(jSONObject, "17I")) {
                            JSONObject jSONObject8 = jSONObject.getJSONObject("17I");
                            boolean zX14 = x(jSONObject8.optString("na"), false);
                            boolean zX15 = x(jSONObject8.optString("aa"), false);
                            t1t.e = zX14;
                            t1t.f = zX15;
                            SharedPreferences.Editor editorC7 = i4t.c(context2, "open_common");
                            i4t.k(editorC7, "a4", zX14);
                            i4t.k(editorC7, "a5", zX15);
                            i4t.f(editorC7);
                        }
                        if (p0t.l(jSONObject, "1A4")) {
                            JSONObject jSONObject9 = jSONObject.getJSONObject("1A4");
                            String strOptString2 = jSONObject9.optString("ada");
                            boolean zX16 = x(strOptString2, q0t.c);
                            long jOptLong2 = jSONObject9.optLong("iv", q0t.f30971a);
                            q0t.d = zX16;
                            q0t.f30972b = jOptLong2;
                            SharedPreferences.Editor editorC8 = i4t.c(context2, "open_common");
                            i4t.j(editorC8, "a16", strOptString2);
                            i4t.i(editorC8, "a17", jOptLong2);
                            i4t.f(editorC8);
                        }
                    }
                } else {
                    str2 = "ustv";
                    str3 = "ust";
                    str4 = "umv";
                }
            } catch (Throwable th14) {
                th = th14;
                str2 = "ustv";
            }
        } else {
            str2 = "ustv";
            str3 = "ust";
            str4 = "umv";
        }
        if (p0t.l(jSONObject, "15K")) {
            jSONObject2 = jSONObject.getJSONObject("15K");
            if (jSONObject2 != null) {
                zX2 = x(jSONObject2.optString("ucf"), g.f6317a);
                zX3 = x(jSONObject2.optString("fsv2"), g.f6318b);
                zX4 = x(jSONObject2.optString("usc"), g.c);
                String str12 = str4;
                iOptInt = jSONObject2.optInt(str12, g.d);
                String str13 = str3;
                zX5 = x(jSONObject2.optString(str13), g.e);
                String str14 = str2;
                iOptInt2 = jSONObject2.optInt(str14, g.f);
                if (zX2 != g.f6317a && zX3 == g.f6318b && zX4 == g.c && iOptInt == g.d && zX5 == g.e && iOptInt2 == g.d) {
                    context2 = context;
                } else {
                    g.f6317a = zX2;
                    g.f6318b = zX3;
                    g.c = zX4;
                    g.d = iOptInt;
                    g.e = zX5;
                    g.f = iOptInt2;
                    context2 = context;
                    SharedPreferences.Editor editorC9 = i4t.c(context2, "open_common");
                    i4t.k(editorC9, "ucf", g.f6317a);
                    i4t.k(editorC9, "fsv2", g.f6318b);
                    i4t.k(editorC9, "usc", g.c);
                    i4t.h(editorC9, str12, g.d);
                    i4t.k(editorC9, str13, g.e);
                    i4t.h(editorC9, str14, g.f);
                    i4t.f(editorC9);
                }
            } else {
                context2 = context;
            }
        } else {
            context2 = context;
        }
        if (p0t.l(jSONObject, "183")) {
            v4t.c(o0tVar, jSONObject.getJSONObject("183"));
        }
        if (p0t.l(jSONObject, "17I")) {
            JSONObject jSONObject10 = jSONObject.getJSONObject("17I");
            boolean zX17 = x(jSONObject10.optString("na"), false);
            boolean zX18 = x(jSONObject10.optString("aa"), false);
            t1t.e = zX17;
            t1t.f = zX18;
            SharedPreferences.Editor editorC10 = i4t.c(context2, "open_common");
            i4t.k(editorC10, "a4", zX17);
            i4t.k(editorC10, "a5", zX18);
            i4t.f(editorC10);
        }
        if (p0t.l(jSONObject, "1A4")) {
            JSONObject jSONObject11 = jSONObject.getJSONObject("1A4");
            String strOptString3 = jSONObject11.optString("ada");
            boolean zX19 = x(strOptString3, q0t.c);
            long jOptLong3 = jSONObject11.optLong("iv", q0t.f30971a);
            q0t.d = zX19;
            q0t.f30972b = jOptLong3;
            SharedPreferences.Editor editorC11 = i4t.c(context2, "open_common");
            i4t.j(editorC11, "a16", strOptString3);
            i4t.i(editorC11, "a17", jOptLong3);
            i4t.f(editorC11);
        }
    }

    public static void k(Context context, o0t o0tVar, Throwable th) {
        h(context, o0tVar, th.getMessage());
    }

    public static void l(Context context, String str) {
        e0t.b(context, str);
    }

    public static void m(Context context, String str, String str2, f fVar) {
        if (fVar == null || TextUtils.isEmpty(fVar.f6315a)) {
            return;
        }
        String strE = fVar.e();
        if (TextUtils.isEmpty(strE) || context == null) {
            return;
        }
        SharedPreferences.Editor editorC = i4t.c(context, str2);
        editorC.putString(str, strE);
        i4t.f(editorC);
    }

    public static void n(d1.c cVar) {
        if (cVar == null || g == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("serverip", cVar.c);
        map.put("hostname", cVar.e);
        map.put("path", cVar.d);
        map.put("csid", cVar.f5997a);
        map.put("degrade", String.valueOf(cVar.f5998b.a()));
        map.put("errorcode", String.valueOf(cVar.m));
        map.put("errorsubcode", String.valueOf(cVar.n));
        map.put("connecttime", String.valueOf(cVar.h));
        map.put("writetime", String.valueOf(cVar.i));
        map.put("readtime", String.valueOf(cVar.j));
        map.put("datasize", String.valueOf(cVar.l));
        map.put("totaltime", String.valueOf(cVar.f));
        String string = new JSONObject(map).toString();
        "--埋点--".concat(String.valueOf(string));
        d1.s();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            f6t f6tVar = new f6t(g, "core", "2.0", "O008");
            f6tVar.a(string);
            g6t.e(f6tVar, g);
        } catch (ik unused) {
        }
    }

    public static void o(o0t o0tVar) {
        if (o0tVar != null) {
            try {
                if (TextUtils.isEmpty(o0tVar.a())) {
                    return;
                }
                String strF = o0tVar.f();
                if (TextUtils.isEmpty(strF)) {
                    strF = o0tVar.e();
                }
                if (TextUtils.isEmpty(strF)) {
                    return;
                }
                t1t.b(o0tVar.a(), strF);
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void p(String str, long j2, String str2) {
        try {
            if (p != null && p.containsKey(str)) {
                if (n == null) {
                    n = new ConcurrentHashMap<>(8);
                }
                n.put(str, new h(Long.valueOf(j2), str2));
                Context context = g;
                if (context != null) {
                    SharedPreferences.Editor editorC = i4t.c(context, "open_common");
                    i4t.i(editorC, str, j2);
                    i4t.j(editorC, str + "lct-info", str2);
                    i4t.f(editorC);
                }
            }
        } catch (Throwable th) {
            j2t.e(th, "at", "ucut");
        }
    }

    public static void q(String str, String str2) {
        f fVarE = e(g, str, str2);
        String strC = p0t.c(System.currentTimeMillis(), "yyyyMMdd");
        if (!strC.equals(fVarE.f6316b)) {
            fVarE.c(strC);
            fVarE.c.set(0);
        }
        fVarE.c.incrementAndGet();
        m(g, str, str2, fVarE);
    }

    public static synchronized void r(String str, boolean z2, String str2, String str3, String str4) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (o == null) {
                o = new ConcurrentHashMap<>(8);
            }
            o.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
            if (p == null) {
                return;
            }
            if (p.containsKey(str)) {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (z2) {
                    v4t.j(true, str);
                }
                j1.h().b(new a(str, str2, str3, str4));
            }
        } catch (Throwable th) {
            j2t.e(th, "at", "lca");
        }
    }

    public static void s(String str, boolean z2, boolean z3, boolean z4) {
        if (TextUtils.isEmpty(str) || g == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("url", str);
        map.put("downLevel", String.valueOf(z2));
        map.put("ant", h0t.K(g) == 0 ? "0" : "1");
        if (z4) {
            map.put("type", z2 ? e : f);
        } else {
            map.put("type", z2 ? c : d);
        }
        map.put("status", z3 ? "0" : "1");
        String string = new JSONObject(map).toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            f6t f6tVar = new f6t(g, "core", "2.0", "O002");
            f6tVar.a(string);
            g6t.e(f6tVar, g);
        } catch (ik unused) {
        }
    }

    public static void t(boolean z2, d1.a aVar) {
        if (!D || aVar == null) {
            return;
        }
        synchronized (C) {
            if (z2) {
                try {
                    Iterator<d1.a> it = C.iterator();
                    while (it.hasNext()) {
                        d1.a next = it.next();
                        if (next.f5994b.equals(aVar.f5994b) && next.e.equals(aVar.e) && next.f == aVar.f) {
                            if (next.j == aVar.j) {
                                it.remove();
                                d1.s();
                            } else {
                                next.j.set(next.j.get() - aVar.j.get());
                                d1.s();
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            D = false;
            d1.s();
            for (d1.a aVar2 : C) {
                String str = aVar2.e;
                Objects.toString(aVar2.j);
                d1.s();
            }
            d1.s();
        }
    }

    public static void u(boolean z2, String str) {
        try {
            "--markHostNameFailed---hostname=".concat(String.valueOf(str));
            d1.s();
            if (t || z2) {
                if ((x || !z2) && !TextUtils.isEmpty(str)) {
                    if (z2) {
                        if (B.get(str) != null) {
                            return;
                        }
                        B.put(str, Boolean.TRUE);
                        q(B(str, "a15"), "open_common");
                        return;
                    }
                    if (A.get(str) != null) {
                        return;
                    }
                    A.put(str, Boolean.TRUE);
                    q(B(str, "a14"), "open_common");
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean v() {
        f fVarE;
        if (g != null) {
            X();
            if (!K()) {
                return false;
            }
            if (G()) {
                return true;
            }
        }
        return h && (fVarE = e(g, "IPV6_CONFIG_NAME", "open_common")) != null && fVarE.a() < 5;
    }

    public static synchronized boolean w(String str, long j2) {
        boolean z2 = false;
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            h hVarR = R(str);
            long jLongValue = 0;
            if (j2 != (hVarR != null ? hVarR.f6319a : 0L)) {
                if (o != null && o.containsKey(str)) {
                    jLongValue = o.get(str).longValue();
                }
                if (SystemClock.elapsedRealtime() - jLongValue > 30000) {
                    z2 = true;
                }
            }
        } catch (Throwable unused) {
        }
        return z2;
    }

    public static boolean x(String str, boolean z2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return z2;
            }
            String[] strArrSplit = URLDecoder.decode(str).split("/");
            return strArrSplit[strArrSplit.length - 1].charAt(4) % 2 == 1;
        } catch (Throwable unused) {
            return z2;
        }
    }

    public static boolean y(InetAddress inetAddress) {
        return inetAddress.isLoopbackAddress() || inetAddress.isLinkLocalAddress() || inetAddress.isAnyLocalAddress();
    }

    public static c z(Context context, o0t o0tVar, String str, Map<String, String> map) {
        return d(context, o0tVar, str, map, null, null, null);
    }
}
