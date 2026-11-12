package com.garmin.android.apps.connectmobile.menstrualcycle.data.api;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.data.api.PeriodicHealthServiceApi$Companion", f = "PeriodicHealthServiceApi.kt", l = {93}, m = "postCycle", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f38764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.b f38765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38766c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a.b bVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f38765b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f38764a = obj;
        this.f38766c |= Integer.MIN_VALUE;
        return this.f38765b.g(null, null, this);
    }
}
