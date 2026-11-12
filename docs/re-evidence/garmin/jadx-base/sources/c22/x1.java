package c22;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.util.MapSearchUtil", f = "MapSearchUtil.kt", l = {17}, m = "getAddress", v = 2)
public final class x1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1 f23749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23750c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(z1 z1Var, t13.d<? super x1> dVar) {
        super(dVar);
        this.f23749b = z1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f23748a = obj;
        this.f23750c |= Integer.MIN_VALUE;
        return this.f23749b.f(null, this);
    }
}
