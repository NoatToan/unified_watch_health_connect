package com.amap.api.col.p0003sl;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
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

/* JADX INFO: loaded from: classes4.dex */
public final class kw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile ConcurrentHashMap<String, c> f2991a = new ConcurrentHashMap<>(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile List<String> f2992b = Collections.synchronizedList(new ArrayList(8));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile ConcurrentHashMap<String, b> f2993c = new ConcurrentHashMap<>(8);
    private static Random d = new Random();
    private static ConcurrentHashMap<String, String> e = new ConcurrentHashMap<>(8);
    private static List<li> f = Collections.synchronizedList(new ArrayList(16));

    public static void a(ix ixVar, JSONObject jSONObject) {
        synchronized (kw.class) {
            if (ixVar == null) {
                return;
            }
            try {
                String strA = ixVar.a();
                if (TextUtils.isEmpty(strA)) {
                    return;
                }
                if (jSONObject == null) {
                    a(strA);
                }
                if (!im.a(jSONObject.optString("able", null), false)) {
                    a(strA);
                } else {
                    ki.a(im.f2770c, "Yb3Blbl9odHRwX2NvbnRyb2w", strA, jSONObject.toString());
                    a(strA, jSONObject);
                }
            } catch (Throwable th) {
                js.a(th, "hlUtil", "par");
            }
        }
    }

    private static void a(String str, JSONObject jSONObject) {
        try {
            c cVar = new c((byte) 0);
            a(cVar, jSONObject);
            b(cVar, jSONObject);
            if (cVar.f3000b == null && cVar.f2999a == null) {
                a(str);
            } else {
                a(str, cVar);
            }
        } catch (Throwable unused) {
        }
    }

    public static String a(String str, String str2) throws ik {
        synchronized (kw.class) {
            try {
                try {
                    try {
                        System.currentTimeMillis();
                        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                            Context context = im.f2770c;
                            try {
                                if (f2992b == null) {
                                    f2992b = Collections.synchronizedList(new ArrayList(8));
                                }
                                if (context != null && !f2992b.contains(str2)) {
                                    f2992b.add(str2);
                                    String strA = ki.a(context, "Yb3Blbl9odHRwX2NvbnRyb2w", str2);
                                    if (!TextUtils.isEmpty(strA)) {
                                        a(str2, new JSONObject(strA));
                                    }
                                }
                            } catch (Throwable th) {
                                js.a(th, "hlUtil", "llhl");
                            }
                            if (f2991a != null && f2991a.size() > 0) {
                                if (!f2991a.containsKey(str2)) {
                                    return str;
                                }
                                c cVar = f2991a.get(str2);
                                if (cVar == null) {
                                    return str;
                                }
                                if (a(str, cVar, str2)) {
                                    throw new ik("服务QPS超限");
                                }
                                return b(str, cVar, str2);
                            }
                            return str;
                        }
                        return str;
                    } catch (Throwable th2) {
                        js.a(th2, "hlUtil", "pcr");
                        return str;
                    }
                } catch (ik e2) {
                    throw e2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        lb f2997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f2998b;

        private b() {
        }

        /* synthetic */ b(byte b2) {
            this();
        }
    }

    public static void a(URL url, lb lbVar) {
        List<String> list;
        try {
            if (f2993c == null) {
                f2993c = new ConcurrentHashMap<>(8);
            }
            if (lbVar.f3038b != null && lbVar.f3038b.containsKey("nb") && (list = lbVar.f3038b.get("nb")) != null && list.size() > 0) {
                byte b2 = 0;
                String[] strArrSplit = list.get(0).split("#");
                if (strArrSplit.length < 2) {
                    return;
                }
                int i = Integer.parseInt(strArrSplit[0]);
                long j = Integer.parseInt(strArrSplit[1]);
                b bVar = new b(b2);
                bVar.f2997a = lbVar;
                if (j <= 0) {
                    j = 30;
                }
                bVar.f2998b = SystemClock.elapsedRealtime() + (j * 1000);
                if (i == 1) {
                    f2993c.put("app", bVar);
                } else {
                    if (i != 2 || url == null) {
                        return;
                    }
                    f2993c.put(url.getPath(), bVar);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static lb b(String str, String str2) {
        Uri uri;
        try {
            if (f2993c == null) {
                return null;
            }
            if (f2993c.containsKey("app")) {
                b bVar = f2993c.get("app");
                if (SystemClock.elapsedRealtime() > bVar.f2998b) {
                    f2993c.remove("app");
                } else {
                    lb lbVar = bVar.f2997a;
                    if (lbVar != null) {
                        lbVar.e = false;
                    }
                    a(true, str2, str, 1);
                    return lbVar;
                }
            } else if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null) {
                String path = uri.getPath();
                if (f2993c.containsKey(path)) {
                    b bVar2 = f2993c.get(path);
                    if (SystemClock.elapsedRealtime() <= bVar2.f2998b) {
                        lb lbVar2 = bVar2.f2997a;
                        if (lbVar2 != null) {
                            lbVar2.e = false;
                        }
                        a(true, str2, str, 2);
                        return lbVar2;
                    }
                    f2993c.remove(path);
                }
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    private static void a(String str, c cVar) {
        try {
            if (f2991a == null) {
                f2991a = new ConcurrentHashMap<>(8);
            }
            f2991a.put(str, cVar);
        } catch (Throwable th) {
            js.a(th, "hlUtil", "ucr");
        }
    }

    private static void a(c cVar, JSONObject jSONObject) {
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
                    String strOptString = jSONObjectOptJSONObject.optString(TrackConstants$Events.API);
                    if (!TextUtils.isEmpty(strOptString)) {
                        if (!strOptString.startsWith("/")) {
                            strOptString = "/".concat(String.valueOf(strOptString));
                        }
                        if (strOptString.endsWith("/")) {
                            strOptString = strOptString.substring(0, strOptString.length() - 1);
                        }
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("periods");
                        if (jSONArrayOptJSONArray != null) {
                            ArrayList arrayList = new ArrayList();
                            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i2);
                                if (jSONObjectOptJSONObject2 != null) {
                                    a aVar = new a(b2);
                                    aVar.f2994a = jSONObjectOptJSONObject2.optString("begin");
                                    aVar.f2995b = jSONObjectOptJSONObject2.optInt("duration");
                                    aVar.f2996c = jSONObjectOptJSONObject2.optDouble("percent");
                                    arrayList.add(aVar);
                                }
                            }
                            map.put(strOptString, arrayList);
                        }
                    }
                }
            }
            cVar.f2999a = map;
        } catch (Throwable th) {
            js.a(th, "hlUtil", "pbr");
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
            cVar.f3000b = map;
        } catch (Throwable th) {
            js.a(th, "hlUtil", "pdr");
        }
    }

    private static void a(String str) {
        synchronized (kw.class) {
            try {
                if (f2991a.containsKey(str)) {
                    f2991a.remove(str);
                }
                SharedPreferences.Editor editorA = ki.a(im.f2770c, "Yb3Blbl9odHRwX2NvbnRyb2w");
                ki.a(editorA, str);
                ki.a(editorA);
            } catch (Throwable th) {
                js.a(th, "hlUtil", "rc");
            }
        }
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Map<String, List<a>> f2999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Map<String, String> f3000b;

        private c() {
            this.f2999a = new HashMap(8);
            this.f3000b = new HashMap(8);
        }

        /* synthetic */ c(byte b2) {
            this();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f2999a.equals(cVar.f2999a) && this.f3000b.equals(cVar.f3000b);
        }

        public final int hashCode() {
            Map<String, List<a>> map = this.f2999a;
            int iHashCode = map != null ? map.hashCode() : 0;
            Map<String, String> map2 = this.f3000b;
            return iHashCode + (map2 != null ? map2.hashCode() : 0);
        }
    }

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f2994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f2995b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        double f2996c;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    private static boolean a(String str, c cVar, String str2) {
        try {
            Map<String, List<a>> map = cVar.f2999a;
            if (map != null && map.size() > 0) {
                if (map.containsKey("*")) {
                    Iterator<Map.Entry<String, List<a>>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        if (a(it.next().getValue())) {
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
            js.a(th, "hlUtil", "inb");
        }
    }

    private static boolean a(List<a> list) {
        if (list == null || list.size() <= 0) {
            return false;
        }
        Iterator<a> it = list.iterator();
        while (it.hasNext()) {
            if (a(it.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(a aVar) {
        if (aVar == null || aVar.f2996c == 1.0d) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!TextUtils.isEmpty(aVar.f2994a) && aVar.f2995b > 0) {
            long timeInMillis = jCurrentTimeMillis - iy.a(aVar.f2994a, Constants.TIME_FORMAT_WITHOUT_MILLS).getTimeInMillis();
            if (timeInMillis > 0 && timeInMillis < aVar.f2995b * 1000) {
                if (aVar.f2996c == 0.0d) {
                    return true;
                }
                if (d == null) {
                    d = new Random();
                }
                d.setSeed(((long) UUID.randomUUID().hashCode()) + jCurrentTimeMillis);
                if (d.nextDouble() > aVar.f2996c) {
                    return true;
                }
            }
        }
        return false;
    }

    private static String b(String str, c cVar, String str2) {
        try {
            Map<String, String> map = cVar.f3000b;
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
            js.a(th, "hlUtil", "pdr");
            return str;
        }
    }

    public static void a(boolean z, String str) {
        try {
            Context context = im.f2770c;
            if (context != null && !TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                if (z) {
                    jSONObject.put("type", jg.g);
                } else {
                    jSONObject.put("type", jg.f);
                }
                jSONObject.put("name", str);
                jSONObject.put("version", jg.a(str));
                String string = jSONObject.toString();
                li liVar = new li(context, "core", "2.0", "O005");
                liVar.a(string);
                lj.a(liVar, context);
            }
        } catch (Throwable unused) {
        }
    }

    private static void a(String str, String str2, String str3) {
        try {
            Context context = im.f2770c;
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
                    jSONObject.put("type", jg.j);
                    jSONObject.put("name", str);
                    jSONObject.put("version", jg.a(str));
                    jSONObject.put("hostname", str2 + "#" + str3);
                    String string = jSONObject.toString();
                    if (TextUtils.isEmpty(string)) {
                        return;
                    }
                    li liVar = new li(context, "core", "2.0", "O005");
                    liVar.a(string);
                    lj.a(liVar, context);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static void a(boolean z, String str, String str2, int i) {
        try {
            Context context = im.f2770c;
            if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("timestamp", System.currentTimeMillis());
                String strA = jg.a(str);
                if (z) {
                    jSONObject.put("type", jg.i);
                } else {
                    jSONObject.put("type", jg.h);
                }
                jSONObject.put("name", str);
                jSONObject.put("version", strA);
                jSONObject.put("uri", Uri.parse(str2).getPath());
                jSONObject.put("blockLevel", i);
                String string = jSONObject.toString();
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                li liVar = new li(context, "core", "2.0", "O005");
                liVar.a(string);
                if (f == null) {
                    f = Collections.synchronizedList(new ArrayList(16));
                }
                synchronized (f) {
                    try {
                        f.add(liVar);
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
            Context context = im.f2770c;
            if (context == null) {
                return;
            }
            lj.a(b(), context);
        } catch (Throwable unused) {
        }
    }

    public static List<li> b() {
        ArrayList arrayList = null;
        try {
            synchronized (f) {
                try {
                    List<li> list = f;
                    if (list != null && list.size() > 0) {
                        ArrayList arrayList2 = new ArrayList();
                        try {
                            arrayList2.addAll(f);
                            f.clear();
                            arrayList = arrayList2;
                        } catch (Throwable th) {
                            th = th;
                            arrayList = arrayList2;
                            throw th;
                        }
                    }
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable unused) {
            return arrayList;
        }
    }
}
