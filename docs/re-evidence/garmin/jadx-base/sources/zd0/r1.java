package zd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.domain.SubscriptionProviderImpl", f = "SubscriptionProvider.kt", l = {161}, m = "setup", v = 2)
public final class r1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f12.b f204122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f204123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k1 f204124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f204125d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(k1 k1Var, t13.d<? super r1> dVar) {
        super(dVar);
        this.f204124c = k1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f204123b = obj;
        this.f204125d |= Integer.MIN_VALUE;
        return this.f204124c.d(this);
    }
}
