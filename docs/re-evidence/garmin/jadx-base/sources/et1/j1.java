package et1;

import c2.x2;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j1 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pt1.a f65669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f65670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ je2.b f65671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f65672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.l f65673f;

    public /* synthetic */ j1(pt1.a aVar, e23.l lVar, je2.b bVar, e23.l lVar2, e23.l lVar3, int i14) {
        this.f65668a = i14;
        this.f65669b = aVar;
        this.f65670c = lVar;
        this.f65671d = bVar;
        this.f65672e = lVar2;
        this.f65673f = lVar3;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f6  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f65668a;
        p3.m.a aVar = p3.m.f135153a;
        switch (i14) {
            case 0:
                c2.w wVar = (c2.w) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                wVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(wVar) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    float fG = wVar.g() * 0.6f;
                    g6.f.a aVar2 = g6.f.f75994b;
                    h4.r rVarJ = x2.j(rVarF, 0.0f, fG, 1);
                    pt1.a aVar3 = this.f65669b;
                    boolean zB = mVar.B(aVar3);
                    e23.l lVar = this.f65670c;
                    boolean zB2 = zB | mVar.B(lVar);
                    je2.b bVar = this.f65671d;
                    boolean zR = zB2 | mVar.r(bVar);
                    e23.l lVar2 = this.f65672e;
                    boolean zB3 = zR | mVar.B(lVar2);
                    e23.l lVar3 = this.f65673f;
                    boolean zB4 = zB3 | mVar.B(lVar3);
                    Object objQ = mVar.q();
                    if (zB4) {
                        am.e1 e1Var = new am.e1(aVar3, lVar, bVar, lVar2, lVar3, 14);
                        mVar.K(e1Var);
                        objQ = e1Var;
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            am.e1 e1Var2 = new am.e1(aVar3, lVar, bVar, lVar2, lVar3, 14);
                            mVar.K(e1Var2);
                            objQ = e1Var2;
                        }
                    }
                    e2.c.b(rVarJ, null, null, null, null, null, false, null, (e23.l) objQ, mVar, 0, 510);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    h4.r rVarE = u1.n.e(h4.r.S, vb.h.e(d92.b.f58623a, mVar2), o4.m1.f128891a);
                    pt1.t tVar = this.f65669b.f140800c.get(0);
                    e23.l lVar4 = this.f65670c;
                    boolean zB5 = mVar2.B(lVar4);
                    je2.b bVar2 = this.f65671d;
                    boolean zR2 = zB5 | mVar2.r(bVar2);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new l1(lVar4, bVar2, 1);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new l1(lVar4, bVar2, 1);
                            mVar2.K(objQ2);
                        }
                    }
                    zs1.l.a(rVarE, tVar, true, (e23.a) objQ2, this.f65672e, this.f65673f, mVar2, 384, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
