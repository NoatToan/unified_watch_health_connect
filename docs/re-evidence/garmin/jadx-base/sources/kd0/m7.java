package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.WorkoutDelegateImpl", f = "WorkoutDelegateImpl.kt", l = {194}, m = "rescheduleWorkout", v = 2)
public final class m7 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c7 f104237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104238c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(c7 c7Var, t13.d<? super m7> dVar) {
        super(dVar);
        this.f104237b = c7Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104236a = obj;
        this.f104238c |= Integer.MIN_VALUE;
        return this.f104237b.v(0L, 0L, null, this);
    }
}
