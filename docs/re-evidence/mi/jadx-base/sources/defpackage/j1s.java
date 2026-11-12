package defpackage;

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j1s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j1s f22339a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f22340b = new AtomicBoolean(false);
    public static final AtomicReference<j1s> c = new AtomicReference<>();

    public static class a extends j1s {
        @Override // defpackage.j1s
        public void b() {
        }
    }

    public static class b extends j1s {
        @Override // defpackage.j1s
        public void b() {
            Iterator it = ServiceLoader.load(k1s.class, k1s.class.getClassLoader()).iterator();
            while (it.hasNext()) {
                try {
                    k1s.f((k1s) it.next());
                } catch (ServiceConfigurationError e) {
                    if (!(e.getCause() instanceof SecurityException)) {
                        throw e;
                    }
                }
            }
        }
    }

    public static void a() {
        if (f22340b.getAndSet(true)) {
            throw new IllegalStateException("Already initialized");
        }
        AtomicReference<j1s> atomicReference = c;
        d8i.a(atomicReference, null, new b());
        atomicReference.get().b();
    }

    public static void c(j1s j1sVar) {
        if (f22340b.get()) {
            throw new IllegalStateException("Already initialized");
        }
        if (!d8i.a(c, null, j1sVar)) {
            throw new IllegalStateException("Initializer was already set, possibly with a default during initialization");
        }
    }

    public abstract void b();
}
