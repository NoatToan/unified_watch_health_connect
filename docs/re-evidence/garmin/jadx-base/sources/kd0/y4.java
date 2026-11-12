package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.PerformanceScoreDelegateImpl", f = "PerformanceScoreDelegateImpl.kt", l = {11}, m = "getPrimaryTrainingDevice", v = 2)
public final class y4 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z4 f104459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104460c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(z4 z4Var, t13.d<? super y4> dVar) {
        super(dVar);
        this.f104459b = z4Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104458a = obj;
        this.f104460c |= Integer.MIN_VALUE;
        return this.f104459b.a(this);
    }
}
