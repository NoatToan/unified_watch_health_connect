package z03;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends q03.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Callable<? extends q03.f> f200759a;

    public d(Callable<? extends q03.f> callable) {
        this.f200759a = callable;
    }

    @Override // q03.b
    public final void j(q03.d dVar) {
        try {
            q03.f fVarCall = this.f200759a.call();
            w03.b.a(fVarCall, "The completableSupplier returned a null CompletableSource");
            fVarCall.a(dVar);
        } catch (Throwable th3) {
            t03.a.a(th3);
            dVar.a(v03.d.INSTANCE);
            dVar.onError(th3);
        }
    }
}
