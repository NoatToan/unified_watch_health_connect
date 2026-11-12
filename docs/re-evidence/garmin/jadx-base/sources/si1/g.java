package si1;

import c2.x2;
import p005kotlin.Unit;
import p3.l0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ti1.b f159377b;

    public /* synthetic */ g(ti1.b bVar, int i14) {
        this.f159376a = i14;
        this.f159377b = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f159376a;
        ti1.b bVar = this.f159377b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    h.c(x2.f(aVar, 1.0f), mVar, 6);
                    h.e(x2.x(x2.f(aVar, 1.0f), null, 3), bVar, mVar, 6);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c2.t) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h.d(bVar, mVar2, 0);
                    boolean zB = mVar2.B(bVar);
                    Object objQ = mVar2.q();
                    if (zB) {
                        objQ = new h.a(bVar, null);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new h.a(bVar, null);
                            mVar2.K(objQ);
                        }
                    }
                    l0.e((e23.p) objQ, bVar, mVar2);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
