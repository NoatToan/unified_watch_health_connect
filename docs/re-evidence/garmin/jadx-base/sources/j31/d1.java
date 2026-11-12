package j31;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.domain.feature.PowerZonesFeatureHandler", f = "PowerZonesFeatureHandler.kt", l = {20}, m = "refreshOnboardingState", v = 2)
public final class d1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f96879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f96880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1 f96881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f96882d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(c1 c1Var, t13.d<? super d1> dVar) {
        super(dVar);
        this.f96881c = c1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f96880b = obj;
        this.f96882d |= Integer.MIN_VALUE;
        return this.f96881c.c(0L, this);
    }
}
