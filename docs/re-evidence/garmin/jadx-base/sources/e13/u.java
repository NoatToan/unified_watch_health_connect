package e13;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends q03.r<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f62379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimeUnit f62380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q03.q f62381c;

    public static final class a extends AtomicReference<s03.b> implements s03.b, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.t<? super Long> f62382a;

        public a(q03.t<? super Long> tVar) {
            this.f62382a = tVar;
        }

        @Override // s03.b
        public final boolean b() {
            return v03.c.c(get());
        }

        @Override // s03.b
        public final void dispose() {
            v03.c.a(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f62382a.onSuccess(0L);
        }
    }

    public u(long j8, TimeUnit timeUnit, q03.q qVar) {
        this.f62379a = j8;
        this.f62380b = timeUnit;
        this.f62381c = qVar;
    }

    @Override // q03.r
    public final void i(q03.t<? super Long> tVar) {
        a aVar = new a(tVar);
        tVar.a(aVar);
        v03.c.d(aVar, this.f62381c.c(aVar, this.f62379a, this.f62380b));
    }
}
