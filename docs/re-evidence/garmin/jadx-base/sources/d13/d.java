package d13;

import io.reactivex.exceptions.CompositeException;

/* JADX INFO: loaded from: classes3.dex */
public final class d<T> extends d13.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u03.d<? super T> f57128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u03.d<? super Throwable> f57129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u03.a f57130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u03.a f57131e;

    public static final class a<T> implements q03.p<T>, s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.p<? super T> f57132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u03.d<? super T> f57133b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u03.d<? super Throwable> f57134c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final u03.a f57135d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final u03.a f57136e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public s03.b f57137f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f57138g;

        public a(q03.p<? super T> pVar, u03.d<? super T> dVar, u03.d<? super Throwable> dVar2, u03.a aVar, u03.a aVar2) {
            this.f57132a = pVar;
            this.f57133b = dVar;
            this.f57134c = dVar2;
            this.f57135d = aVar;
            this.f57136e = aVar2;
        }

        @Override // q03.p
        public final void a(s03.b bVar) {
            if (v03.c.g(this.f57137f, bVar)) {
                this.f57137f = bVar;
                this.f57132a.a(this);
            }
        }

        @Override // s03.b
        public final boolean b() {
            return this.f57137f.b();
        }

        @Override // q03.p
        public final void c(T t7) {
            if (this.f57138g) {
                return;
            }
            try {
                this.f57133b.accept(t7);
                this.f57132a.c(t7);
            } catch (Throwable th3) {
                t03.a.a(th3);
                this.f57137f.dispose();
                onError(th3);
            }
        }

        @Override // s03.b
        public final void dispose() {
            this.f57137f.dispose();
        }

        @Override // q03.p
        public final void onComplete() {
            if (this.f57138g) {
                return;
            }
            try {
                this.f57135d.run();
                this.f57138g = true;
                this.f57132a.onComplete();
                try {
                    this.f57136e.run();
                } catch (Throwable th3) {
                    t03.a.a(th3);
                    k13.a.b(th3);
                }
            } catch (Throwable th4) {
                t03.a.a(th4);
                onError(th4);
            }
        }

        @Override // q03.p
        public final void onError(Throwable th3) {
            if (this.f57138g) {
                k13.a.b(th3);
                return;
            }
            this.f57138g = true;
            try {
                this.f57134c.accept(th3);
            } catch (Throwable th4) {
                t03.a.a(th4);
                th3 = new CompositeException(th3, th4);
            }
            this.f57132a.onError(th3);
            try {
                this.f57136e.run();
            } catch (Throwable th5) {
                t03.a.a(th5);
                k13.a.b(th5);
            }
        }
    }

    public d(q03.o<T> oVar, u03.d<? super T> dVar, u03.d<? super Throwable> dVar2, u03.a aVar, u03.a aVar2) {
        super(oVar);
        this.f57128b = dVar;
        this.f57129c = dVar2;
        this.f57130d = aVar;
        this.f57131e = aVar2;
    }

    @Override // q03.l
    public final void f(q03.p<? super T> pVar) {
        this.f57107a.b(new a(pVar, this.f57128b, this.f57129c, this.f57130d, this.f57131e));
    }
}
