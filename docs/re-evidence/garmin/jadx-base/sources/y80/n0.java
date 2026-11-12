package y80;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.data.DeviceStorageRepository", f = "DeviceStorageRepository.kt", l = {232}, m = "getDeviceTutorialsSetup", v = 2)
public final class n0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f195185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f195186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f195187c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(b0 b0Var, t13.d<? super n0> dVar) {
        super(dVar);
        this.f195186b = b0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f195185a = obj;
        this.f195187c |= Integer.MIN_VALUE;
        return this.f195186b.g(null, this);
    }
}
