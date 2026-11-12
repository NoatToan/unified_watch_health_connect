package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public class mu {

    public static final class a {
        public static long d(Context context) {
            long jA;
            synchronized (a.class) {
                jA = d.a(context, "alipay_cashier_statistic_v");
            }
            return jA;
        }
    }

    public static final class b {
        public static String d(Context context) {
            synchronized (b.class) {
                oq.b("RecordPref", "stat peek");
                if (context == null) {
                    return null;
                }
                d dVarE = e(context);
                if (dVarE.d.isEmpty()) {
                    return null;
                }
                try {
                    return dVarE.d.entrySet().iterator().next().getValue();
                } catch (Throwable th) {
                    oq.c(th);
                    return null;
                }
            }
        }

        public static String e(Context context, String str, String str2) {
            synchronized (b.class) {
                oq.b("RecordPref", "stat append " + str2 + " , " + str);
                if (context != null && !TextUtils.isEmpty(str)) {
                    if (TextUtils.isEmpty(str2)) {
                        str2 = UUID.randomUUID().toString();
                    }
                    d dVarE = e(context);
                    if (dVarE.d.size() > 20) {
                        dVarE.d.clear();
                    }
                    dVarE.d.put(str2, str);
                    b(context, dVarE);
                    return str2;
                }
                return null;
            }
        }

        public static final class d {
            public final LinkedHashMap<String, String> d = new LinkedHashMap<>();

            public d() {
            }

            public String c() {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, String> entry : this.d.entrySet()) {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(entry.getKey()).put(entry.getValue());
                        jSONArray.put(jSONArray2);
                    }
                    return jSONArray.toString();
                } catch (Throwable th) {
                    oq.c(th);
                    return new JSONArray().toString();
                }
            }

            public d(String str) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                        this.d.put(jSONArray2.getString(0), jSONArray2.getString(1));
                    }
                } catch (Throwable th) {
                    oq.c(th);
                }
            }
        }

        public static int e(Context context, String str) {
            synchronized (b.class) {
                oq.b("RecordPref", "stat remove " + str);
                if (context != null && !TextUtils.isEmpty(str)) {
                    d dVarE = e(context);
                    if (dVarE.d.isEmpty()) {
                        return 0;
                    }
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry<String, String> entry : dVarE.d.entrySet()) {
                            if (str.equals(entry.getValue())) {
                                arrayList.add(entry.getKey());
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            dVarE.d.remove((String) it.next());
                        }
                        b(context, dVarE);
                        return arrayList.size();
                    } catch (Throwable th) {
                        oq.c(th);
                        int size = dVarE.d.size();
                        b(context, new d());
                        return size;
                    }
                }
                return 0;
            }
        }

        public static d e(Context context) {
            synchronized (b.class) {
                try {
                    String strD = or.d(null, context, "alipay_cashier_statistic_record", null);
                    if (TextUtils.isEmpty(strD)) {
                        return new d();
                    }
                    return new d(strD);
                } catch (Throwable th) {
                    oq.c(th);
                    return new d();
                }
            }
        }

        public static void b(Context context, d dVar) {
            synchronized (b.class) {
                if (dVar == null) {
                    try {
                        dVar = new d();
                    } catch (Throwable th) {
                        oq.c(th);
                    }
                }
                or.c(null, context, "alipay_cashier_statistic_record", dVar.c());
            }
        }
    }

    public static final class c {
        public static long b(Context context) {
            long jA;
            synchronized (c.class) {
                jA = d.a(context, "alipay_cashier_ap_seq_v");
            }
            return jA;
        }
    }

    public static final class d {
        public static long a(Context context, String str) {
            long j;
            long j2;
            synchronized (d.class) {
                try {
                    String strD = or.d(null, context, str, null);
                    j = !TextUtils.isEmpty(strD) ? Long.parseLong(strD) : 0L;
                } catch (Throwable unused) {
                }
                j2 = j + 1;
                try {
                    or.c(null, context, str, Long.toString(j2));
                } catch (Throwable unused2) {
                }
            }
            return j2;
        }
    }

    public static final class e {

        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f42412b;
            public final /* synthetic */ Context d;

            public a(String str, Context context) {
                this.f42412b = str;
                this.d = context;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(this.f42412b) || e.b(this.d, this.f42412b)) {
                    for (int i = 0; i < 4; i++) {
                        String strD = b.d(this.d);
                        if (TextUtils.isEmpty(strD) || !e.b(this.d, strD)) {
                            return;
                        }
                    }
                }
            }
        }

        public static boolean b(Context context, String str) {
            synchronized (e.class) {
                oq.b("mspl", "stat sub " + str);
                try {
                    if ((mx.c().n() ? new oj() : new oh()).a((on) null, context, str) == null) {
                        return false;
                    }
                    b.e(context, str);
                    return true;
                } catch (Throwable th) {
                    oq.c(th);
                    return false;
                }
            }
        }

        public static void c(Context context, mw mwVar, String str, String str2) {
            synchronized (e.class) {
                if (context == null || mwVar == null || str == null) {
                    return;
                }
                e(context, mwVar.c(str), str2);
            }
        }

        public static void e(Context context, String str, String str2) {
            synchronized (e.class) {
                if (context == null) {
                    return;
                }
                if (!TextUtils.isEmpty(str)) {
                    b.e(context, str, str2);
                }
                new Thread(new a(str, context)).start();
            }
        }
    }

    public static void b(Context context, on onVar, String str, String str2) {
        synchronized (mu.class) {
            if (context == null || onVar == null) {
                return;
            }
            e.c(context, onVar.n, str, str2);
        }
    }

    public static void d(Context context, on onVar, String str, String str2) {
        synchronized (mu.class) {
            if (context == null || onVar == null) {
                return;
            }
            try {
                b.e(context, onVar.n.c(str), str2);
            } catch (Throwable th) {
                oq.c(th);
            }
        }
    }

    public static void e(on onVar, String str, String str2, String str3) {
        if (onVar == null) {
            return;
        }
        onVar.n.e(str, str2, str3);
    }

    public static void c(on onVar, String str, Throwable th) {
        if (onVar == null || th == null) {
            return;
        }
        onVar.n.b(str, th.getClass().getSimpleName(), th);
    }

    public static void e(on onVar, String str, String str2, Throwable th, String str3) {
        if (onVar == null) {
            return;
        }
        onVar.n.c(str, str2, th, str3);
    }

    public static void c(on onVar, String str, String str2, Throwable th) {
        if (onVar == null) {
            return;
        }
        onVar.n.b(str, str2, th);
    }

    public static void d(on onVar, String str, String str2, String str3) {
        if (onVar == null) {
            return;
        }
        onVar.n.a(str, str2, str3);
    }

    public static void b(on onVar, String str, String str2) {
        if (onVar == null) {
            return;
        }
        onVar.n.c(str, str2);
    }
}
