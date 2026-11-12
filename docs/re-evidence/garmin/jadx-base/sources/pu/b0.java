package pu;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.auth.PostUserAuthenticationCaller", f = "PostUserAuthenticationCaller.kt", l = {190}, m = "fetchIntelligentRoles", v = 2)
public final class b0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f141049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f141050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f141051c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(n nVar, t13.d<? super b0> dVar) {
        super(dVar);
        this.f141050b = nVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f141049a = obj;
        this.f141051c |= Integer.MIN_VALUE;
        int i14 = n.f141134l;
        return this.f141050b.g(this);
    }
}
