package y80;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.data.DeviceInfoRepositoryImpl", f = "DeviceInfoRepositoryImpl.kt", l = {28}, m = "getDeviceInfo-BWLJW6A", v = 2)
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f195214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f195215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f195216c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(o oVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f195215b = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f195214a = obj;
        this.f195216c |= Integer.MIN_VALUE;
        Object objC = this.f195215b.c(0L, null, null, this);
        return objC == u13.a.COROUTINE_SUSPENDED ? objC : o13.q.a(objC);
    }
}
