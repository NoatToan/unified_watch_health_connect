package ey1;

import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.viewmodel.StrengthTrainingPlanDashboardViewModel", f = "StrengthTrainingPlanDashboardViewModel.kt", l = {783, 793}, m = "getActivities", v = 2)
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DateTime f67403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DateTime f67404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f67405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f67406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f67407e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(j jVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f67406d = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f67405c = obj;
        this.f67407e |= Integer.MIN_VALUE;
        return j.x4(this.f67406d, null, null, this);
    }
}
