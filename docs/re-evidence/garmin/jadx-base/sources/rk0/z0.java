package rk0;

import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class z0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f153333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d1 f153334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f153335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ GearActivity.w f153336e;

    public /* synthetic */ z0(w0 w0Var, d1 d1Var, e23.l lVar, GearActivity.w wVar, int i14, int i15) {
        this.f153332a = i15;
        this.f153333b = w0Var;
        this.f153334c = d1Var;
        this.f153335d = lVar;
        this.f153336e = wVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f153332a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p3.p0.t(1);
                b1.b(this.f153333b, this.f153334c, this.f153335d, this.f153336e, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p3.p0.t(1);
                b1.c(this.f153333b, this.f153334c, this.f153335d, this.f153336e, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
