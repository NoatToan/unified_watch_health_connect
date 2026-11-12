package fg2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.repositories.WorkoutStateHolder", f = "WorkoutStateHolder.kt", l = {394}, m = "registerWorkoutEventListener", v = 2)
public final class f0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f71503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f71504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f71505c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(d0 d0Var, t13.d<? super f0> dVar) {
        super(dVar);
        this.f71504b = d0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f71503a = obj;
        this.f71505c |= Integer.MIN_VALUE;
        return d0.c(this.f71504b, null, this);
    }
}
