package com.amap.api.mapcore.util;

import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class fa implements ey {
    private static Map<String, a> a = new ConcurrentHashMap();

    public class a {
        public String a;
        public String b;
        public int c;
        public final AtomicInteger d = new AtomicInteger(0);

        public a(int i, String str, String str2) {
            this.a = "";
            this.b = "";
            this.a = str;
            this.b = str2;
            this.c = i;
        }
    }

    private static void b(int i, String str, String str2) {
        if (i == 0) {
            Log.i("linklog", str + " " + str2);
            return;
        }
        Log.e("linklog", str + " " + str2);
    }

    @Override // com.amap.api.mapcore.util.ey
    public final void a() {
        try {
            Iterator<Map.Entry<String, a>> it2 = a.entrySet().iterator();
            while (it2.hasNext()) {
                a value = it2.next().getValue();
                if (value != null) {
                    a(value.c, value.a, value.b, value.d.get());
                }
            }
            a.clear();
            hf.a(er.f()).a();
        } catch (Throwable unused) {
        }
    }

    private static void a(int i, String str, String str2, int i2) {
        if (i == 0) {
            hf.a(er.f()).a(he.a(str, str2 + " counter " + i2));
        } else {
            hf.a(er.f()).a(he.a(str, str2 + " counter " + i2));
        }
        if (ew.b) {
            b(i, str, str2 + " counter " + i2);
        }
    }

    @Override // com.amap.api.mapcore.util.ey
    public final void a(int i, String str, String str2) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            String str3 = "";
            sb.append(str == null ? "" : str);
            if (str2 != null) {
                str3 = str2;
            }
            sb.append(str3);
            String string = sb.toString();
            a aVar = a.get(string);
            if (aVar == null) {
                aVar = new a(i, str, str2);
                a.put(string, aVar);
            }
            if (aVar.d.incrementAndGet() > 100) {
                a(aVar.c, aVar.a, aVar.b, aVar.d.get());
                a.remove(string);
            }
        } catch (Throwable unused) {
        }
    }
}
