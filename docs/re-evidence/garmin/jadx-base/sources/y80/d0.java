package y80;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.data.DeviceStorageRepository", f = "DeviceStorageRepository.kt", l = {268}, m = "getDeviceBitmapAsset", v = 2)
public final class d0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f195110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f195111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f195112c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(b0 b0Var, t13.d<? super d0> dVar) {
        super(dVar);
        this.f195111b = b0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f195110a = obj;
        this.f195112c |= Integer.MIN_VALUE;
        return this.f195111b.c(null, this);
    }
}
