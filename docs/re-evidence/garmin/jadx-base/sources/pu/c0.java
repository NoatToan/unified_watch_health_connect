package pu;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.auth.PostUserAuthenticationCaller", f = "PostUserAuthenticationCaller.kt", l = {229, 230}, m = "fetchPromotions", v = 2)
public final class c0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f141052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f141053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f141054c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(n nVar, t13.d<? super c0> dVar) {
        super(dVar);
        this.f141053b = nVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f141052a = obj;
        this.f141054c |= Integer.MIN_VALUE;
        return n.b(this.f141053b, this);
    }
}
