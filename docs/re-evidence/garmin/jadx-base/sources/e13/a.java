package e13;

import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes3.dex */
public final class a<T> extends q03.r<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.u<T> f62295a;

    /* JADX INFO: renamed from: e13.a$a, reason: collision with other inner class name */
    public static final class C1312a<T> extends AtomicReference<s03.b> implements q03.s<T>, s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.t<? super T> f62296a;

        public C1312a(q03.t<? super T> tVar) {
            this.f62296a = tVar;
        }

        public final void a(Throwable th3) {
            s03.b andSet;
            Throwable nullPointerException = th3 == null ? new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.") : th3;
            s03.b bVar = get();
            v03.c cVar = v03.c.DISPOSED;
            if (bVar == cVar || (andSet = getAndSet(cVar)) == cVar) {
                k13.a.b(th3);
                return;
            }
            try {
                this.f62296a.onError(nullPointerException);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // s03.b
        public final boolean b() {
            return v03.c.c(get());
        }

        public final void c(T t7) {
            s03.b andSet;
            s03.b bVar = get();
            v03.c cVar = v03.c.DISPOSED;
            if (bVar == cVar || (andSet = getAndSet(cVar)) == cVar) {
                return;
            }
            q03.t<? super T> tVar = this.f62296a;
            try {
                if (t7 == null) {
                    tVar.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    tVar.onSuccess(t7);
                }
                if (andSet != null) {
                    andSet.dispose();
                }
            } catch (Throwable th3) {
                if (andSet != null) {
                    andSet.dispose();
                }
                throw th3;
            }
        }

        @Override // s03.b
        public final void dispose() {
            v03.c.a(this);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return com.nimbusds.jose.shaded.gson.internal.a.h(C1312a.class.getSimpleName(), "{", super.toString(), StringSubstitutor.DEFAULT_VAR_END);
        }
    }

    public a(q03.u<T> uVar) {
        this.f62295a = uVar;
    }

    @Override // q03.r
    public final void i(q03.t<? super T> tVar) {
        C1312a c1312a = new C1312a(tVar);
        tVar.a(c1312a);
        try {
            this.f62295a.c(c1312a);
        } catch (Throwable th3) {
            t03.a.a(th3);
            c1312a.a(th3);
        }
    }
}
