package ui1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.network.InReachSubscriptionRepository", f = "InReachSubscriptionRepository.kt", l = {169}, m = "isSubscriptionActiveForUnitId", v = 2)
public final class x extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f171408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f171409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f171410c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(l lVar, t13.d<? super x> dVar) {
        super(dVar);
        this.f171409b = lVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f171408a = obj;
        this.f171410c |= Integer.MIN_VALUE;
        return this.f171409b.k(0L, this);
    }
}
