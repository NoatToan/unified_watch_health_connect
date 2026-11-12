package j31;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.domain.feature.IndexScaleConnectionsFeatureHandler", f = "IndexScaleConnectionsFeatureHandler.kt", l = {18}, m = "refreshOnboardingState", v = 2)
public final class k0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f96898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f96899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f96900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f96901d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(l0 l0Var, t13.d<? super k0> dVar) {
        super(dVar);
        this.f96900c = l0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f96899b = obj;
        this.f96901d |= Integer.MIN_VALUE;
        return this.f96900c.c(0L, this);
    }
}
