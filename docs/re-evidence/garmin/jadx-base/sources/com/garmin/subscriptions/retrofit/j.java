package com.garmin.subscriptions.retrofit;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.subscriptions.retrofit.SubscriptionGatewayRetrofitManager", f = "SubscriptionGatewayRetrofitManager.kt", l = {201}, m = "getSubscriptions")
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f52714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f52715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f52716c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f52715b = gVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f52714a = obj;
        this.f52716c |= Integer.MIN_VALUE;
        return this.f52715b.d(null, null, null, false, this);
    }
}
