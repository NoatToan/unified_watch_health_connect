package j31;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.domain.feature.HeartRateZonesFeatureHandler", f = "HeartRateZonesFeatureHandler.kt", l = {19}, m = "refreshOnboardingState", v = 2)
public final class i0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f96890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f96891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f96892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f96893d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(h0 h0Var, t13.d<? super i0> dVar) {
        super(dVar);
        this.f96892c = h0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f96891b = obj;
        this.f96893d |= Integer.MIN_VALUE;
        return this.f96892c.c(0L, this);
    }
}
