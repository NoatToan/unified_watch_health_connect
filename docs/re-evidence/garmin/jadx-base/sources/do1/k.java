package do1;

import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.social.b f60603b;

    public /* synthetic */ k(com.garmin.android.apps.connectmobile.social.b bVar, int i14) {
        this.f60602a = i14;
        this.f60603b = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f60602a;
        com.garmin.android.apps.connectmobile.social.b bVar = this.f60603b;
        Object[] objArr = 0;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.social.b.a aVar = com.garmin.android.apps.connectmobile.social.b.T0;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1265751649, new k(bVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.social.b.a aVar2 = com.garmin.android.apps.connectmobile.social.b.T0;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    com.garmin.android.apps.connectmobile.tag.b bVar2 = bVar.I;
                    if (bVar2 != null) {
                        boolean zR = mVar2.r(bVar);
                        Object objQ = mVar2.q();
                        if (zR) {
                            objQ = new j(bVar, objArr == true ? 1 : 0);
                            mVar2.K(objQ);
                        } else {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new j(bVar, objArr == true ? 1 : 0);
                                mVar2.K(objQ);
                            }
                        }
                        io1.e.a(bVar2, (e23.l) objQ, mVar2, 0);
                    }
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
