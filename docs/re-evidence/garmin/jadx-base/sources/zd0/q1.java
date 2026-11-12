package zd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.domain.SubscriptionProviderImpl", f = "SubscriptionProvider.kt", l = {395, 395}, m = "refreshRoles", v = 2)
public final class q1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z70.i0 f204117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f204118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k1 f204119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f204120d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(k1 k1Var, t13.d<? super q1> dVar) {
        super(dVar);
        this.f204119c = k1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f204118b = obj;
        this.f204120d |= Integer.MIN_VALUE;
        return this.f204119c.g(this);
    }
}
