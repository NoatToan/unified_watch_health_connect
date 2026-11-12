package gy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.domain.GetMultiDayActivityLifetimeStatsUseCase", f = "GetMultiDayActivityLifetimeStatsUseCase.kt", l = {22}, m = "invoke", v = 2)
public final class w0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f80264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f80265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f80266c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(x0 x0Var, t13.d<? super w0> dVar) {
        super(dVar);
        this.f80265b = x0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f80264a = obj;
        this.f80266c |= Integer.MIN_VALUE;
        return this.f80265b.a(null, null, null, false, this);
    }
}
