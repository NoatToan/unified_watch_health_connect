package com.garmin.android.apps.connectmobile;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.AppUpgradeManager$Companion", f = "AppUpgradeManager.kt", l = {232}, m = "bindMfaTokenToOAuth2", v = 2)
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u.a f39752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39753c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(u.a aVar, t13.d<? super p> dVar) {
        super(dVar);
        this.f39752b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f39751a = obj;
        this.f39753c |= Integer.MIN_VALUE;
        return u.a.a(this.f39752b, this);
    }
}
