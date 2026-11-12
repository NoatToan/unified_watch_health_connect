package cr1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.storage.device.DeviceStorageRepo", f = "DeviceStorageRepo.kt", l = {346}, m = "getDeviceLottieAsset", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f55390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f55391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55392c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(f fVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f55391b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f55390a = obj;
        this.f55392c |= Integer.MIN_VALUE;
        return this.f55391b.f(null, this);
    }
}
