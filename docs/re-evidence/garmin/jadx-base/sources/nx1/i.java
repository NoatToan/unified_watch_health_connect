package nx1;

import p005kotlin.Metadata;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.domain.usecase.GetStrengthTrainingPlanUseCase", f = "GetStrengthTrainingPlanUseCase.kt", l = {16, 14}, m = "invoke", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p2 f128232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f128233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f128234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f128235d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f128234c = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f128233b = obj;
        this.f128235d |= Integer.MIN_VALUE;
        return this.f128234c.a(null, this);
    }
}
