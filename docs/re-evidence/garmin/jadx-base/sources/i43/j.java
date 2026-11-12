package i43;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o43.j<l> f91056b;

    public j(o43.n nVar, e23.a<? extends l> aVar) {
        nVar.getClass();
        aVar.getClass();
        this.f91056b = nVar.g(new i(aVar));
    }

    @Override // i43.a
    public final l i() {
        return this.f91056b.invoke();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(e23.a<? extends l> aVar) {
        this(null, aVar, 1, 0 == true ? 1 : 0);
        aVar.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ j(o43.n nVar, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            nVar = o43.e.f129095e;
            nVar.getClass();
        }
        this(nVar, aVar);
    }
}
