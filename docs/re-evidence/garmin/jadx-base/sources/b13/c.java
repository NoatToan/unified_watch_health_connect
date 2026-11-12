package b13;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class c<T> extends q03.i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Callable<? extends q03.k<? extends T>> f14426a;

    public c(Callable<? extends q03.k<? extends T>> callable) {
        this.f14426a = callable;
    }

    @Override // q03.i
    public final void c(q03.j<? super T> jVar) {
        try {
            q03.k<? extends T> kVarCall = this.f14426a.call();
            w03.b.a(kVarCall, "The maybeSupplier returned a null MaybeSource");
            kVarCall.a(jVar);
        } catch (Throwable th3) {
            t03.a.a(th3);
            jVar.a(v03.d.INSTANCE);
            jVar.onError(th3);
        }
    }
}
