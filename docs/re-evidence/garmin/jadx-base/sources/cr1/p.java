package cr1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.storage.device.DeviceStorageRepo", f = "DeviceStorageRepo.kt", l = {372}, m = "getDeviceVideoAssetInputStream", v = 2)
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f55426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f55427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55428c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(f fVar, t13.d<? super p> dVar) {
        super(dVar);
        this.f55427b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f55426a = obj;
        this.f55428c |= Integer.MIN_VALUE;
        return this.f55427b.h(null, this);
    }
}
