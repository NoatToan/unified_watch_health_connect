package d13;

/* JADX INFO: loaded from: classes3.dex */
public final class k<T> extends q03.l<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b83.a<? extends T> f57190a;

    public static final class a<T> implements q03.h<T>, s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.p<? super T> f57191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b83.c f57192b;

        public a(q03.p<? super T> pVar) {
            this.f57191a = pVar;
        }

        @Override // s03.b
        public final boolean b() {
            return this.f57192b == h13.e.CANCELLED;
        }

        @Override // b83.b
        public final void c(T t7) {
            this.f57191a.c(t7);
        }

        @Override // b83.b
        public final void d(b83.c cVar) {
            if (h13.e.e(this.f57192b, cVar)) {
                this.f57192b = cVar;
                this.f57191a.a(this);
                cVar.b(Long.MAX_VALUE);
            }
        }

        @Override // s03.b
        public final void dispose() {
            this.f57192b.cancel();
            this.f57192b = h13.e.CANCELLED;
        }

        @Override // b83.b
        public final void onComplete() {
            this.f57191a.onComplete();
        }

        @Override // b83.b
        public final void onError(Throwable th3) {
            this.f57191a.onError(th3);
        }
    }

    public k(b83.a<? extends T> aVar) {
        this.f57190a = aVar;
    }

    @Override // q03.l
    public final void f(q03.p<? super T> pVar) {
        this.f57190a.a(new a(pVar));
    }
}
