package e13;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class b<T> extends q03.r<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Callable<? extends q03.v<? extends T>> f62297a;

    public b(Callable<? extends q03.v<? extends T>> callable) {
        this.f62297a = callable;
    }

    @Override // q03.r
    public final void i(q03.t<? super T> tVar) {
        try {
            q03.v<? extends T> vVarCall = this.f62297a.call();
            w03.b.a(vVarCall, "The singleSupplier returned a null SingleSource");
            vVarCall.a(tVar);
        } catch (Throwable th3) {
            t03.a.a(th3);
            tVar.a(v03.d.INSTANCE);
            tVar.onError(th3);
        }
    }
}
