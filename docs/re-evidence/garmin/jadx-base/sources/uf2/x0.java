package uf2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.MetricsConfigRepeatTimer", f = "MetricsConfigRepeatTimer.kt", l = {22, 24}, m = "startTimer", v = 2)
public final class x0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f170535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0 f170536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f170537c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(y0 y0Var, t13.d<? super x0> dVar) {
        super(dVar);
        this.f170536b = y0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f170535a = obj;
        this.f170537c |= Integer.MIN_VALUE;
        return this.f170536b.b(this);
    }
}
