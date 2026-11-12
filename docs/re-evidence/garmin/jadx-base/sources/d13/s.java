package d13;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class s<T, R> extends q03.l<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f57228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u03.f<? super T, ? extends q03.o<? extends R>> f57229b;

    public s(T t7, u03.f<? super T, ? extends q03.o<? extends R>> fVar) {
        this.f57228a = t7;
        this.f57229b = fVar;
    }

    @Override // q03.l
    public final void f(q03.p<? super R> pVar) {
        try {
            q03.o<? extends R> oVarMo330apply = this.f57229b.mo330apply(this.f57228a);
            w03.b.a(oVarMo330apply, "The mapper returned a null ObservableSource");
            q03.o<? extends R> oVar = oVarMo330apply;
            if (!(oVar instanceof Callable)) {
                oVar.b(pVar);
                return;
            }
            try {
                Object objCall = ((Callable) oVar).call();
                if (objCall == null) {
                    pVar.a(v03.d.INSTANCE);
                    pVar.onComplete();
                } else {
                    r rVar = new r(pVar, objCall);
                    pVar.a(rVar);
                    rVar.run();
                }
            } catch (Throwable th3) {
                t03.a.a(th3);
                pVar.a(v03.d.INSTANCE);
                pVar.onError(th3);
            }
        } catch (Throwable th4) {
            pVar.a(v03.d.INSTANCE);
            pVar.onError(th4);
        }
    }
}
