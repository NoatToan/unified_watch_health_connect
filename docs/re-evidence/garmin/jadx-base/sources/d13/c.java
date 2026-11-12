package d13;

import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes3.dex */
public final class c<T> extends q03.l<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.n<T> f57126a;

    public static final class a<T> extends AtomicReference<s03.b> implements q03.m<T>, s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.p<? super T> f57127a;

        public a(q03.p<? super T> pVar) {
            this.f57127a = pVar;
        }

        public final void a(Throwable th3) {
            if (c(th3)) {
                return;
            }
            k13.a.b(th3);
        }

        @Override // s03.b
        public final boolean b() {
            return v03.c.c(get());
        }

        public final boolean c(Throwable th3) {
            if (b()) {
                return false;
            }
            try {
                this.f57127a.onError(th3);
                return true;
            } finally {
                v03.c.a(this);
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

    public c(q03.n<T> nVar) {
        this.f57126a = nVar;
    }

    @Override // q03.l
    public final void f(q03.p<? super T> pVar) {
        a aVar = new a(pVar);
        pVar.a(aVar);
        try {
            this.f57126a.i(aVar);
        } catch (Throwable th3) {
            t03.a.a(th3);
            aVar.a(th3);
        }
    }
}
