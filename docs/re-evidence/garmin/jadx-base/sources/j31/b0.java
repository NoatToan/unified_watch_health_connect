package j31;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.domain.feature.GarminMessengerFeatureHandler", f = "GarminMessengerFeatureHandler.kt", l = {28}, m = "refreshOnboardingState", v = 2)
public final class b0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f96870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f96871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f96872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f96873d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, t13.d<? super b0> dVar) {
        super(dVar);
        this.f96872c = c0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f96871b = obj;
        this.f96873d |= Integer.MIN_VALUE;
        return this.f96872c.c(0L, this);
    }
}
