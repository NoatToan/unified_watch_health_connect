package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.WorkoutDelegateImpl", f = "WorkoutDelegateImpl.kt", l = {366, 365}, m = "getLastPowerToWeightReport", v = 2)
public final class e7 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ws0.a f104054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f104055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c7 f104056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f104057d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(c7 c7Var, t13.d<? super e7> dVar) {
        super(dVar);
        this.f104056c = c7Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104055b = obj;
        this.f104057d |= Integer.MIN_VALUE;
        return this.f104056c.j(this);
    }
}
