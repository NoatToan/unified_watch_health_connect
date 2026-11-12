package e13;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class c<T> extends q03.r<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.v<T> f62298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q03.f f62299b;

    public static final class a<T> extends AtomicReference<s03.b> implements q03.d, s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.t<? super T> f62300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q03.v<T> f62301b;

        public a(q03.t<? super T> tVar, q03.v<T> vVar) {
            this.f62300a = tVar;
            this.f62301b = vVar;
        }

        @Override // q03.d
        public final void a(s03.b bVar) {
            if (v03.c.f(this, bVar)) {
                this.f62300a.a(this);
            }
        }

        @Override // s03.b
        public final boolean b() {
            return v03.c.c(get());
        }

        @Override // s03.b
        public final void dispose() {
            v03.c.a(this);
        }

        @Override // q03.d
        public final void onComplete() {
            this.f62301b.a(new y03.j(this, this.f62300a));
        }

        @Override // q03.d
        public final void onError(Throwable th3) {
            this.f62300a.onError(th3);
        }
    }

    public c(q03.v<T> vVar, q03.f fVar) {
        this.f62298a = vVar;
        this.f62299b = fVar;
    }

    @Override // q03.r
    public final void i(q03.t<? super T> tVar) {
        this.f62299b.a(new a(tVar, this.f62298a));
    }
}
