package n70;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.CheckProductImprovementConsentUseCase", f = "CheckProductImprovementConsentUseCase.kt", l = {61}, m = "fetchConsentText", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q92.x f124156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f124157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f124158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f124159d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, t13.d<? super e> dVar2) {
        super(dVar2);
        this.f124158c = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f124157b = obj;
        this.f124159d |= Integer.MIN_VALUE;
        return d.a(this.f124158c, this);
    }
}
