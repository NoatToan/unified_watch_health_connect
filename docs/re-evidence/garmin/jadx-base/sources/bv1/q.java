package bv1;

import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f21429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jv1.n f21430c;

    public /* synthetic */ q(r rVar, jv1.n nVar, int i14) {
        this.f21428a = i14;
        this.f21429b = rVar;
        this.f21430c = nVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0062  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i14 = this.f21428a;
        jv1.n nVar = this.f21430c;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1336631600, new q(this.f21429b, nVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    h4.r rVarC = c2.l.C(c2.l.A(aVar, eVar.f97920e, 0.0f, 2), 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
                    boolean z14 = nVar.f101094p;
                    boolean zR = mVar2.r(nVar);
                    r rVar = this.f21429b;
                    boolean zR2 = zR | mVar2.r(rVar);
                    Object objQ = mVar2.q();
                    if (zR2) {
                        objQ = new bb0.d(9, nVar, rVar);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new bb0.d(9, nVar, rVar);
                            mVar2.K(objQ);
                        }
                    }
                    rVar.c(0, (e23.a) objQ, rVarC, mVar2, z14);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
