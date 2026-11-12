package ew1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1 f66331b;

    public /* synthetic */ b1(c1 c1Var, int i14) {
        this.f66330a = i14;
        this.f66331b = c1Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = 1;
        switch (this.f66330a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                c1.a aVar = c1.f66352d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1159503378, new b1(this.f66331b, i14), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                c1.a aVar2 = c1.f66352d;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    c1 c1Var = this.f66331b;
                    jv1.s sVar = (jv1.s) o53.f0.G(c1Var.y6().j6(), mVar2).getF182175a();
                    vt1.j jVar = sVar != null ? sVar.f101147z : null;
                    boolean zR5 = c1Var.y6().R5();
                    int iC5 = c1Var.y6().C5("FBTItpPlanTypeSelectionFragmentCompose");
                    int iY5 = c1Var.y6().Y5();
                    boolean zR = mVar2.r(c1Var);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new ds0.g(c1Var, 18);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ds0.g(c1Var, 18);
                            mVar2.K(objQ);
                        }
                    }
                    c1Var.w6(null, jVar, zR5, iC5, iY5, (e23.l) objQ, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
