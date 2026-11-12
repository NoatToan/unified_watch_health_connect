package zd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.domain.PromosManager", f = "PromosProvider.kt", l = {825}, m = "removeCachedPromoById", v = 2)
public final class d1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f204003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z53.b f204004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f204005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u0 f204006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f204007e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(u0 u0Var, t13.d<? super d1> dVar) {
        super(dVar);
        this.f204006d = u0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f204005c = obj;
        this.f204007e |= Integer.MIN_VALUE;
        int i14 = u0.f204141p;
        return this.f204006d.E(null, this);
    }
}
