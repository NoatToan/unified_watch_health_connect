package d13;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class g<T> extends q03.r<T> implements x03.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.o<T> f57151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f57152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f57153c;

    public static final class a<T> implements q03.p<T>, s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.t<? super T> f57154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f57155b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T f57156c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public s03.b f57157d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f57158e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f57159f;

        public a(q03.t<? super T> tVar, long j8, T t7) {
            this.f57154a = tVar;
            this.f57155b = j8;
            this.f57156c = t7;
        }

        @Override // q03.p
        public final void a(s03.b bVar) {
            if (v03.c.g(this.f57157d, bVar)) {
                this.f57157d = bVar;
                this.f57154a.a(this);
            }
        }

        @Override // s03.b
        public final boolean b() {
            return this.f57157d.b();
        }

        @Override // q03.p
        public final void c(T t7) {
            if (this.f57159f) {
                return;
            }
            long j8 = this.f57158e;
            if (j8 != this.f57155b) {
                this.f57158e = j8 + 1;
                return;
            }
            this.f57159f = true;
            this.f57157d.dispose();
            this.f57154a.onSuccess(t7);
        }

        @Override // s03.b
        public final void dispose() {
            this.f57157d.dispose();
        }

        @Override // q03.p
        public final void onComplete() {
            if (this.f57159f) {
                return;
            }
            this.f57159f = true;
            T t7 = this.f57156c;
            q03.t<? super T> tVar = this.f57154a;
            if (t7 != null) {
                tVar.onSuccess(t7);
            } else {
                tVar.onError(new NoSuchElementException());
            }
        }

        @Override // q03.p
        public final void onError(Throwable th3) {
            if (this.f57159f) {
                k13.a.b(th3);
            } else {
                this.f57159f = true;
                this.f57154a.onError(th3);
            }
        }
    }

    public g(q03.o<T> oVar, long j8, T t7) {
        this.f57151a = oVar;
        this.f57152b = j8;
        this.f57153c = t7;
    }

    @Override // x03.b
    public final q03.l<T> b() {
        return new f(this.f57151a, this.f57152b, this.f57153c, true);
    }

    @Override // q03.r
    public final void i(q03.t<? super T> tVar) {
        this.f57151a.b(new a(tVar, this.f57152b, this.f57153c));
    }
}
