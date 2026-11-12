package k11;

import ew1.v1;
import p005kotlin.Unit;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f102201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f102202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f102203d;

    public /* synthetic */ i(e23.a aVar, p1 p1Var, e23.l lVar, int i14) {
        this.f102200a = i14;
        this.f102201b = aVar;
        this.f102202c = lVar;
        this.f102203d = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0080  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:37:0x0113  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f102200a;
        p3.m.a aVar = p3.m.f135153a;
        p1 p1Var = this.f102203d;
        e23.l lVar = this.f102202c;
        e23.a aVar2 = this.f102201b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    a.f102163a.getClass();
                    z3.e eVar = a.f102166d;
                    boolean zB = mVar.B(aVar2);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new a11.a0(aVar2, p1Var, 20);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new a11.a0(aVar2, p1Var, 20);
                            mVar.K(objQ);
                        }
                    }
                    i3.u.b(eVar, (e23.a) objQ, null, null, null, false, null, null, mVar, 6, 508);
                    z3.e eVar2 = a.f102167e;
                    boolean zB2 = mVar.B(lVar);
                    Object objQ2 = mVar.q();
                    if (zB2) {
                        objQ2 = new v1(lVar, p1Var, 7);
                        mVar.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new v1(lVar, p1Var, 7);
                            mVar.K(objQ2);
                        }
                    }
                    i3.u.b(eVar2, (e23.a) objQ2, null, null, null, false, null, null, mVar, 6, 508);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    e.f102189a.getClass();
                    z3.e eVar3 = e.f102190b;
                    boolean zB3 = mVar2.B(aVar2);
                    Object objQ3 = mVar2.q();
                    if (zB3) {
                        objQ3 = new a11.a0(aVar2, p1Var, 24);
                        mVar2.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new a11.a0(aVar2, p1Var, 24);
                            mVar2.K(objQ3);
                        }
                    }
                    i3.u.b(eVar3, (e23.a) objQ3, null, null, null, false, null, null, mVar2, 6, 508);
                    z3.e eVar4 = e.f102191c;
                    boolean zB4 = mVar2.B(lVar);
                    Object objQ4 = mVar2.q();
                    if (zB4) {
                        objQ4 = new v1(lVar, p1Var, 10);
                        mVar2.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new v1(lVar, p1Var, 10);
                            mVar2.K(objQ4);
                        }
                    }
                    i3.u.b(eVar4, (e23.a) objQ4, null, null, null, false, null, null, mVar2, 6, 508);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
