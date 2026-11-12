package rx.schedulers;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import q83.a;
import q83.c;
import q83.e;
import q83.g;
import q83.h;
import q83.k;
import q83.o;
import s83.d;
import v83.j;
import v83.s;
import v83.v;

/* JADX INFO: loaded from: classes11.dex */
public final class Schedulers {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReference<Schedulers> f154928d = new AtomicReference<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f154929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f154930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f154931c;

    private Schedulers() {
        v.f176271f.e().getClass();
        this.f154929a = new c(new d("RxComputationScheduler-"));
        this.f154930b = new a(new d("RxIoScheduler-"));
        this.f154931c = new h(new d("RxNewThreadScheduler-"));
    }

    public static Schedulers a() {
        while (true) {
            AtomicReference<Schedulers> atomicReference = f154928d;
            Schedulers schedulers = atomicReference.get();
            if (schedulers != null) {
                return schedulers;
            }
            Schedulers schedulers2 = new Schedulers();
            while (!atomicReference.compareAndSet(null, schedulers2)) {
                if (atomicReference.get() != null) {
                    schedulers2.b();
                }
            }
            return schedulers2;
        }
    }

    public static j83.h computation() {
        c cVar = a().f154929a;
        j jVar = s.f176256a;
        return cVar;
    }

    public static j83.h from(Executor executor) {
        return new q83.d(executor);
    }

    public static j83.h immediate() {
        return g.f143411a;
    }

    public static j83.h io() {
        a aVar = a().f154930b;
        j jVar = s.f176256a;
        return aVar;
    }

    public static j83.h newThread() {
        h hVar = a().f154931c;
        j jVar = s.f176256a;
        return hVar;
    }

    public static void reset() {
        Schedulers andSet = f154928d.getAndSet(null);
        if (andSet != null) {
            andSet.b();
        }
    }

    public static void shutdown() {
        Schedulers schedulersA = a();
        schedulersA.b();
        synchronized (schedulersA) {
            e.f143406d.shutdown();
        }
    }

    public static void start() {
        Schedulers schedulersA = a();
        synchronized (schedulersA) {
            try {
                c cVar = schedulersA.f154929a;
                if (cVar != null) {
                    cVar.start();
                }
                a aVar = schedulersA.f154930b;
                if (aVar != null) {
                    aVar.start();
                }
                Object obj = schedulersA.f154931c;
                if (obj instanceof k) {
                    ((k) obj).start();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        synchronized (schedulersA) {
            e.f143406d.start();
        }
    }

    public static TestScheduler test() {
        return new TestScheduler();
    }

    public static j83.h trampoline() {
        return o.f143447a;
    }

    public final synchronized void b() {
        try {
            c cVar = this.f154929a;
            if (cVar != null) {
                cVar.shutdown();
            }
            a aVar = this.f154930b;
            if (aVar != null) {
                aVar.shutdown();
            }
            Object obj = this.f154931c;
            if (obj instanceof k) {
                ((k) obj).shutdown();
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
