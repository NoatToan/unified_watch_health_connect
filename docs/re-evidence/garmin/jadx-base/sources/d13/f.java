package d13;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class f<T> extends d13.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f57141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f57142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f57143d;

    public static final class a<T> implements q03.p<T>, s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.p<? super T> f57144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f57145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T f57146c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f57147d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public s03.b f57148e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f57149f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f57150g;

        public a(q03.p<? super T> pVar, long j8, T t7, boolean z14) {
            this.f57144a = pVar;
            this.f57145b = j8;
            this.f57146c = t7;
            this.f57147d = z14;
        }

        @Override // q03.p
        public final void a(s03.b bVar) {
            if (v03.c.g(this.f57148e, bVar)) {
                this.f57148e = bVar;
                this.f57144a.a(this);
            }
        }

        @Override // s03.b
        public final boolean b() {
            return this.f57148e.b();
        }

        @Override // q03.p
        public final void c(T t7) {
            if (this.f57150g) {
                return;
            }
            long j8 = this.f57149f;
            if (j8 != this.f57145b) {
                this.f57149f = j8 + 1;
                return;
            }
            this.f57150g = true;
            this.f57148e.dispose();
            q03.p<? super T> pVar = this.f57144a;
            pVar.c(t7);
            pVar.onComplete();
        }

        @Override // s03.b
        public final void dispose() {
            this.f57148e.dispose();
        }

        @Override // q03.p
        public final void onComplete() {
            if (this.f57150g) {
                return;
            }
            this.f57150g = true;
            q03.p<? super T> pVar = this.f57144a;
            T t7 = this.f57146c;
            if (t7 == null && this.f57147d) {
                pVar.onError(new NoSuchElementException());
                return;
            }
            if (t7 != null) {
                pVar.c(t7);
            }
            pVar.onComplete();
        }

        @Override // q03.p
        public final void onError(Throwable th3) {
            if (this.f57150g) {
                k13.a.b(th3);
            } else {
                this.f57150g = true;
                this.f57144a.onError(th3);
            }
        }
    }

    public f(q03.o<T> oVar, long j8, T t7, boolean z14) {
        super(oVar);
        this.f57141b = j8;
        this.f57142c = t7;
        this.f57143d = z14;
    }

    @Override // q03.l
    public final void f(q03.p<? super T> pVar) {
        this.f57107a.b(new a(pVar, this.f57141b, this.f57142c, this.f57143d));
    }
}
