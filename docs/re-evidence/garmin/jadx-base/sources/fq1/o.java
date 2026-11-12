package fq1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.startup.init.async.MobileAuthInitializer", f = "MobileAuthInitializer.kt", l = {51}, m = "prefetchOAuth1Token", v = 2)
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f73278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f73279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f73280c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(n nVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f73279b = nVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f73278a = obj;
        this.f73280c |= Integer.MIN_VALUE;
        return n.c(this.f73279b, this);
    }
}
