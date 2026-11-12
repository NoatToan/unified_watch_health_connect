package com.garmin.subscriptions.retrofit;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.subscriptions.retrofit.SubscriptionGatewayRetrofitManager", f = "SubscriptionGatewayRetrofitManager.kt", l = {239}, m = "getPurchasableSubscriptions")
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f52703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f52704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f52705c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f52704b = gVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f52703a = obj;
        this.f52705c |= Integer.MIN_VALUE;
        return this.f52704b.c(null, null, null, null, null, null, false, null, this);
    }
}
