package pu;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.auth.GCMCountryMinimumAgeImpl", f = "GCMCountryMinimumAgeImpl.kt", l = {43, 45}, m = "fetchAndCacheCountryMinimumAge", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f141089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f141090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f141091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f141092d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f141091c = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f141090b = obj;
        this.f141092d |= Integer.MIN_VALUE;
        return this.f141091c.a(this);
    }
}
