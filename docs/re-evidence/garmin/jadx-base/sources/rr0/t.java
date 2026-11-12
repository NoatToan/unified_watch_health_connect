package rr0;

import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class t implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ir0.e f154242b;

    public /* synthetic */ t(ir0.e eVar, int i14) {
        this.f154241a = i14;
        this.f154242b = eVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f154241a;
        ir0.e eVar = this.f154242b;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    u.a(Integer.valueOf(eVar.b()), Integer.valueOf(eVar.f()), mVar, 0, 0);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    u.a(Integer.valueOf(eVar.b()), Integer.valueOf(eVar.f()), mVar, 0, 0);
                } else {
                    mVar.e();
                }
                break;
            case 2:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    a0.a(or0.p.c(eVar), or0.p.b(eVar), mVar, 64);
                } else {
                    mVar.e();
                }
                break;
            case 3:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    int iH = eVar.h();
                    int i15 = eVar.i();
                    if (iH == 0 && i15 == 0) {
                        mVar.C(-1760328594);
                        mVar.f();
                    } else {
                        mVar.C(-1760408357);
                        y.c(Integer.valueOf(iH), Integer.valueOf(i15), mVar, 0);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            case 4:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    a0.a(or0.p.c(eVar), or0.p.b(eVar), mVar, 64);
                } else {
                    mVar.e();
                }
                break;
            default:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    if (eVar == null || !eVar.m()) {
                        mVar.C(376041928);
                        mVar.f();
                    } else {
                        mVar.C(375919881);
                        y.c(Integer.valueOf(eVar.h()), Integer.valueOf(eVar.i()), mVar, 0);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
