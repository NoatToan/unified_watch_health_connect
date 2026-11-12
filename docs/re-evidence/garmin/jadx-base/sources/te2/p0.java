package te2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.CustomerAgeManager", f = "CustomerAgeManager.kt", l = {82}, m = "preCheckForNetworkCall")
public final class p0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f164229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f164230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f164231c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(k0 k0Var, t13.d<? super p0> dVar) {
        super(dVar);
        this.f164230b = k0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f164229a = obj;
        this.f164231c |= Integer.MIN_VALUE;
        return k0.a(this.f164230b, this);
    }
}
