package sy;

import e23.p;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.calories.presentation.a f161161b;

    public /* synthetic */ d(com.garmin.android.apps.connectmobile.calories.presentation.a aVar, int i14, int i15) {
        this.f161160a = i15;
        this.f161161b = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f161160a;
        com.garmin.android.apps.connectmobile.calories.presentation.a aVar = this.f161161b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        int i15 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
        switch (i14) {
            case 0:
                aVar.h(mVar, p0.t(1));
                break;
            case 1:
                aVar.j(mVar, p0.t(1));
                break;
            case 2:
                aVar.n(mVar, p0.t(1));
                break;
            case 3:
                aVar.l(mVar, p0.t(1));
                break;
            case 4:
                aVar.m(mVar, p0.t(1));
                break;
            case 5:
                aVar.g(mVar, p0.t(1));
                break;
            case 6:
                aVar.i(mVar, p0.t(1));
                break;
            default:
                aVar.k(mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
