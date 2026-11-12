package d83;

import c83.a0;
import io.reactivex.exceptions.CompositeException;
import q03.l;
import q03.p;

/* JADX INFO: loaded from: classes11.dex */
public final class b<T> extends l<a0<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c83.d<T> f58390a;

    public static final class a<T> implements s03.b, c83.f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c83.d<?> f58391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p<? super a0<T>> f58392b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile boolean f58393c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f58394d = false;

        public a(c83.d<?> dVar, p<? super a0<T>> pVar) {
            this.f58391a = dVar;
            this.f58392b = pVar;
        }

        @Override // c83.f
        public final void a(c83.d<T> dVar, Throwable th3) {
            if (dVar.isCanceled()) {
                return;
            }
            try {
                this.f58392b.onError(th3);
            } catch (Throwable th4) {
                t03.a.a(th4);
                k13.a.b(new CompositeException(th3, th4));
            }
        }

        @Override // s03.b
        public final boolean b() {
            return this.f58393c;
        }

        @Override // c83.f
        public final void c(c83.d<T> dVar, a0<T> a0Var) {
            if (this.f58393c) {
                return;
            }
            try {
                this.f58392b.c(a0Var);
                if (this.f58393c) {
                    return;
                }
                this.f58394d = true;
                this.f58392b.onComplete();
            } catch (Throwable th3) {
                t03.a.a(th3);
                if (this.f58394d) {
                    k13.a.b(th3);
                    return;
                }
                if (this.f58393c) {
                    return;
                }
                try {
                    this.f58392b.onError(th3);
                } catch (Throwable th4) {
                    t03.a.a(th4);
                    k13.a.b(new CompositeException(th3, th4));
                }
            }
        }

        @Override // s03.b
        public final void dispose() {
            this.f58393c = true;
            this.f58391a.cancel();
        }
    }

    public b(c83.d<T> dVar) {
        this.f58390a = dVar;
    }

    @Override // q03.l
    public final void f(p<? super a0<T>> pVar) {
        c83.d<T> dVarM7clone = this.f58390a.m7clone();
        a aVar = new a(dVarM7clone, pVar);
        pVar.a(aVar);
        if (aVar.f58393c) {
            return;
        }
        dVarM7clone.q0(aVar);
    }
}
