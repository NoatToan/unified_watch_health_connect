package ty1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.k f167169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Integer f167170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f167171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f167172e;

    public /* synthetic */ l0(com.garmin.android.apps.connectmobile.traininginitiative.ui.k kVar, Integer num, e23.l lVar, int i14, int i15) {
        this.f167168a = i15;
        this.f167169b = kVar;
        this.f167170c = num;
        this.f167171d = lVar;
        this.f167172e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f167168a;
        int i15 = this.f167172e;
        e23.l<? super Boolean, Unit> lVar = this.f167171d;
        Integer num = this.f167170c;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.k kVar = this.f167169b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        com.garmin.android.apps.connectmobile.traininginitiative.ui.k.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.k.f46110c;
        switch (i14) {
            case 0:
                kVar.E6(num, lVar, mVar, p3.p0.t(i15 | 1));
                break;
            default:
                kVar.A6(num, lVar, mVar, p3.p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
