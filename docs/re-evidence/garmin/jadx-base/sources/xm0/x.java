package xm0;

import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class x implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f191482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f191483c;

    public /* synthetic */ x(k kVar, y yVar, int i14) {
        this.f191481a = i14;
        this.f191482b = kVar;
        this.f191483c = yVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f191481a;
        y yVar = this.f191483c;
        k kVar = this.f191482b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                y.b bVar = y.f191484d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1687674090, new x(kVar, yVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                y.b bVar2 = y.f191484d;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    boolean zR = mVar2.r(yVar) | mVar2.r(kVar);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new wz1.c(27, yVar, kVar);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new wz1.c(27, yVar, kVar);
                            mVar2.K(objQ);
                        }
                    }
                    l.a(kVar, (e23.a) objQ, mVar2, b12.b.f14385f);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
