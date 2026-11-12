package com.garmin.subscriptions.retrofit;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.subscriptions.retrofit.RateLimitManager", f = "RateLimitManager.kt", l = {110}, m = "isRateLimited$subscriptions_purchase_release")
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z53.b f52687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f52688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f52689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f52690d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f52689c = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f52688b = obj;
        this.f52690d |= Integer.MIN_VALUE;
        return this.f52689c.d(this);
    }
}
