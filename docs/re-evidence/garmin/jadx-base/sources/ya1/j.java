package ya1;

import p005kotlin.Unit;
import p3.l0;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import s1.e0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f195567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f195568b;

    public /* synthetic */ j(m mVar, int i14) {
        this.f195567a = i14;
        this.f195568b = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f195567a;
        m mVar = this.f195568b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-2113524554, new j(mVar, i15), mVar2), mVar2, 196608, 31);
                } else {
                    mVar2.e();
                }
                break;
            default:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    String str = mVar.f195572b;
                    String str2 = mVar.f195573c;
                    Object objQ = mVar3.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = p0.n(Boolean.FALSE);
                        mVar3.K(objQ);
                    }
                    p1 p1Var = (p1) objQ;
                    x3 x3VarB = s1.f.b(((Boolean) p1Var.getF182175a()).booleanValue() ? 1.0f : 0.0f, s1.l.d(1000, 0, e0.f155563d, 2), "floatAnimation", mVar3, 3072, 20);
                    Unit unit = Unit.INSTANCE;
                    Object objQ2 = mVar3.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new k(p1Var, null);
                        mVar3.K(objQ2);
                    }
                    l0.e((e23.p) objQ2, unit, mVar3);
                    g82.c cVar = g82.c.f76436a;
                    l lVar = new l(x3VarB);
                    String str3 = mVar.f195574d;
                    boolean zR = mVar3.r(mVar);
                    Object objQ3 = mVar3.q();
                    if (zR || objQ3 == c2565a) {
                        objQ3 = new xn.r(mVar, 18);
                        mVar3.K(objQ3);
                    }
                    e23.a aVar = (e23.a) objQ3;
                    boolean zR2 = mVar3.r(mVar);
                    Object objQ4 = mVar3.q();
                    if (zR2 || objQ4 == c2565a) {
                        objQ4 = new xr.a(15, mVar, p1Var);
                        mVar3.K(objQ4);
                    }
                    cVar.c(lVar, str, str2, 0, str3, aVar, null, null, true, (e23.a) objQ4, mVar3, 100663296, 200);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
