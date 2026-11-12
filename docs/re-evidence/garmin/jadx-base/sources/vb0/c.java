package vb0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.subscription.data.InReachSubscriptionDeviceRepositoryImpl", f = "InReachSubscriptionDeviceRepositoryImpl.kt", l = {13}, m = "getNonPairedDeviceIdsWithSubscription", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f176835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f176836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f176837c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, t13.d<? super c> dVar2) {
        super(dVar2);
        this.f176836b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f176835a = obj;
        this.f176837c |= Integer.MIN_VALUE;
        return this.f176836b.c(this);
    }
}
