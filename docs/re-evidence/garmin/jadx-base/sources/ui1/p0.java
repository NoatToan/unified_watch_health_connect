package ui1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.network.SubscriptionsRepository", f = "SubscriptionsRepository.kt", l = {208}, m = "checkJobStatus", v = 2)
public final class p0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f171354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f171355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f171356c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(o0 o0Var, t13.d<? super p0> dVar) {
        super(dVar);
        this.f171355b = o0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f171354a = obj;
        this.f171356c |= Integer.MIN_VALUE;
        return this.f171355b.a(null, this);
    }
}
