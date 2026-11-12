package pu;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.auth.PostUserAuthenticationCaller", f = "PostUserAuthenticationCaller.kt", l = {154, 162}, m = "fetchSocialProfile", v = 2)
public final class d0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f141055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f141056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f141057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f141058d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(n nVar, t13.d<? super d0> dVar) {
        super(dVar);
        this.f141057c = nVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f141056b = obj;
        this.f141058d |= Integer.MIN_VALUE;
        int i14 = n.f141134l;
        return this.f141057c.h(0, this);
    }
}
