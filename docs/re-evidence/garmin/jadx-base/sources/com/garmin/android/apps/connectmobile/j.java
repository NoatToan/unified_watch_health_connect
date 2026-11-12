package com.garmin.android.apps.connectmobile;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.ActivityTypeManager", f = "ActivityTypeManager.kt", l = {67}, m = "performStartupOperation", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f36941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f36942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f36943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36944d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f36943c = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f36942b = obj;
        this.f36944d |= Integer.MIN_VALUE;
        return this.f36943c.k(null, this);
    }
}
