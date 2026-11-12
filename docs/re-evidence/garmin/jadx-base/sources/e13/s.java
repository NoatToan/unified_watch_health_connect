package e13;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class s<T> extends q03.r<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.v<? extends T> f62362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q03.q f62363b;

    public static final class a<T> extends AtomicReference<s03.b> implements q03.t<T>, s03.b, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.t<? super T> f62364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v03.f f62365b = new v03.f();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final q03.v<? extends T> f62366c;

        public a(q03.t<? super T> tVar, q03.v<? extends T> vVar) {
            this.f62364a = tVar;
            this.f62366c = vVar;
        }

        @Override // q03.t
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
            v03.f fVar = this.f62365b;
            fVar.getClass();
            v03.c.a(fVar);
        }

        @Override // q03.t
        public final void onError(Throwable th3) {
            this.f62364a.onError(th3);
        }

        @Override // q03.t
        public final void onSuccess(T t7) {
            this.f62364a.onSuccess(t7);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f62366c.a(this);
        }
    }

    public s(q03.v<? extends T> vVar, q03.q qVar) {
        this.f62362a = vVar;
        this.f62363b = qVar;
    }

    @Override // q03.r
    public final void i(q03.t<? super T> tVar) {
        a aVar = new a(tVar, this.f62362a);
        tVar.a(aVar);
        s03.b bVarB = this.f62363b.b(aVar);
        v03.f fVar = aVar.f62365b;
        fVar.getClass();
        v03.c.d(fVar, bVarB);
    }
}
