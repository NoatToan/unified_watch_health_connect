package z03;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends q03.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Callable<?> f200768a;

    public i(Callable<?> callable) {
        this.f200768a = callable;
    }

    @Override // q03.b
    public final void j(q03.d dVar) {
        s03.e eVarA = s03.c.a(w03.a.f181170a);
        dVar.a(eVarA);
        try {
            this.f200768a.call();
            if (eVarA.b()) {
                return;
            }
            dVar.onComplete();
        } catch (Throwable th3) {
            t03.a.a(th3);
            if (eVarA.b()) {
                k13.a.b(th3);
            } else {
                dVar.onError(th3);
            }
        }
    }
}
