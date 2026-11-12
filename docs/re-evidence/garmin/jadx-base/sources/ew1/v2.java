package ew1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class v2 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x2 f66803b;

    public /* synthetic */ v2(x2 x2Var, int i14) {
        this.f66802a = i14;
        this.f66803b = x2Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004a  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = 1;
        switch (this.f66802a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                x2.a aVar = x2.f66834d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1312211236, new v2(this.f66803b, i14), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                x2.a aVar2 = x2.f66834d;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    x2 x2Var = this.f66803b;
                    aw1.h hVarY6 = x2Var.y6();
                    boolean zR5 = x2Var.y6().R5();
                    boolean z14 = !x2Var.y6().f13385r1;
                    boolean zR = mVar2.r(x2Var);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new ds0.g(x2Var, 26);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ds0.g(x2Var, 26);
                            mVar2.K(objQ);
                        }
                    }
                    x2Var.w6(hVarY6, zR5, z14, (e23.l) objQ, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
