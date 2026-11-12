package lw1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.findplan.presentation.FindTrainingPlanViewModel", f = "FindTrainingPlanViewModel.kt", l = {105}, m = "hasGCPlusSubscription", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f115091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f115092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f115093c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f115092b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f115091a = obj;
        this.f115093c |= Integer.MIN_VALUE;
        return this.f115092b.x4(this);
    }
}
