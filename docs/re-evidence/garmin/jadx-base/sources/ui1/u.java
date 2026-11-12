package ui1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.network.InReachSubscriptionRepository", f = "InReachSubscriptionRepository.kt", l = {146}, m = "isExistingUser", v = 2)
public final class u extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f171388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f171389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f171390c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(l lVar, t13.d<? super u> dVar) {
        super(dVar);
        this.f171389b = lVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f171388a = obj;
        this.f171390c |= Integer.MIN_VALUE;
        return this.f171389b.i(0L, this);
    }
}
