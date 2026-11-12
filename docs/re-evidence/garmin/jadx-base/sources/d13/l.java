package d13;

/* JADX INFO: loaded from: classes3.dex */
public final class l<T> extends d13.a<T, T> {

    public static final class a<T> implements q03.p<T>, s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.p<? super T> f57193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public s03.b f57194b;

        public a(q03.p<? super T> pVar) {
            this.f57193a = pVar;
        }

        @Override // q03.p
        public final void a(s03.b bVar) {
            if (v03.c.g(this.f57194b, bVar)) {
                this.f57194b = bVar;
                this.f57193a.a(this);
            }
        }

        @Override // s03.b
        public final boolean b() {
            return this.f57194b.b();
        }

        @Override // q03.p
        public final void c(T t7) {
            this.f57193a.c(t7);
        }

        @Override // s03.b
        public final void dispose() {
            this.f57194b.dispose();
        }

        @Override // q03.p
        public final void onComplete() {
            this.f57193a.onComplete();
        }

        @Override // q03.p
        public final void onError(Throwable th3) {
            this.f57193a.onError(th3);
        }
    }

    public l(q03.o<T> oVar) {
        super(oVar);
    }

    @Override // q03.l
    public final void f(q03.p<? super T> pVar) {
        this.f57107a.b(new a(pVar));
    }
}
