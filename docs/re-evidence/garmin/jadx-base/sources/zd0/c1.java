package zd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.domain.PromosManager", f = "PromosProvider.kt", l = {825, 225, 226}, m = "remap", v = 2)
public final class c1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c80.s0 f203992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z53.a f203993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f203994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f203995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f203996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u0 f203997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f203998g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(u0 u0Var, t13.d<? super c1> dVar) {
        super(dVar);
        this.f203997f = u0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f203996e = obj;
        this.f203998g |= Integer.MIN_VALUE;
        return this.f203997f.w(this);
    }
}
