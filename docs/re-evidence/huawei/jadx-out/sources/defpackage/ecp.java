package defpackage;

import android.util.LruCache;

/* JADX INFO: loaded from: classes7.dex */
public class ecp {
    private static volatile ecp d;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LruCache<String, String> f32747b = new LruCache<>(4);

    private ecp() {
    }

    public static ecp c() {
        if (d == null) {
            synchronized (e) {
                if (d == null) {
                    d = new ecp();
                }
            }
        }
        return d;
    }

    public void c(String str, String str2) {
        this.f32747b.put(str, str2);
    }

    public String a(String str) {
        return this.f32747b.get(str);
    }

    public void a() {
        this.f32747b.evictAll();
    }
}
