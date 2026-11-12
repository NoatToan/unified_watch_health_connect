package zd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.domain.PromosManager", f = "PromosProvider.kt", l = {717}, m = "removePendingDismissedPromoIds", v = 2)
public final class e1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z70.b0 f204008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f204009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f204010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f204011d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(u0 u0Var, t13.d<? super e1> dVar) {
        super(dVar);
        this.f204010c = u0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f204009b = obj;
        this.f204011d |= Integer.MIN_VALUE;
        return this.f204010c.f(this);
    }
}
