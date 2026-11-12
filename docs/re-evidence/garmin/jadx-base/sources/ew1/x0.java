package ew1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class x0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0 f66831b;

    public /* synthetic */ x0(y0 y0Var, int i14) {
        this.f66830a = i14;
        this.f66831b = y0Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0072  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f66830a;
        y0 y0Var = this.f66831b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                y0.a aVar = y0.f66855c;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1341447296, new x0(y0Var, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                y0.a aVar2 = y0.f66855c;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    int iC5 = y0Var.u6().C5("FBTHowToEndPlanFragment");
                    int iY5 = y0Var.u6().Y5();
                    h4.r rVarC = c2.x2.c(c2.x2.f(h4.r.S, 1.0f), 1.0f);
                    jv1.s sVar = (jv1.s) y0Var.u6().j6().d();
                    jv1.x xVar = sVar != null ? sVar.E : null;
                    boolean zR5 = y0Var.u6().R5();
                    boolean zR = mVar2.r(y0Var);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new ds0.g(y0Var, 16);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ds0.g(y0Var, 16);
                            mVar2.K(objQ);
                        }
                    }
                    cw1.i0.a(rVarC, xVar, zR5, iC5, iY5, (e23.l) objQ, mVar2, 6);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
