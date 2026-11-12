package ew1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class x1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2 f66833b;

    public /* synthetic */ x1(a2 a2Var, int i14) {
        this.f66832a = i14;
        this.f66833b = a2Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:41:0x011d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f66832a;
        a2 a2Var = this.f66833b;
        int i15 = 2;
        int i16 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                a2.a aVar = a2.f66311e;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1274381561, new x1(a2Var, i16), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                a2.a aVar2 = a2.f66311e;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    a2 a2Var2 = this.f66833b;
                    aw1.h hVarY6 = a2Var2.y6();
                    boolean zR5 = a2Var2.y6().R5();
                    boolean z14 = !a2Var2.y6().f13385r1;
                    boolean zR = mVar2.r(a2Var2);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new x1(a2Var2, i15);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new x1(a2Var2, i15);
                            mVar2.K(objQ);
                        }
                    }
                    a2Var2.w6(hVarY6, zR5, z14, (e23.p) objQ, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
            default:
                hv1.j jVar = (hv1.j) obj;
                Integer num = (Integer) obj2;
                num.getClass();
                a2.a aVar3 = a2.f66311e;
                jVar.getClass();
                fy1.c.f73884a.getClass();
                fy1.c.b("GarminCoachTrainingHistorySelected");
                a2Var.y6().I7(jVar);
                a2Var.y6().H7(num);
                if (a2Var.y6().d7() && a2Var.y6().Q6()) {
                    jv1.h hVarE5 = a2Var.y6().E5();
                    if (hVarE5 instanceof jv1.g) {
                        tu1.i.f166483a.getClass();
                        o13.p pVarM = tu1.i.a.m(a2Var.y6().b7(), (jv1.g) hVarE5);
                        boolean zBooleanValue = ((Boolean) pVarM.f128594a).booleanValue();
                        vt1.n nVar = (vt1.n) pVarM.f128595b;
                        if (zBooleanValue) {
                            a2Var.y6().j5(nVar, true, true);
                        } else {
                            a2Var.y6().i7();
                        }
                    } else if (!(hVarE5 instanceof jv1.i) && a2Var.y6().N6()) {
                        a2Var.y6().s6().j("FBTSelectDistanceOrTimeFragmentCompose");
                    } else {
                        a2Var.y6().i7();
                    }
                } else if (a2Var.y6().N6()) {
                    a2Var.y6().s6().j("FBTSelectDistanceOrTimeFragmentCompose");
                } else {
                    aw1.h hVarY7 = a2Var.y6();
                    if (!hVarY7.d7() || hVarY7.Q6()) {
                        a2Var.y6().i7();
                    } else {
                        a2Var.y6().s6().j("FBTSelectDistanceOrTimeFragmentCompose");
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
