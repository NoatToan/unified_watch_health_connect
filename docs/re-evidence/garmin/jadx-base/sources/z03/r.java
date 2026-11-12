package z03;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends q03.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f200814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimeUnit f200815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q03.q f200816c;

    public static final class a extends AtomicReference<s03.b> implements s03.b, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.d f200817a;

        public a(q03.d dVar) {
            this.f200817a = dVar;
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
            this.f200817a.onComplete();
        }
    }

    public r(long j8, TimeUnit timeUnit, q03.q qVar) {
        this.f200814a = j8;
        this.f200815b = timeUnit;
        this.f200816c = qVar;
    }

    @Override // q03.b
    public final void j(q03.d dVar) {
        a aVar = new a(dVar);
        dVar.a(aVar);
        v03.c.d(aVar, this.f200816c.c(aVar, this.f200814a, this.f200815b));
    }
}
