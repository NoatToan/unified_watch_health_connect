package pf0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class v implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.ecg.presentation.stats.b f137537b;

    public /* synthetic */ v(com.garmin.android.apps.connectmobile.ecg.presentation.stats.b bVar, int i14, int i15) {
        this.f137536a = i15;
        this.f137537b = bVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f137536a;
        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b bVar = this.f137537b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
        switch (i14) {
            case 0:
                bVar.g(mVar, p0.t(1));
                break;
            case 1:
                bVar.l(mVar, p0.t(1));
                break;
            case 2:
                bVar.m(mVar, p0.t(1));
                break;
            case 3:
                bVar.h(mVar, p0.t(1));
                break;
            case 4:
                bVar.i(mVar, p0.t(1));
                break;
            case 5:
                bVar.j(mVar, p0.t(1));
                break;
            default:
                bVar.k(mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
