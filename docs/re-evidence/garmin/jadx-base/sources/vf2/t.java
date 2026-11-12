package vf2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.workout.WorkoutDataSourceImpl", f = "WorkoutDataSourceImpl.kt", l = {98}, m = "getExerciseInfo", v = 2)
public final class t extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f178020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f178021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f178022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f178023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f178024e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(r rVar, t13.d<? super t> dVar) {
        super(dVar);
        this.f178023d = rVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f178022c = obj;
        this.f178024e |= Integer.MIN_VALUE;
        int i14 = r.f178007e;
        return this.f178023d.d(0, 0, null, this);
    }
}
