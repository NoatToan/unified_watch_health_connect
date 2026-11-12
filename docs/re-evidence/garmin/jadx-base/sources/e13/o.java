package e13;

/* JADX INFO: loaded from: classes3.dex */
public final class o<T, R> extends q03.r<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.v<? extends T> f62343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u03.f<? super T, ? extends R> f62344b;

    public static final class a<T, R> implements q03.t<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.t<? super R> f62345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u03.f<? super T, ? extends R> f62346b;

        public a(q03.t<? super R> tVar, u03.f<? super T, ? extends R> fVar) {
            this.f62345a = tVar;
            this.f62346b = fVar;
        }

        @Override // q03.t
        public final void a(s03.b bVar) {
            this.f62345a.a(bVar);
        }

        @Override // q03.t
        public final void onError(Throwable th3) {
            this.f62345a.onError(th3);
        }

        @Override // q03.t
        public final void onSuccess(T t7) {
            try {
                R rMo330apply = this.f62346b.mo330apply(t7);
                w03.b.a(rMo330apply, "The mapper function returned a null value.");
                this.f62345a.onSuccess(rMo330apply);
            } catch (Throwable th3) {
                t03.a.a(th3);
                onError(th3);
            }
        }
    }

    public o(q03.v<? extends T> vVar, u03.f<? super T, ? extends R> fVar) {
        this.f62343a = vVar;
        this.f62344b = fVar;
    }

    @Override // q03.r
    public final void i(q03.t<? super R> tVar) {
        this.f62343a.a(new a(tVar, this.f62344b));
    }
}
