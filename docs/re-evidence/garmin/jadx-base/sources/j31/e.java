package j31;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.domain.feature.ActivateLTEServiceFeatureHandler", f = "ActivateLTEServiceFeatureHandler.kt", l = {16}, m = "refreshOnboardingState", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f96883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f96884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f96885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f96886d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f96885c = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f96884b = obj;
        this.f96886d |= Integer.MIN_VALUE;
        return this.f96885c.c(0L, this);
    }
}
