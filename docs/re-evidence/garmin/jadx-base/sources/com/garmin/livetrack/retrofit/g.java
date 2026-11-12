package com.garmin.livetrack.retrofit;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.livetrack.retrofit.RetrofitManager", f = "RetrofitManager.kt", l = {946}, m = "deleteProfilePasscode")
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f52448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f52449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f52450c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b bVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f52449b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f52448a = obj;
        this.f52450c |= Integer.MIN_VALUE;
        return this.f52449b.f(this);
    }
}
