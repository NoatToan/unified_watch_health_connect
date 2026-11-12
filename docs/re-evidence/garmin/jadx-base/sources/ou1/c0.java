package ou1;

import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.domain.TrainingPlanFitnessStatsUseCase", f = "TrainingPlanFitnessStatsUseCase.kt", l = {MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE}, m = "getStrengthStats", v = 2)
public final class c0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f134020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f134021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f134022c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(i iVar, t13.d<? super c0> dVar) {
        super(dVar);
        this.f134021b = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f134020a = obj;
        this.f134022c |= Integer.MIN_VALUE;
        return this.f134021b.n(null, null, this);
    }
}
