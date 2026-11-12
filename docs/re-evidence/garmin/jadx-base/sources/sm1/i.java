package sm1;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.sleep.presentation.a f160123b;

    public /* synthetic */ i(com.garmin.android.apps.connectmobile.sleep.presentation.a aVar, int i14, int i15) {
        this.f160122a = i15;
        this.f160123b = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f160122a;
        com.garmin.android.apps.connectmobile.sleep.presentation.a aVar = this.f160123b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        int i15 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
        switch (i14) {
            case 0:
                aVar.l(mVar, p0.t(1));
                break;
            case 1:
                aVar.o(mVar, p0.t(1));
                break;
            case 2:
                aVar.p(mVar, p0.t(1));
                break;
            case 3:
                aVar.s(mVar, p0.t(1));
                break;
            case 4:
                aVar.n(mVar, p0.t(1));
                break;
            case 5:
                aVar.m(mVar, p0.t(1));
                break;
            case 6:
                aVar.q(mVar, p0.t(1));
                break;
            case 7:
                aVar.i(mVar, p0.t(1));
                break;
            case 8:
                aVar.j(mVar, p0.t(1));
                break;
            case 9:
                aVar.k(mVar, p0.t(1));
                break;
            default:
                aVar.h(mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
