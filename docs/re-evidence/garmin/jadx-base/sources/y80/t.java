package y80;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.data.DeviceInfoRepositoryImpl", f = "DeviceInfoRepositoryImpl.kt", l = {62}, m = "getPrimaryTrainingDevices-IoAF18A", v = 2)
public final class t extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f195217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f195218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f195219c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(o oVar, t13.d<? super t> dVar) {
        super(dVar);
        this.f195218b = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f195217a = obj;
        this.f195219c |= Integer.MIN_VALUE;
        Object objA = this.f195218b.a(this);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : o13.q.a(objA);
    }
}
