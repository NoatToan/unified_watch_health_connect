package vd0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.c f177194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f177195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f177196d;

    public /* synthetic */ d0(i53.c cVar, e23.a aVar, e23.l lVar, int i14) {
        this.f177193a = i14;
        this.f177194b = cVar;
        this.f177196d = aVar;
        this.f177195c = lVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        e2.f0 f0Var = (e2.f0) obj;
        switch (this.f177193a) {
            case 0:
                f0Var.getClass();
                i0 i0Var = i0.f177291a;
                i53.c cVar = this.f177194b;
                f0Var.a(cVar.size(), null, new j0(i0Var, cVar), new z3.e(802480018, true, new k0(cVar, this.f177195c)));
                e2.f0.b(f0Var, null, new z3.e(1832198806, true, new ak0.p(this.f177196d, 25)), 3);
                break;
            case 1:
                f0Var.getClass();
                wv0.i.b bVar = wv0.i.b.f187405a;
                i53.c cVar2 = this.f177194b;
                f0Var.a(cVar2.size(), null, new wv0.i.c(bVar, cVar2), new z3.e(802480018, true, new wv0.i.d(cVar2, this.f177195c)));
                e2.f0.b(f0Var, null, new z3.e(-1177649105, true, new ak0.p(this.f177196d, 26)), 3);
                break;
            case 2:
                f0Var.getClass();
                e2.f0.b(f0Var, null, new z3.e(-443272557, true, new ak0.p(this.f177196d, 29)), 3);
                wv0.i.j jVar = wv0.i.j.f187419a;
                i53.c cVar3 = this.f177194b;
                f0Var.a(cVar3.size(), null, new wv0.i.k(jVar, cVar3), new z3.e(802480018, true, new wv0.i.l(cVar3, this.f177195c)));
                break;
            default:
                f0Var.getClass();
                i53.c cVar4 = this.f177194b;
                e2.f0.e(f0Var, -1, new z3.e(-1920698818, true, new o72.m1(24, cVar4, this.f177196d)), 2);
                f0Var.a(cVar4.size(), new zs1.g(new z81.b(27), cVar4), new zs1.h(zs1.f.f206861a, cVar4), new z3.e(802480018, true, new zs1.i(cVar4, this.f177195c)));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ d0(i53.c cVar, e23.l lVar, e23.a aVar, int i14) {
        this.f177193a = i14;
        this.f177194b = cVar;
        this.f177195c = lVar;
        this.f177196d = aVar;
    }
}
