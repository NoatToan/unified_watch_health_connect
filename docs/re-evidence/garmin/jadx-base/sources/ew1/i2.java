package ew1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i2 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j2 f66525b;

    public /* synthetic */ i2(j2 j2Var, int i14) {
        this.f66524a = i14;
        this.f66525b = j2Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = 1;
        switch (this.f66524a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                j2.a aVar = j2.f66533d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1963500224, new i2(this.f66525b, i14), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                j2 j2Var = this.f66525b;
                androidx.lifecycle.w1 w1Var = j2Var.f66534b;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                j2.a aVar2 = j2.f66533d;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    jv1.s sVar = (jv1.s) o53.f0.G(((aw1.h) w1Var.getValue()).j6(), mVar2).getF182175a();
                    vt1.e eVar = sVar != null ? sVar.f101122a : null;
                    int iC5 = ((aw1.h) w1Var.getValue()).C5("FBTSelectPlanTypeFragment");
                    int iY5 = ((aw1.h) w1Var.getValue()).Y5();
                    boolean zR = mVar2.r(j2Var);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new ds0.g(j2Var, 22);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ds0.g(j2Var, 22);
                            mVar2.K(objQ);
                        }
                    }
                    j2Var.w6(null, eVar, iC5, iY5, (e23.l) objQ, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
