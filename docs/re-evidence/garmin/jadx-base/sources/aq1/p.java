package aq1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.startup.StartupChecksRepositoryImpl", f = "StartupChecksRepositoryImpl.kt", l = {32}, m = "getUserLocation", v = 2)
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f12418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12419c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(j jVar, t13.d<? super p> dVar) {
        super(dVar);
        this.f12418b = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f12417a = obj;
        this.f12419c |= Integer.MIN_VALUE;
        return this.f12418b.a(this);
    }
}
