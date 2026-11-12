package z10;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class t implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.consent.b f201248b;

    public /* synthetic */ t(com.garmin.android.apps.connectmobile.consent.b bVar, int i14) {
        this.f201247a = 2;
        this.f201248b = bVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f201247a;
        byte b14 = 0;
        com.garmin.android.apps.connectmobile.consent.b bVar = this.f201248b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.consent.b.a aVar = com.garmin.android.apps.connectmobile.consent.b.f32262b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1690092305, new t(bVar, i15, b14), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.consent.b.a aVar2 = com.garmin.android.apps.connectmobile.consent.b.f32262b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    bVar.u6(mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.consent.b.a aVar3 = com.garmin.android.apps.connectmobile.consent.b.f32262b;
                bVar.u6((p3.m) obj, p3.p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ t(com.garmin.android.apps.connectmobile.consent.b bVar, int i14, byte b14) {
        this.f201247a = i14;
        this.f201248b = bVar;
    }
}
