package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class uos implements nos {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map<String, a> f35980a = new ConcurrentHashMap();

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f35981a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f35982b;
        public int c;
        public final AtomicInteger d = new AtomicInteger(0);

        public a(int i, String str, String str2) {
            this.f35981a = str;
            this.f35982b = str2;
            this.c = i;
        }

        public final int a() {
            return this.d.incrementAndGet();
        }
    }

    public static void b(int i, String str, String str2, int i2) {
        if (i == 0) {
            i1t.d(zns.t()).h(g1t.d(str, str2 + " counter " + i2));
        } else {
            i1t.d(zns.t()).h(g1t.d(str, str2 + " counter " + i2));
        }
        if (gos.f19197b) {
            d(i, str, str2 + " counter " + i2);
        }
    }

    public static String c(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        if (str == null) {
            str = "";
        }
        sb.append(str);
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }

    public static void d(int i, String str, String str2) {
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" ");
        sb2.append(str2);
    }

    @Override // defpackage.nos
    public final void a(int i, String str, String str2) {
        try {
            String strC = c(i, str, str2);
            a aVar = f35980a.get(strC);
            if (aVar == null) {
                aVar = new a(i, str, str2);
                f35980a.put(strC, aVar);
            }
            if (aVar.a() > 100) {
                b(aVar.c, aVar.f35981a, aVar.f35982b, aVar.d.get());
                f35980a.remove(strC);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.nos
    public final void a() {
        try {
            Iterator<Map.Entry<String, a>> it = f35980a.entrySet().iterator();
            while (it.hasNext()) {
                a value = it.next().getValue();
                if (value != null) {
                    b(value.c, value.f35981a, value.f35982b, value.d.get());
                }
            }
            f35980a.clear();
            i1t.d(zns.t()).e();
        } catch (Throwable unused) {
        }
    }
}
