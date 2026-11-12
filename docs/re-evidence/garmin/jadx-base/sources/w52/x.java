package w52;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class x implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.data.model.p f182755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f182756c;

    public /* synthetic */ x(com.garmin.android.apps.connectmobile.workouts.data.model.p pVar, int i14, int i15) {
        this.f182754a = i15;
        this.f182755b = pVar;
        this.f182756c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f182754a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                y.m(this.f182755b, mVar, p3.p0.t(this.f182756c | 1));
                break;
            case 1:
                y.a(this.f182755b, mVar, p3.p0.t(this.f182756c | 1));
                break;
            default:
                y.l(this.f182755b, mVar, p3.p0.t(this.f182756c | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
