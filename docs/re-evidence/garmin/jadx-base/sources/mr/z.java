package mr;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.domain.GetCompactActivityDetailsUseCase", f = "GetCompactActivityDetailsUseCase.kt", l = {62}, m = "getActivitySummary", v = 2)
public final class z extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f120337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f120338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f120339c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(g0 g0Var, t13.d<? super z> dVar) {
        super(dVar);
        this.f120338b = g0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f120337a = obj;
        this.f120339c |= Integer.MIN_VALUE;
        return g0.c(this.f120338b, 0L, this);
    }
}
