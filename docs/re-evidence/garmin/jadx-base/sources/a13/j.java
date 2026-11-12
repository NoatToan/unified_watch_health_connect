package a13;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class j<T, R> extends q03.g<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u03.f<? super T, ? extends b83.a<? extends R>> f452c;

    public j(T t7, u03.f<? super T, ? extends b83.a<? extends R>> fVar) {
        this.f451b = t7;
        this.f452c = fVar;
    }

    @Override // q03.g
    public final void c(q03.h hVar) {
        try {
            b83.a<? extends R> aVarMo330apply = this.f452c.mo330apply(this.f451b);
            w03.b.a(aVarMo330apply, "The mapper returned a null Publisher");
            b83.a<? extends R> aVar = aVarMo330apply;
            if (!(aVar instanceof Callable)) {
                aVar.a(hVar);
                return;
            }
            try {
                Object objCall = ((Callable) aVar).call();
                if (objCall != null) {
                    hVar.d(new h13.d(hVar, objCall));
                } else {
                    hVar.d(h13.c.INSTANCE);
                    hVar.onComplete();
                }
            } catch (Throwable th3) {
                t03.a.a(th3);
                hVar.d(h13.c.INSTANCE);
                hVar.onError(th3);
            }
        } catch (Throwable th4) {
            hVar.d(h13.c.INSTANCE);
            hVar.onError(th4);
        }
    }
}
