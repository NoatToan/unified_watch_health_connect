package id0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.TrailsDelegateImpl", f = "TrailsDI.kt", l = {106}, m = "getTrailActivityData", v = 2)
public final class b5 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f92677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e5 f92678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f92679c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(e5 e5Var, t13.d<? super b5> dVar) {
        super(dVar);
        this.f92678b = e5Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f92677a = obj;
        this.f92679c |= Integer.MIN_VALUE;
        return this.f92678b.g(0L, this);
    }
}
