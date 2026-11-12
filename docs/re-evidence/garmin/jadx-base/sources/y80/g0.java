package y80;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.data.DeviceStorageRepository", f = "DeviceStorageRepository.kt", l = {254}, m = "getDeviceLottieAsset", v = 2)
public final class g0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f195134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f195135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f195136c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(b0 b0Var, t13.d<? super g0> dVar) {
        super(dVar);
        this.f195135b = b0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f195134a = obj;
        this.f195136c |= Integer.MIN_VALUE;
        return this.f195135b.d(null, this);
    }
}
