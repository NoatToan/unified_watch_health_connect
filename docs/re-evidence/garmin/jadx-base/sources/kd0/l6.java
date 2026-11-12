package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.TrainingPlanDelegateImpl", f = "TrainingPlanDelegateImpl.kt", l = {437, 447}, m = "getFBTDashboardBodyBatteryData", v = 2)
public final class l6 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public gs1.z f104209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f104210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i6 f104211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f104212d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(i6 i6Var, t13.d<? super l6> dVar) {
        super(dVar);
        this.f104211c = i6Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104210b = obj;
        this.f104212d |= Integer.MIN_VALUE;
        return this.f104211c.c(this);
    }
}
