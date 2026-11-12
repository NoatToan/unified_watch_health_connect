package ou1;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.domain.TrainingPlanFitnessStatsUseCase", f = "TrainingPlanFitnessStatsUseCase.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "getFrogCoachStatsAPI", v = 2)
public final class t extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f134108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f134109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f134110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f134111d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(i iVar, t13.d<? super t> dVar) {
        super(dVar);
        this.f134110c = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f134109b = obj;
        this.f134111d |= Integer.MIN_VALUE;
        return this.f134110c.i(null, null, this);
    }
}
