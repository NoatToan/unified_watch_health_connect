package kq;

import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m0 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f106105b;

    public /* synthetic */ m0(o0 o0Var, int i14) {
        this.f106104a = i14;
        this.f106105b = o0Var;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f106104a;
        o0 o0Var = this.f106105b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i15 = o0.f106115f;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    o0Var.g(mVar, h82.c.f82429e);
                } else {
                    mVar.e();
                }
                break;
            default:
                h82.r rVar = (h82.r) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i16 = o0.f106115f;
                rVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    c22.x0.f23314a.getClass();
                    int i17 = (iIntValue2 << 6) & 896;
                    rVar.E(gl1.d.W(c22.x0.f23542n9), mVar2, i17);
                    rVar.m(i17, 2, gl1.d.W(c22.x0.D9), null, mVar2);
                    int i18 = (iIntValue2 << 3) & 112;
                    rVar.q(gl1.d.W(c22.x0.E9), mVar2, i18);
                    int i19 = i18 | 6;
                    rVar.j(z3.f.c(-579340989, new ix0.f(rVar, 17), mVar2), mVar2, i19);
                    rVar.j(z3.f.c(2041154554, new k41.e(19, rVar, o0Var), mVar2), mVar2, i19);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
