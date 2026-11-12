package com.garmin.subscriptions.retrofit;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.subscriptions.retrofit.RateLimitManager", f = "RateLimitManager.kt", l = {110}, m = "enable$subscriptions_purchase_release")
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f52681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f52682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z53.b f52683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f52684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f52685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f52686f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f52685e = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f52684d = obj;
        this.f52686f |= Integer.MIN_VALUE;
        return this.f52685e.b(0, null, this);
    }
}
