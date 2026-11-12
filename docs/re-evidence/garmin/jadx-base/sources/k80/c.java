package k80;

import e23.p;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.developer.tutorials.a f103340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ iz1.f f103341c;

    public /* synthetic */ c(com.garmin.android.apps.connectmobile.developer.tutorials.a aVar, iz1.f fVar, int i14) {
        this.f103339a = i14;
        this.f103340b = aVar;
        this.f103341c = fVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f103339a;
        iz1.f fVar = this.f103341c;
        com.garmin.android.apps.connectmobile.developer.tutorials.a aVar = this.f103340b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.developer.tutorials.a.C0558a c0558a = com.garmin.android.apps.connectmobile.developer.tutorials.a.f33708e;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-208742906, new c(aVar, fVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.developer.tutorials.a.C0558a c0558a2 = com.garmin.android.apps.connectmobile.developer.tutorials.a.f33708e;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    aVar.w6((com.garmin.android.apps.connectmobile.developer.tutorials.a.b) aVar.f33709a.getValue(), fVar, mVar2, o90.a.f130960i);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
