package aq1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.startup.StartupChecksRepositoryImpl", f = "StartupChecksRepositoryImpl.kt", l = {53}, m = "updateUserLocation", v = 2)
public final class u extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f12434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f12436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12437d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(j jVar, t13.d<? super u> dVar) {
        super(dVar);
        this.f12436c = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f12435b = obj;
        this.f12437d |= Integer.MIN_VALUE;
        return this.f12436c.j(null, this);
    }
}
