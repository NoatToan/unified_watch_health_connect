package e13;

/* JADX INFO: loaded from: classes3.dex */
public final class v<T> extends q03.l<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.v<? extends T> f62383a;

    public static final class a<T> extends y03.f<T> implements q03.t<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public s03.b f62384c;

        public a(q03.p<? super T> pVar) {
            super(pVar);
        }

        @Override // q03.t
        public final void a(s03.b bVar) {
            if (v03.c.g(this.f62384c, bVar)) {
                this.f62384c = bVar;
                this.f193061a.a(this);
            }
        }

        @Override // y03.f, s03.b
        public final void dispose() {
            super.dispose();
            this.f62384c.dispose();
        }

        @Override // q03.t
        public final void onError(Throwable th3) {
            if ((get() & 54) != 0) {
                k13.a.b(th3);
            } else {
                lazySet(2);
                this.f193061a.onError(th3);
            }
        }

        @Override // q03.t
        public final void onSuccess(T t7) {
            int i14 = get();
            if ((i14 & 54) != 0) {
                return;
            }
            q03.p<? super T> pVar = this.f193061a;
            if (i14 == 8) {
                this.f193062b = t7;
                lazySet(16);
                pVar.c(null);
            } else {
                lazySet(2);
                pVar.c(t7);
            }
            if (get() != 4) {
                pVar.onComplete();
            }
        }
    }

    public v(q03.v<? extends T> vVar) {
        this.f62383a = vVar;
    }

    @Override // q03.l
    public final void f(q03.p<? super T> pVar) {
        this.f62383a.a(new a(pVar));
    }
}
