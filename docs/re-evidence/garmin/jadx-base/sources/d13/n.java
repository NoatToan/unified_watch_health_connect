package d13;

/* JADX INFO: loaded from: classes3.dex */
public final class n<T> extends q03.b implements x03.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.o<T> f57197a;

    public static final class a<T> implements q03.p<T>, s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.d f57198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public s03.b f57199b;

        public a(q03.d dVar) {
            this.f57198a = dVar;
        }

        @Override // q03.p
        public final void a(s03.b bVar) {
            this.f57199b = bVar;
            this.f57198a.a(this);
        }

        @Override // s03.b
        public final boolean b() {
            return this.f57199b.b();
        }

        @Override // q03.p
        public final void c(T t7) {
        }

        @Override // s03.b
        public final void dispose() {
            this.f57199b.dispose();
        }

        @Override // q03.p
        public final void onComplete() {
            this.f57198a.onComplete();
        }

        @Override // q03.p
        public final void onError(Throwable th3) {
            this.f57198a.onError(th3);
        }
    }

    public n(q03.o<T> oVar) {
        this.f57197a = oVar;
    }

    @Override // x03.b
    public final q03.l<T> b() {
        return new m(this.f57197a);
    }

    @Override // q03.b
    public final void j(q03.d dVar) {
        this.f57197a.b(new a(dVar));
    }
}
