package pc0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.repo.DevicesRepo", f = "DevicesRepo.kt", l = {400}, m = "getHistoricalDevices", v = 2)
public final class w extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f137300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f137301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f137302c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(j jVar, t13.d<? super w> dVar) {
        super(dVar);
        this.f137301b = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f137300a = obj;
        this.f137302c |= Integer.MIN_VALUE;
        return this.f137301b.h(this);
    }
}
