package b13;

import q03.t;
import q03.v;

/* JADX INFO: loaded from: classes3.dex */
public final class g<T> extends q03.i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v<T> f14440a;

    public static final class a<T> implements t<T>, s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.j<? super T> f14441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public s03.b f14442b;

        public a(q03.j<? super T> jVar) {
            this.f14441a = jVar;
        }

        @Override // q03.t
        public final void a(s03.b bVar) {
            if (v03.c.g(this.f14442b, bVar)) {
                this.f14442b = bVar;
                this.f14441a.a(this);
            }
        }

        @Override // s03.b
        public final boolean b() {
            return this.f14442b.b();
        }

        @Override // s03.b
        public final void dispose() {
            this.f14442b.dispose();
            this.f14442b = v03.c.DISPOSED;
        }

        @Override // q03.t
        public final void onError(Throwable th3) {
            this.f14442b = v03.c.DISPOSED;
            this.f14441a.onError(th3);
        }

        @Override // q03.t
        public final void onSuccess(T t7) {
            this.f14442b = v03.c.DISPOSED;
            this.f14441a.onSuccess(t7);
        }
    }

    public g(v<T> vVar) {
        this.f14440a = vVar;
    }

    @Override // q03.i
    public final void c(q03.j<? super T> jVar) {
        this.f14440a.a(new a(jVar));
    }
}
