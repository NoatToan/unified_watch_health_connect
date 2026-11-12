package j31;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.domain.feature.CiqAppsFeatureHandler", f = "CiqAppsFeatureHandler.kt", l = {26}, m = "refreshOnboardingState", v = 2)
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f96912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f96913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f96914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f96915d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(l lVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f96914c = lVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f96913b = obj;
        this.f96915d |= Integer.MIN_VALUE;
        return this.f96914c.c(0L, this);
    }
}
