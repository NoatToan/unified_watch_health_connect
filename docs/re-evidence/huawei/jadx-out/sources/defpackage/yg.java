package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes21.dex */
class yg {
    private final Object d = new Object();
    private final Map<SoftReference<xw>, Boolean> e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReferenceQueue<xw> f53335a = new ReferenceQueue<>();

    static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final yg f53336c = new yg();
    }

    yg() {
    }

    public static yg d() {
        return a.f53336c;
    }

    public SoftReference<xw> b(xw xwVar) {
        SoftReference<xw> softReference = new SoftReference<>(xwVar, this.f53335a);
        this.e.put(softReference, true);
        a();
        return softReference;
    }

    private void a() {
        while (true) {
            SoftReference softReference = (SoftReference) this.f53335a.poll();
            if (softReference == null) {
                return;
            } else {
                this.e.remove(softReference);
            }
        }
    }
}
