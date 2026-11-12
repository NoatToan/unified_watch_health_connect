package n40;

import e23.p;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f123592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i53.c f123593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f123594d;

    public /* synthetic */ l(boolean z14, i53.c cVar, m mVar, int i14) {
        this.f123591a = i14;
        this.f123592b = z14;
        this.f123593c = cVar;
        this.f123594d = mVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003b  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f123591a;
        m mVar = this.f123594d;
        i53.c cVar = this.f123593c;
        boolean z14 = this.f123592b;
        int i15 = 1;
        p3.m mVar2 = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                m.a aVar = m.f123595m;
                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(847591215, new l(z14, cVar, mVar, i15), mVar2), mVar2, 196608, 31);
                } else {
                    mVar2.e();
                }
                break;
            default:
                m.a aVar2 = m.f123595m;
                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    boolean zR = mVar2.r(mVar);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new m92.f(mVar, 9);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new m92.f(mVar, 9);
                            mVar2.K(objQ);
                        }
                    }
                    n.b(z14, cVar, (p) objQ, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
