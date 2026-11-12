package z03;

import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends q03.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.e f200757a;

    public static final class a extends AtomicReference<s03.b> implements q03.c, s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.d f200758a;

        public a(q03.d dVar) {
            this.f200758a = dVar;
        }

        public final void a() {
            s03.b andSet;
            s03.b bVar = get();
            v03.c cVar = v03.c.DISPOSED;
            if (bVar == cVar || (andSet = getAndSet(cVar)) == cVar) {
                return;
            }
            try {
                this.f200758a.onComplete();
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

        public final void c(Throwable th3) {
            if (d(th3)) {
                return;
            }
            k13.a.b(th3);
        }

        public final boolean d(Throwable th3) {
            s03.b andSet;
            if (th3 == null) {
                th3 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            s03.b bVar = get();
            v03.c cVar = v03.c.DISPOSED;
            if (bVar == cVar || (andSet = getAndSet(cVar)) == cVar) {
                return false;
            }
            try {
                this.f200758a.onError(th3);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // s03.b
        public final void dispose() {
            v03.c.a(this);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return com.nimbusds.jose.shaded.gson.internal.a.h(a.class.getSimpleName(), "{", super.toString(), StringSubstitutor.DEFAULT_VAR_END);
        }
    }

    public c(q03.e eVar) {
        this.f200757a = eVar;
    }

    @Override // q03.b
    public final void j(q03.d dVar) {
        a aVar = new a(dVar);
        dVar.a(aVar);
        try {
            this.f200757a.f(aVar);
        } catch (Throwable th3) {
            t03.a.a(th3);
            aVar.c(th3);
        }
    }
}
