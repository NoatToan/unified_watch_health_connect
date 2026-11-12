package ui1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.network.InReachSubscriptionRepository", f = "InReachSubscriptionRepository.kt", l = {234}, m = "getSubscriptionInfo", v = 2)
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f171343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f171344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f171345c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(l lVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f171344b = lVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f171343a = obj;
        this.f171345c |= Integer.MIN_VALUE;
        return this.f171344b.d(0L, this);
    }
}
