package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.WorkoutDelegateImpl", f = "WorkoutDelegateImpl.kt", l = {265}, m = "isAdaptiveCoachWorkoutOnDevice-BWLJW6A", v = 2)
public final class j7 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c7 f104157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104158c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(c7 c7Var, t13.d<? super j7> dVar) {
        super(dVar);
        this.f104157b = c7Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f104156a = obj;
        this.f104158c |= Integer.MIN_VALUE;
        Object objC = this.f104157b.C(0, 0, 0L, this);
        return objC == u13.a.COROUTINE_SUSPENDED ? objC : o13.q.a(objC);
    }
}
