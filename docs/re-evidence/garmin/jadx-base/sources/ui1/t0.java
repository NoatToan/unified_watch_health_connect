package ui1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.network.SubscriptionsRepository", f = "SubscriptionsRepository.kt", l = {116}, m = "getAllSubscriberDevices", v = 2)
public final class t0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f171384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f171385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0 f171386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f171387d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(o0 o0Var, t13.d<? super t0> dVar) {
        super(dVar);
        this.f171386c = o0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f171385b = obj;
        this.f171387d |= Integer.MIN_VALUE;
        return this.f171386c.d(null, this);
    }
}
