package yo0;

import e23.p;
import h4.r;
import p005kotlin.Unit;
import p3.x1;
import r22.u0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f198357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ub1.k f198358c;

    public /* synthetic */ e(f fVar, ub1.k kVar, int i14) {
        this.f198356a = i14;
        this.f198357b = fVar;
        this.f198358c = kVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f198356a;
        ub1.k kVar = this.f198358c;
        f fVar = this.f198357b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-556675873, new e(fVar, kVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    u0 u0Var = fVar.f198359a;
                    if (u0Var != null) {
                        u0Var.a();
                    }
                    r.a aVar = r.S;
                    boolean zR = mVar2.r(fVar);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new xn.r(fVar, 23);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new xn.r(fVar, 23);
                            mVar2.K(objQ);
                        }
                    }
                    kVar.a(6, (e23.a) objQ, aVar, mVar2);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
