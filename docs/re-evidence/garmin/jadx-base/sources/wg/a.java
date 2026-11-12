package wg;

import android.content.Context;
import android.text.TextUtils;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import nh.k;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    public static final class b {
        public static synchronized void a(Context context, wg.c cVar, String str, String str2) {
            if (context == null || cVar == null || str == null) {
                return;
            }
            String strB = cVar.b(str);
            synchronized (b.class) {
                try {
                    if (!TextUtils.isEmpty(strB)) {
                        C3422a.c(context, strB, str2);
                    }
                    new Thread(new wg.b(strB, context)).start();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        public static boolean b(Context context, String str) {
            synchronized (b.class) {
                try {
                    try {
                        if ((ah.a.g().f3251g ? new hh.c() : new hh.d()).a(context, str, null) == null) {
                            return false;
                        }
                        C3422a.b(context, str);
                        return true;
                    } catch (Throwable th3) {
                        nh.d.a(th3);
                        return false;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    public static final class c {
    }

    public static final class d {
        public static synchronized long a(Context context, String str) {
            long j8;
            String strB;
            try {
                strB = k.b(str, null, context, null);
            } catch (Throwable unused) {
            }
            j8 = (!TextUtils.isEmpty(strB) ? Long.parseLong(strB) : 0L) + 1;
            try {
                k.c(str, Long.toString(j8), context, null);
            } catch (Throwable unused2) {
            }
            return j8;
        }
    }

    public static final class e {
    }

    public static synchronized void a(String str, String str2, Context context, lh.a aVar) {
        if (context == null || aVar == null) {
            return;
        }
        try {
            C3422a.c(context, aVar.f112386k.b(str), str2);
        } catch (Throwable th3) {
            nh.d.a(th3);
        }
    }

    public static void b(String str, lh.a aVar) {
        if (aVar == null) {
            return;
        }
        aVar.f112386k.e("biz", str);
    }

    public static void c(lh.a aVar, String str, String str2, String str3) {
        if (aVar == null) {
            return;
        }
        wg.c cVar = aVar.f112386k;
        cVar.getClass();
        cVar.e(str, str2 + "|" + str3);
    }

    public static void d(lh.a aVar, String str, String str2, Throwable th3) {
        if (aVar == null) {
            return;
        }
        wg.c cVar = aVar.f112386k;
        cVar.getClass();
        cVar.f(str, str2, wg.c.c(th3));
    }

    public static void e(lh.a aVar, String str, Throwable th3, String str2) {
        if (aVar == null) {
            return;
        }
        wg.c cVar = aVar.f112386k;
        cVar.getClass();
        cVar.f("biz", str, e5.g(str2, ": ", wg.c.c(th3)));
    }

    public static synchronized void f(String str, String str2, Context context, lh.a aVar) {
        if (context == null || aVar == null) {
            return;
        }
        b.a(context, aVar.f112386k, str, str2);
    }

    public static void g(lh.a aVar, String str, String str2, String str3) {
        if (aVar == null) {
            return;
        }
        aVar.f112386k.f(str, str2, str3);
    }

    /* JADX INFO: renamed from: wg.a$a, reason: collision with other inner class name */
    public static final class C3422a {
        public static synchronized C3423a a(Context context) {
            try {
                String strB = k.b("alipay_cashier_statistic_record", null, context, null);
                if (TextUtils.isEmpty(strB)) {
                    return new C3423a();
                }
                return new C3423a(strB);
            } catch (Throwable th3) {
                nh.d.a(th3);
                return new C3423a();
            }
        }

        public static synchronized void b(Context context, String str) {
            if (context != null) {
                if (!TextUtils.isEmpty(str)) {
                    C3423a c3423aA = a(context);
                    if (c3423aA.f185030a.isEmpty()) {
                        return;
                    }
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry<String, String> entry : c3423aA.f185030a.entrySet()) {
                            if (str.equals(entry.getValue())) {
                                arrayList.add(entry.getKey());
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            c3423aA.f185030a.remove((String) it.next());
                        }
                        d(context, c3423aA);
                        arrayList.size();
                    } catch (Throwable th3) {
                        nh.d.a(th3);
                        c3423aA.f185030a.size();
                        d(context, new C3423a());
                    }
                }
            }
        }

        public static synchronized void c(Context context, String str, String str2) {
            if (context != null) {
                try {
                    if (!TextUtils.isEmpty(str)) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = UUID.randomUUID().toString();
                        }
                        C3423a c3423aA = a(context);
                        if (c3423aA.f185030a.size() > 20) {
                            c3423aA.f185030a.clear();
                        }
                        c3423aA.f185030a.put(str2, str);
                        d(context, c3423aA);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        public static synchronized void d(Context context, C3423a c3423a) {
            try {
                k.c("alipay_cashier_statistic_record", c3423a.a(), context, null);
            } catch (Throwable th3) {
                nh.d.a(th3);
            }
        }

        /* JADX INFO: renamed from: wg.a$a$a, reason: collision with other inner class name */
        public static final class C3423a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LinkedHashMap<String, String> f185030a = new LinkedHashMap<>();

            public C3423a(String str) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                        JSONArray jSONArray2 = jSONArray.getJSONArray(i14);
                        this.f185030a.put(jSONArray2.getString(0), jSONArray2.getString(1));
                    }
                } catch (Throwable th3) {
                    nh.d.a(th3);
                }
            }

            public final String a() {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, String> entry : this.f185030a.entrySet()) {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(entry.getKey()).put(entry.getValue());
                        jSONArray.put(jSONArray2);
                    }
                    return jSONArray.toString();
                } catch (Throwable th3) {
                    nh.d.a(th3);
                    return new JSONArray().toString();
                }
            }

            public C3423a() {
            }
        }
    }
}
