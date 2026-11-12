package vf2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.workout.WorkoutDataSourceImpl", f = "WorkoutDataSourceImpl.kt", l = {106}, m = "getExerciseData", v = 2)
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f178017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f178018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f178019c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(r rVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f178018b = rVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f178017a = obj;
        this.f178019c |= Integer.MIN_VALUE;
        return this.f178018b.a(0, 0, this);
    }
}
