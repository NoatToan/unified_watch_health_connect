package d83;

import c83.a0;
import io.reactivex.exceptions.CompositeException;
import q03.l;
import q03.p;

/* JADX INFO: loaded from: classes11.dex */
public final class c<T> extends l<a0<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c83.d<T> f58395a;

    public static final class a implements s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c83.d<?> f58396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile boolean f58397b;

        public a(c83.d<?> dVar) {
            this.f58396a = dVar;
        }

        @Override // s03.b
        public final boolean b() {
            return this.f58397b;
        }

        @Override // s03.b
        public final void dispose() {
            this.f58397b = true;
            this.f58396a.cancel();
        }
    }

    public c(c83.d<T> dVar) {
        this.f58395a = dVar;
    }

    @Override // q03.l
    public final void f(p<? super a0<T>> pVar) {
        c83.d<T> dVarM7clone = this.f58395a.m7clone();
        a aVar = new a(dVarM7clone);
        pVar.a(aVar);
        if (aVar.f58397b) {
            return;
        }
        boolean z14 = false;
        try {
            a0<T> a0VarExecute = dVarM7clone.execute();
            if (!aVar.f58397b) {
                pVar.c(a0VarExecute);
            }
            if (aVar.f58397b) {
                return;
            }
            try {
                pVar.onComplete();
            } catch (Throwable th3) {
                th = th3;
                z14 = true;
                t03.a.a(th);
                if (z14) {
                    k13.a.b(th);
                    return;
                }
                if (aVar.f58397b) {
                    return;
                }
                try {
                    pVar.onError(th);
                } catch (Throwable th4) {
                    t03.a.a(th4);
                    k13.a.b(new CompositeException(th, th4));
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
