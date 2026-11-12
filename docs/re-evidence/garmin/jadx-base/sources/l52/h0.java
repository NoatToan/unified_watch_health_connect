package l52;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.data.WorkoutsRepositoryImpl", f = "WorkoutsRepositoryImpl.kt", l = {210}, m = "getBenchmarkExerciseListAsync", v = 2)
public final class h0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f110271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f110272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f110273c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(z zVar, t13.d<? super h0> dVar) {
        super(dVar);
        this.f110272b = zVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f110271a = obj;
        this.f110273c |= Integer.MIN_VALUE;
        return this.f110272b.i(this);
    }
}
