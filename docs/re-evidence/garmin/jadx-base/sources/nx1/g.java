package nx1;

import p005kotlin.Metadata;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.domain.usecase.GetStrengthTrainingPlanBenchmarksUseCase", f = "GetStrengthTrainingPlanBenchmarksUseCase.kt", l = {16, 14}, m = "invoke", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p2 f128226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f128227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f128228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f128229d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f128228c = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f128227b = obj;
        this.f128229d |= Integer.MIN_VALUE;
        return this.f128228c.a(null, this);
    }
}
