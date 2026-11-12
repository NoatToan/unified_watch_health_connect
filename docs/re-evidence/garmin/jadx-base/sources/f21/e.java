package f21;

import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.f f68510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g21.n f68511c;

    public /* synthetic */ e(i53.f fVar, g21.n nVar, int i14) {
        this.f68509a = i14;
        this.f68510b = fVar;
        this.f68511c = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f68509a;
        d82.a aVar = null;
        g21.n nVar = this.f68511c;
        i53.f fVar = this.f68510b;
        float fFloatValue = ((Float) obj).floatValue();
        p3.m mVar = (p3.m) obj2;
        ((Integer) obj3).getClass();
        switch (i14) {
            case 0:
                mVar.C(1730149209);
                x1 x1Var = p3.n.f135158a;
                Double dL = l0.l((g21.z) fVar.get((int) fFloatValue), nVar);
                if (dL == null) {
                    mVar.C(-1027199461);
                    mVar.f();
                } else {
                    mVar.C(-1027199460);
                    double dDoubleValue = dL.doubleValue();
                    g21.n.f75455a.getClass();
                    aVar = new d82.a(g21.n.a.c(nVar, mVar), new d02.a().a(dDoubleValue), new j82.g.a(g21.n.a.b(nVar, mVar), null), g21.n.a.d(nVar, mVar));
                    mVar.f();
                }
                mVar.f();
                break;
            case 1:
                mVar.C(-366978765);
                x1 x1Var2 = p3.n.f135158a;
                Double dL2 = l0.l((g21.z) fVar.get((int) fFloatValue), nVar);
                if (dL2 == null) {
                    mVar.C(-1972398051);
                    mVar.f();
                } else {
                    mVar.C(-1972398050);
                    double dDoubleValue2 = dL2.doubleValue();
                    g21.n.f75455a.getClass();
                    aVar = new d82.a(g21.n.a.c(nVar, mVar), new d02.a().a(dDoubleValue2), new j82.g.a(g21.n.a.b(nVar, mVar), null), g21.n.a.d(nVar, mVar));
                    mVar.f();
                }
                mVar.f();
                break;
            case 2:
                mVar.C(-664339115);
                x1 x1Var3 = p3.n.f135158a;
                Double dK = l0.k((g21.b) fVar.get((int) fFloatValue), nVar);
                if (dK == null) {
                    mVar.C(-117037412);
                    mVar.f();
                } else {
                    mVar.C(-117037411);
                    double dDoubleValue3 = dK.doubleValue();
                    g21.n.f75455a.getClass();
                    aVar = new d82.a(g21.n.a.a(nVar, mVar), new d02.a().a(dDoubleValue3), new j82.g.a(g21.n.a.b(nVar, mVar), null), g21.n.a.d(nVar, mVar));
                    mVar.f();
                }
                mVar.f();
                break;
            default:
                mVar.C(530688571);
                x1 x1Var4 = p3.n.f135158a;
                Double dK2 = l0.k((g21.b) fVar.get((int) fFloatValue), nVar);
                if (dK2 == null) {
                    mVar.C(-31173102);
                    mVar.f();
                } else {
                    mVar.C(-31173101);
                    double dDoubleValue4 = dK2.doubleValue();
                    g21.n.f75455a.getClass();
                    aVar = new d82.a(g21.n.a.a(nVar, mVar), new d02.a().a(dDoubleValue4), new j82.g.a(g21.n.a.b(nVar, mVar), null), g21.n.a.d(nVar, mVar));
                    mVar.f();
                }
                mVar.f();
                break;
        }
        return aVar;
    }
}
