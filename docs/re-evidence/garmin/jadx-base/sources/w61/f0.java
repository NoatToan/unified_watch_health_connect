package w61;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusViewModel", f = "TrainingStatusViewModel.kt", l = {1078}, m = "getTrainingPlans", v = 2)
public final class f0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f183179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f183180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f183181c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(x xVar, t13.d<? super f0> dVar) {
        super(dVar);
        this.f183180b = xVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f183179a = obj;
        this.f183181c |= Integer.MIN_VALUE;
        int i14 = x.O0;
        return this.f183180b.G4(this);
    }
}
