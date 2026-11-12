package z03;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends q03.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.f f200801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f200802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f200803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q03.q f200804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q03.f f200805e;

    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f200806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s03.a f200807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final q03.d f200808c;

        /* JADX INFO: renamed from: z03.q$a$a, reason: collision with other inner class name */
        public final class C3751a implements q03.d {
            public C3751a() {
            }

            @Override // q03.d
            public final void a(s03.b bVar) {
                a.this.f200807b.a(bVar);
            }

            @Override // q03.d
            public final void onComplete() {
                a aVar = a.this;
                aVar.f200807b.dispose();
                aVar.f200808c.onComplete();
            }

            @Override // q03.d
            public final void onError(Throwable th3) {
                a aVar = a.this;
                aVar.f200807b.dispose();
                aVar.f200808c.onError(th3);
            }
        }

        public a(AtomicBoolean atomicBoolean, s03.a aVar, q03.d dVar) {
            this.f200806a = atomicBoolean;
            this.f200807b = aVar;
            this.f200808c = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f200806a.compareAndSet(false, true)) {
                this.f200807b.e();
                q qVar = q.this;
                q03.f fVar = qVar.f200805e;
                if (fVar != null) {
                    fVar.a(new C3751a());
                } else {
                    this.f200808c.onError(new TimeoutException(i13.d.a(qVar.f200802b, qVar.f200803c)));
                }
            }
        }
    }

    public static final class b implements q03.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s03.a f200811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f200812b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final q03.d f200813c;

        public b(s03.a aVar, AtomicBoolean atomicBoolean, q03.d dVar) {
            this.f200811a = aVar;
            this.f200812b = atomicBoolean;
            this.f200813c = dVar;
        }

        @Override // q03.d
        public final void a(s03.b bVar) {
            this.f200811a.a(bVar);
        }

        @Override // q03.d
        public final void onComplete() {
            if (this.f200812b.compareAndSet(false, true)) {
                this.f200811a.dispose();
                this.f200813c.onComplete();
            }
        }

        @Override // q03.d
        public final void onError(Throwable th3) {
            if (!this.f200812b.compareAndSet(false, true)) {
                k13.a.b(th3);
            } else {
                this.f200811a.dispose();
                this.f200813c.onError(th3);
            }
        }
    }

    public q(q03.f fVar, long j8, TimeUnit timeUnit, q03.q qVar, q03.f fVar2) {
        this.f200801a = fVar;
        this.f200802b = j8;
        this.f200803c = timeUnit;
        this.f200804d = qVar;
        this.f200805e = fVar2;
    }

    @Override // q03.b
    public final void j(q03.d dVar) {
        s03.a aVar = new s03.a();
        dVar.a(aVar);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        aVar.a(this.f200804d.c(new a(atomicBoolean, aVar, dVar), this.f200802b, this.f200803c));
        this.f200801a.a(new b(aVar, atomicBoolean, dVar));
    }
}
