package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bah<T, R> implements p4h.a<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p4h.a<T> f3987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p4h.b<? extends R, ? super T> f3988b;

    public bah(p4h.a<T> aVar, p4h.b<? extends R, ? super T> bVar) {
        this.f3987a = aVar;
        this.f3988b = bVar;
    }

    @Override // defpackage.tc0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(xno<? super R> xnoVar) {
        try {
            xno<? super T> xnoVarCall = p5l.i(this.f3988b).call(xnoVar);
            try {
                xnoVarCall.onStart();
                this.f3987a.call(xnoVarCall);
            } catch (Throwable th) {
                pf8.d(th);
                xnoVarCall.onError(th);
            }
        } catch (Throwable th2) {
            pf8.d(th2);
            xnoVar.onError(th2);
        }
    }
}
