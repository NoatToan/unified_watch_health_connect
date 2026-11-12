package com.garmin.android.apps.connectmobile.googlehealthconnect;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.googlehealthconnect.HealthConnectDelegateImpl", f = "GoogleHealthConnectDelegateImpl.kt", l = {393}, m = "writeToGoogleHealthConnect", v = 2)
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f36127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f36128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36129c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(i iVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f36128b = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f36127a = obj;
        this.f36129c |= Integer.MIN_VALUE;
        return i.a(this.f36128b, null, this);
    }
}
