package o83;

/* JADX INFO: loaded from: classes11.dex */
public final class h<T, R> implements j83.e.a<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83.e.a<T> f130880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j83.e.b<? extends R, ? super T> f130881b;

    public h(j83.e.a<T> aVar, j83.e.b<? extends R, ? super T> bVar) {
        this.f130880a = aVar;
        this.f130881b = bVar;
    }

    @Override // n83.b
    public final void call(Object obj) {
        j83.n nVar = (j83.n) obj;
        try {
            j83.e.b<? extends R, ? super T> bVar = this.f130881b;
            v83.r rVar = v83.s.f176269n;
            if (rVar != null) {
                bVar = (j83.e.b) rVar.call(bVar);
            }
            j83.n nVar2 = (j83.n) bVar.call(nVar);
            try {
                nVar2.g();
                this.f130880a.call(nVar2);
            } catch (Throwable th3) {
                m83.a.b(th3);
                nVar2.onError(th3);
            }
        } catch (Throwable th4) {
            m83.a.b(th4);
            nVar.onError(th4);
        }
    }
}
