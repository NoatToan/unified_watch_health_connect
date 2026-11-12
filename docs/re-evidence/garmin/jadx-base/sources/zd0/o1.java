package zd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.domain.SubscriptionProviderImpl", f = "SubscriptionProvider.kt", l = {197}, m = "getSubscriptionStatus", v = 2)
public final class o1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f204099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k1 f204100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f204101c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(k1 k1Var, t13.d<? super o1> dVar) {
        super(dVar);
        this.f204100b = k1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f204099a = obj;
        this.f204101c |= Integer.MIN_VALUE;
        return this.f204100b.k(false, this);
    }
}
