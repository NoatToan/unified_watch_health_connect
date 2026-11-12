package ew1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class t1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w1 f66768b;

    public /* synthetic */ t1(w1 w1Var, int i14) {
        this.f66767a = i14;
        this.f66768b = w1Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004a  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = 1;
        switch (this.f66767a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                w1.a aVar = w1.f66814e;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(930114646, new t1(this.f66768b, i14), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                w1.a aVar2 = w1.f66814e;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    w1 w1Var = this.f66768b;
                    aw1.h hVarY6 = w1Var.y6();
                    boolean zR5 = w1Var.y6().R5();
                    boolean z14 = !w1Var.y6().f13385r1;
                    boolean zR = mVar2.r(w1Var);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new ds0.g(w1Var, 20);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ds0.g(w1Var, 20);
                            mVar2.K(objQ);
                        }
                    }
                    w1Var.w6(hVarY6, zR5, z14, (e23.l) objQ, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
