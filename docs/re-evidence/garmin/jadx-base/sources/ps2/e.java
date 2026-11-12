package ps2;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e implements q03.u, q03.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f140474b;

    public /* synthetic */ e(n nVar, int i14) {
        this.f140473a = i14;
        this.f140474b = nVar;
    }

    @Override // q03.u
    public void c(e13.a.C1312a c1312a) {
        n nVar = this.f140474b;
        nVar.f140499b.r(new jn2.g(3, c1312a, nVar));
    }

    @Override // q03.e
    public void f(z03.c.a aVar) {
        switch (this.f140473a) {
            case 1:
                n nVar = this.f140474b;
                nVar.f140499b.y(new l(nVar, new h(nVar, aVar, 0), 1));
                break;
            default:
                n nVar2 = this.f140474b;
                hs2.d dVar = nVar2.f140499b;
                js2.b bVar = nVar2.f140507j;
                dVar.J(bVar.f100652a, bVar.f100653b, new jn2.f(aVar, 2));
                break;
        }
    }
}
