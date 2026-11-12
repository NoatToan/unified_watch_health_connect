package y90;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.sync.TriggerDeviceSetupSyncUseCase", f = "TriggerDeviceSetupSyncUseCase.kt", l = {32}, m = "invoke", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d90.f f195285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f195286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f195287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f195288d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f195287c = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f195286b = obj;
        this.f195288d |= Integer.MIN_VALUE;
        return this.f195287c.a(null, false, this);
    }
}
