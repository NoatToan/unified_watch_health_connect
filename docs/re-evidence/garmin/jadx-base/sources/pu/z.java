package pu;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.auth.PostUserAuthenticationCaller", f = "PostUserAuthenticationCaller.kt", l = {221}, m = "fetchActivityTypes", v = 2)
public final class z extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f141176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f141177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f141178c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(n nVar, t13.d<? super z> dVar) {
        super(dVar);
        this.f141177b = nVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f141176a = obj;
        this.f141178c |= Integer.MIN_VALUE;
        return n.a(this.f141177b, this);
    }
}
