package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class tcp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f34574a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<SoftReference<x53>, Boolean> f34575b = new ConcurrentHashMap();
    public final ReferenceQueue<x53> c = new ReferenceQueue<>();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final tcp f34576a = new tcp();
    }

    public static tcp a() {
        return a.f34576a;
    }

    public final void b() {
        while (true) {
            SoftReference softReference = (SoftReference) this.c.poll();
            if (softReference == null) {
                return;
            } else {
                this.f34575b.remove(softReference);
            }
        }
    }

    public SoftReference<x53> c(x53 x53Var) {
        SoftReference<x53> softReference = new SoftReference<>(x53Var, this.c);
        this.f34575b.put(softReference, Boolean.TRUE);
        b();
        return softReference;
    }
}
