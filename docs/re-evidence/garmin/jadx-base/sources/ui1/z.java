package ui1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.network.InReachSubscriptionRepository", f = "InReachSubscriptionRepository.kt", l = {244}, m = "isSubscriptionPurchaseProcessed", v = 2)
public final class z extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f171414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f171415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f171416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f171417d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(l lVar, t13.d<? super z> dVar) {
        super(dVar);
        this.f171416c = lVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f171415b = obj;
        this.f171417d |= Integer.MIN_VALUE;
        return this.f171416c.l(null, this);
    }
}
