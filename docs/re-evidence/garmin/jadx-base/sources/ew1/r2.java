package ew1;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import ew1.s2.d;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class r2 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s2 f66719b;

    public /* synthetic */ r2(s2 s2Var, int i14) {
        this.f66718a = i14;
        this.f66719b = s2Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0040  */
    /* JADX WARN: Code duplicated, block: B:49:0x012c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14;
        int i15;
        int i16 = this.f66718a;
        s2 s2Var = this.f66719b;
        int i17 = 1;
        switch (i16) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s2.a aVar = s2.f66742d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(498595182, new r2(s2Var, i17), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                s2.a aVar2 = s2.f66742d;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    Unit unit = Unit.INSTANCE;
                    boolean zR = mVar2.r(s2Var);
                    Object objQ = mVar2.q();
                    p3.m.a aVar3 = p3.m.f135153a;
                    if (zR) {
                        objQ = s2Var.new d(null);
                        mVar2.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = s2Var.new d(null);
                            mVar2.K(objQ);
                        }
                    }
                    p3.l0.e((e23.p) objQ, unit, mVar2);
                    p3.p1 p1VarC = p3.p0.c(s2Var.w6().M1, mVar2, 0);
                    g3 g3Var = (g3) p1VarC.getF182175a();
                    fw.p pVar = g3Var != null ? g3Var.f35300a : null;
                    int i18 = pVar == null ? -1 : s2.b.f66746b[pVar.ordinal()];
                    if (i18 == 1) {
                        mVar2.C(-1886348573);
                        mVar2.f();
                        g22.e.l(s2Var);
                    } else if (i18 == 2) {
                        mVar2.C(1652801173);
                        mVar2.f();
                        g22.e.f(s2Var);
                        g22.e.a(s2Var, null);
                    } else if (i18 != 3) {
                        mVar2.C(1655537295);
                        mVar2.f();
                    } else {
                        mVar2.C(1653045143);
                        g22.e.f(s2Var);
                        h4.r rVarD = c2.x2.d(h4.r.S, 1.0f);
                        jv1.s sVarI6 = s2Var.w6().i6();
                        tw1.k kVar = sVarI6 != null ? sVarI6.O : null;
                        g3 g3Var2 = (g3) p1VarC.getF182175a();
                        tw1.k kVar2 = g3Var2 != null ? (tw1.k) g3Var2.f35301b : null;
                        int iJ = tu1.a.j(s2Var.w6().E5(), s2Var.w6().a6(), false, s2Var.w6().Z6());
                        vt1.o oVarA6 = s2Var.w6().a6();
                        g3 g3Var3 = (g3) p1VarC.getF182175a();
                        boolean z14 = (g3Var3 != null ? (tw1.k) g3Var3.f35301b : null) != null;
                        if (s2Var.w6().f13385r1) {
                            i14 = -1886273785;
                            i15 = R.string.changes_may_require_plan_updates;
                        } else {
                            i14 = -1886271760;
                            i15 = R.string.training_level_recommendation_description;
                        }
                        String strH = sn.a.h(mVar2, i14, i15, mVar2);
                        boolean zR5 = s2Var.w6().R5();
                        int iC5 = s2Var.w6().C5("FBTSelectTrainingLevelFragment");
                        int iY5 = s2Var.w6().Y5();
                        Integer numValueOf = Integer.valueOf(iJ);
                        boolean zR2 = mVar2.r(s2Var);
                        Object objQ2 = mVar2.q();
                        if (zR2) {
                            objQ2 = new ds0.g(s2Var, 25);
                            mVar2.K(objQ2);
                        } else {
                            aVar3.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new ds0.g(s2Var, 25);
                                mVar2.K(objQ2);
                            }
                        }
                        cw1.d1.a(rVarD, kVar, kVar2, z14, strH, zR5, oVarA6, iC5, iY5, numValueOf, (e23.l) objQ2, mVar2, 6);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
