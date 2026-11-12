package j31;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.domain.feature.CreateCourseFeatureHandler", f = "CreateCourseFeatureHandler.kt", l = {27}, m = "refreshOnboardingState", v = 2)
public final class r extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f96923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f96924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f96925c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(q qVar, t13.d<? super r> dVar) {
        super(dVar);
        this.f96924b = qVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f96923a = obj;
        this.f96925c |= Integer.MIN_VALUE;
        return this.f96924b.c(0L, this);
    }
}
