package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.TrainingPlanDelegateImpl", f = "TrainingPlanDelegateImpl.kt", l = {220}, m = "hasTrainingPlanCardShownOnHome", v = 2)
public final class p6 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i6 f104291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104292c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(i6 i6Var, t13.d<? super p6> dVar) {
        super(dVar);
        this.f104291b = i6Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104290a = obj;
        this.f104292c |= Integer.MIN_VALUE;
        return this.f104291b.m(this);
    }
}
