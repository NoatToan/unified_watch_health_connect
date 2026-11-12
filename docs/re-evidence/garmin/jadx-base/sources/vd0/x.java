package vd0;

import c2.x2;
import i3.i7;
import i3.mh;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class x implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pe0.g f177428b;

    public /* synthetic */ x(pe0.g gVar, int i14) {
        this.f177427a = i14;
        this.f177428b = gVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f177427a;
        pe0.g gVar = this.f177428b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    String strT = gl1.d.T(gVar.f137440a, mVar, 0);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB = d92.c.b(j92.f.f97932i, mVar);
                    d6.h.f57752b.getClass();
                    mh.c(strT, rVarF, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57757g), 0L, 0, false, 0, 0, null, x0VarB, mVar, 48, 0, 130044);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    String strT2 = gl1.d.T(gVar.f137440a, mVar2, 0);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0Var = j92.f.f97933j;
                    long jA = zl.a.a(mVar2);
                    h4.r.a aVar = h4.r.S;
                    d92.b.f58625c.getClass();
                    mh.c(strT2, c2.l.C(aVar, 0.0f, 0.0f, j92.b.f97899b.f97918c, 0.0f, 11), jA, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, mVar2, 0, 0, 131064);
                    h4.r rVarQ = x2.q(aVar, j92.b.f97901d.f97903b);
                    s62.a.f157643a.getClass();
                    i7.b(v62.h1.a(t62.b.f162798a), null, rVarQ, lc.u0.f(mVar2), mVar2, 48, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
