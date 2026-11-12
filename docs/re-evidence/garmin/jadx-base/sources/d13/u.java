package d13;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class u<T> extends q03.r<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.o<? extends T> f57235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f57236b;

    public static final class a<T> implements q03.p<T>, s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.t<? super T> f57237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f57238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public s03.b f57239c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public T f57240d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f57241e;

        public a(q03.t<? super T> tVar, T t7) {
            this.f57237a = tVar;
            this.f57238b = t7;
        }

        @Override // q03.p
        public final void a(s03.b bVar) {
            if (v03.c.g(this.f57239c, bVar)) {
                this.f57239c = bVar;
                this.f57237a.a(this);
            }
        }

        @Override // s03.b
        public final boolean b() {
            return this.f57239c.b();
        }

        @Override // q03.p
        public final void c(T t7) {
            if (this.f57241e) {
                return;
            }
            if (this.f57240d == null) {
                this.f57240d = t7;
                return;
            }
            this.f57241e = true;
            this.f57239c.dispose();
            this.f57237a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // s03.b
        public final void dispose() {
            this.f57239c.dispose();
        }

        @Override // q03.p
        public final void onComplete() {
            if (this.f57241e) {
                return;
            }
            this.f57241e = true;
            T t7 = this.f57240d;
            this.f57240d = null;
            if (t7 == null) {
                t7 = this.f57238b;
            }
            q03.t<? super T> tVar = this.f57237a;
            if (t7 != null) {
                tVar.onSuccess(t7);
            } else {
                tVar.onError(new NoSuchElementException());
            }
        }

        @Override // q03.p
        public final void onError(Throwable th3) {
            if (this.f57241e) {
                k13.a.b(th3);
            } else {
                this.f57241e = true;
                this.f57237a.onError(th3);
            }
        }
    }

    public u(q03.o<? extends T> oVar, T t7) {
        this.f57235a = oVar;
        this.f57236b = t7;
    }

    @Override // q03.r
    public final void i(q03.t<? super T> tVar) {
        this.f57235a.b(new a(tVar, this.f57236b));
    }
}
