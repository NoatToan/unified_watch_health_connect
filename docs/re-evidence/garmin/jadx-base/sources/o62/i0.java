package o62;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.data.model.j0 f129684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f129685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f129686d;

    public /* synthetic */ i0(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, e23.l lVar, int i14, int i15) {
        this.f129683a = i15;
        this.f129684b = j0Var;
        this.f129685c = lVar;
        this.f129686d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f129683a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.D(this.f129684b, this.f129685c, mVar, p3.p0.t(this.f129686d | 1));
                break;
            default:
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.r(this.f129684b, this.f129685c, mVar, p3.p0.t(this.f129686d | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
