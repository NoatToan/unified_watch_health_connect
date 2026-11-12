package com.amap.api.col.p0003sl;

import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class eh implements ef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, a> f2419a = new ConcurrentHashMap();

    final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f2420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f2421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f2422c;
        final AtomicInteger d = new AtomicInteger(0);

        public a(int i, String str, String str2) {
            this.f2420a = str;
            this.f2421b = str2;
            this.f2422c = i;
        }

        public final int a() {
            return this.d.incrementAndGet();
        }
    }

    private static String b(int i, String str, String str2) {
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

    @Override // com.amap.api.col.p0003sl.ef
    public final void a(int i, String str, String str2) {
        try {
            String strB = b(i, str, str2);
            a aVar = f2419a.get(strB);
            if (aVar == null) {
                aVar = new a(i, str, str2);
                f2419a.put(strB, aVar);
            }
            if (aVar.a() > 100) {
                a(aVar.f2422c, aVar.f2420a, aVar.f2421b, aVar.d.get());
                f2419a.remove(strB);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.amap.api.col.p0003sl.ef
    public final void a() {
        try {
            Iterator<Map.Entry<String, a>> it = f2419a.entrySet().iterator();
            while (it.hasNext()) {
                a value = it.next().getValue();
                if (value != null) {
                    a(value.f2422c, value.f2420a, value.f2421b, value.d.get());
                }
            }
            f2419a.clear();
            jc.a(eb.a()).a();
        } catch (Throwable unused) {
        }
    }

    private static void a(int i, String str, String str2, int i2) {
        if (i == 0) {
            jc.a(eb.a()).a(jb.a(str, str2 + " counter " + i2));
        } else {
            jc.a(eb.a()).a(jb.a(str, str2 + " counter " + i2));
        }
        if (ed.f2415b) {
            c(i, str, str2 + " counter " + i2);
        }
    }

    private static void c(int i, String str, String str2) {
        if (i == 0) {
            Log.i("linklog", str + " " + str2);
            return;
        }
        Log.e("linklog", str + " " + str2);
    }
}
