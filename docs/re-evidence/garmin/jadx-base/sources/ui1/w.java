package ui1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.network.InReachSubscriptionRepository", f = "InReachSubscriptionRepository.kt", l = {109, 109, 110}, m = "isOnboardingItemCompleted", v = 2)
public final class w extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f171401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f171402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f171403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f171404d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(l lVar, t13.d<? super w> dVar) {
        super(dVar);
        this.f171403c = lVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f171402b = obj;
        this.f171404d |= Integer.MIN_VALUE;
        return this.f171403c.j(0L, this);
    }
}
