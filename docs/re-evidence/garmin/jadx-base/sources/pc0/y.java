package pc0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.repo.DevicesRepo", f = "DevicesRepo.kt", l = {422}, m = "getHistoricalDevicesDetails", v = 2)
public final class y extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f137305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f137306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f137307c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(j jVar, t13.d<? super y> dVar) {
        super(dVar);
        this.f137306b = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f137305a = obj;
        this.f137307c |= Integer.MIN_VALUE;
        return this.f137306b.i(this);
    }
}
