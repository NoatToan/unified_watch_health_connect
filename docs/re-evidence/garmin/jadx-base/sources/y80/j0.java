package y80;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.data.DeviceStorageRepository", f = "DeviceStorageRepository.kt", l = {243}, m = "getDeviceLottieTutorialsSetup", v = 2)
public final class j0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f195160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f195161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f195162c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(b0 b0Var, t13.d<? super j0> dVar) {
        super(dVar);
        this.f195161b = b0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f195160a = obj;
        this.f195162c |= Integer.MIN_VALUE;
        return this.f195161b.f(null, this);
    }
}
