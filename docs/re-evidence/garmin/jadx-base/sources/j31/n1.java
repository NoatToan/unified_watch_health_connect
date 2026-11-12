package j31;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.domain.feature.VO2MaxFeatureHandler", f = "VO2MaxFeatureHandler.kt", l = {27}, m = "refreshOnboardingState", v = 2)
public final class n1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f96916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o1 f96917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f96918c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(o1 o1Var, t13.d<? super n1> dVar) {
        super(dVar);
        this.f96917b = o1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f96916a = obj;
        this.f96918c |= Integer.MIN_VALUE;
        return this.f96917b.c(0L, this);
    }
}
