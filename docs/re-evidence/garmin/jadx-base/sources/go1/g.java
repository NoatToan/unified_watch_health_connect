package go1;

import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f78238b;

    public /* synthetic */ g(k kVar, int i14) {
        this.f78237a = i14;
        this.f78238b = kVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f78237a;
        k kVar = this.f78238b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = k.C;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(262953257, new g(kVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = k.C;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    com.garmin.android.apps.connectmobile.tag.b bVar = (com.garmin.android.apps.connectmobile.tag.b) kVar.f78253c.getValue();
                    boolean zR = mVar2.r(kVar);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new f(kVar, 6);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new f(kVar, 6);
                            mVar2.K(objQ);
                        }
                    }
                    io1.e.a(bVar, (e23.l) objQ, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
