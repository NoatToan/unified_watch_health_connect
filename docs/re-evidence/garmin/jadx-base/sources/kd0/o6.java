package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.TrainingPlanDelegateImpl", f = "TrainingPlanDelegateImpl.kt", l = {464}, m = "hasLast7DaysBodyBatteryData", v = 2)
public final class o6 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i6 f104272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104273c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(i6 i6Var, t13.d<? super o6> dVar) {
        super(dVar);
        this.f104272b = i6Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104271a = obj;
        this.f104273c |= Integer.MIN_VALUE;
        int i14 = i6.f104121g;
        return this.f104272b.Y(this);
    }
}
