package ui1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.network.InReachSubscriptionRepository", f = "InReachSubscriptionRepository.kt", l = {114}, m = "isDirectActivationCapableDevice", v = 2)
public final class t extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f171381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f171382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f171383c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(l lVar, t13.d<? super t> dVar) {
        super(dVar);
        this.f171382b = lVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f171381a = obj;
        this.f171383c |= Integer.MIN_VALUE;
        return this.f171382b.h(0L, this);
    }
}
