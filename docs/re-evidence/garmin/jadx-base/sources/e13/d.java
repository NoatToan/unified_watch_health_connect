package e13;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class d<T> extends q03.r<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.v<T> f62302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u03.a f62303b;

    public static final class a<T> extends AtomicInteger implements q03.t<T>, s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.t<? super T> f62304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u03.a f62305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public s03.b f62306c;

        public a(q03.t<? super T> tVar, u03.a aVar) {
            this.f62304a = tVar;
            this.f62305b = aVar;
        }

        @Override // q03.t
        public final void a(s03.b bVar) {
            if (v03.c.g(this.f62306c, bVar)) {
                this.f62306c = bVar;
                this.f62304a.a(this);
            }
        }

        @Override // s03.b
        public final boolean b() {
            return this.f62306c.b();
        }

        public final void c() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f62305b.run();
                } catch (Throwable th3) {
                    t03.a.a(th3);
                    k13.a.b(th3);
                }
            }
        }

        @Override // s03.b
        public final void dispose() {
            this.f62306c.dispose();
            c();
        }

        @Override // q03.t
        public final void onError(Throwable th3) {
            this.f62304a.onError(th3);
            c();
        }

        @Override // q03.t
        public final void onSuccess(T t7) {
            this.f62304a.onSuccess(t7);
            c();
        }
    }

    public d(q03.v<T> vVar, u03.a aVar) {
        this.f62302a = vVar;
        this.f62303b = aVar;
    }

    @Override // q03.r
    public final void i(q03.t<? super T> tVar) {
        this.f62302a.a(new a(tVar, this.f62303b));
    }
}
