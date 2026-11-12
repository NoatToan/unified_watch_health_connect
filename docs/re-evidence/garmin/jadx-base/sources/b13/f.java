package b13;

import java.util.concurrent.atomic.AtomicReference;
import q03.t;
import q03.v;

/* JADX INFO: loaded from: classes3.dex */
public final class f<T, R> extends q03.i<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.k<T> f14434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u03.f<? super T, ? extends v<? extends R>> f14435b;

    public static final class a<T, R> extends AtomicReference<s03.b> implements q03.j<T>, s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.j<? super R> f14436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u03.f<? super T, ? extends v<? extends R>> f14437b;

        public a(q03.j<? super R> jVar, u03.f<? super T, ? extends v<? extends R>> fVar) {
            this.f14436a = jVar;
            this.f14437b = fVar;
        }

        @Override // q03.j
        public final void a(s03.b bVar) {
            if (v03.c.f(this, bVar)) {
                this.f14436a.a(this);
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
            this.f14436a.onComplete();
        }

        @Override // q03.j
        public final void onError(Throwable th3) {
            this.f14436a.onError(th3);
        }

        @Override // q03.j
        public final void onSuccess(T t7) {
            try {
                v<? extends R> vVarMo330apply = this.f14437b.mo330apply(t7);
                w03.b.a(vVarMo330apply, "The mapper returned a null SingleSource");
                vVarMo330apply.a(new b(this, this.f14436a));
            } catch (Throwable th3) {
                t03.a.a(th3);
                onError(th3);
            }
        }
    }

    public static final class b<R> implements t<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReference<s03.b> f14438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q03.j<? super R> f14439b;

        public b(AtomicReference<s03.b> atomicReference, q03.j<? super R> jVar) {
            this.f14438a = atomicReference;
            this.f14439b = jVar;
        }

        @Override // q03.t
        public final void a(s03.b bVar) {
            v03.c.d(this.f14438a, bVar);
        }

        @Override // q03.t
        public final void onError(Throwable th3) {
            this.f14439b.onError(th3);
        }

        @Override // q03.t
        public final void onSuccess(R r14) {
            this.f14439b.onSuccess(r14);
        }
    }

    public f(q03.k<T> kVar, u03.f<? super T, ? extends v<? extends R>> fVar) {
        this.f14434a = kVar;
        this.f14435b = fVar;
    }

    @Override // q03.i
    public final void c(q03.j<? super R> jVar) {
        this.f14434a.a(new a(jVar, this.f14435b));
    }
}
