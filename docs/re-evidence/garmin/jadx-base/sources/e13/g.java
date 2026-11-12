package e13;

/* JADX INFO: loaded from: classes3.dex */
public final class g<T> extends q03.r<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.v<T> f62316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u03.d<? super T> f62317b;

    public final class a implements q03.t<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.t<? super T> f62318a;

        public a(q03.t<? super T> tVar) {
            this.f62318a = tVar;
        }

        @Override // q03.t
        public final void a(s03.b bVar) {
            this.f62318a.a(bVar);
        }

        @Override // q03.t
        public final void onError(Throwable th3) {
            this.f62318a.onError(th3);
        }

        @Override // q03.t
        public final void onSuccess(T t7) {
            q03.t<? super T> tVar = this.f62318a;
            try {
                g.this.f62317b.accept(t7);
                tVar.onSuccess(t7);
            } catch (Throwable th3) {
                t03.a.a(th3);
                tVar.onError(th3);
            }
        }
    }

    public g(q03.v<T> vVar, u03.d<? super T> dVar) {
        this.f62316a = vVar;
        this.f62317b = dVar;
    }

    @Override // q03.r
    public final void i(q03.t<? super T> tVar) {
        this.f62316a.a(new a(tVar));
    }
}
