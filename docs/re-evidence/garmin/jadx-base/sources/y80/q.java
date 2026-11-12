package y80;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.data.DeviceInfoRepositoryImpl", f = "DeviceInfoRepositoryImpl.kt", l = {42, 50, 50, 55}, m = "getAllDevicesInfo-gIAlu-s", v = 2)
public final class q extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f195205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f195206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f195207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f195208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f195209e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(o oVar, t13.d<? super q> dVar) {
        super(dVar);
        this.f195208d = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f195207c = obj;
        this.f195209e |= Integer.MIN_VALUE;
        Object objB = this.f195208d.b(this);
        return objB == u13.a.COROUTINE_SUSPENDED ? objB : o13.q.a(objB);
    }
}
