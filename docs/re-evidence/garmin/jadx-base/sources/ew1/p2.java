package ew1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p2 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q2 f66663b;

    public /* synthetic */ p2(q2 q2Var, int i14) {
        this.f66662a = i14;
        this.f66663b = q2Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0098  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f66662a;
        q2 q2Var = this.f66663b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                q2.a aVar = q2.f66691d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1372903614, new p2(q2Var, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                q2.a aVar2 = q2.f66691d;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    Double dF6 = q2Var.w6().f6();
                    double dDoubleValue = dF6 != null ? dF6.doubleValue() : 0.0d;
                    boolean zN = tu1.a.n(q2Var.w6().f13389v1, dDoubleValue);
                    m52.i iVarK = zN ? m52.i.HALF_IRON : tu1.a.k(q2Var.w6().f13389v1, dDoubleValue);
                    hv1.i iVarX5 = (zN && q2Var.w6().X5() == hv1.i.NOVICE) ? null : q2Var.w6().X5();
                    int iC5 = q2Var.w6().C5("FBTSelectSwimAbilityFragment");
                    int iY5 = q2Var.w6().Y5();
                    boolean zR5 = q2Var.w6().R5();
                    boolean zR = mVar2.r(q2Var);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new ds0.g(q2Var, 24);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ds0.g(q2Var, 24);
                            mVar2.K(objQ);
                        }
                    }
                    cw1.x0.b(null, iVarX5, zR5, iC5, iY5, iVarK, (e23.l) objQ, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
