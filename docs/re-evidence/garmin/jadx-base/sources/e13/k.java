package e13;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class k<T> extends q03.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.v<T> f62331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u03.f<? super T, ? extends q03.f> f62332b;

    public static final class a<T> extends AtomicReference<s03.b> implements q03.t<T>, q03.d, s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.d f62333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u03.f<? super T, ? extends q03.f> f62334b;

        public a(q03.d dVar, u03.f<? super T, ? extends q03.f> fVar) {
            this.f62333a = dVar;
            this.f62334b = fVar;
        }

        @Override // q03.t
        public final void a(s03.b bVar) {
            v03.c.d(this, bVar);
        }

        @Override // s03.b
        public final boolean b() {
            return v03.c.c(get());
        }

        @Override // s03.b
        public final void dispose() {
            v03.c.a(this);
        }

        @Override // q03.d
        public final void onComplete() {
            this.f62333a.onComplete();
        }

        @Override // q03.t
        public final void onError(Throwable th3) {
            this.f62333a.onError(th3);
        }

        @Override // q03.t
        public final void onSuccess(T t7) {
            try {
                q03.f fVarMo330apply = this.f62334b.mo330apply(t7);
                w03.b.a(fVarMo330apply, "The mapper returned a null CompletableSource");
                q03.f fVar = fVarMo330apply;
                if (b()) {
                    return;
                }
                fVar.a(this);
            } catch (Throwable th3) {
                t03.a.a(th3);
                onError(th3);
            }
        }
    }

    public k(q03.v<T> vVar, u03.f<? super T, ? extends q03.f> fVar) {
        this.f62331a = vVar;
        this.f62332b = fVar;
    }

    @Override // q03.b
    public final void j(q03.d dVar) {
        a aVar = new a(dVar, this.f62332b);
        dVar.a(aVar);
        this.f62331a.a(aVar);
    }
}
