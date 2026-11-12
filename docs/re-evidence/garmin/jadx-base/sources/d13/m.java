package d13;

/* JADX INFO: loaded from: classes3.dex */
public final class m<T> extends d13.a<T, T> {

    public static final class a<T> implements q03.p<T>, s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.p<? super T> f57195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public s03.b f57196b;

        public a(q03.p<? super T> pVar) {
            this.f57195a = pVar;
        }

        @Override // q03.p
        public final void a(s03.b bVar) {
            this.f57196b = bVar;
            this.f57195a.a(this);
        }

        @Override // s03.b
        public final boolean b() {
            return this.f57196b.b();
        }

        @Override // q03.p
        public final void c(T t7) {
        }

        @Override // s03.b
        public final void dispose() {
            this.f57196b.dispose();
        }

        @Override // q03.p
        public final void onComplete() {
            this.f57195a.onComplete();
        }

        @Override // q03.p
        public final void onError(Throwable th3) {
            this.f57195a.onError(th3);
        }
    }

    public m(q03.o<T> oVar) {
        super(oVar);
    }

    @Override // q03.l
    public final void f(q03.p<? super T> pVar) {
        this.f57107a.b(new a(pVar));
    }
}
