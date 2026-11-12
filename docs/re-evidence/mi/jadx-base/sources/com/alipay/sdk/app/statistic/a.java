package com.alipay.sdk.app.statistic;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.packet.impl.d;
import com.alipay.sdk.packet.impl.e;
import com.alipay.sdk.util.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: com.alipay.sdk.app.statistic.a$a, reason: collision with other inner class name */
    public static final class C0116a {
        private C0116a() {
        }

        public static synchronized int a(Context context, String str) {
            com.alipay.sdk.util.c.b("RecordPref", "stat remove " + str);
            if (context != null && !TextUtils.isEmpty(str)) {
                C0117a c0117aE = e(context);
                if (c0117aE.f5825a.isEmpty()) {
                    return 0;
                }
                try {
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry<String, String> entry : c0117aE.f5825a.entrySet()) {
                        if (str.equals(entry.getValue())) {
                            arrayList.add(entry.getKey());
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        c0117aE.f5825a.remove((String) it.next());
                    }
                    d(context, c0117aE);
                    return arrayList.size();
                } catch (Throwable th) {
                    com.alipay.sdk.util.c.d(th);
                    int size = c0117aE.f5825a.size();
                    d(context, new C0117a());
                    return size;
                }
            }
            return 0;
        }

        public static synchronized String b(Context context) {
            com.alipay.sdk.util.c.b("RecordPref", "stat peek");
            if (context == null) {
                return null;
            }
            C0117a c0117aE = e(context);
            if (c0117aE.f5825a.isEmpty()) {
                return null;
            }
            try {
                return c0117aE.f5825a.entrySet().iterator().next().getValue();
            } catch (Throwable th) {
                com.alipay.sdk.util.c.d(th);
                return null;
            }
        }

        public static synchronized String c(Context context, String str, String str2) {
            try {
                com.alipay.sdk.util.c.b("RecordPref", "stat append " + str2 + " , " + str);
                if (context != null && !TextUtils.isEmpty(str)) {
                    if (TextUtils.isEmpty(str2)) {
                        str2 = UUID.randomUUID().toString();
                    }
                    C0117a c0117aE = e(context);
                    if (c0117aE.f5825a.size() > 20) {
                        c0117aE.f5825a.clear();
                    }
                    c0117aE.f5825a.put(str2, str);
                    d(context, c0117aE);
                    return str2;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }

        public static synchronized void d(Context context, C0117a c0117a) {
            if (c0117a == null) {
                try {
                    c0117a = new C0117a();
                } catch (Throwable th) {
                    com.alipay.sdk.util.c.d(th);
                }
            }
            g.b(null, context, "alipay_cashier_statistic_record", c0117a.a());
        }

        public static synchronized C0117a e(Context context) {
            try {
                String strC = g.c(null, context, "alipay_cashier_statistic_record", null);
                if (TextUtils.isEmpty(strC)) {
                    return new C0117a();
                }
                return new C0117a(strC);
            } catch (Throwable th) {
                com.alipay.sdk.util.c.d(th);
                return new C0117a();
            }
        }

        /* JADX INFO: renamed from: com.alipay.sdk.app.statistic.a$a$a, reason: collision with other inner class name */
        public static final class C0117a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LinkedHashMap<String, String> f5825a = new LinkedHashMap<>();

            public C0117a() {
            }

            public String a() {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, String> entry : this.f5825a.entrySet()) {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(entry.getKey()).put(entry.getValue());
                        jSONArray.put(jSONArray2);
                    }
                    return jSONArray.toString();
                } catch (Throwable th) {
                    com.alipay.sdk.util.c.d(th);
                    return new JSONArray().toString();
                }
            }

            public C0117a(String str) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                        this.f5825a.put(jSONArray2.getString(0), jSONArray2.getString(1));
                    }
                } catch (Throwable th) {
                    com.alipay.sdk.util.c.d(th);
                }
            }
        }
    }

    public static final class b {
        private b() {
        }

        public static synchronized void a(Context context, com.alipay.sdk.app.statistic.b bVar, String str, String str2) {
            if (context == null || bVar == null || str == null) {
                return;
            }
            b(context, bVar.d(str), str2);
        }

        public static synchronized void b(final Context context, final String str, String str2) {
            if (context == null) {
                return;
            }
            try {
                if (!TextUtils.isEmpty(str)) {
                    C0116a.c(context, str, str2);
                }
                new Thread(new Runnable() { // from class: com.alipay.sdk.app.statistic.a.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (TextUtils.isEmpty(str) || b.d(context, str)) {
                            for (int i = 0; i < 4; i++) {
                                String strB = C0116a.b(context);
                                if (TextUtils.isEmpty(strB) || !b.d(context, strB)) {
                                    return;
                                }
                            }
                        }
                    }
                }).start();
            } catch (Throwable th) {
                throw th;
            }
        }

        public static synchronized boolean d(Context context, String str) {
            try {
                com.alipay.sdk.util.c.b("mspl", "stat sub " + str);
                try {
                    if ((com.alipay.sdk.data.a.w().n() ? new d() : new e()).b(null, context, str) == null) {
                        return false;
                    }
                    C0116a.a(context, str);
                    return true;
                } catch (Throwable th) {
                    com.alipay.sdk.util.c.d(th);
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final class c {
        public static synchronized long a(Context context) {
            long j;
            long j2 = 0;
            try {
                String strC = g.c(null, context, "alipay_cashier_statistic_v", null);
                if (!TextUtils.isEmpty(strC)) {
                    j2 = Long.parseLong(strC);
                }
            } catch (Throwable unused) {
            }
            j = j2 + 1;
            try {
                g.b(null, context, "alipay_cashier_statistic_v", Long.toString(j));
            } catch (Throwable unused2) {
            }
            return j;
        }
    }

    private a() {
    }

    public static synchronized void a(Context context, com.alipay.sdk.sys.a aVar, String str, String str2) {
        if (context == null || aVar == null) {
            return;
        }
        try {
            C0116a.c(context, aVar.i.d(str), str2);
        } catch (Throwable th) {
            com.alipay.sdk.util.c.d(th);
        }
    }

    public static void b(com.alipay.sdk.sys.a aVar, String str, String str2) {
        if (aVar == null) {
            return;
        }
        aVar.i.f(str, str2);
    }

    public static void c(com.alipay.sdk.sys.a aVar, String str, String str2, String str3) {
        if (aVar == null) {
            return;
        }
        aVar.i.g(str, str2, str3);
    }

    public static void d(com.alipay.sdk.sys.a aVar, String str, String str2, Throwable th) {
        if (aVar == null) {
            return;
        }
        aVar.i.h(str, str2, th);
    }

    public static void e(com.alipay.sdk.sys.a aVar, String str, String str2, Throwable th, String str3) {
        if (aVar == null) {
            return;
        }
        aVar.i.i(str, str2, th, str3);
    }

    public static void f(com.alipay.sdk.sys.a aVar, String str, Throwable th) {
        if (aVar == null || th == null) {
            return;
        }
        aVar.i.h(str, th.getClass().getSimpleName(), th);
    }

    public static synchronized void g(Context context, com.alipay.sdk.sys.a aVar, String str, String str2) {
        if (context == null || aVar == null) {
            return;
        }
        b.a(context, aVar.i, str, str2);
    }

    public static void h(com.alipay.sdk.sys.a aVar, String str, String str2, String str3) {
        if (aVar == null) {
            return;
        }
        aVar.i.m(str, str2, str3);
    }
}
