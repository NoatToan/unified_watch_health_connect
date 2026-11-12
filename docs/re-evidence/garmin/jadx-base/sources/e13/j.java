package e13;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class j<T, R> extends q03.r<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.v<? extends T> f62325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u03.f<? super T, ? extends q03.v<? extends R>> f62326b;

    public static final class a<T, R> extends AtomicReference<s03.b> implements q03.t<T>, s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.t<? super R> f62327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u03.f<? super T, ? extends q03.v<? extends R>> f62328b;

        /* JADX INFO: renamed from: e13.j$a$a, reason: collision with other inner class name */
        public static final class C1313a<R> implements q03.t<R> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AtomicReference<s03.b> f62329a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final q03.t<? super R> f62330b;

            public C1313a(AtomicReference<s03.b> atomicReference, q03.t<? super R> tVar) {
                this.f62329a = atomicReference;
                this.f62330b = tVar;
            }

            @Override // q03.t
            public final void a(s03.b bVar) {
                v03.c.d(this.f62329a, bVar);
            }

            @Override // q03.t
            public final void onError(Throwable th3) {
                this.f62330b.onError(th3);
            }

            @Override // q03.t
            public final void onSuccess(R r14) {
                this.f62330b.onSuccess(r14);
            }
        }

        public a(q03.t<? super R> tVar, u03.f<? super T, ? extends q03.v<? extends R>> fVar) {
            this.f62327a = tVar;
            this.f62328b = fVar;
        }

        @Override // q03.t
        public final void a(s03.b bVar) {
            if (v03.c.f(this, bVar)) {
                this.f62327a.a(this);
            }
        }

        @Override // s03.b
        public final boolean b() {
            return v03.c.c(get());
        }

        @Override // s03.b
        public final void dispose() {
            v03.c.a(this);
        }

        @Override // q03.t
        public final void onError(Throwable th3) {
            this.f62327a.onError(th3);
        }

        @Override // q03.t
        public final void onSuccess(T t7) {
            q03.t<? super R> tVar = this.f62327a;
            try {
                q03.v<? extends R> vVarMo330apply = this.f62328b.mo330apply(t7);
                w03.b.a(vVarMo330apply, "The single returned by the mapper is null");
                q03.v<? extends R> vVar = vVarMo330apply;
                if (b()) {
                    return;
                }
                vVar.a(new C1313a(this, tVar));
            } catch (Throwable th3) {
                t03.a.a(th3);
                tVar.onError(th3);
            }
        }
    }

    public j(q03.v<? extends T> vVar, u03.f<? super T, ? extends q03.v<? extends R>> fVar) {
        this.f62326b = fVar;
        this.f62325a = vVar;
    }

    @Override // q03.r
    public final void i(q03.t<? super R> tVar) {
        this.f62325a.a(new a(tVar, this.f62326b));
    }
}
