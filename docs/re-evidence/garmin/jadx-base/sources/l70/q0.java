package l70;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.repository.UserFocusRepositoryImpl", f = "UserFocusRepositoryImpl.kt", l = {37}, m = "getUserSuggestedFocuses", v = 2)
public final class q0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f110767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f110768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f110769c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(u0 u0Var, t13.d<? super q0> dVar) {
        super(dVar);
        this.f110768b = u0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f110767a = obj;
        this.f110769c |= Integer.MIN_VALUE;
        return this.f110768b.r3(this);
    }
}
