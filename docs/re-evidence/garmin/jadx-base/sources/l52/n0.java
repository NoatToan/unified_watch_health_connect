package l52;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.data.WorkoutsRepositoryImpl", f = "WorkoutsRepositoryImpl.kt", l = {165, 166, 168, 170, 171, 173}, m = "getMSNWorkoutDetailsAsync", v = 2)
public final class n0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f110312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f110313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f110314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f110315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f110316e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(z zVar, t13.d<? super n0> dVar) {
        super(dVar);
        this.f110315d = zVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f110314c = obj;
        this.f110316e |= Integer.MIN_VALUE;
        return this.f110315d.t(null, null, this);
    }
}
