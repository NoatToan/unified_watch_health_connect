package com.amap.api.mapcore.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huami.watch.notification.TransportUri;
import com.huami.watch.ota.UpdateUtils;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
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

/* JADX INFO: loaded from: classes2.dex */
public final class in {
    public static volatile ConcurrentHashMap<String, c> a = new ConcurrentHashMap<>(8);
    public static volatile List<String> b = Collections.synchronizedList(new ArrayList(8));
    private static volatile ConcurrentHashMap<String, b> c = new ConcurrentHashMap<>(8);
    private static Random d = new Random();
    private static ConcurrentHashMap<String, String> e = new ConcurrentHashMap<>(8);
    private static List<iz> f = Collections.synchronizedList(new ArrayList(16));

    public static class a {
        public String a;
        public int b;
        public double c;

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static class b {
        public is a;
        public long b;

        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    public static synchronized void a(gt gtVar, JSONObject jSONObject) {
        if (gtVar == null) {
            return;
        }
        try {
            String strA = gtVar.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            if (jSONObject == null) {
                a(strA);
            }
            if (!gk.a(jSONObject.optString("able", null), false)) {
                a(strA);
            } else {
                hp.a(gk.c, "Yb3Blbl9odHRwX2NvbnRyb2w", strA, jSONObject.toString());
                a(strA, jSONObject);
            }
        } catch (Throwable th) {
            hk.a(th, "hlUtil", "par");
        }
    }

    public static is b(String str, String str2) {
        Uri uri;
        try {
            if (c == null) {
                return null;
            }
            if (c.containsKey("app")) {
                b bVar = c.get("app");
                if (SystemClock.elapsedRealtime() <= bVar.b) {
                    is isVar = bVar.a;
                    if (isVar != null) {
                        isVar.e = false;
                    }
                    a(true, str2, str, 1);
                    return isVar;
                }
                c.remove("app");
            } else if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null) {
                String path = uri.getPath();
                if (c.containsKey(path)) {
                    b bVar2 = c.get(path);
                    if (SystemClock.elapsedRealtime() <= bVar2.b) {
                        is isVar2 = bVar2.a;
                        if (isVar2 != null) {
                            isVar2.e = false;
                        }
                        a(true, str2, str, 2);
                        return isVar2;
                    }
                    c.remove(path);
                }
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    public static class c {
        public Map<String, List<a>> a;
        public Map<String, String> b;

        private c() {
            this.a = new HashMap(8);
            this.b = new HashMap(8);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class == obj.getClass()) {
                c cVar = (c) obj;
                if (this.a.equals(cVar.a) && this.b.equals(cVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            Map<String, List<a>> map = this.a;
            int iHashCode = map != null ? map.hashCode() : 0;
            Map<String, String> map2 = this.b;
            return iHashCode + (map2 != null ? map2.hashCode() : 0);
        }

        public /* synthetic */ c(byte b) {
            this();
        }
    }

    private static void a(String str, JSONObject jSONObject) {
        try {
            c cVar = new c((byte) 0);
            a(cVar, jSONObject);
            b(cVar, jSONObject);
            if (cVar.b == null && cVar.a == null) {
                a(str);
            } else {
                a(str, cVar);
            }
        } catch (Throwable unused) {
        }
    }

    private static void b(c cVar, JSONObject jSONObject) {
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
            cVar.b = map;
        } catch (Throwable th) {
            hk.a(th, "hlUtil", "pdr");
        }
    }

    public static synchronized String a(String str, String str2) throws gi {
        try {
            try {
                System.currentTimeMillis();
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                    Context context = gk.c;
                    try {
                        if (b == null) {
                            b = Collections.synchronizedList(new ArrayList(8));
                        }
                        if (context != null && !b.contains(str2)) {
                            b.add(str2);
                            String strA = hp.a(context, "Yb3Blbl9odHRwX2NvbnRyb2w", str2);
                            if (!TextUtils.isEmpty(strA)) {
                                a(str2, new JSONObject(strA));
                            }
                        }
                    } catch (Throwable th) {
                        hk.a(th, "hlUtil", "llhl");
                    }
                    if (a != null && a.size() > 0) {
                        if (!a.containsKey(str2)) {
                            return str;
                        }
                        c cVar = a.get(str2);
                        if (cVar == null) {
                            return str;
                        }
                        if (!a(str, cVar, str2)) {
                            return b(str, cVar, str2);
                        }
                        throw new gi("服务QPS超限");
                    }
                    return str;
                }
                return str;
            } catch (Throwable th2) {
                throw th2;
            }
        } catch (gi e2) {
            throw e2;
        } catch (Throwable th3) {
            hk.a(th3, "hlUtil", "pcr");
            return str;
        }
    }

    private static String b(String str, c cVar, String str2) {
        try {
            Map<String, String> map = cVar.b;
            if (map != null && map.size() > 0) {
                Uri uri = Uri.parse(str);
                String authority = uri.getAuthority();
                if (!map.containsKey(authority)) {
                    return str;
                }
                String str3 = map.get(authority);
                str = uri.buildUpon().authority(str3).toString();
                a(str2, authority, str3);
                return str;
            }
            return str;
        } catch (Throwable th) {
            hk.a(th, "hlUtil", "pdr");
            return str;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0028 */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0024, code lost:
    
        r0 = th;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static List<iz> b() {
        ArrayList arrayList;
        Throwable th;
        ArrayList arrayList2 = null;
        try {
            synchronized (f) {
                try {
                    List<iz> list = f;
                    if (list != null && list.size() > 0) {
                        arrayList = new ArrayList();
                        arrayList.addAll(f);
                        f.clear();
                        arrayList2 = arrayList;
                    }
                    return arrayList2;
                } catch (Throwable th2) {
                    arrayList = arrayList2;
                    th = th2;
                }
            }
            while (true) {
                try {
                    break;
                } catch (Throwable unused) {
                    return arrayList;
                }
            }
            throw th;
            while (true) {
                break;
                break;
            }
            throw th;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static void a(URL url, is isVar) {
        List<String> list;
        try {
            if (c == null) {
                c = new ConcurrentHashMap<>(8);
            }
            Map<String, List<String>> map = isVar.b;
            if (map != null && map.containsKey("nb") && (list = isVar.b.get("nb")) != null && list.size() > 0) {
                byte b2 = 0;
                String[] strArrSplit = list.get(0).split(UpdateUtils.CMD_FILTER);
                if (strArrSplit.length < 2) {
                    return;
                }
                int i = Integer.parseInt(strArrSplit[0]);
                long j = Integer.parseInt(strArrSplit[1]);
                b bVar = new b(b2);
                bVar.a = isVar;
                if (j <= 0) {
                    j = 30;
                }
                bVar.b = SystemClock.elapsedRealtime() + (j * 1000);
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

    private static void a(String str, c cVar) {
        try {
            if (a == null) {
                a = new ConcurrentHashMap<>(8);
            }
            a.put(str, cVar);
        } catch (Throwable th) {
            hk.a(th, "hlUtil", "ucr");
        }
    }

    private static void a(c cVar, JSONObject jSONObject) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(TransportUri.ACTION_BLOCK);
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
                        if (!strOptString.startsWith(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE)) {
                            strOptString = FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE.concat(strOptString);
                        }
                        if (strOptString.endsWith(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE)) {
                            strOptString = strOptString.substring(0, strOptString.length() - 1);
                        }
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("periods");
                        ArrayList arrayList = new ArrayList();
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i2);
                            if (jSONObjectOptJSONObject2 != null) {
                                a aVar = new a(b2);
                                aVar.a = jSONObjectOptJSONObject2.optString("begin");
                                aVar.b = jSONObjectOptJSONObject2.optInt("duration");
                                aVar.c = jSONObjectOptJSONObject2.optDouble("percent");
                                arrayList.add(aVar);
                            }
                        }
                        map.put(strOptString, arrayList);
                    }
                }
            }
            cVar.a = map;
        } catch (Throwable th) {
            hk.a(th, "hlUtil", "pbr");
        }
    }

    private static synchronized void a(String str) {
        try {
            if (a.containsKey(str)) {
                a.remove(str);
            }
            SharedPreferences.Editor editorA = hp.a(gk.c, "Yb3Blbl9odHRwX2NvbnRyb2w");
            hp.a(editorA, str);
            hp.a(editorA);
        } catch (Throwable th) {
            hk.a(th, "hlUtil", "rc");
        }
    }

    private static boolean a(String str, c cVar, String str2) {
        try {
            Map<String, List<a>> map = cVar.a;
            if (map != null && map.size() > 0) {
                if (map.containsKey("*")) {
                    Iterator<Map.Entry<String, List<a>>> it2 = map.entrySet().iterator();
                    while (it2.hasNext()) {
                        if (a(it2.next().getValue())) {
                            a(false, str2, str, 1);
                            return true;
                        }
                    }
                } else {
                    String path = Uri.parse(str).getPath();
                    if (map.containsKey(path) && a(map.get(path))) {
                        a(false, str2, str, 2);
                        return true;
                    }
                }
                return false;
            }
            return false;
        } catch (Throwable th) {
            hk.a(th, "hlUtil", "inb");
        }
    }

    private static boolean a(List<a> list) {
        if (list != null && list.size() > 0) {
            Iterator<a> it2 = list.iterator();
            while (it2.hasNext()) {
                if (a(it2.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a(a aVar) {
        if (aVar == null || aVar.c == 1.0d) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!TextUtils.isEmpty(aVar.a) && aVar.b > 0) {
            long timeInMillis = jCurrentTimeMillis - gu.a(aVar.a, "HH:mm:ss").getTimeInMillis();
            if (timeInMillis > 0 && timeInMillis < aVar.b * 1000) {
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

    public static void a(boolean z, String str) {
        try {
            Context context = gk.c;
            if (context != null && !TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                if (z) {
                    jSONObject.put("type", hj.g);
                } else {
                    jSONObject.put("type", hj.f);
                }
                jSONObject.put("name", str);
                jSONObject.put("version", hj.a(str));
                String string = jSONObject.toString();
                iz izVar = new iz(context, "core", "2.0", "O005");
                izVar.a(string);
                ja.a(izVar, context);
            }
        } catch (Throwable unused) {
        }
    }

    private static void a(String str, String str2, String str3) {
        try {
            Context context = gk.c;
            if (context != null && !TextUtils.isEmpty(str)) {
                if (e == null) {
                    e = new ConcurrentHashMap<>(8);
                }
                synchronized (e) {
                    if (e.containsKey(str2)) {
                        return;
                    }
                    e.put(str2, str3);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("timestamp", System.currentTimeMillis());
                    jSONObject.put("type", hj.j);
                    jSONObject.put("name", str);
                    jSONObject.put("version", hj.a(str));
                    jSONObject.put("hostname", str2 + UpdateUtils.CMD_FILTER + str3);
                    String string = jSONObject.toString();
                    if (TextUtils.isEmpty(string)) {
                        return;
                    }
                    iz izVar = new iz(context, "core", "2.0", "O005");
                    izVar.a(string);
                    ja.a(izVar, context);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static void a(boolean z, String str, String str2, int i) {
        try {
            Context context = gk.c;
            if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("timestamp", System.currentTimeMillis());
                String strA = hj.a(str);
                if (z) {
                    jSONObject.put("type", hj.i);
                } else {
                    jSONObject.put("type", hj.h);
                }
                jSONObject.put("name", str);
                jSONObject.put("version", strA);
                jSONObject.put("uri", Uri.parse(str2).getPath());
                jSONObject.put("blockLevel", i);
                String string = jSONObject.toString();
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                iz izVar = new iz(context, "core", "2.0", "O005");
                izVar.a(string);
                if (f == null) {
                    f = Collections.synchronizedList(new ArrayList(16));
                }
                synchronized (f) {
                    try {
                        f.add(izVar);
                        if (f.size() >= 15) {
                            a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void a() {
        try {
            Context context = gk.c;
            if (context == null) {
                return;
            }
            ja.a(b(), context);
        } catch (Throwable unused) {
        }
    }
}
