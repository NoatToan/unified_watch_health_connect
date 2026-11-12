package mr;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.domain.GetCompactActivityDetailsUseCase", f = "GetCompactActivityDetailsUseCase.kt", l = {151, 159}, m = "getActivityLaps", v = 2)
public final class x extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f120326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f120327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f120328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g0 f120329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f120330e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(g0 g0Var, t13.d<? super x> dVar) {
        super(dVar);
        this.f120329d = g0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f120328c = obj;
        this.f120330e |= Integer.MIN_VALUE;
        return g0.b(this.f120329d, 0L, false, this);
    }
}
