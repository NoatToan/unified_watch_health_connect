package pu;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.auth.PostUserAuthenticationViewModel", f = "PostUserAuthenticationViewModel.kt", l = {73, 74}, m = "executePostUserAuthenticationCaller", v = 2)
public final class k0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f141121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f141122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f141123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f141124d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(j0 j0Var, t13.d<? super k0> dVar) {
        super(dVar);
        this.f141123c = j0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f141122b = obj;
        this.f141124d |= Integer.MIN_VALUE;
        return j0.x4(this.f141123c, this);
    }
}
