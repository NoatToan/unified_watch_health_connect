package f62;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditCreateViewModel", f = "WorkoutEditCreateViewModel.kt", l = {690}, m = "getLatestCriticalSwimSpeed", v = 2)
public final class f0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f69237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.r f69238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f69239c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVar, t13.d<? super f0> dVar) {
        super(dVar);
        this.f69238b = rVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f69237a = obj;
        this.f69239c |= Integer.MIN_VALUE;
        return com.garmin.android.apps.connectmobile.workouts.presentation.edit.r.z4(this.f69238b, this);
    }
}
