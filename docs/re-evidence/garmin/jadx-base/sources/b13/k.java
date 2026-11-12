package b13;

import java.util.concurrent.atomic.AtomicReference;
import q03.r;
import q03.t;
import q03.v;

/* JADX INFO: loaded from: classes3.dex */
public final class k<T> extends r<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.k<T> f14454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v<? extends T> f14455b;

    public static final class a<T> extends AtomicReference<s03.b> implements q03.j<T>, s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t<? super T> f14456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v<? extends T> f14457b;

        /* JADX INFO: renamed from: b13.k$a$a, reason: collision with other inner class name */
        public static final class C0210a<T> implements t<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final t<? super T> f14458a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final AtomicReference<s03.b> f14459b;

            public C0210a(t<? super T> tVar, AtomicReference<s03.b> atomicReference) {
                this.f14458a = tVar;
                this.f14459b = atomicReference;
            }

            @Override // q03.t
            public final void a(s03.b bVar) {
                v03.c.f(this.f14459b, bVar);
            }

            @Override // q03.t
            public final void onError(Throwable th3) {
                this.f14458a.onError(th3);
            }

            @Override // q03.t
            public final void onSuccess(T t7) {
                this.f14458a.onSuccess(t7);
            }
        }

        public a(t<? super T> tVar, v<? extends T> vVar) {
            this.f14456a = tVar;
            this.f14457b = vVar;
        }

        @Override // q03.j
        public final void a(s03.b bVar) {
            if (v03.c.f(this, bVar)) {
                this.f14456a.a(this);
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

        @Override // q03.j
        public final void onComplete() {
            s03.b bVar = get();
            if (bVar == v03.c.DISPOSED || !compareAndSet(bVar, null)) {
                return;
            }
            this.f14457b.a(new C0210a(this.f14456a, this));
        }

        @Override // q03.j
        public final void onError(Throwable th3) {
            this.f14456a.onError(th3);
        }

        @Override // q03.j
        public final void onSuccess(T t7) {
            this.f14456a.onSuccess(t7);
        }
    }

    public k(q03.k<T> kVar, v<? extends T> vVar) {
        this.f14454a = kVar;
        this.f14455b = vVar;
    }

    @Override // q03.r
    public final void i(t<? super T> tVar) {
        this.f14454a.a(new a(tVar, this.f14455b));
    }
}
