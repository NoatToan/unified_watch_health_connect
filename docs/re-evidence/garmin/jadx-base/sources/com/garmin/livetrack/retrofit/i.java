package com.garmin.livetrack.retrofit;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.livetrack.retrofit.RetrofitManager", f = "RetrofitManager.kt", l = {584}, m = "getPersonalUrl")
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f52453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f52454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f52455c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(b bVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f52454b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f52453a = obj;
        this.f52455c |= Integer.MIN_VALUE;
        return this.f52454b.i(this);
    }
}
