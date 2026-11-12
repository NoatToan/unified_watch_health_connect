package d13;

/* JADX INFO: loaded from: classes3.dex */
public final class i<T> extends d13.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u03.g<? super T> f57161b;

    public static final class a<T> extends y03.a<T, T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final u03.g<? super T> f57162e;

        public a(q03.p<? super T> pVar, u03.g<? super T> gVar) {
            super(pVar);
            this.f57162e = gVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // q03.p
        public final void c(T t7) {
            try {
                if (this.f57162e.test(t7)) {
                    this.f193049a.c((Object) t7);
                }
            } catch (Throwable th3) {
                t03.a.a(th3);
                this.f193050b.dispose();
                onError(th3);
            }
        }

        @Override // y03.a, x03.d
        public final int e() {
            return 0;
        }

        @Override // x03.h
        public final T poll() {
            T tPoll;
            do {
                tPoll = this.f193051c.poll();
                if (tPoll == null) {
                    break;
                }
            } while (!this.f57162e.test(tPoll));
            return tPoll;
        }
    }

    public i(q03.o<T> oVar, u03.g<? super T> gVar) {
        super(oVar);
        this.f57161b = gVar;
    }

    @Override // q03.l
    public final void f(q03.p<? super T> pVar) {
        this.f57107a.b(new a(pVar, this.f57161b));
    }
}
