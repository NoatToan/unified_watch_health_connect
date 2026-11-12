package e13;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class i<T> extends q03.r<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Callable<? extends Throwable> f62324a;

    public i(Callable<? extends Throwable> callable) {
        this.f62324a = callable;
    }

    @Override // q03.r
    public final void i(q03.t<? super T> tVar) {
        try {
            Throwable thCall = this.f62324a.call();
            w03.b.a(thCall, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
            th = thCall;
        } catch (Throwable th3) {
            th = th3;
            t03.a.a(th);
        }
        tVar.a(v03.d.INSTANCE);
        tVar.onError(th);
    }
}
