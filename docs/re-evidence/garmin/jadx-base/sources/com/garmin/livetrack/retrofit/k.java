package com.garmin.livetrack.retrofit;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.livetrack.retrofit.RetrofitManager", f = "RetrofitManager.kt", l = {904}, m = "getProfilePasscode")
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f52458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f52459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f52460c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b bVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f52459b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f52458a = obj;
        this.f52460c |= Integer.MIN_VALUE;
        return this.f52459b.j(this);
    }
}
