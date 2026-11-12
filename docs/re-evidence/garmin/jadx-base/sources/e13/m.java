package e13;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class m<T> extends q03.r<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Callable<? extends T> f62341a;

    public m(Callable<? extends T> callable) {
        this.f62341a = callable;
    }

    @Override // q03.r
    public final void i(q03.t<? super T> tVar) {
        s03.e eVarA = s03.c.a(w03.a.f181170a);
        tVar.a(eVarA);
        if (eVarA.b()) {
            return;
        }
        try {
            T tCall = this.f62341a.call();
            w03.b.a(tCall, "The callable returned a null value");
            if (eVarA.b()) {
                return;
            }
            tVar.onSuccess(tCall);
        } catch (Throwable th3) {
            t03.a.a(th3);
            if (eVarA.b()) {
                k13.a.b(th3);
            } else {
                tVar.onError(th3);
            }
        }
    }
}
