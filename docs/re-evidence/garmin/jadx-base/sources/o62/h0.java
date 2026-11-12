package o62;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m52.k f129675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.data.model.j0 f129676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f129677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f129678e;

    public /* synthetic */ h0(m52.k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, e23.l lVar, int i14, int i15) {
        this.f129674a = i15;
        this.f129675b = kVar;
        this.f129676c = j0Var;
        this.f129677d = lVar;
        this.f129678e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f129674a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.G(this.f129675b, this.f129676c, this.f129677d, mVar, p3.p0.t(this.f129678e | 1));
                break;
            case 1:
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.Y(this.f129675b, this.f129676c, this.f129677d, mVar, p3.p0.t(this.f129678e | 1));
                break;
            case 2:
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.l(this.f129675b, this.f129676c, this.f129677d, mVar, p3.p0.t(this.f129678e | 1));
                break;
            default:
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.B(this.f129675b, this.f129676c, this.f129677d, mVar, p3.p0.t(this.f129678e | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
