package d13;

/* JADX INFO: loaded from: classes3.dex */
public final class w<T> extends d13.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f57247b;

    public static final class a<T> implements q03.p<T>, s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.p<? super T> f57248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f57249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public s03.b f57250c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f57251d;

        public a(q03.p<? super T> pVar, long j8) {
            this.f57248a = pVar;
            this.f57251d = j8;
        }

        @Override // q03.p
        public final void a(s03.b bVar) {
            if (v03.c.g(this.f57250c, bVar)) {
                this.f57250c = bVar;
                long j8 = this.f57251d;
                q03.p<? super T> pVar = this.f57248a;
                if (j8 != 0) {
                    pVar.a(this);
                    return;
                }
                this.f57249b = true;
                bVar.dispose();
                v03.d.a(pVar);
            }
        }

        @Override // s03.b
        public final boolean b() {
            return this.f57250c.b();
        }

        @Override // q03.p
        public final void c(T t7) {
            if (this.f57249b) {
                return;
            }
            long j8 = this.f57251d;
            long j14 = j8 - 1;
            this.f57251d = j14;
            if (j8 > 0) {
                boolean z14 = j14 == 0;
                this.f57248a.c(t7);
                if (z14) {
                    onComplete();
                }
            }
        }

        @Override // s03.b
        public final void dispose() {
            this.f57250c.dispose();
        }

        @Override // q03.p
        public final void onComplete() {
            if (this.f57249b) {
                return;
            }
            this.f57249b = true;
            this.f57250c.dispose();
            this.f57248a.onComplete();
        }

        @Override // q03.p
        public final void onError(Throwable th3) {
            if (this.f57249b) {
                k13.a.b(th3);
                return;
            }
            this.f57249b = true;
            this.f57250c.dispose();
            this.f57248a.onError(th3);
        }
    }

    public w(q03.o<T> oVar, long j8) {
        super(oVar);
        this.f57247b = j8;
    }

    @Override // q03.l
    public final void f(q03.p<? super T> pVar) {
        this.f57107a.b(new a(pVar, this.f57247b));
    }
}
