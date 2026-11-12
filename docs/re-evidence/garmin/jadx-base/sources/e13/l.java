package e13;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class l<T, R> extends q03.i<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.v<? extends T> f62335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u03.f<? super T, ? extends q03.k<? extends R>> f62336b;

    public static final class a<R> implements q03.j<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReference<s03.b> f62337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q03.j<? super R> f62338b;

        public a(AtomicReference<s03.b> atomicReference, q03.j<? super R> jVar) {
            this.f62337a = atomicReference;
            this.f62338b = jVar;
        }

        @Override // q03.j
        public final void a(s03.b bVar) {
            v03.c.d(this.f62337a, bVar);
        }

        @Override // q03.j
        public final void onComplete() {
            this.f62338b.onComplete();
        }

        @Override // q03.j
        public final void onError(Throwable th3) {
            this.f62338b.onError(th3);
        }

        @Override // q03.j
        public final void onSuccess(R r14) {
            this.f62338b.onSuccess(r14);
        }
    }

    public static final class b<T, R> extends AtomicReference<s03.b> implements q03.t<T>, s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.j<? super R> f62339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u03.f<? super T, ? extends q03.k<? extends R>> f62340b;

        public b(q03.j<? super R> jVar, u03.f<? super T, ? extends q03.k<? extends R>> fVar) {
            this.f62339a = jVar;
            this.f62340b = fVar;
        }

        @Override // q03.t
        public final void a(s03.b bVar) {
            if (v03.c.f(this, bVar)) {
                this.f62339a.a(this);
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
            this.f62339a.onError(th3);
        }

        @Override // q03.t
        public final void onSuccess(T t7) {
            try {
                q03.k<? extends R> kVarMo330apply = this.f62340b.mo330apply(t7);
                w03.b.a(kVarMo330apply, "The mapper returned a null MaybeSource");
                q03.k<? extends R> kVar = kVarMo330apply;
                if (b()) {
                    return;
                }
                kVar.a(new a(this, this.f62339a));
            } catch (Throwable th3) {
                t03.a.a(th3);
                onError(th3);
            }
        }
    }

    public l(q03.v<? extends T> vVar, u03.f<? super T, ? extends q03.k<? extends R>> fVar) {
        this.f62336b = fVar;
        this.f62335a = vVar;
    }

    @Override // q03.i
    public final void c(q03.j<? super R> jVar) {
        this.f62335a.a(new b(jVar, this.f62336b));
    }
}
