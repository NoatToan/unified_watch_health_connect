package ew1;

import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class z0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f66881b;

    public /* synthetic */ z0(a1 a1Var, int i14) {
        this.f66880a = i14;
        this.f66881b = a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0084  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        List<tw1.d> listI;
        tw1.c cVar;
        int i14 = 1;
        switch (this.f66880a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                a1.a aVar = a1.f66302e;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(531987888, new z0(this.f66881b, i14), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                a1.a aVar2 = a1.f66302e;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    a1 a1Var = this.f66881b;
                    p3.p1 p1VarG = o53.f0.G(a1Var.z6().j6(), mVar2);
                    jv1.s sVar = (jv1.s) p1VarG.getF182175a();
                    if (sVar == null || (cVar = sVar.f101131j) == null || (listI = cVar.i()) == null) {
                        listI = p13.j0.f134944a;
                    }
                    List<tw1.d> list = listI;
                    jv1.s sVar2 = (jv1.s) p1VarG.getF182175a();
                    tw1.d dVar = sVar2 != null ? sVar2.A : null;
                    boolean zR5 = a1Var.z6().R5();
                    int iC5 = a1Var.z6().C5("FBTItpHoursPerWeekSelectionFragmentCompose");
                    int iY5 = a1Var.z6().Y5();
                    boolean zR = mVar2.r(a1Var);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new ds0.g(a1Var, 17);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ds0.g(a1Var, 17);
                            mVar2.K(objQ);
                        }
                    }
                    a1Var.w6(null, list, dVar, zR5, iC5, iY5, (e23.l) objQ, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
