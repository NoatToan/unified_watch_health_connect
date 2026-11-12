package y80;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.data.DeviceSettingsRepositoryImpl", f = "DeviceSettingsRepositoryImpl.kt", l = {21}, m = "saveDeviceSettings-0E7RQCE", v = 2)
public final class z extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f195232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f195233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f195234c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(x xVar, t13.d<? super z> dVar) {
        super(dVar);
        this.f195233b = xVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f195232a = obj;
        this.f195234c |= Integer.MIN_VALUE;
        Object objB = this.f195233b.b(0L, null, this);
        return objB == u13.a.COROUTINE_SUSPENDED ? objB : o13.q.a(objB);
    }
}
