package ey1;

import p005kotlin.Metadata;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.viewmodel.StrengthTrainingPlanDashboardViewModel", f = "StrengthTrainingPlanDashboardViewModel.kt", l = {315, 315}, m = "loadTrainingPlan", v = 2)
public final class u extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p2 f67430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f67431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f67432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f67433d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(j jVar, t13.d<? super u> dVar) {
        super(dVar);
        this.f67432c = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f67431b = obj;
        this.f67433d |= Integer.MIN_VALUE;
        return j.y4(this.f67432c, this);
    }
}
