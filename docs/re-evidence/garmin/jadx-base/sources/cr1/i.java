package cr1;

import p005kotlin.Metadata;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.storage.device.DeviceStorageRepo", f = "DeviceStorageRepo.kt", l = {115, 131}, m = "getDeviceECGVideoPath", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f55372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.devices.model.l f55373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u0 f55374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f55375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f55376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f55377f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f55378g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f55379h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f55380i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f fVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f55379h = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f55378g = obj;
        this.f55380i |= Integer.MIN_VALUE;
        return this.f55379h.d(null, false, false, this);
    }
}
