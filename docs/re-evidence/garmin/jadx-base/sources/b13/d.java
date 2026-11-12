package b13;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class d<T> extends q03.i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.k<T> f14427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q03.f f14428b;

    public static final class a<T> implements q03.j<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReference<s03.b> f14429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q03.j<? super T> f14430b;

        public a(AtomicReference<s03.b> atomicReference, q03.j<? super T> jVar) {
            this.f14429a = atomicReference;
            this.f14430b = jVar;
        }

        @Override // q03.j
        public final void a(s03.b bVar) {
            v03.c.d(this.f14429a, bVar);
        }

        @Override // q03.j
        public final void onComplete() {
            this.f14430b.onComplete();
        }

        @Override // q03.j
        public final void onError(Throwable th3) {
            this.f14430b.onError(th3);
        }

        @Override // q03.j
        public final void onSuccess(T t7) {
            this.f14430b.onSuccess(t7);
        }
    }

    public static final class b<T> extends AtomicReference<s03.b> implements q03.d, s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.j<? super T> f14431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q03.k<T> f14432b;

        public b(q03.j<? super T> jVar, q03.k<T> kVar) {
            this.f14431a = jVar;
            this.f14432b = kVar;
        }

        @Override // q03.d
        public final void a(s03.b bVar) {
            if (v03.c.f(this, bVar)) {
                this.f14431a.a(this);
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
            this.f14432b.a(new a(this, this.f14431a));
        }

        @Override // q03.d
        public final void onError(Throwable th3) {
            this.f14431a.onError(th3);
        }
    }

    public d(q03.k<T> kVar, q03.f fVar) {
        this.f14427a = kVar;
        this.f14428b = fVar;
    }

    @Override // q03.i
    public final void c(q03.j<? super T> jVar) {
        this.f14428b.a(new b(jVar, this.f14427a));
    }
}
