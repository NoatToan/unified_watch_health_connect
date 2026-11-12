package ew1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b2 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jv1.l f66333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d2 f66334c;

    public /* synthetic */ b2(jv1.l lVar, d2 d2Var, int i14) {
        this.f66332a = i14;
        this.f66333b = lVar;
        this.f66334c = d2Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    /* JADX WARN: Code duplicated, block: B:18:0x005c  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f66332a;
        d2 d2Var = this.f66334c;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                d2.a aVar = d2.f66384d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1403925662, new b2(this.f66333b, d2Var, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                d2.a aVar2 = d2.f66384d;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    boolean z14 = d2Var.w6().f13385r1;
                    boolean zR = mVar2.r(d2Var);
                    Object objQ = mVar2.q();
                    p3.m.a aVar3 = p3.m.f135153a;
                    if (zR) {
                        objQ = new e40.d(d2Var, 17);
                        mVar2.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new e40.d(d2Var, 17);
                            mVar2.K(objQ);
                        }
                    }
                    e23.a aVar4 = (e23.a) objQ;
                    boolean zR2 = mVar2.r(d2Var);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new ds0.g(d2Var, 21);
                        mVar2.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new ds0.g(d2Var, 21);
                            mVar2.K(objQ2);
                        }
                    }
                    cw1.w0.a(this.f66333b, z14, aVar4, (e23.l) objQ2, !d2Var.w6().f13385r1, d2Var.w6().C5("FBTSelectCourseFragment"), d2Var.w6().Y5(), mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
