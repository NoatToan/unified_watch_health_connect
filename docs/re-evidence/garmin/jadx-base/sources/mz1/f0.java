package mz1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.EventDetailsViewModel", f = "EventDetailsViewModel.kt", l = {1413}, m = "clearEventTrainingPlanInfoOnNoPlanFound", v = 2)
public final class f0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fg0.k f121737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f121738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f121739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f121740d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(e0 e0Var, t13.d<? super f0> dVar) {
        super(dVar);
        this.f121739c = e0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f121738b = obj;
        this.f121740d |= Integer.MIN_VALUE;
        return e0.X4(this.f121739c, null, this);
    }
}
