package f62;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditCreateViewModel", f = "WorkoutEditCreateViewModel.kt", l = {650}, m = "getHistoricUserAvgSpeed", v = 2)
public final class e0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f69231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.r f69232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f69233c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVar, t13.d<? super e0> dVar) {
        super(dVar);
        this.f69232b = rVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f69231a = obj;
        this.f69233c |= Integer.MIN_VALUE;
        m52.j jVar = com.garmin.android.apps.connectmobile.workouts.presentation.edit.r.f49273q;
        return this.f69232b.H4(null, this);
    }
}
