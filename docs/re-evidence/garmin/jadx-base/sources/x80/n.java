package x80;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.DeviceSetupViewModel", f = "DeviceSetupViewModel.kt", l = {415}, m = "updatePrimaryWearable", v = 2)
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f189550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f189551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f189552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f189553d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(e eVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f189552c = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f189551b = obj;
        this.f189553d |= Integer.MIN_VALUE;
        return e.y4(this.f189552c, 0L, this);
    }
}
