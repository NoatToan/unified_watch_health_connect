package z03;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends q03.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.f f200796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q03.q f200797b;

    public static final class a extends AtomicReference<s03.b> implements q03.d, s03.b, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.d f200798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v03.f f200799b = new v03.f();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final q03.f f200800c;

        public a(q03.d dVar, q03.f fVar) {
            this.f200798a = dVar;
            this.f200800c = fVar;
        }

        @Override // q03.d
        public final void a(s03.b bVar) {
            v03.c.f(this, bVar);
        }

        @Override // s03.b
        public final boolean b() {
            return v03.c.c(get());
        }

        @Override // s03.b
        public final void dispose() {
            v03.c.a(this);
            v03.f fVar = this.f200799b;
            fVar.getClass();
            v03.c.a(fVar);
        }

        @Override // q03.d
        public final void onComplete() {
            this.f200798a.onComplete();
        }

        @Override // q03.d
        public final void onError(Throwable th3) {
            this.f200798a.onError(th3);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f200800c.a(this);
        }
    }

    public p(q03.f fVar, q03.q qVar) {
        this.f200796a = fVar;
        this.f200797b = qVar;
    }

    @Override // q03.b
    public final void j(q03.d dVar) {
        a aVar = new a(dVar, this.f200796a);
        dVar.a(aVar);
        s03.b bVarB = this.f200797b.b(aVar);
        v03.f fVar = aVar.f200799b;
        fVar.getClass();
        v03.c.d(fVar, bVarB);
    }
}
