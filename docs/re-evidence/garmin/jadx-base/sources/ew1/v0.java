package ew1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class v0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f66798b;

    public /* synthetic */ v0(w0 w0Var, int i14) {
        this.f66797a = i14;
        this.f66798b = w0Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0050  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f66797a;
        w0 w0Var = this.f66798b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                w0.a aVar = w0.f66806d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-2078648640, new v0(w0Var, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                w0.a aVar2 = w0.f66806d;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    jv1.s sVarI6 = w0Var.w6().i6();
                    hv1.e eVar = sVarI6 != null ? sVarI6.M : null;
                    boolean zD7 = w0Var.w6().d7();
                    boolean zR = mVar2.r(w0Var);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new ds0.g(w0Var, 15);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ds0.g(w0Var, 15);
                            mVar2.K(objQ);
                        }
                    }
                    cw1.o0.a(eVar, zD7, (e23.l) objQ, !w0Var.w6().f13385r1, w0Var.w6().C5("FBTHillTypeFragment"), w0Var.w6().Y5(), mVar2, 0, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
