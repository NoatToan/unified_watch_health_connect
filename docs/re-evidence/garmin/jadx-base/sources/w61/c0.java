package w61;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusViewModel", f = "TrainingStatusViewModel.kt", l = {745, 751}, m = "getLastUsedTrainingStatusDevice", v = 2)
public final class c0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f183160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f183161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f183162c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(x xVar, t13.d<? super c0> dVar) {
        super(dVar);
        this.f183161b = xVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f183160a = obj;
        this.f183162c |= Integer.MIN_VALUE;
        return x.y4(this.f183161b, this);
    }
}
