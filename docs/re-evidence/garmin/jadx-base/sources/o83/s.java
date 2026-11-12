package o83;

/* JADX INFO: loaded from: classes11.dex */
public final class s<T> implements j83.e.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83.l.b<T> f130957a;

    public s(j83.l.b<T> bVar) {
        this.f130957a = bVar;
    }

    @Override // n83.b
    public final void call(Object obj) {
        j83.n nVar = (j83.n) obj;
        p pVar = new p(nVar);
        nVar.b(pVar);
        this.f130957a.call(pVar);
    }
}
