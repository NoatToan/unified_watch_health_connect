package y80;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.data.DeviceSettingsRepositoryImpl", f = "DeviceSettingsRepositoryImpl.kt", l = {13}, m = "getDeviceSettings-gIAlu-s", v = 2)
public final class y extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f195228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f195229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f195230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f195231d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(x xVar, t13.d<? super y> dVar) {
        super(dVar);
        this.f195230c = xVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f195229b = obj;
        this.f195231d |= Integer.MIN_VALUE;
        Object objA = this.f195230c.a(0L, this);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : o13.q.a(objA);
    }
}
