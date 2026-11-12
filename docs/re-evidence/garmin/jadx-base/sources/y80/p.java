package y80;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.data.DeviceInfoRepositoryImpl", f = "DeviceInfoRepositoryImpl.kt", l = {78}, m = "fetchAllDevicesInfo", v = 2)
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f195197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f195198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f195199c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(o oVar, t13.d<? super p> dVar) {
        super(dVar);
        this.f195198b = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f195197a = obj;
        this.f195199c |= Integer.MIN_VALUE;
        int i14 = o.f195188f;
        return this.f195198b.d(this);
    }
}
