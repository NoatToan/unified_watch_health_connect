package ew1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l2 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m2 f66568b;

    public /* synthetic */ l2(m2 m2Var, int i14) {
        this.f66567a = i14;
        this.f66568b = m2Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ab  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f66567a;
        m2 m2Var = this.f66568b;
        int i15 = 2;
        int i16 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m2.a aVar = m2.f66581d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-2013381751, new l2(m2Var, i16), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                m2.a aVar2 = m2.f66581d;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    m2 m2Var2 = this.f66568b;
                    p3.p1 p1VarG = o53.f0.G(m2Var2.A6().j6(), mVar2);
                    jv1.s sVar = (jv1.s) p1VarG.getF182175a();
                    vt1.o oVar = sVar != null ? sVar.f101125d : null;
                    jv1.s sVar2 = (jv1.s) p1VarG.getF182175a();
                    vt1.d dVar = sVar2 != null ? sVar2.f101126e : null;
                    boolean zR5 = m2Var2.A6().R5();
                    int iC5 = m2Var2.A6().C5("FBTSelectSportFragmentCompose");
                    int iY5 = m2Var2.A6().Y5();
                    boolean zR = mVar2.r(m2Var2);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new l2(m2Var2, i15);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new l2(m2Var2, i15);
                            mVar2.K(objQ);
                        }
                    }
                    m2Var2.y6(null, oVar, dVar, zR5, iC5, iY5, (e23.p) objQ, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
            default:
                vt1.o oVar2 = (vt1.o) obj;
                m2.a aVar3 = m2.f66581d;
                fy1.c.f73884a.getClass();
                fy1.c.b("GarminCoachSportTypeSelected");
                m2Var.A6().S7(oVar2, (vt1.d) obj2);
                if ((oVar2 == null ? -1 : m2.b.f66584a[oVar2.ordinal()]) == 1) {
                    m2Var.A6().s6().j("FBTRideWeeklyAvgHoursFragCompose");
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
