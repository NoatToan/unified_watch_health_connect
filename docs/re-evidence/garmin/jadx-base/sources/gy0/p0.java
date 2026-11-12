package gy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.domain.GetHeatAltitudeAcclimationDataUseCase", f = "GetHeatAltitudeAcclimationDataUseCase.kt", l = {21}, m = "invoke", v = 2)
public final class p0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o82.a f80210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f80211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0 f80212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f80213d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(q0 q0Var, t13.d<? super p0> dVar) {
        super(dVar);
        this.f80212c = q0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f80211b = obj;
        this.f80213d |= Integer.MIN_VALUE;
        return this.f80212c.a(null, null, null, null, this);
    }
}
