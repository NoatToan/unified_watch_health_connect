package cr1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.storage.device.DeviceStorageRepo", f = "DeviceStorageRepo.kt", l = {359}, m = "getDeviceBitmapAsset", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f55366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f55367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55368c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f55367b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f55366a = obj;
        this.f55368c |= Integer.MIN_VALUE;
        return this.f55367b.c(null, this);
    }
}
