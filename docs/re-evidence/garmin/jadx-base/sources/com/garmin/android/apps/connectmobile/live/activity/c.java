package com.garmin.android.apps.connectmobile.live.activity;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.live.activity.DefaultLiveActivityActivityInfoDataSource", f = "DefaultLiveActivityActivityInfoDataSource.kt", l = {25}, m = "getActivityTypeKey", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f38393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f38394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38395c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f38394b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f38393a = obj;
        this.f38395c |= Integer.MIN_VALUE;
        return this.f38394b.b(0, 0, this);
    }
}
