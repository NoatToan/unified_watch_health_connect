package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.ik;
import com.amap.api.col.p0003sl.x0;
import com.miui.tsmclient.util.StringUtils;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes4.dex */
public final class v4t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile ConcurrentHashMap<String, c> f36479a = new ConcurrentHashMap<>(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile List<String> f36480b = Collections.synchronizedList(new ArrayList(8));
    public static volatile ConcurrentHashMap<String, b> c = new ConcurrentHashMap<>(8);
    public static Random d = new Random();
    public static ConcurrentHashMap<String, String> e = new ConcurrentHashMap<>(8);
    public static List<f6t> f = Collections.synchronizedList(new ArrayList(16));

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f36481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f36482b;
        public double c;

        public a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public v5t f36483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f36484b;

        public b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public static synchronized String a(String str, String str2) throws ik {
        try {
            try {
                try {
                    System.currentTimeMillis();
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                        Context context = x0.g;
                        try {
                            if (f36480b == null) {
                                f36480b = Collections.synchronizedList(new ArrayList(8));
                            }
                            if (context != null && !f36480b.contains(str2)) {
                                f36480b.add(str2);
                                String strD = i4t.d(context, "Yb3Blbl9odHRwX2NvbnRyb2w", str2);
                                if (!TextUtils.isEmpty(strD)) {
                                    g(str2, new JSONObject(strD));
                                }
                            }
                        } catch (Throwable th) {
                            j2t.e(th, "hlUtil", "llhl");
                        }
                        if (f36479a != null && f36479a.size() > 0) {
                            if (!f36479a.containsKey(str2)) {
                                return str;
                            }
                            c cVar = f36479a.get(str2);
                            if (cVar == null) {
                                return str;
                            }
                            if (l(str, cVar, str2)) {
                                throw new ik("服务QPS超限");
                            }
                            return o(str, cVar, str2);
                        }
                        return str;
                    }
                    return str;
                } catch (ik e2) {
                    throw e2;
                }
            } catch (Throwable th2) {
                j2t.e(th2, "hlUtil", "pcr");
                return str;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public static void b() {
        try {
            Context context = x0.g;
            if (context == null) {
                return;
            }
            g6t.d(p(), context);
        } catch (Throwable unused) {
        }
    }

    public static synchronized void c(o0t o0tVar, JSONObject jSONObject) {
        if (o0tVar == null) {
            return;
        }
        try {
            String strA = o0tVar.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            if (jSONObject == null) {
                d(strA);
            }
            if (!x0.x(jSONObject.optString("able", null), false)) {
                d(strA);
            } else {
                i4t.e(x0.g, "Yb3Blbl9odHRwX2NvbnRyb2w", strA, jSONObject.toString());
                g(strA, jSONObject);
            }
        } catch (Throwable th) {
            j2t.e(th, "hlUtil", "par");
        }
    }

    public static synchronized void d(String str) {
        try {
            if (f36479a.containsKey(str)) {
                f36479a.remove(str);
            }
            SharedPreferences.Editor editorC = i4t.c(x0.g, "Yb3Blbl9odHRwX2NvbnRyb2w");
            i4t.g(editorC, str);
            i4t.f(editorC);
        } catch (Throwable th) {
            j2t.e(th, "hlUtil", "rc");
        }
    }

    public static void e(String str, String str2, String str3) {
        try {
            Context context = x0.g;
            if (context != null && !TextUtils.isEmpty(str)) {
                if (e == null) {
                    e = new ConcurrentHashMap<>(8);
                }
                synchronized (e) {
                    try {
                        if (e.containsKey(str2)) {
                            return;
                        }
                        e.put(str2, str3);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("timestamp", System.currentTimeMillis());
                        jSONObject.put("type", t1t.l);
                        jSONObject.put("name", str);
                        jSONObject.put("version", t1t.a(str));
                        jSONObject.put("hostname", str2 + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + str3);
                        String string = jSONObject.toString();
                        if (TextUtils.isEmpty(string)) {
                            return;
                        }
                        f6t f6tVar = new f6t(context, "core", "2.0", "O005");
                        f6tVar.a(string);
                        g6t.e(f6tVar, context);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void f(String str, c cVar) {
        try {
            if (f36479a == null) {
                f36479a = new ConcurrentHashMap<>(8);
            }
            f36479a.put(str, cVar);
        } catch (Throwable th) {
            j2t.e(th, "hlUtil", "ucr");
        }
    }

    public static void g(String str, JSONObject jSONObject) {
        try {
            c cVar = new c((byte) 0);
            i(cVar, jSONObject);
            r(cVar, jSONObject);
            if (cVar.f36486b == null && cVar.f36485a == null) {
                d(str);
            } else {
                f(str, cVar);
            }
        } catch (Throwable unused) {
        }
    }

    public static void h(URL url, v5t v5tVar) {
        List<String> list;
        try {
            if (c == null) {
                c = new ConcurrentHashMap<>(8);
            }
            Map<String, List<String>> map = v5tVar.f36514b;
            if (map != null && map.containsKey("nb") && (list = v5tVar.f36514b.get("nb")) != null && list.size() > 0) {
                byte b2 = 0;
                String[] strArrSplit = list.get(0).split(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX);
                if (strArrSplit.length < 2) {
                    return;
                }
                int i = Integer.parseInt(strArrSplit[0]);
                long j = Integer.parseInt(strArrSplit[1]);
                b bVar = new b(b2);
                bVar.f36483a = v5tVar;
                if (j <= 0) {
                    j = 30;
                }
                bVar.f36484b = SystemClock.elapsedRealtime() + (j * 1000);
                if (i == 1) {
                    c.put("app", bVar);
                } else {
                    if (i != 2 || url == null) {
                        return;
                    }
                    c.put(url.getPath(), bVar);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void i(c cVar, JSONObject jSONObject) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("block");
            if (jSONArrayOptJSONArray == null) {
                return;
            }
            HashMap map = new HashMap(8);
            byte b2 = 0;
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("api");
                    if (!TextUtils.isEmpty(strOptString)) {
                        if (!strOptString.startsWith("/")) {
                            strOptString = "/".concat(strOptString);
                        }
                        if (strOptString.endsWith("/")) {
                            strOptString = strOptString.substring(0, strOptString.length() - 1);
                        }
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("periods");
                        ArrayList arrayList = new ArrayList();
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i2);
                            if (jSONObjectOptJSONObject2 != null) {
                                a aVar = new a(b2);
                                aVar.f36481a = jSONObjectOptJSONObject2.optString("begin");
                                aVar.f36482b = jSONObjectOptJSONObject2.optInt("duration");
                                aVar.c = jSONObjectOptJSONObject2.optDouble("percent");
                                arrayList.add(aVar);
                            }
                        }
                        map.put(strOptString, arrayList);
                    }
                }
            }
            cVar.f36485a = map;
        } catch (Throwable th) {
            j2t.e(th, "hlUtil", "pbr");
        }
    }

    public static void j(boolean z, String str) {
        try {
            Context context = x0.g;
            if (context != null && !TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                if (z) {
                    jSONObject.put("type", t1t.i);
                } else {
                    jSONObject.put("type", t1t.h);
                }
                jSONObject.put("name", str);
                jSONObject.put("version", t1t.a(str));
                String string = jSONObject.toString();
                f6t f6tVar = new f6t(context, "core", "2.0", "O005");
                f6tVar.a(string);
                g6t.e(f6tVar, context);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void k(boolean r5, java.lang.String r6, java.lang.String r7, int r8) {
        /*
            android.content.Context r0 = com.amap.api.col.p0003sl.x0.g     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L97
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L97
            if (r1 != 0) goto L97
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L97
            if (r1 == 0) goto L12
            goto L97
        L12:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L97
            r1.<init>()     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = "timestamp"
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L97
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = defpackage.t1t.a(r6)     // Catch: java.lang.Throwable -> L97
            if (r5 == 0) goto L2e
            java.lang.String r5 = "type"
            java.lang.Integer r3 = defpackage.t1t.f34216k     // Catch: java.lang.Throwable -> L97
            r1.put(r5, r3)     // Catch: java.lang.Throwable -> L97
            goto L35
        L2e:
            java.lang.String r5 = "type"
            java.lang.Integer r3 = defpackage.t1t.j     // Catch: java.lang.Throwable -> L97
            r1.put(r5, r3)     // Catch: java.lang.Throwable -> L97
        L35:
            java.lang.String r5 = "name"
            r1.put(r5, r6)     // Catch: java.lang.Throwable -> L97
            java.lang.String r5 = "version"
            r1.put(r5, r2)     // Catch: java.lang.Throwable -> L97
            android.net.Uri r5 = android.net.Uri.parse(r7)     // Catch: java.lang.Throwable -> L97
            java.lang.String r5 = r5.getPath()     // Catch: java.lang.Throwable -> L97
            java.lang.String r6 = "uri"
            r1.put(r6, r5)     // Catch: java.lang.Throwable -> L97
            java.lang.String r5 = "blockLevel"
            r1.put(r5, r8)     // Catch: java.lang.Throwable -> L97
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L97
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L97
            if (r6 == 0) goto L5c
            return
        L5c:
            f6t r6 = new f6t     // Catch: java.lang.Throwable -> L97
            java.lang.String r7 = "core"
            java.lang.String r8 = "2.0"
            java.lang.String r1 = "O005"
            r6.<init>(r0, r7, r8, r1)     // Catch: java.lang.Throwable -> L97
            r6.a(r5)     // Catch: java.lang.Throwable -> L97
            java.util.List<f6t> r5 = defpackage.v4t.f     // Catch: java.lang.Throwable -> L97
            if (r5 != 0) goto L7b
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L97
            r7 = 16
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L97
            java.util.List r5 = java.util.Collections.synchronizedList(r5)     // Catch: java.lang.Throwable -> L97
            defpackage.v4t.f = r5     // Catch: java.lang.Throwable -> L97
        L7b:
            java.util.List<f6t> r5 = defpackage.v4t.f     // Catch: java.lang.Throwable -> L97
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L97
            java.util.List<f6t> r7 = defpackage.v4t.f     // Catch: java.lang.Throwable -> L91
            r7.add(r6)     // Catch: java.lang.Throwable -> L91
            java.util.List<f6t> r6 = defpackage.v4t.f     // Catch: java.lang.Throwable -> L91
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L91
            r7 = 15
            if (r6 < r7) goto L93
            b()     // Catch: java.lang.Throwable -> L91
            goto L93
        L91:
            r6 = move-exception
            goto L95
        L93:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L91
            return
        L95:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L91
            throw r6     // Catch: java.lang.Throwable -> L97
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v4t.k(boolean, java.lang.String, java.lang.String, int):void");
    }

    public static boolean l(String str, c cVar, String str2) {
        try {
            Map<String, List<a>> map = cVar.f36485a;
            if (map != null && map.size() > 0) {
                if (map.containsKey(Marker.ANY_MARKER)) {
                    Iterator<Map.Entry<String, List<a>>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        if (m(it.next().getValue())) {
                            k(false, str2, str, 1);
                            return true;
                        }
                    }
                } else {
                    String path = Uri.parse(str).getPath();
                    if (map.containsKey(path) && m(map.get(path))) {
                        k(false, str2, str, 2);
                        return true;
                    }
                }
                return false;
            }
            return false;
        } catch (Throwable th) {
            j2t.e(th, "hlUtil", "inb");
        }
    }

    public static boolean m(List<a> list) {
        if (list != null && list.size() > 0) {
            Iterator<a> it = list.iterator();
            while (it.hasNext()) {
                if (n(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean n(a aVar) {
        if (aVar == null || aVar.c == 1.0d) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!TextUtils.isEmpty(aVar.f36481a) && aVar.f36482b > 0) {
            long timeInMillis = jCurrentTimeMillis - p0t.h(aVar.f36481a, StringUtils.EXPECT_TIME_FORMAT).getTimeInMillis();
            if (timeInMillis > 0 && timeInMillis < aVar.f36482b * 1000) {
                if (aVar.c == 0.0d) {
                    return true;
                }
                if (d == null) {
                    d = new Random();
                }
                d.setSeed(((long) UUID.randomUUID().hashCode()) + jCurrentTimeMillis);
                if (d.nextDouble() > aVar.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String o(String str, c cVar, String str2) {
        try {
            Map<String, String> map = cVar.f36486b;
            if (map != null && map.size() > 0) {
                Uri uri = Uri.parse(str);
                String authority = uri.getAuthority();
                if (!map.containsKey(authority)) {
                    return str;
                }
                String str3 = map.get(authority);
                str = uri.buildUpon().authority(str3).toString();
                e(str2, authority, str3);
                return str;
            }
            return str;
        } catch (Throwable th) {
            j2t.e(th, "hlUtil", "pdr");
            return str;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x001f */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0028, code lost:
    
        r0 = th;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<defpackage.f6t> p() {
        /*
            r0 = 0
            java.util.List<f6t> r1 = defpackage.v4t.f     // Catch: java.lang.Throwable -> L2b
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L2b
            java.util.List<f6t> r2 = defpackage.v4t.f     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L26
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L21
            if (r2 <= 0) goto L26
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L21
            r2.<init>()     // Catch: java.lang.Throwable -> L21
            java.util.List<f6t> r0 = defpackage.v4t.f     // Catch: java.lang.Throwable -> L1f
            r2.addAll(r0)     // Catch: java.lang.Throwable -> L1f
            java.util.List<f6t> r0 = defpackage.v4t.f     // Catch: java.lang.Throwable -> L1f
            r0.clear()     // Catch: java.lang.Throwable -> L1f
            r0 = r2
            goto L26
        L1f:
            r0 = move-exception
            goto L28
        L21:
            r2 = move-exception
            r3 = r2
            r2 = r0
            r0 = r3
            goto L28
        L26:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L21
            goto L2b
        L28:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            throw r0     // Catch: java.lang.Throwable -> L2a
        L2a:
            r0 = r2
        L2b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v4t.p():java.util.List");
    }

    public static v5t q(String str, String str2) {
        Uri uri;
        try {
            if (c == null) {
                return null;
            }
            if (c.containsKey("app")) {
                b bVar = c.get("app");
                if (SystemClock.elapsedRealtime() <= bVar.f36484b) {
                    v5t v5tVar = bVar.f36483a;
                    if (v5tVar != null) {
                        v5tVar.e = false;
                    }
                    k(true, str2, str, 1);
                    return v5tVar;
                }
                c.remove("app");
            } else if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null) {
                String path = uri.getPath();
                if (c.containsKey(path)) {
                    b bVar2 = c.get(path);
                    if (SystemClock.elapsedRealtime() <= bVar2.f36484b) {
                        v5t v5tVar2 = bVar2.f36483a;
                        if (v5tVar2 != null) {
                            v5tVar2.e = false;
                        }
                        k(true, str2, str, 2);
                        return v5tVar2;
                    }
                    c.remove(path);
                }
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    public static void r(c cVar, JSONObject jSONObject) {
        JSONArray jSONArrayNames;
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("domainMap");
            if (jSONObjectOptJSONObject == null || (jSONArrayNames = jSONObjectOptJSONObject.names()) == null) {
                return;
            }
            HashMap map = new HashMap(8);
            int length = jSONArrayNames.length();
            for (int i = 0; i < length; i++) {
                String strOptString = jSONArrayNames.optString(i);
                map.put(strOptString, jSONObjectOptJSONObject.optString(strOptString));
            }
            cVar.f36486b = map;
        } catch (Throwable th) {
            j2t.e(th, "hlUtil", "pdr");
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Map<String, List<a>> f36485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map<String, String> f36486b;

        public c() {
            this.f36485a = new HashMap(8);
            this.f36486b = new HashMap(8);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class == obj.getClass()) {
                c cVar = (c) obj;
                if (this.f36485a.equals(cVar.f36485a) && this.f36486b.equals(cVar.f36486b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            Map<String, List<a>> map = this.f36485a;
            int iHashCode = map != null ? map.hashCode() : 0;
            Map<String, String> map2 = this.f36486b;
            return iHashCode + (map2 != null ? map2.hashCode() : 0);
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }
}
