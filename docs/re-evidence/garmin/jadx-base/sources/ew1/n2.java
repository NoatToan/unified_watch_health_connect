package ew1;

import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n2 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o2 f66626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f66627c;

    public /* synthetic */ n2(o2 o2Var, String str, int i14) {
        this.f66625a = i14;
        this.f66626b = o2Var;
        this.f66627c = str;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        vt1.h hVar;
        int i14 = this.f66625a;
        o2 o2Var = this.f66626b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                o2.a aVar = o2.f66641d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(2076605142, new n2(o2Var, this.f66627c, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                o2.a aVar2 = o2.f66641d;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    List<vt1.h> listT5 = o2Var.w6().T5();
                    jv1.s sVarI6 = o2Var.w6().i6();
                    if (sVarI6 == null || (hVar = sVarI6.F) == null) {
                        hVar = vt1.h.NONE;
                    }
                    if (hVar == null || !listT5.contains(hVar)) {
                        hVar = vt1.h.NONE;
                    }
                    vt1.h hVar2 = hVar;
                    h4.r rVarD = c2.x2.d(h4.r.S, 1.0f);
                    boolean zR = mVar2.r(o2Var);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new ds0.g(o2Var, 23);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ds0.g(o2Var, 23);
                            mVar2.K(objQ);
                        }
                    }
                    cw1.e1.a(rVarD, this.f66627c, listT5, hVar2, (e23.l) objQ, o2Var.w6().R5(), o2Var.w6().C5("FBTSelectStrengthWorkoutTypeFragment"), o2Var.w6().Y5(), mVar2, 6, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
