package f62;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditCreateViewModel", f = "WorkoutEditCreateViewModel.kt", l = {662}, m = "getUserDefinedAvgSpeed", v = 2)
public final class h0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m52.k f69248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f69249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.r f69250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f69251d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVar, t13.d<? super h0> dVar) {
        super(dVar);
        this.f69250c = rVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f69249b = obj;
        this.f69251d |= Integer.MIN_VALUE;
        m52.j jVar = com.garmin.android.apps.connectmobile.workouts.presentation.edit.r.f49273q;
        return this.f69250c.L4(null, this);
    }
}
