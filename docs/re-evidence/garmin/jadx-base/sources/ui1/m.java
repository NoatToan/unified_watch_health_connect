package ui1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.network.InReachSubscriptionRepository", f = "InReachSubscriptionRepository.kt", l = {123}, m = "getAvailableFreeTrialSubscriptions", v = 2)
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f171319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f171320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f171321c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l lVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f171320b = lVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f171319a = obj;
        this.f171321c |= Integer.MIN_VALUE;
        return this.f171320b.a(0L, this);
    }
}
