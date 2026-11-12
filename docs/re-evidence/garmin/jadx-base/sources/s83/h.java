package s83;

import j83.n;

/* JADX INFO: loaded from: classes11.dex */
public class h implements j83.e.a<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n83.d f157964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f157965b;

    public h(i iVar, n83.d dVar) {
        this.f157965b = iVar;
        this.f157964a = dVar;
    }

    @Override // n83.b
    public final void call(Object obj) {
        n nVar = (n) obj;
        j83.e eVar = (j83.e) this.f157964a.call(this.f157965b.f157967b);
        if (!(eVar instanceof i)) {
            eVar.f(new u83.c(nVar, nVar));
        } else {
            T t7 = ((i) eVar).f157967b;
            nVar.i(i.f157966c ? new p83.b(nVar, t7) : new i.d(nVar, t7));
        }
    }
}
