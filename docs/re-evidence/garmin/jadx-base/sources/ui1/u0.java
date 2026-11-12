package ui1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.network.SubscriptionsRepository", f = "SubscriptionsRepository.kt", l = {58, 62}, m = "getLTESubscriptions", v = 2)
public final class u0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f171391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f171392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0 f171393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f171394d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(o0 o0Var, t13.d<? super u0> dVar) {
        super(dVar);
        this.f171393c = o0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f171392b = obj;
        this.f171394d |= Integer.MIN_VALUE;
        return this.f171393c.f(null, this);
    }
}
