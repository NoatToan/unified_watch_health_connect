package gy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.domain.GetMultiDayActivitySummariesUseCase", f = "GetMultiDayActivitySummariesUseCase.kt", l = {15}, m = "invoke", v = 2)
public final class y0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f80280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f80281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f80282c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(z0 z0Var, t13.d<? super y0> dVar) {
        super(dVar);
        this.f80281b = z0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f80280a = obj;
        this.f80282c |= Integer.MIN_VALUE;
        return this.f80281b.a(null, null, this);
    }
}
