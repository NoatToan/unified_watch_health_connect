package l52;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.data.WorkoutsRepositoryImpl", f = "WorkoutsRepositoryImpl.kt", l = {99}, m = "getMyWorkoutKeyTypes", v = 2)
public final class e1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f110244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f110245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f110246c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(z zVar, t13.d<? super e1> dVar) {
        super(dVar);
        this.f110245b = zVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f110244a = obj;
        this.f110246c |= Integer.MIN_VALUE;
        return this.f110245b.m(this);
    }
}
