package com.garmin.android.apps.connectmobile;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.ActivityTypeManager", f = "ActivityTypeManager.kt", l = {89}, m = "fetchActivityTypes", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f35282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f35283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35284c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f35283b = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f35282a = obj;
        this.f35284c |= Integer.MIN_VALUE;
        return this.f35283b.a(this);
    }
}
