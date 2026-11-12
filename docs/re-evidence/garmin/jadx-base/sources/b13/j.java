package b13;

import java.util.concurrent.atomic.AtomicReference;
import q03.q;

/* JADX INFO: loaded from: classes3.dex */
public final class j<T> extends b13.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f14449b;

    public static final class a<T> extends AtomicReference<s03.b> implements q03.j<T>, s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v03.f f14450a = new v03.f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q03.j<? super T> f14451b;

        public a(q03.j<? super T> jVar) {
            this.f14451b = jVar;
        }

        @Override // q03.j
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
            v03.f fVar = this.f14450a;
            fVar.getClass();
            v03.c.a(fVar);
        }

        @Override // q03.j
        public final void onComplete() {
            this.f14451b.onComplete();
        }

        @Override // q03.j
        public final void onError(Throwable th3) {
            this.f14451b.onError(th3);
        }

        @Override // q03.j
        public final void onSuccess(T t7) {
            this.f14451b.onSuccess(t7);
        }
    }

    public static final class b<T> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.j<? super T> f14452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q03.k<T> f14453b;

        public b(q03.j<? super T> jVar, q03.k<T> kVar) {
            this.f14452a = jVar;
            this.f14453b = kVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f14453b.a(this.f14452a);
        }
    }

    public j(q03.k<T> kVar, q qVar) {
        super(kVar);
        this.f14449b = qVar;
    }

    @Override // q03.i
    public final void c(q03.j<? super T> jVar) {
        a aVar = new a(jVar);
        jVar.a(aVar);
        s03.b bVarB = this.f14449b.b(new b(aVar, this.f14422a));
        v03.f fVar = aVar.f14450a;
        fVar.getClass();
        v03.c.d(fVar, bVarB);
    }
}
