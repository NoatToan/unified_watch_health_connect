package i71;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.trainingstatus.domain.dashboard.GetTrainingStatusKeyStatsDataUseCase", f = "GetTrainingStatusKeyStatsDataUseCase.kt", l = {124}, m = "getPrimaryTrainingDeviceCount", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f91956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f91957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f91958c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l lVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f91957b = lVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f91956a = obj;
        this.f91958c |= Integer.MIN_VALUE;
        return l.c(this.f91957b, this);
    }
}
