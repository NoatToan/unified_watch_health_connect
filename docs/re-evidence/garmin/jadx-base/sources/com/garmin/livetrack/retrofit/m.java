package com.garmin.livetrack.retrofit;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.livetrack.retrofit.RetrofitManager", f = "RetrofitManager.kt", l = {455}, m = "getUserSettings")
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f52463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f52464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f52465c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(b bVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f52464b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f52463a = obj;
        this.f52465c |= Integer.MIN_VALUE;
        return this.f52464b.k(this);
    }
}
