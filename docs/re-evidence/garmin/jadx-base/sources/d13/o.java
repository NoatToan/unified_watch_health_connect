package d13;

/* JADX INFO: loaded from: classes3.dex */
public final class o<T, U> extends d13.a<T, U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u03.f<? super T, ? extends U> f57200b;

    public static final class a<T, U> extends y03.a<T, U> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final u03.f<? super T, ? extends U> f57201e;

        public a(q03.p<? super U> pVar, u03.f<? super T, ? extends U> fVar) {
            super(pVar);
            this.f57201e = fVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // q03.p
        public final void c(T t7) {
            if (this.f193052d) {
                return;
            }
            try {
                U uMo330apply = this.f57201e.mo330apply(t7);
                w03.b.a(uMo330apply, "The mapper function returned a null value.");
                this.f193049a.c((Object) uMo330apply);
            } catch (Throwable th3) {
                t03.a.a(th3);
                this.f193050b.dispose();
                onError(th3);
            }
        }

        @Override // x03.h
        public final U poll() {
            T tPoll = this.f193051c.poll();
            if (tPoll == null) {
                return null;
            }
            U uMo330apply = this.f57201e.mo330apply(tPoll);
            w03.b.a(uMo330apply, "The mapper function returned a null value.");
            return uMo330apply;
        }
    }

    public o(q03.o<T> oVar, u03.f<? super T, ? extends U> fVar) {
        super(oVar);
        this.f57200b = fVar;
    }

    @Override // q03.l
    public final void f(q03.p<? super U> pVar) {
        this.f57107a.b(new a(pVar, this.f57200b));
    }
}
