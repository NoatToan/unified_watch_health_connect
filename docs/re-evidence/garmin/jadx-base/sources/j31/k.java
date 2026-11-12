package j31;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.domain.feature.BpmRemindersFeatureHandler", f = "BpmRemindersFeatureHandler.kt", l = {16}, m = "refreshOnboardingState", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f96895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f96896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f96897c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j jVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f96896b = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f96895a = obj;
        this.f96897c |= Integer.MIN_VALUE;
        return this.f96896b.c(0L, this);
    }
}
