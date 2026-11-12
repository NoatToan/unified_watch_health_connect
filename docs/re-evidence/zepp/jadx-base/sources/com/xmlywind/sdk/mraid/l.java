package com.xmlywind.sdk.mraid;

import android.annotation.SuppressLint;
import android.os.Handler;
import com.xmlywind.sdk.base.common.p;
import com.xmlywind.sdk.common.utils.m;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class l {

    @SuppressLint({"UseSparseArrays"})
    private static final Map<String, a> b = Collections.synchronizedMap(new HashMap());
    public static final b a = new b();
    private static Handler c = new Handler();

    public static class a {
        private final WeakReference<Object> a;
        private final p b;
        private final c c;

        public WeakReference<Object> a() {
            return this.a;
        }

        public p b() {
            return this.b;
        }

        public c c() {
            return this.c;
        }
    }

    public static class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l.a();
        }
    }

    public static a a(String str) {
        m.a(str);
        return b.remove(str);
    }

    public static void a() {
        synchronized (l.class) {
            Iterator<Map.Entry<String, a>> it2 = b.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<String, a> next = it2.next();
                if (next.getValue().a().get() == null) {
                    next.getValue().b().a();
                    it2.remove();
                }
            }
            if (!b.isEmpty()) {
                Handler handler = c;
                b bVar = a;
                handler.removeCallbacks(bVar);
                c.postDelayed(bVar, 3000000L);
            }
        }
    }
}
