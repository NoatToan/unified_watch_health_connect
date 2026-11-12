package aq;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class z1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.repcounting.model.e f12317b;

    public /* synthetic */ z1(com.garmin.android.apps.connectmobile.repcounting.model.e eVar, int i14) {
        this.f12316a = i14;
        this.f12317b = eVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f12316a;
        com.garmin.android.apps.connectmobile.repcounting.model.e eVar = this.f12317b;
        Long l14 = (Long) obj;
        switch (i14) {
            case 0:
                int i15 = a2.f11811f;
                if (l14 == null) {
                    l14 = -2L;
                }
                eVar.i0(l14);
                break;
            case 1:
                int i16 = b2.f11835f;
                if (l14 == null) {
                    l14 = -2L;
                }
                eVar.i0(l14);
                break;
            default:
                int i17 = d2.f11903g;
                eVar.i0(Long.valueOf(l14 != null ? l14.longValue() : -2L));
                break;
        }
        return Unit.INSTANCE;
    }
}
