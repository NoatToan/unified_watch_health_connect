package com.garmin.livetrack.retrofit;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.livetrack.retrofit.RetrofitManager", f = "RetrofitManager.kt", l = {613}, m = "isPersonalUrlAvailable")
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f52468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f52469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f52470c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(b bVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f52469b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f52468a = obj;
        this.f52470c |= Integer.MIN_VALUE;
        return this.f52469b.l(null, this);
    }
}
