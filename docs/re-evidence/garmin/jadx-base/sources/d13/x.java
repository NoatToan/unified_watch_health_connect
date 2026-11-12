package d13;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends q03.l<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.q f57252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f57253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f57254c;

    public static final class a extends AtomicReference<s03.b> implements s03.b, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.p<? super Long> f57255a;

        public a(q03.p<? super Long> pVar) {
            this.f57255a = pVar;
        }

        @Override // s03.b
        public final boolean b() {
            return get() == v03.c.DISPOSED;
        }

        @Override // s03.b
        public final void dispose() {
            v03.c.a(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (b()) {
                return;
            }
            q03.p<? super Long> pVar = this.f57255a;
            pVar.c(0L);
            lazySet(v03.d.INSTANCE);
            pVar.onComplete();
        }
    }

    public x(long j8, TimeUnit timeUnit, q03.q qVar) {
        this.f57253b = j8;
        this.f57254c = timeUnit;
        this.f57252a = qVar;
    }

    @Override // q03.l
    public final void f(q03.p<? super Long> pVar) {
        a aVar = new a(pVar);
        pVar.a(aVar);
        s03.b bVarC = this.f57252a.c(aVar, this.f57253b, this.f57254c);
        v03.c cVar = v03.c.DISPOSED;
        while (!aVar.compareAndSet(null, bVarC)) {
            if (aVar.get() != null) {
                if (aVar.get() == v03.c.DISPOSED) {
                    bVarC.dispose();
                    return;
                }
                return;
            }
        }
    }
}
